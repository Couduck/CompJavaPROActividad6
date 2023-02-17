<%-- 
    Document   : index
    Created on : 16 feb. 2023, 21:19:29
    Author     : patoe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="servlets.RecibirDatos"%>

<!DOCTYPE html>
<html>
    <!-- Documento principal del proyecto -->
    <head>
        <title>Principal</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Computación Avanzada en Java Actividad 4: ¡Ahora con Servlets!</h1>
        
        <div><h2>Formulario de ingreso</h2>
            <form action="RecibirDatos" method="post">
                Base:<br>
                    <input type="text" name="base" value=""><br><br>
                Altura:<br>
                <input type="text" name="altura" value=""><br><br>
                <input type="submit" value="Area y Perimetro">
            </form>
        </div>
        
    </body>
</html>
