

<?php 
include("../includes/config2.php");
include("../includes/verifica.php");
include("../includes/top.php");
if(isset($_POST['cliente'])){
	$cliente = $_POST['cliente'];
	$pizza = $_POST['pizza'];
	$estado = $_POST['estado'];
	$consulta = $MySQLi->query("INSERT INTO TB_PEDIDOS (PED_CLI_CODIGO, PED_PIZ_CODIGO, PED_FINALIZADO) VALUES ($cliente, $pizza, '$estado')");
	header("Location: pedidos.php");

}

$consultaClientes = $MySQLi->query("SELECT * FROM TB_CLIENTES");
$consultaPizzas = $MySQLi->query("SELECT * FROM TB_PIZZAS");
?>


<div class="main-panel">
		<nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Adicionar Pedido</a>
                </div>
                
            </div>
        </nav>


        <div class="content">
<div class="container-fluid">
    <div class="col-md-12">
                        <div class="card">

<div class="content">
<div class="content">
<form action = "?" method = "POST">
        <div class="row">
            <div class="col-md-12">
                <div class="form-group">
                    <label>Cliente</label>
                    	<select name="cliente" class="form-control border-input">
						<?php while($resultadoCliente = $consultaClientes->fetch_assoc()) { ?>
							<option value="<?php echo $resultadoCliente['CLI_CODIGO']; ?>"><?php echo $resultadoCliente['CLI_NOME']; ?></option>
						<?php } ?>
						</select>
                </div>
            </div>
        

            
        </div>

        <div class="row">

        	<div class="col-md-8">
                <div class="form-group">
                    <label>Pizza</label>
                    <select name="pizza" class="form-control border-input">
				<?php while($resultadoPizza = $consultaPizzas->fetch_assoc()) { ?>
				<option value="<?php echo $resultadoPizza['PIZ_CODIGO']; ?>"><?php echo $resultadoPizza['PIZ_SABOR']; ?></option>
				<?php } ?>
			</select>
                </div>
            </div>
            

            <div class="col-md-4">
                <div class="form-group">
                    <label>Estado</label>
                    <input name = "estado" class="form-control border-input" placeholder=" 0">
                </div>
            </div>
        </div>
                                      
                                   <br>
                                    <div class="text-center">
                                        <button type="submit" class="btn btn-info btn-fill btn-wd">Enviar</button>
                                  
                                    </div>
                                    <div class="clearfix"></div>
                                </form></div></div>
	
	
</div></div>
<?php include("../includes/bot.php"); ?>