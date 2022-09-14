<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tela de Erros </title>
</head>
<body>
<h2>Messagem de Erro: Entre em contato com nosso suporte técnico (48) 9.91399889</h2>
<%
 out.print(request.getAttribute("msg"));
%>
</body>
</html>