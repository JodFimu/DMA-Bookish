<%-- 
    Document   : formulario-autor
    Author     : Anthony Escobar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="assets/imagenes/Logo.png" type="image/x-icon">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Formulario/Clientes/agregar</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark fixed-top position-relative">
            <div class="container-fluid">
                <a class="navbar-brand" href="../index.jsp">Sistema de gestión de Clientes</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
                    <div class="offcanvas-header">
                        <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Sistema de gestión de Clientes</h5>
                        <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                    </div>
                    <div class="offcanvas-body">
                        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                            <li class="nav-item">
                                <a class="nav-link" href="../index.jsp">Inicio</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="../formulario-clientes/formulario-clientes.jsp">Formulario de Clientes</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../listar-clientes/listar-clientes.jsp">Lista de Clientes</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
        <div class="container mt-5">
            <h2>Agregar Cliente</h2>
            <form action="${pageContext.request.contextPath}/clientes-servlet" method="post">
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="NITClientes" name="NITClientes" placeholder="NIT" maxlength="10">
                    <label for="NITClientes">NIT</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="nombreCliente" name="nombreCliente" placeholder="Nombre">
                    <label for="nombreCliente">Nombre</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="apellidoCliente" name="apellidoCliente" placeholder="Apellido">
                    <label for="apellidoCliente">Apellido</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="direccionCliente" name="direccionCliente" placeholder="Dirección">
                    <label for="direccionCliente">Dirección</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="telefonoCliente" name="telefonoCliente" placeholder="Teléfono">
                    <label for="telefonoCliente">Teléfono</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="email" class="form-control" id="correoCliente" name="correoCliente" placeholder="Correo">
                    <label for="correoCliente">Correo</label>
                </div>
                <div>
                    <input class="btn btn-outline-success" type="submit" value="Agregar Cliente">
                </div>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>