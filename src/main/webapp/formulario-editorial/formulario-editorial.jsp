<%-- 
<<<<<<< HEAD
    Document   : formulario-autor
=======
    Document   : formulario-editorial
>>>>>>> e9486aea539a342240a11cf46b009ab8dbef769c
    Author     : Anthony Escobar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="icon" href="assets/Logo.png" type="image/x-icon">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Sistema de Editorial</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark fixed-top position-relative">
            <div class="container-fluid">
                <a class="navbar-brand" href="../index.jsp">Sistema de gestión de Editoriales</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
                    <div class="offcanvas-header">
                        <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Sistema de gestión de Editoriales</h5>
                        <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                    </div>
                    <div class="offcanvas-body">
                        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                            <li class="nav-item">
                                <a class="nav-link active" aria-current="page" href="../index.jsp">Inicio</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../formulario-libro/formulario-libro.jsp">Formulario de Libro</a>
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
                                <a class="nav-link" href="../formulario-compras/formulario-compras.jsp">Formulario de Compras</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="../compras-servlet">Lista de Compras</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="../formulario-autor/formulario-autor.jsp">Formulario de Autor</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="../autor-servlet">Lista de autores</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="../formulario-editorial/formulario-editorial.jsp">Formulario de Editorial</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link " href="../editorial-servlet">Lista de Editorial</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../formulario-factura/formulario-factura.jsp">Formulario de Factura</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="../factura-servlet">Lista de Facturas</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
        <meta charset="UTF-8">
        <title>Agregar Editorial</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-qjz5+2qjBk/e3hFf9N8tqPQ6T+nNQFw5Y5+5heFyDveov5Z+Om2YjTA+aUNH8yZb" crossorigin="anonymous">
    </body>
    <body>
        <div class="container mt-5">
            <h2>Agregar Editorial</h2>
            <form action="${pageContext.request.contextPath}/editorial-servlet" method="post">
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Editorial">
                    <label for="nombre">Nombre</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="telefono" name="telefono" placeholder="telefono">
                    <label for="telefono">Telefono</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="contacto" name="contacto" placeholder="contacto">
                    <label for="contacto">Contacto</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="NITEditorial" name="NITEditorial" placeholder="NITEditorial">
                    <label for="NITEditorial">NITEditorial</label>
                </div>
                <div>
                    <input class="btn btn-outline-success" type="submit" value="Agregar">
                </div>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-qjz5+2qjBk/e3hFf9N8tqPQ6T+nNQFw5Y5+5heFyDveov5Z+Om2YjTA+aUNH8yZb" crossorigin="anonymous"></script>
    </body>
</html>
