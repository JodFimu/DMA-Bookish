<%-- 
    Document   : listar-editorial
    Author     : Anthony Escobar
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Listado Informacion Editoriales</title>
    </head>
    <body>
        <div class="container mt-5">
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">#ID</th>
                        <th scope="col">Nombre</th>
                        <th scope="col">Telefono</th>
                        <th scope="col">Contacto</th>
                        <th scope="col">NITEditorial</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach  var="Editorial" items="${Editorial}" >
                    <tr>
                        <td>${Editorial.idEditorial}</td>
                        <td>${Editorial.nombre}</td>
                        <td>${Editorial.telefono}</td>
                        <td>${Editorial.Contacto}</td>
                        <td>${Editorial.NITEditorial}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
