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
                    <label for="first">First</label>
                    <input type="number" id="first" name="first">
                    <br>
                    <label for="second">Second</label>
                    <input type="number" id="second" name="second">
                    <br>
                    <tr><input type="button" id="add" name="add"></tr>
                    <tr><input type="button" id="minus" name="minus"></tr>
                    <tr><input type="button" id ="multiply" name="multiply"></tr>
                    <tr><input type="button" id="divide" name="divide"> </tr>
                    <br>
                    <br>
                    
                </form>
                <span id ="result"></span>
                <a href="age"> Age Calculator</a>
            <br>
            <br>
    </body>
</html>
