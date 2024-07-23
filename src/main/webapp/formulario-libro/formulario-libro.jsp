<%--
  Created by IntelliJ IDEA.
  User: JoseDavid
  Date: 20/07/2024
  Time: 07:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Agregar Libro</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-qjz5+2qjBk/e3hFf9N8tqPQ6T+nNQFw5Y5+5heFyDveov5Z+Om2YjTA+aUNH8yZb" crossorigin="anonymous">
</head>
<body>
<div class="container mt-5">
    <h2>Agregar Libro</h2>
    <form action="${pageContext.request.contextPath}/libro-servlet" method="post" enctype="multipart/form-data">
        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre">
            <label for="nombre">Nombre</label>
        </div>
        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="sinopsis" name="sinopsis" placeholder="Sinopsis">
            <label for="sinopsis">Sinopsis</label>
        </div>
        <div class="form-floating mb-3">
            <input type="number" class="form-control" id="precio" name="precio" placeholder="Precio" step="0.01">
            <label for="precio">Precio</label>
        </div>
        <div class="form-floating mb-3">
            <input type="number" class="form-control" id="existencias" name="existencias" placeholder="Existencias">
            <label for="existencias">Existencias</label>
        </div>
        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="autor" name="autor" placeholder="Autor">
            <label for="autor">Autor</label>
        </div>
        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="genero" name="genero" placeholder="Género">
            <label for="genero">Género</label>
        </div>
        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="idioma" name="idioma" placeholder="Idioma">
            <label for="idioma">Idioma</label>
        </div>
        <div class="form-floating mb-3">
            <input type="text" class="form-control" id="editorial" name="editorial" placeholder="Editorial">
            <label for="editorial">Editorial</label>
        </div>
        <div>
            <input class="btn btn-outline-success" type="submit" value="Agregar">
        </div>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-qjz5+2qjBk/e3hFf9N8tqPQ6T+nNQFw5Y5+5heFyDveov5Z+Om2YjTA+aUNH8yZb" crossorigin="anonymous"></script>
</body>
</html>
