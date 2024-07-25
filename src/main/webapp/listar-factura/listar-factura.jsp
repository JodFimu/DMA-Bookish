<%-- 
    Document   : listar-factura
    Author     : Anthony Escobar
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listado Informacion sobre Facturas</title>
</head>
<body>
<div class="container mt-5">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#ID</th>
            <th scope="col">estado</th>
            <th scope="col">total de compra</th>
            <th scope="col">fecha de emision</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach  var="Factura" items="${Factura}" >
            <tr>
                <td>${Editorial.numeroFactura}</td>
                <td>${Editorial.estado}</td>
                <td>${Editorial.totalFactura}</td>
                <td>${Editorial.fechaFactura}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
