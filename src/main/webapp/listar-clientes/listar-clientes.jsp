<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: JoseDavid
  Date: 24/07/2024
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>sistema de gestion</title>
    <link rel="icon" href="assets/Logo.png" type="image/x-icon">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-dark bg-dark fixed-top position-relative">
    <div class="container-fluid">
        <a class="navbar-brand" href="../index.jsp">Sistema de gestion de Clientes</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
            <div class="offcanvas-header">
                <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Sistema de gestion de Clientes</h5>
                <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
            </div>
            <div class="offcanvas-body">
                <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="./index.jsp">Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./formulario-libro/formulario-libro.jsp">Formulario de Libro</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="./libro-servlet">Lista de Libros</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./formulario-clientes/formulario-clientes.jsp">Formulario de Clientes</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="./clientes-servlet">Lista de Clientes</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./formulario-compras/formulario-compras.jsp">Formulario de Compras</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="./compras-servlet">Lista de Compras</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="./formulario-autor/formulario-autor.jsp">Formulario de Autor</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="./autor-servlet">Lista de autores</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="./formulario-editorial/formulario-editorial.jsp">Formulario de Editorial</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="./editorial-servlet">Lista de Editorial</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./formulario-factura/formulario-factura.jsp">Formulario de Factura</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="./factura-servlet">Lista de Facturas</a>
                    </li>

                </ul>
            </div>
        </div>
    </div>
</nav>
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
                <td>${Clientes.NITClientes}</td>
                <td>${Clientes.nombreCliente}</td>
                <td>${Clientes.apellidoCliente}</td>
                <td>${Clientes.direccionCliente}</td>
                <td>${Clientes.telefonoCliente}</td>
                <td>${Clientes.correoCliente}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
