<?xml version="1.0" encoding="utf-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match = "/">
        <html>
            <body>
                <h2>Órarend</h2>
                <table border = "14">
                    <tr bgcolor = "#6495ED">
                        <th>ID</th>
                        <th>Tipus</th>
                        <th>Targy</th>
                        <th>Idopont</th>
                        <th>Szak</th>
                        <th>Oktato</th>
                        <th>Helyszin</th>
                    </tr>
                    <xsl:for-each select="JYHSW2_orarend/ora">
                        <tr>
                            <td>
                                <xsl:value-of select="@id"/>
                            </td>
                            <td><xsl:value-of select="@tipus"/></td>
                            <td><xsl:value-of select="targy"/></td>
                            <td><xsl:value-of select="idopont"/></td>
                            <td><xsl:value-of select="szak"/></td>
                            <td><xsl:value-of select="oktato"/></td>
                            <td><xsl:value-of select="helyszin"/></td>

                        </tr>

                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>