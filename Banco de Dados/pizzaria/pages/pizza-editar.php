<?php 
include("../includes/config2.php");
include("../includes/verifica.php");
include("../includes/top.php");
if(isset($_POST['sabor'])){
	$sabor = $_POST['sabor'];
	$tamanho = $_POST['tamanho'];
	$preco = $_POST['preco'];
	$codigopizza = $_POST['codigopizza'];
	$consulta = $MySQLi->query("UPDATE TB_PIZZAS 
	SET PIZ_SABOR = '$sabor',
	PIZ_TAMANHO = '$tamanho', PIZ_PRECO = '$preco' WHERE PIZ_CODIGO = $codigopizza");
	header("Location: pizzas.php");
}

$codigo = $_GET['codigo'];
if(!isset($_GET['codigo'])) header("location: pizzas.php");
$consultaPizza = $MySQLi->query("SELECT * FROM TB_PIZZAS WHERE PIZ_CODIGO = $codigo");
$resultadoPizza = $consultaPizza->fetch_assoc();
?>

<div class="main-panel">
		<nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Editar Pizza</a>
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
        <div class="col-md-1">
            <div class="form-group">
                <label>Código</label>
                <input type="text" class="form-control border-input" name="codigopizza" value="<?php echo $resultadoPizza['PIZ_CODIGO']; ?>" READONLY style="background:#ccc;">
    	</div>
	</div>
	<div class="col-md-11">
        <div class="form-group">
            <label>Sabor</label>
                <input type="text" class="form-control border-input" name = "sabor" value="<?php echo $resultadoPizza['PIZ_SABOR']; ?>">
        </div>
    </div>
    
</div>

    <div class="row">
        <div class="col-md-8">
        <div class="form-group">
            <label>Preço</label>
                <input type="text" class="form-control border-input" name = "preco" value="<?php echo $resultadoPizza['PIZ_PRECO']; ?>">
        </div>
    </div> 
    <div class="col-md-4">
        <div class="form-group">
            <label>Tamanho</label>
                <input type="text" class="form-control border-input" name = "tamanho" value="<?php echo $resultadoPizza['PIZ_TAMANHO']; ?>">
        </div>
    </div>                           
    </div>
	<br>
	<div class="text-center">
        <button type="submit" class="btn btn-info btn-fill btn-wd">Enviar</button>
                                  
        </div>
        <div class="clearfix"></div>
   </form>	
	                         
                  </div></div>   </div></div>               
<?php include("../includes/bot.php"); ?>