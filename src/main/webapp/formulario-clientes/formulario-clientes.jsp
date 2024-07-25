<%-- 
    Document   : formulario-clientes
    Author     : Anthony Escobar
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Agregar Cliente</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-qjz5+2qjBk/e3hFf9N8tqPQ6T+nNQFw5Y5+5heFyDveov5Z+Om2YjTA+aUNH8yZb" crossorigin="anonymous">
    </head>
    <body>
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
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-qjz5+2qjBk/e3hFf9N8tqPQ6T+nNQFw5Y5+5heFyDveov5Z+Om2YjTA+aUNH8yZb" crossorigin="anonymous"></script>
    </body>
</html>