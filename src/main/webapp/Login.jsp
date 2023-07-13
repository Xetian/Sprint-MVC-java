<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
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

<title>Iniciar Sesion</title>
</head>
<body>
	<div class="container-fluid">
		<header>
			<%@include file="Cabecera.jsp"%>
		</header>


		<main>
			<div class="container my-3">
			<h1 class="display-4">Capacitacion y Contacto solo para usuarios registrados</h1>
				<h1 class="display-3">Iniciar Sesion</h1>
				

				<br /> <br />
				<div class="row align-items-center">



					<div class="col-sm-12 col-md-12 col-lg-4 col-xl-4 mb-6">
						<div class="img-thumbnail">
							<form class="row g-3" method="post"
								action="UsuarioValidar">


								<div class="col-sm-12 col-md-12 col-lg-12 col-xl-12 mb-6">
									<label for="inputNombre" class="form-label">Nombre
										Usuario</label> <input type="text" class="form-control"
										name="inputNombre" placeholder="Nombre" required>
								</div>
								<div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 mb-6">
									<label for="inputClave" class="form-label">Clave</label> <input
										type="password" class="form-control" name="inputClave"
										placeholder="Ingrese clave" required>
								</div>


								<div>
									<button type="submit" class="btn btn-outline-primary">Validar</button>
								</div>

							</form>
						</div>
					</div>
				</div>

			</div>
			<br /> <br /> <br /> <br /> <br /> <br />


		</main>

		<footer class="text-center text-white"
			style="background-color: #323030">
			<%@ include file="PaginaPie.jsp"%>
		</footer>
	</div>
</body>
</html>