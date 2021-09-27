<%-- 
    Document   : ageClacJsp
    Created on : Sep 23, 2021, 2:44:07 PM
    Author     : JRKap
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>age calculator</h1>

        <div>
            <form method="post" action="Age">
                <input type="text" name="ageIn" id="ageIn" value="${ageIn}"><br>
                <button type="submit" value=""> Calculate age</button>
                
            </form>

            <p>${message}</p>
        </div>
        <a href="Arithmetic"> arithmetic calculator</a>
    </body>
</html>
