
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> <s:property  value="title"/> </title>
    </head>
    <body>
        <h1> <s:property  value="heading"/> </h1>
        
        <s:form action="greetings">
            <s:textfield name="name" label="Your name"/>
            <s:submit key="collector.button" name="submit"/>
        </s:form> 
        <div>
            <p> <s:property value="submitted"/> <s:property value="name"/> </p>
            <p> <s:property value="customGreeting"/>  </p>
        </div>
    </body>
</html>
