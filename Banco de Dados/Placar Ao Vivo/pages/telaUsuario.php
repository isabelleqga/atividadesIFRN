<!DOCTYPE html>
<html>

<head>
	<title>Tela Usuario</title>

		<?php

		$arquivoTime1 = fopen("../data/time1.txt", "r");
		$linhaTime1 = fread($arquivoTime1, filesize("../data/time1.txt"));
		$texto1 = preg_split('/,/', $linhaTime1);
		fclose($arquivoTime1);
		$goltime1 = fopen("../data/gols1.txt", "r");
		$gols1 = fread($goltime1, filesize("../data/gols1.txt"));
		fclose($goltime1);

		$arquivoTime2 = fopen("../data/time2.txt", "r");
		$linhaTime2 = fread($arquivoTime2, filesize("../data/time2.txt"));
		$texto2 = preg_split('/,/', $linhaTime2);
		fclose($arquivoTime2);
		$goltime2 = fopen("../data/gols2.txt", "r");
		$gols2 = fread($goltime2, filesize("../data/gols2.txt"));
		fclose($goltime2);

		$arquivoLances = fopen("../data/lances.txt", "r");
		$comentarios = fread($arquivoLances, filesize("../data/lances.txt"));
		fclose($arquivoLances);

		?>
</head>

<body>
	<center>
		<h1 style="display:inline;"><?php echo $texto1[0]; ?></h1>
		<img style="width: 80px; height: 95px;display:inline;" src=<?php echo $texto1[1]; ?>>
		<h1 style="display:inline;"><?php echo $gols1; ?></h1>
		x
		<h1 style="display:inline;"><?php echo $gols2; ?></h1>
		<img style="width: 80px; height: 95px;display:inline;" src=<?php echo $texto2[1]; ?>>
		<h1 style="display:inline;"><?php echo $texto2[0]; ?></h1>
		<div id="lancesetals">
			<h2> <?php echo $comentarios; ?> </h2>
		</div>
	</center>
</body>

</html>