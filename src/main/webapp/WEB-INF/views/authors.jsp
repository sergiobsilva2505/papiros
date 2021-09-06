
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Autores</title>
    <link rel='stylesheet' href='/webjars/bootstrap/3.1.0/css/bootstrap.min.css'>
    <style>
        hr{
            border-top: 3px solid grey;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1 class="text-center">Novo autor</h1>
        <form action="<c:url value="/authors" />" method="POST">
            <div class="form-group">
                <label for="name">Nome</label>
                <input class="form-control" type="text" id="name" name="name"/>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input class="form-control" type="email" id="email" name="email"/>
            </div>
            <div class="form-group">
                <label for="birthDate">Data de nascimento</label>
                <input class="form-control" type="text" id="birthDate" name="birthDate"/>
            </div>
            <div class="form-group">
                <label for="miniResume">Mini curriculo</label>
                <textarea id="miniResume" class="form-control"  name="miniResume" rows="4" cols="50" placeholder=""></textarea>
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary" >Enviar</button>
            </div>
        </form>

        <hr>

        <h1 class="text-center">Lista de autores</h1>
        <table class="table table-bordered table-hover table-striped">
            <thead>
                <tr class="bg-primary text-center text-white">
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