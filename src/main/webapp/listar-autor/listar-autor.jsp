<%-- 
    Document   : listar-autor
    Author     : Anthony Escobar
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Listado Informacion Autores</title>
    </head>
    <body>
        <div class="container mt-5">
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">#ID</th>
                        <th scope="col">Nombre</th>
                        <th scope="col">Apellido</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach  var="Autor" items="${Autor}" >
                    <tr>
                        <td>${Autor.idAutor}</td>
                        <td>${Autor.nombre}</td>
                        <td>${Autor.apellido}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
