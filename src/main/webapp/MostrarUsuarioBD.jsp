<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="modelo.Usuario" %>
<%@ page import="java.util.*" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>



 
    
<div class="row align-items-center">
	<div class="col-sm-12 col-md-12 col-lg-12 col-xl-12 mb-3">


		<br />
		<h2 class="display-4">Listado Usuarios</h2>
		<br />

		<table class="table">
			<thead class="table-dark">
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Nombre</th>
					<th scope="col">Tipo Usuario</th>
					<th scope="col">E-mail</th>
					<th scope="col">Claves</th>
					<th scope="col">Editar</th>
					<th scope="col">Eliminar</th>
				</tr>
			</thead>
			<tbody>
			<% 
			List<Usuario>listu = new ArrayList<Usuario>();
			listu=(List<Usuario>)request.getAttribute("lisu");
			
			
					for (Usuario us:listu)
					{%>
					
					
					<tr>
						<td><%= us.getId()%></td>
						<td><%= us.getNombre()%></td>
						<td><%= us.getTipo()%></td>
						<td><%= us.getEmail()%></td>
						<td><%= us.getClave()%></td>
						<td><a class="btn btn-warning" href="BuscarUsuarioBD?id=<%= us.getId()%>">Editar</a></td>
                    	<td><a class="btn btn-danger"href="EliminarUsuarioBD?id=<%= us.getId()%>">Eliminar</a></td>
					</tr>
				<%}%>
				
			</tbody>
		</table>

	</div>
</div>