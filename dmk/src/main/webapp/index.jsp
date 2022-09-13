<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DIGITAL MK TECNOLOGIA</title>
</head>
<body>
	<form action="servletLogin" method="post">
	<input type="hidden" value="<%= request.getParameter("url") %>" name="url"> <!-- na serlet chamar a url -->
		<table>
			<tr>
				<td><label>Login:</label></td>
				<td><input name="login" type="text"></td>
			</tr>
			<tr>
				<td><label>Senha:</label></td>
				<td><input name="senha" type="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Salvar"></td>
				
			</tr>

		</table>
	</form>
<h4>${msg }</h4>
<h4>${msg2 }</h4>
</body>
</html>