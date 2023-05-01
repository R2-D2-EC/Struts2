<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<!DOCTYPE html>
<html>
    <head>
        <title>
            <tiles:insertAttribute name="title"/>
        </title>
    </head>
    <body>
        <table border="1" align="center" width="100%" style=" border-collapse: collapse; min-height: 100vh">
            <tr style="background-color: #f1f1f1">
                <td colspan="2" height="10">
                    <tiles:insertAttribute name="header"/>
                </td>
            </tr>
            <tr >
                <td height="150" width="350" style="background-color:  #F9E0F9">
                    <tiles:insertAttribute name="menu" />
                </td>
                <td style="background-color:  #F9E8E0">
                    <tiles:insertAttribute name="body"/>
                </td>
            </tr>
            <tr style="background-color:  #DBC5D0">
                <td height="10" colspan="2">
                    <tiles:insertAttribute name="footer"/>
                </td>
            </tr>
        </table>
    </body>
</html>
