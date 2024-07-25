<%-- 
    Document   : formulario-editorial
    Author     : Anthony Escobar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Agregar Editorial</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-qjz5+2qjBk/e3hFf9N8tqPQ6T+nNQFw5Y5+5heFyDveov5Z+Om2YjTA+aUNH8yZb" crossorigin="anonymous">
    </head>
    <body>
        <div class="container mt-5">
            <h2>Agregar Editorial</h2>
            <form action="${pageContext.request.contextPath}/editorial-servlet" method="post">
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Editorial">
                    <label for="nombre">Nombre..</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="telefono" name="telefono" placeholder="telefono">
                    <label for="telefono">Telefono..</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="contacto" name="contacto" placeholder="contacto">
                    <label for="contacto">Contacto..</label>
                </div>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="NITEditorial" name="NITEditorial" placeholder="NITEditorial">
                    <label for="NITEditorial">NITEditorial..</label>
                </div>
                <div>
                    <input class="btn btn-outline-success" type="submit" value="Agregar Editorial">
                </div>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-qjz5+2qjBk/e3hFf9N8tqPQ6T+nNQFw5Y5+5heFyDveov5Z+Om2YjTA+aUNH8yZb" crossorigin="anonymous"></script>
    </body>
</html>
