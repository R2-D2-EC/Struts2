
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> <s:property value="formTitle"/> </title>
        <style>
            .valuesSubmitted{
                border: 1px #9976ff solid;
                margin-top: 1rem;
                padding: 0px 1rem 0px 1rem;
            }
        </style>
    </head>
    <body>
        <h1> <s:property value="formTitle"/> </h1>
        
        <s:form>
            <s:textfield key="form.user" name="user"/>
            <s:password key="form.password" name="password"/>
            <s:submit key="form.button"  name="submit"/>
        </s:form>
        
        <div class="valuesSubmitted">
            <h2> <s:text name="form.values"/> </h2>
            <p> <s:property value="formUser"/>: <s:property value="user"/> </p>
            <p> <s:property value="formPassword"/>: <s:property value="password"/> </p>
        </div>       
    </body>
</html>
