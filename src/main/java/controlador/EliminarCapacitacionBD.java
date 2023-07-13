package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import implementar.CapacitacionDAO;


/**
 * Servlet implementation class EliminarCapacitacionBD
 */
public class EliminarCapacitacionBD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarCapacitacionBD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CapacitacionDAO eliminar = new CapacitacionDAO();
		
		int  id;
		try {
		id=Integer.parseInt(request.getParameter("id"));
		eliminar.eliminarCapacitacionID(id);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	       response.sendRedirect("ListarCapacitacionBD");
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
