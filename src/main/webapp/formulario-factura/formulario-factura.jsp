<%-- 
    Document   : formulario-factura
    Author     : Anthony Escobar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Agregar Factura</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-qjz5+2qjBk/e3hFf9N8tqPQ6T+nNQFw5Y5+5heFyDveov5Z+Om2YjTA+aUNH8yZb" crossorigin="anonymous">
    </head>
    <body>
        <div class="container mt-5">
            <h2>Agregar Factura</h2>
            <form action="${pageContext.request.contextPath}/editorial-servlet" method="post">

                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="estado" name="estado" placeholder="estado">
                    <label for="estado">Estado..</label>
                </div>
                <div class="input-group">
                    <input type="text" class="form-control" name="totalFactura" aria-label="Amount (to the nearest dollar)">
                    <span class="input-group-text">Q</span>
                    <span class="input-group-text">Total de factura</span>
                </div>

                <div class="row form-group">
                    <label for="fechaFactura">Fecha..</label>
                    <div class="input-group date" id="datepicker">
                        <input type="text" class="form-control" id="fechaFactura" name="fechaFactura" placeholder="fechaFactura">
                        <span class="input-group-text bg-white d-block">
                            <i class="fa fa-calendar"></i>
                        </span>
                    </div>
                </div>

                <div>
                    <input class="btn btn-outline-success" type="submit" value="Agregar Factura">
                </div>
            </form>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-qjz5+2qjBk/e3hFf9N8tqPQ6T+nNQFw5Y5+5heFyDveov5Z+Om2YjTA+aUNH8yZb" crossorigin="anonymous"></script>
    </body>
</html>
