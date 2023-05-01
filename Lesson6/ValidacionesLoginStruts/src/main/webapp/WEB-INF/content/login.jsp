
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> <s:text name="form.title"/> </title>
        <s:head/>
    </head>
    <body>
        <h1> <s:text name="form.title"/> </h1>
        
        <s:actionerror/>
        
        <s:form action="validateUser">
            <s:textfield key="form.user" name="user"/>
            <s:password key="form.password" name="password"/>
            <s:submit key="form.button"  name="submit"/>
        </s:form>
    </body>
</html>
