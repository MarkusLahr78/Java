<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:fn="http://www.w3.org/2005/xpath-functions">
	<xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>
	<xsl:template match="text()">
  <xsl:analyze-string select="."
                      regex="[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\.[A-Za-z]{{2,4}}">
    <xsl:matching-substring>
      <a href="mailto:{.}">
        <xsl:value-of select="."/>
      </a>
    </xsl:matching-substring>
    <xsl:non-matching-substring>
      <xsl:copy/>
    </xsl:non-matching-substring>
  </xsl:analyze-string>
</xsl:template>

<xsl:template match="*">
  <xsl:copy>
    <xsl:copy-of select="@*"/>
    <xsl:apply-templates/>
  </xsl:copy>
</xsl:template>
</xsl:stylesheet>
