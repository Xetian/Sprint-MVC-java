<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="modelo.Capacitacion" %>
<%@ page import="java.util.*" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>



 
    
<div class="row align-items-center">
	<div class="col-sm-12 col-md-12 col-lg-12 col-xl-12 mb-3">


		<br />
		<h2 class="display-4">Listado Capacitación</h2>
		<br />

		<table class="table">
			<thead class="table-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Rut Cliente</th>
					<th scope="col">Dia</th>
					<th scope="col">Hora</th>
					<th scope="col">Lugar</th>
					<th scope="col">Duracion</th>
					<th scope="col">Asist</th>
					<th scope="col">Editar</th>
					<th scope="col">Eliminar</th>
				</tr>
			</thead>
			<tbody>
			<% 
			List<Capacitacion>list = new ArrayList<Capacitacion>();
			list=(List<Capacitacion>)request.getAttribute("lis");
			
			
					for (Capacitacion rec:list)
					{%>
					
					
					<tr>
						<td><%= rec.getIdentificador()%></td>
						<td><%= rec.getRutCliente()%></td>
						<td><%= rec.getDia()%></td>
						<td><%= rec.getHora()%></td>
						<td><%= rec.getLugar()%></td>
						<td><%= rec.getDuracion()%></td>
						<td><%= rec.getCantidad()%></td>
						<td><a class="btn btn-warning" href="BuscarCapacitacionBD?id=<%=rec.getIdentificador()%>">Editar</a></td>
                    	<td><a class="btn btn-danger"href="EliminarCapacitacionBD?id=<%=rec.getIdentificador()%>">Eliminar</a></td>
					
					</tr>
				<%}%>
				
			</tbody>
		</table>

	</div>
</div>