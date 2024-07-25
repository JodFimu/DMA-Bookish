<%-- 
    Document   : formulario-autor
    Author     : Anthony Escobar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Agregar Autor</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-qjz5+2qjBk/e3hFf9N8tqPQ6T+nNQFw5Y5+5heFyDveov5Z+Om2YjTA+aUNH8yZb" crossorigin="anonymous">
    </head>
    <body>
        <div class="container mt-5">
            <h2>Agregar Autor</h2>
            <form action="/../Bookish-DMA/autor-servlet" method="post">
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre">
                    <label for="nombre">Nombre..</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="apellido" name="apellido" placeholder="Apellido">
                    <label for="apellido">Apellido..</label>
                </div>
                <div>
                    <input class="btn btn-outline-success" type="submit" value="Agregar Autor">
                </div>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-qjz5+2qjBk/e3hFf9N8tqPQ6T+nNQFw5Y5+5heFyDveov5Z+Om2YjTA+aUNH8yZb" crossorigin="anonymous"></script>
    </body>
</html>
