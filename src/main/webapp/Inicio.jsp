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

<title>Asesorias</title>
</head>
<body>
	<div class="container-fluid">
		<header>
			<%@include file="Cabecera.jsp"%>
		</header>
		
		
		<main>
			<div class="container my-3">
				<h1 class="display-3">Asesorías : Prevención de Riesgos</h1>

				<br /> <br />
				<div class="row align-items-center">


					<div class="col-sm-12 col-md-12 col-lg-12 col-xl-12 mb-6">
						<h2 class="display-6">PROPÓSITO:</h2>
						<hr />
						<h3>Somos una empresa que se dedica a la asesoría en prevención de riesgos laborales, 
						ajustándose a las necesidades de cada cliente, buscando entregar el mejor servicio para que se cumplan los requisitos legales aplicables y los objetivos de la empresa en seguridad y salud ocupacional.</h3>
						<br />
						</div>
						<div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 mb-6">
						<div class="img-thumbnail">
						<img class="col-sm-12 col-md-12 col-lg-12 col-xl-12 mb-6" src="img/2.jpg">
						<br>
						</div>
						</div>
						<div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 mb-6">
						<div class="img-thumbnail">
						<img class="col-sm-12 col-md-12 col-lg-12 col-xl-12 mb-6" src="img/1.jpg">
						<br>
						</div>
						</div>
						
						
						
						<div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 mb-6">
						<h2 class="display-6">MISIÓN:</h2>
						<hr />
						<h3>Ser una empresa que contribuye a un ambiente de trabajo libre de riesgos de accidente. 
						Capacitamos y asesoramos a nuestros clientes. Pronto en todo Chile</h3>
						<br />
					</div>
					
					
					
					
					<div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 mb-6">
						<h2 class="display-6">VISIÓN:</h2>
						<hr />
						<h3>Ser una empresa líder en la entrega de servicios de asesorías en prevención de riesgos 
						laborales con los más altos estándares de calidad. Segun la normativa chilena</h3>
						<br />
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