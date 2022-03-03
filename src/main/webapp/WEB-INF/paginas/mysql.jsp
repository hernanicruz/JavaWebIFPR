<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt_br">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Sergey Pozhilov (GetTemplate.com)">

<title>Conexão JSP MySQL</title>

<link rel="shortcut icon" href="assets/images/gt_favicon.png">

<!-- Bootstrap -->
<link
	href="http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.no-icons.min.css"
	rel="stylesheet">
<!-- Icon font -->
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
<body>

	<header id="header">
		<nav class="navbar navbar-default navbar-sticky">
			<div class="container-fluid">


				<div class="navbar-collapse collapse">

					<ul class="nav navbar-nav">
						<li class="active"><a href="index.jsp">Home</a></li>
					</ul>

				</div>
				<!--/.nav-collapse -->
			</div>
		</nav>
	</header>

	<main id="main">

		<div class="container">

			<div class="row topspace">
				<div class="col-sm-8 col-sm-offset-2">

					<article class="post">
						<header class="entry-header">
							<div class="entry-meta">
								<span class="posted-on"><time
										class="entry-date published" date="2022-02-24">24 de
										fevereiro de 2022</time></span>
							</div>
							<h1 class="entry-title">
								<a href="single.html" rel="bookmark">Conexão JSP MySQL</a>
							</h1>
						</header>
						<div class="entry-content">

							<blockquote>
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
								
								<p>${mensagem}</p>
							</blockquote>
						</div>
					</article>
					<!-- #post-## -->

				</div>
			</div>
			<!-- /row post  -->

			<div class="clearfix"></div>

		</div>
		<!-- /container -->

	</main>


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
