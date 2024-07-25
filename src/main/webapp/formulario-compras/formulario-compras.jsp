<%--
  Created by IntelliJ IDEA.
  User: JoseDavid
  Date: 25/07/2024
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sistema de Compras</title>
    <link rel="icon" href="../assets/Logo.png" type="image/x-icon">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-dark bg-dark fixed-top position-relative">
    <div class="container-fluid">
        <a class="navbar-brand" href="../index.jsp">Sistema de gestion de Compras</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
            <div class="offcanvas-header">
                <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Sistema de gestion de Compras</h5>
                <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
            </div>
            <div class="offcanvas-body">
                <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                    <li class="nav-item">
                        <a class="nav-link" href="../index.jsp">Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link"  href="../formulario-libro/formulario-libro.jsp">Formulario de Libros</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="../libro-servlet">Lista de Libros</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../formulario-clientes/formulario-clientes.jsp">Formulario de Clientes</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link " href="../clientes-servlet">Lista de Clientes</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="../formulario-compras/formulario-compras.jsp">Formulario de Compras</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="../listar-compras/listar-compras.jsp">Lista de Compras</a>
                    </li>

                </ul>
            </div>
        </div>
    </div>
</nav>
<div class="container mt-5">
    <h2>Agregar Libro</h2>
    <form action="${pageContext.request.contextPath}/compras-servlet" method="post" enctype="multipart/form-data">
        <div class="form-floating mb-3">
            <input type="date" class="form-control" id="fecha" name="fecha" placeholder="Fecha">
            <label for="fecha">Fecha</label>
        </div>

        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="descripcion" name="descripcion" placeholder="Descripción">
            <label for="descripcion">Descripción</label>
        </div>

        <div class="form-floating mb-3">
            <input type="number" class="form-control" id="total" name="total" placeholder="Total" step="0.01">
            <label for="total">Total</label>
        </div>

        <div>
            <input class="btn btn-outline-success" type="submit" value="Agregar">
        </div>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
