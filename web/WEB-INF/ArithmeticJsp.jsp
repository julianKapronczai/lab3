<%-- 
    Document   : ArithmeticJsp
    Created on : Sep 24, 2021, 4:42:34 PM
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
        <h1>arithmetic calculator</h1>

        <div>
            <form method="POST" action="Arithmetic">
            <input type="text" name="first" id="first" value="${first}"><br>
            <input type="text" name="second" id="second" value="${second}"><br>
            <button type="submit" name="info" value="+">+</button><button type="submit" name="info" value="-">-</button><button type="submit" name="info" value="*">*</button><button type="submit" name="info" value="%">%</button>
            </form>
            <p>Value: ${message}</p>
            <a href="Age">age calculator</a>
        </div>
    </body>
</html>
