<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
        <link rel='stylesheet' href='/webjars/bootstrap/3.1.0/css/bootstrap.min.css'>
    </head>
    <body>
        <div class="text-center">
            <h1>Papiros, sua livraria online</h1>
            <a href="<c:url value="/authors"/>">Clique aqui para entrar</a>
        </div>
    </body>
</html>