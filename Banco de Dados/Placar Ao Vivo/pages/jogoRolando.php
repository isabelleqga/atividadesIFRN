<!DOCTYPE html>
<html>

<head>
	<?php
	$time1 = $_POST['time1n'];
	$time2 = $_POST['time2n'];
	$esc1 = $_POST['escudo1'];
	$esc2 = $_POST['escudo2'];


	$arquivoLances = fopen("../data/lances.txt", "w");
	$resultadoEscrita = fwrite($arquivoLances, "");
	fclose($arquivoLances);

	$arquivoTime1 = fopen("../data/time1.txt", 'w');
	fwrite($arquivoTime1, $time1 . ",");
	fwrite($arquivoTime1, $esc1);
	fclose($arquivoTime1);
	$arquivoGols1 = fopen("../data/gols1.txt", 'w');
	fwrite($arquivoGols1, 0);
	fclose($arquivoGols1);

	$arquivoTime2 = fopen("../data/time2.txt", 'w');
	fwrite($arquivoTime2, $time2 . ",");
	fwrite($arquivoTime2, $esc2);
	fclose($arquivoTime2);
	$arquivoGols2 = fopen("../data/gols2.txt", 'w');
	fwrite($arquivoGols2, 0);
	fclose($arquivoGols2);

	?>
	<title>Tela Moderador</title>
</head>

<body>
	<center>

		<h1 style="display:inline;">
			<?php echo $time1 ?>
			<img style="width: 80px; height: 95px;" src=<?php echo $esc1 ?>>
			x
			<img style="width: 80px; height: 95px;" src=<?php echo $esc2 ?>>
			<?php echo $time2 ?>

		</h1>
		<br>
		<br>
		<form action="adicionaGol1.php" method="POST">
			Gol do <?php echo $time1; ?><br><input type="submit" value="+">
		</form>
		<br>
		<form action="adicionaGol2.php" method="POST">
			Gol do <?php echo $time2; ?><br><input type="submit" value="+">
		</form>
		<br>
		<form action="adicionaLance.php" method="POST">
			<input style="width: 500px; height: 30px;" type="text" name="lance" placeholder="Lance...">
			<input type="submit" value="ENVIAR">
		</form>
		<br>
		<form action=telaUsuario.php>
			<input type="submit" value="ver">
		</form>

	</center>
</body>

</html>