package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import modelo.Capacitacion;
import implementar.CapacitacionDAO;

/**
 * Servlet implementation class ListarCapacitacionBD
 */
public class ListarCapacitacionBD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitacionBD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			 List<Capacitacion>lis = new ArrayList<Capacitacion>();
			 CapacitacionDAO objcap = new CapacitacionDAO();
		
			 lis = objcap.listarCapacitacion();
		   
			request.setAttribute("lis", lis);

			request.getRequestDispatcher("CapacitacionForm.jsp").forward(request, response);
			
		}catch(Exception e){
			System.out.println("no conectado "+e.getMessage());
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
