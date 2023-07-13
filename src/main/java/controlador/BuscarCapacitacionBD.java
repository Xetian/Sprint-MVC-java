package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Capacitacion;
import java.io.IOException;
import implementar.CapacitacionDAO;


/**
 * Servlet implementation class BuscarCapacitacionBD
 */
public class BuscarCapacitacionBD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarCapacitacionBD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CapacitacionDAO buscar = new CapacitacionDAO();
		Capacitacion capa = new Capacitacion();
		
		int id;
		id=Integer.parseInt(request.getParameter("id"));
		capa = buscar.buscarCapacitacion(id);
		
		request.setAttribute("capa", capa);
        request.getRequestDispatcher("ActCapacitacionForm.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
