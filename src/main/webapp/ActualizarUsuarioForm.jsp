<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@ page import="java.util.*"%>
<%@ page import="jakarta.servlet.http.HttpSession"%>
<%@ page import="modelo.Usuario"%>
<%@ page import="java.sql.Connection"%>




<%
  HttpSession sesion = request.getSession(false); // se recupera sesion sin crear una nueva
  if (sesion == null || sesion.getAttribute("usu") == null) {
    // redirige al usuario a la página "Login.jsp" si no hay sesion
    response.sendRedirect("Login.jsp");
  } else {
    // Mostramos el contenido del formulario si hay sesion
%>
<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta content="Etian Parra" />
<!-- Link Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous" />

<!--Estilos Personalizados-->
<link rel="stylesheet" href="estilos.css" />

<title>Ingresar Usuario</title>
</head>
<body>
	<div class="container-fluid">
		<header>
			<%@include file="Cabecera.jsp"%>
		</header>


		<main>
			<div class="container my-3">
				<h1 class="display-3">Asesorías : Bienvenido Admin</h1>

				<br /> <br />
				<div class="row align-items-center">


					<div class="col-sm-12 col-md-6 col-lg-6 col-xl-6 mb-6">

						<h2 class="display-6">Actualizar   Usuario.</h2>
						<br />

							
						<form class="row g-3" method="post" action="EditarUsuarioBD">

							<div class="col-md-6">
								<label for="inputNombre" class="form-label">Nombre</label> <input
									type="text" class="form-control" name="inputNombre" value="${usuario.getNombre()}" required
									placeholder="Nombre Usuario">
							</div>
							<div class="col-md-6">
								<label for="inputEmail" class="form-label">Email</label> <input
									type="text" class="form-control" name="inputEmail" value="${usuario.getEmail()}"required
									placeholder="Correo electronico">
							</div>
							<div class="col-md-6">
								<label for="inputClave" class="form-label">Clave</label> <input
									type="text" class="form-control" name="inputClave" value="${usuario.getClave()}"required
									placeholder="Clave 1234">
							</div>
							<input type="hidden" name="campoOculto" value="${usuario.getId()}">
								
     							
     							<div class="col-md-6">
								<label for="inputTipo" class="form-label">Tipo de
									Usuario</label> <select id="Usuario" name="inputTipo"
									class="form-select" aria-label="Default select example">
									<option value="Cliente">Cliente</option>
									<option value="Administrativo">Administrativo</option>
									<option value="Profesional">Profesional</option>

								</select>
							</div>

							<div>
								
								<br />
								<button type="submit" class="btn btn-outline-primary">Actualizar Usuario</button>
							</div>

						</form>
						<br />
							<a href="ListarUsuarioBD" class="btn btn-outline-primary">Listar Usuarios</a>
							
					</div>

					<div class="col-sm-12 col-md-6 col-lg-6 col-xl-6 mb-6">

							<div class="img-thumbnail">
							<img class="col-sm-12 col-md-12 col-lg-12 col-xl-12 mb-6"
								src="img/3.jpg">
						</div>

					</div>


					<br />

					<%
					if (request.getAttribute("lisu") != null) {
					%>
					<%@include file="MostrarUsuarioBD.jsp"%>
					<%
					}
					%>




				</div>

			</div>
			<br />


		</main>

		<footer class="text-center text-white"
			style="background-color: #323030">
			<%@ include file="PaginaPie.jsp"%>
		</footer>
	</div>
</body>
</html>
<%
  }
%>