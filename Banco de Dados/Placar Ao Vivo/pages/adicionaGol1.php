<!DOCTYPE html>
<html>

<head>
	<title></title>
	<?php

	$goltime1 = fopen("../data/gols1.txt", "r");
	$gols = fread($goltime1, filesize("../data/gols1.txt"));
	fclose($goltime1);
	$gols++;
	$arquivoGravacao = fopen("../data/gols1.txt", "w");
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