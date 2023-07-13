package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Capacitacion;
import java.io.IOException;
import implementar.CapacitacionDAO;

/**
 * Servlet implementation class CrearCapacitacion
 */
public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				CapacitacionDAO ca = new CapacitacionDAO();
				Capacitacion capa = new Capacitacion();
				String  rut, dia, hora, ciudad, duracion, cant;

				
				rut = request.getParameter("inputCliente");
				dia = request.getParameter("inputDia");
				hora = request.getParameter("inputHora");
				ciudad = request.getParameter("inputCiudad");
				duracion = request.getParameter("inputDuracion");
				cant = request.getParameter("inputAsist");

				capa.setRutCliente(rut);
				capa.setDia(dia);
				capa.setHora(hora);
				capa.setLugar(ciudad);
				capa.setDuracion(duracion);
				capa.setCantidad(Integer.parseInt(cant));
				
				ca.crearCapacitacion(capa);
				
				
	            response.sendRedirect("ListarCapacitacionBD");
	            
	            
				

	}

}
