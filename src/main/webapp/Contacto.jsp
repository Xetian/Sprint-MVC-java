<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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

<title>Ingresar Capacitacion</title>
</head>
<body>
	<div class="container-fluid">
		<header>
			<%@include file="Cabecera.jsp"%>
		</header>
		
		
		<main>
			<div class="container my-3">
				<h1 class="display-3">Asesorías : Envíanos tu información</h1>

				<br /> <br />
				<div class="row align-items-center">


					<div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 mb-6">
						
						<h2 class="display-6">CONTACTO</h2>
						<br />
						
						
						<form class="row g-3" method="post" action="Contacto">
						
							<div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 mb-6">
								<label for="inputNombre" class="form-label">Nombre</label>
								<input type="text" class="form-control" name="inputNombre"
									placeholder="Su nombre" required>
							</div>
							<div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 mb-6">
								<label for="inputRut" class="form-label">Rut</label>
								<input type="text" class="form-control" name="inputRut"
									placeholder="Rut alfanumerico" required>
							</div>
							<div class="col-sm-12 col-md-12 col-lg-12 col-xl-12 mb-6">
								<label for="inputTexto" class="form-label">Texto Completo</label>
								<textarea class="form-control" name="inputTexto"
									placeholder="Escriba todo lo que necesite..." required></textarea>
							</div>

							<div>
								<button type="submit" class="btn btn-outline-primary">Enviar</button>
							</div>

						</form>
							<br/>
					</div>
					
						<div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 mb-6">
						<div class="img-thumbnail">
						<img class="col-sm-12 col-md-12 col-lg-12 col-xl-12 mb-6" src="img/5.jpg">
						</div>
						</div>
					
					<div class="row align-items-center">

						<div class="col-sm-12 col-md-12 col-lg-12 col-xl-12 mb-3">
							<h2>${espacio}</h2>
							<h2 class="display-6">${titulo}</h2>
							<h3>${nombre}</h3>
							<h3>${rut}</h3>
							<h3>${texto}</h3>
							</div>
						</div>
					
						
				</div>
				
						
				
				
				
				

			</div>
			<br />
			
			
		</main>

		<footer class="text-center text-white" style="background-color: #323030">
			<%@ include file="PaginaPie.jsp" %>
		</footer>
	</div>
</body>
</html>
<%
  }
%>