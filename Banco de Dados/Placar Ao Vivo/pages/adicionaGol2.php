<!DOCTYPE html>
<html>

<head>
	<title></title>
	<?php

	$goltime2 = fopen("../data/gols2.txt", "r");
	$gols = fread($goltime2, filesize("../data/gols2.txt"));
	fclose($goltime2);
	$gols++;
	$arquivoGravacao = fopen("../data/gols2.txt", "w");
	$resultadoEscrita = fwrite($arquivoGravacao, $gols);
	fclose($arquivoGravacao);

	?>
</head>

<body>

	<center>
		<h1>GOL!</h1>
	</center>

</body>

</html>