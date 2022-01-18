<%-- 
    Document   : arithmeticcalculator
    Created on : 17-Jan-2022, 12:21:46 PM
    Author     : Cole
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
                <h1>Arithmetic Calculator</h1>

        <form action="arithmetic" method="post">
            <label for="first">First:</label>
            <input type="number" name="first" id="first" value="${first}">
            <br>
            <label for="second">Second:</label>
            <input type="number" name="second" id="second" value="${second}">
            <br>
            <input type="submit" name="operation" id="plus" value="+">
            <input type="submit" name="operation" id="minus" value="-">
            <input type="submit" name="operation" id="multiply" value="*">
            <input type="submit" name="operation" id="modulus" value="%">

            <br>
            <br>
    </body>
</html>
