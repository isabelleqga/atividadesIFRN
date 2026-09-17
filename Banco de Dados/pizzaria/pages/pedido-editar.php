
<?php
include("../includes/config2.php");
include("../includes/verifica.php");
include("../includes/top.php");
if(isset($_POST['cliente'])){
	$cliente = $_POST['cliente'];
	$pizza = $_POST['pizza'];
	$data = $_POST['data'];
	$estado = $_POST['estado'];
	$codigopedido = $_POST['codigopedido'];
	$consulta = $MySQLi->query("UPDATE TB_PEDIDOS SET PED_CLI_CODIGO ='$cliente', PED_PIZ_CODIGO='$pizza', PED_DATA='$data', PED_FINALIZADO='$estado'
WHERE PED_CODIGO = $codigopedido");
	header("Location: pedidos.php");
}

$consultaClientes = $MySQLi->query("SELECT * FROM TB_CLIENTES");
$consultaPizzas = $MySQLi->query("SELECT * FROM TB_PIZZAS");
$codigopedido = $_GET['codigo'];
if(!isset($_GET['codigo'])) header("location: pedidos.php");

$consultaPedido = $MySQLi->query("SELECT * FROM TB_PEDIDOS WHERE PED_CODIGO = $codigopedido");
$resultadoPedido = $consultaPedido->fetch_assoc();
?>

<div class="main-panel">
		<nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Editar Pedido</a>
                </div>

            </div>
        </nav>
        <div class="content">
<div class="container-fluid">
    <div class="col-md-12">
                        <div class="card"><div class="content">
<div class="content">
<form action = "?" method = "POST">
    <div class="row">
        <div class="col-md-1">
            <div class="form-group">
                <label>Código</label>
                <input type="text" class="form-control border-input" name="codigopedido" value="<?php echo $resultadoPedido['PED_CODIGO']; ?>" READONLY style="background:#ccc;">
    	</div>
	</div>
	<div class="col-md-8">
        <div class="form-group">
            <label>Data</label>
                <input type="text" class="form-control border-input" name = "data" value="<?php echo $resultadoPedido['PED_DATA']; ?>">
        </div>
    </div>
    <div class="col-md-3">
        <div class="form-group">
            <label>Estado</label>
                <input type="text" class="form-control border-input" name = "estado" value="<?php echo $resultadoPedido['PED_FINALIZADO']; ?>">
        </div>
    </div>
</div>








    <div class="row">
        <div class="col-md-6">
        <div class="form-group">
            <label>Cliente</label>
            		<select name="cliente" class="form-control border-input">
					<?php while($resultadoCliente = $consultaClientes->fetch_assoc()) { ?>
					<option value="<?php echo $resultadoCliente['CLI_CODIGO']; ?>"<?php
					if($resultadoCliente['CLI_CODIGO'] == $resultadoPedido['PED_CLI_CODIGO'])
			echo " selected";
					?>><?php echo $resultadoCliente['CLI_NOME']; ?></option>
					<?php } ?>
				</select>

        </div>
    </div>

    <div class="col-md-6">
        <div class="form-group">
            <label>Pizza</label>
            		<select name="pizza" class="form-control border-input">
		<?php while($resultadoPizza = $consultaPizzas->fetch_assoc()) { ?>
		<option value="<?php echo $resultadoPizza['PIZ_CODIGO']; ?>"<?php
		if($resultadoPizza['PIZ_CODIGO'] == $resultadoPedido['PED_PIZ_CODIGO'])
			echo " selected";
		?>><?php echo $resultadoPizza['PIZ_SABOR']; ?></option>
		<?php } ?>
	</select>

        </div>
    </div>
    </div>
	<br>
	<div class="text-center">
        <button type="submit" class="btn btn-info btn-fill btn-wd">Enviar</button>

        </div>
        <div class="clearfix"></div>
   </form>
	</div></div>    </div></div>

<?php include("../includes/bot.php"); ?>




