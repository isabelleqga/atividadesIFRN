<!DOCTYPE html>
<html>

<head>
	<title></title>
</head>

<body>
		<?php
		$textoLance = $_POST['lance'];

		$arquivoLances = fopen("../data/lances.txt", "a");
		$resultadoEscrita = fwrite($arquivoLances, $textoLance . "<br>");
		fclose($arquivoLances);
		?>

	<center>
		<h1>O LANCE FOI DADO!</h1>
	</center>
</body>

</html>