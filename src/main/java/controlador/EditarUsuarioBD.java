package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Usuario;
import java.io.IOException;
import implementar.UsuarioDAO;

/**
 * Servlet implementation class EditarUsuarioBD
 */
public class EditarUsuarioBD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarUsuarioBD() {
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
		
			Usuario usuario = new Usuario();
			UsuarioDAO actualizo = new UsuarioDAO();
			// Obtener los datos del formulario
			String  nombre, tipo, email, clave,id;
				

				
				nombre = request.getParameter("inputNombre");
				tipo = request.getParameter("inputTipo");
				email = request.getParameter("inputEmail");
				clave = request.getParameter("inputClave");
				id=request.getParameter("campoOculto");
				
				usuario.setNombre(nombre);
				usuario.setTipo(tipo);
				usuario.setEmail(email);
				usuario.setClave(clave);
				usuario.setId(Integer.parseInt(id));
				
				actualizo.actualizarUsuario(usuario);
				response.sendRedirect("ListarUsuarioBD");
				
				
		    }

}
		
		
		
		
		
	


