<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
 
    <!-- set output mode as html -->
    <xsl:output method="html"/>
 
    <!-- template that matches the root node -->
    <xsl:template match="/">
        <html>
        <head>
            <title>Search Results For Presidents</title>
        </head>
        <body>
            
 
            <!-- results table -->
            <table border="1" cellpadding="5">
                <tr>
                    <th>Pres ID</th>
                    <th>Name</th>
                    <th>Birthday</th>
                    <th>Birthplace</th>
                    <th>Years Served</th>
                    <th> Party</th>
                    <th>Terms</th>
                </tr>
                <!-- run the template that renders the classes in table rows -->
                <xsl:apply-templates select="Presidents/President" />
            </table>
        </body>
        </html>
    </xsl:template>
 
    <!-- template that matches classes -->
    <xsl:template match="President">
        <tr>
            <td><xsl:value-of select="@ID" /></td>
            
            <td><xsl:value-of select="Name" /></td>
            <td><xsl:value-of select="Birthday" /></td>
            <td><xsl:value-of select="Birthplace" /></td>
            <td><xsl:value-of select="YearsServed" /></td>
            <td><xsl:value-of select="Party" /></td>
             <td><xsl:value-of select="Terms" /></td>
        </tr>
    </xsl:template>
 
</xsl:stylesheet>