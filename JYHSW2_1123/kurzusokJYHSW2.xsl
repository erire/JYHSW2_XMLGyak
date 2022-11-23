<?xml version="1.0" encoding="utf-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match = "/">
        <html>
            <body>
                <h2>JYHSW2 Hallgató vizsgái</h2>
                <table border = "4">
                    <tr bgcolor = "#9acd32">
                        <th>Kurzus</th>
                        <th>Helszin</th>
                        <th>Oktató</th>
                        <th>Jegy</th>
                    </tr>

                    <xsl:for-each select="vizsgak/vizsga">
                        <tr>
                            <td><xsl:value-of select="kurzus"/></td>
                            <td><xsl:value-of select="helszin"/></td>
                            <td><xsl:value-of select="oktato"/></td>
                            <td><xsl:value-of select="jegy"/></td>
                        </tr>

                    </xsl:for-each>
                </table>
                <h2>Átlag</h2>
                <table border = "4">
                    <tr bgcolor = "#2CE5D4">
                        <th>Neptunkód</th>
                        <th>Átlag</th>
                    </tr>

                    <xsl:for-each select="vizsgak">
                        <tr>
                            <td>
                                <xsl:value-of select="@_id"/>
                            </td>
                            <td><xsl:value-of select="atlag"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>

    </xsl:template>

</xsl:stylesheet>