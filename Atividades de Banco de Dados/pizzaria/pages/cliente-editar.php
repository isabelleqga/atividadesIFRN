<?php 
include("../includes/top.php");
include("../includes/config2.php");
include("../includes/verifica.php");
if(isset($_POST['nome'])){
	$nome = $_POST['nome'];
	$mesa = $_POST['mesa'];
	$usuario = $_POST['usuario'];
	$senha = $_POST['senha'];
	$codigocliente = $_POST['codigocliente'];
	$consulta = $MySQLi->query("UPDATE TB_CLIENTES 
	SET CLI_NOME = '$nome',
	CLI_MESA = '$mesa', CLI_USUARIO = '$usuario', CLI_SENHA = '$senha' WHERE CLI_CODIGO = $codigocliente");
	header("Location: clientes.php");
}

$consultaBairros = $MySQLi->query("SELECT * FROM TB_BAIRROS");
$codigo = $_GET['codigo'];
if(!isset($_GET['codigo'])) header("location: clientes.php");
$consultaCliente = $MySQLi->query("SELECT * FROM TB_CLIENTES WHERE CLI_CODIGO = $codigo");
$resultadoCliente = $consultaCliente->fetch_assoc();
?>

<div class="main-panel">
		<nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Editar Cliente</a>
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
                <input type="text" class="form-control border-input" name="codigocliente" value="<?php echo $resultadoCliente['CLI_CODIGO']; ?>" READONLY style="background:#ccc;">
    	</div>
	</div>
	<div class="col-md-8">
        <div class="form-group">
            <label>Nome</label>
                <input type="text" class="form-control border-input" name = "nome" value="<?php echo $resultadoCliente['CLI_NOME']; ?>">
        </div>
    </div>
    <div class="col-md-3">
        <div class="form-group">
            <label>Mesa</label>
                <input type="text" class="form-control border-input" name = "mesa" value="<?php echo $resultadoCliente['CLI_MESA']; ?>">
        </div>
    </div>
</div>

    <div class="row">
        <div class="col-md-6">
        <div class="form-group">
            <label>Usuario</label>
                <input type="text" class="form-control border-input" name = "usuario" value="<?php echo $resultadoCliente['CLI_USUARIO']; ?>">
        </div>
    </div>
    <div class="col-md-6">
        <div class="form-group">
            <label>Senha</label>
                <input type="text" class="form-control border-input" name = "senha" value="<?php echo $resultadoCliente['CLI_SENHA']; ?>">
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