<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns="http://www.w3.org/TR/REC-html40">
	<xsl:output method="html" version="4.0" indent="yes" encoding="ISO-8859-1"/>
	<xsl:template match="/">
		<html>
			<head>
				<title>Adressen</title>
				<meta http-equiv="content-type" content="text/html;charset=iso-8859-1"/>
			</head>
			<body>
				<h2> Lernmittel zur Programmiersprache C </h2>
				<!-- cellpadding=Abstand zwischen Zellenrand und Zelleninhalt in Pixeln -->
				<!-- cellspacing bestimmen Sie den Abstand der Zellen untereinander in Pixeln -->
				<!-- border= Dicke des Tabellenrahmens in Pixeln -->
				<table border="1" cellpadding="0" width="90%">
					<!-- Spaltenbreite definieren -->
					<colgroup>
						<!-- HIER KOMMT DER FEHLER !!!!!!!!!!!!!!!!!!!! -->
						<col width="25%"/>
						<col width="25%"/>
						<col width="25%"/>
						<col width="25%"/>
					</colgroup>
					<tr style='font-family:"Times New Roman";color:black;font-size:12.0pt'>
						<td align="center">Gebiet</td>
						<td align="center">Präsentationen/Dokus</td>
						<td align="center">Übungen</td>
						<td align="center">Demo-Programme</td>
					</tr>
					<xsl:for-each select="eintrag">
						<tr>
							<td>
								<xsl:value-of select="name"/>
							</td>
							<td>
								<xsl:value-of select="dokument"/>
							</td>
							<td>
								<xsl:value-of select="uebung"/>
							</td>
							<td>
								<xsl:value-of select="programm"/>
							</td>
						</tr>
					</xsl:for-each>
				</table>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
