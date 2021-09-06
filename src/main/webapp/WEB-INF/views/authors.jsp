
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Autores</title>
    <link rel='stylesheet' href='/webjars/bootstrap/3.1.0/css/bootstrap.min.css'>
</head>
<body>
    <div class="container">
        <h1 class="text-center">Lista de autores</h1>
        <table class="table table-bordered table-hover table-striped">
            <thead>
            <tr class="bg-primary">
                <th>Nome</th>
                <th>Email</th>
                <th>Data de Nascimento</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${ authors }" var="author">
                <tr>
                    <td>${ author.name }</td>
                    <td>${ author.email }</td>
                    <td>${ author.birthDate }</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
