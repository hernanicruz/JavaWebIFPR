<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt_br">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Sergey Pozhilov (GetTemplate.com)">

<title>Desenvolvimento Web III</title>

<link rel="shortcut icon" href="assets/images/gt_favicon.png">

<!-- Bootstrap -->
<link
	href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.no-icons.min.css"
	rel="stylesheet">
<!-- Icons -->
<link
	href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css"
	rel="stylesheet">
<!-- Fonts -->
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Alice|Open+Sans:400,300,700">
<!-- Custom styles -->
<link rel="stylesheet" href="assets/css/styles.css">

<!--[if lt IE 9]> <script src="assets/js/html5shiv.js"></script> <![endif]-->
</head>
<body class="home">
	<header id="header">
		<nav class="navbar navbar-default navbar-sticky">
			<div class="container-fluid">

				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>

				<div class="navbar-collapse collapse">

					<ul class="nav navbar-nav">
						<li class="active"><a href="index.jsp">Home</a></li>
						<!-- <li><a href="single.jsp">Página Simples</a></li> -->
					</ul>

				</div>
				<!--/.nav-collapse -->
			</div>
		</nav>
	</header>

	<main id="main">

		<div class="container">

			<div class="row section featured topspace">
				<h2 class="section-title">
					<span>Insert, update delete</span>
				</h2>
				
				<form method="POST" action="FornecedorServlet">
				<c:forEach var="f" items="${fornecedoresId}">
					Nome: <input type="text" name="nome" value="$.{f.nome}"/><br>
					Razão Social: <input type="text" name="rs" value="${f.razaoSocial}" /><br> 
					Email: <input type="text" name="email" value="${f.email}"/><br>
					Cnpj: <input type="text" name="cnpj" value="$.{f.cnpj}" /><br>
					Não listado<INPUT TYPE="hidden" NAME="naolistado" VALUE="update"><br>
					<input type="submit" value="Atualizar"/><br>
				</c:forEach>
				</form>
								
			</div>
			<br>

		</div>
		<!-- /container -->

	</main>

	<footer id="footer">
		<div class="container"></div>
	</footer>

	<footer id="underfooter"> </footer>

	<!-- JavaScript libs are placed at the end of the document so the pages load faster -->
	<script
		src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
	<script
		src="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
	<script src="assets/js/template.js"></script>
</body>
</html>