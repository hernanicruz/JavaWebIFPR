<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<!--  Expression Language ${variavel} -->
	<table border="1">
		<tr>
			<th>id</th>
			<th>email</th>
			<th>nome</th>
			<th>razão social</th>
			<th>cnpj</th>
		</tr>
		<!-- usar jstl.jar -->
		
		<c:forEach var="f" items="${fornecedores}">
			<tr>
				<td>${f.id}</td>
				<td>${f.email}</td>
				<td>${f.nome}</td>
				<td>${f.razaoSocial}</td>
				<td>${f.cnpj}</td>
			</tr>
		</c:forEach>


	</table>

</body>
</html>