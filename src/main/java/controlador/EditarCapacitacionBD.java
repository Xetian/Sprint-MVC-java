package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Capacitacion;
import java.io.IOException;
import implementar.CapacitacionDAO;


/**
 * Servlet implementation class EditarCapacitacionBD
 */
public class EditarCapacitacionBD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarCapacitacionBD() {
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
		Capacitacion cap = new Capacitacion();
		CapacitacionDAO actualizar = new CapacitacionDAO();
		
		 String identificador,rutCliente,dia,hora,lugar,duracion,cantidad;
		
			identificador = request.getParameter("campoOculto");
			rutCliente = request.getParameter("inputCliente");
			dia = request.getParameter("inputDia");
			hora = request.getParameter("inputHora");
			lugar = request.getParameter("inputCiudad");
			duracion = request.getParameter("inputDuracion");
			cantidad = request.getParameter("inputAsist");
			
			
			cap.setIdentificador(identificador);
			cap.setRutCliente(rutCliente);
			cap.setDia(dia);
			cap.setHora(hora);
			cap.setLugar(lugar);
			cap.setDuracion(duracion);
			cap.setCantidad(Integer.parseInt(cantidad));
			
			actualizar.actualizarCapacitacion(cap);
			response.sendRedirect("ListarCapacitacionBD");
			
			
	    }

	}


