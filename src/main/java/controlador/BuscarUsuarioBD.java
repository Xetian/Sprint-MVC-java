package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Usuario;
import java.io.IOException;
import implementar.UsuarioDAO;

/**
 * Servlet implementation class BuscarUsuarioBD
 */
public class BuscarUsuarioBD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarUsuarioBD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UsuarioDAO buscar = new UsuarioDAO();
		Usuario usua = new Usuario();
		
		int id;
		id=Integer.parseInt(request.getParameter("id"));
		usua = buscar.buscarUsuario(id);
		
		request.setAttribute("usuario", usua);
        request.getRequestDispatcher("ActualizarUsuarioForm.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
