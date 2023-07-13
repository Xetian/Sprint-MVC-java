<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ page import="java.util.*" %>  
<%@ page import="jakarta.servlet.http.HttpSession" %>
<%@ page import="modelo.Capacitacion" %>
<%@ page import ="java.sql.Connection"%>




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
				<h1 class="display-3">Asesorías : Bienvenido Admin</h1>

				<br /> <br />
				<div class="row align-items-center">


					<div class="col-sm-12 col-md-12 col-lg-12 col-xl-12 mb-6">

						<h2 class="display-6">Si necesitas agregar una nueva
							capacitacion o curso, solo debes registrar la informacion
							requerida en el formulario.</h2>
						<br />


						<form class="row g-3" method="post" action="CrearCapacitacion">
							
							<div class="col-md-6">
								<label for="inputCliente" class="form-label">Rut Cliente</label>
								<input type="text" class="form-control" name="inputCliente" required
									placeholder="Alfanumerico">
							</div>
							<div class="col-md-6">
								<label for="inputDia" class="form-label">Dia</label> <select id="inputDia" name="inputDia"
									class="form-select" aria-label="Default select example">
									<option value="Lunes">Lunes</option>
									<option value="Martes">Martes</option>
									<option value="Miercoles">Miercoles</option>
									<option value="Jueves">jueves</option>
									<option value="Viernes">Viernes</option>
									<option value="Sabado">Sabado</option>
									<option value="Domingo">Domingo</option>
								</select>
							</div>
							<div class="col-md-6">
								<label for="inputHora" class="form-label">Hora</label> <input
									type="text" class="form-control" name="inputHora" required
									placeholder="Formato HH:MM">
							</div>
							<div class="col-md-6">
								<label for="inputCiudad" class="form-label">Ciudad</label> <input
									type="text" class="form-control" name="inputCiudad" required
									placeholder="Ciudad Capacitacion">
							</div>
							<div class="col-md-6">
								<label for="inputDuracion" class="form-label">Duracion</label> <input
									type="text" class="form-control" name="inputDuracion" required
									placeholder="Tiempo en minutos">
							</div>
							<div class="col-md-4">
								<label for="inputAsist" class="form-label">Num.
									Asistentes</label> <input type="text" class="form-control"
									name="inputAsist" required placeholder="Cantidad asistentes">
							</div>

							<div>
								<button type="submit" class="btn btn-outline-primary">Ingresar
									Capacitacion</button>
							</div>

						</form>
						<br/>
								<a href="ListarCapacitacionBD" class="btn btn-outline-primary">Listar Capacitaciones</a>
					</div>

					
					
					<br/>
					
					<%
					if (request.getAttribute("lis") != null) {
					%>
					<%@include file="MostrarCapacitacionBD.jsp"%>
					<%
					}
					%>
			
					
					

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