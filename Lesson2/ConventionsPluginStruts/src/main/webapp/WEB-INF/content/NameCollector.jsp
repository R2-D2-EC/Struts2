
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Name Collector Page</title>
    </head>
    <body>
        <h1> Entre your name </h1>
        
        <s:form action="greetings">
            <s:textfield name="name" label="Your name"/>
            <s:submit name="submit"/>
        </s:form> 
    </body>
</html>
