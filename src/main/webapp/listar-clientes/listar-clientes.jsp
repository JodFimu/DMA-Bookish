<%-- 
    Document   : listar-clientes
    Created on : 25/07/2024, 11:56:00
    Author     : Anthony Escobar
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container mt-5">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">NIT</th>
            <th scope="col">Nombre</th>
            <th scope="col">Apellido</th>
            <th scope="col">Direccion</th>
            <th scope="col">Telefono</th>
            <th scope="col">Correo</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach  var="Clientes" items="${Clientes}" >
            <tr>
                <td>${Clientes.idClientes}</td>
                <td>${Libro.NITClientes}</td>
                <td>${Libro.nombreCliente}</td>
                <td>${Libro.apellidoCliente}</td>
                <td>${Libro.direccionCliente}</td>
                <td>${Libro.telefonoCliente}</td>
                <td>${Libro.correoCliente}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
