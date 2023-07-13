package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Usuario;
import java.io.IOException;
import implementar.UsuarioDAO;

/**
 * Servlet implementation class CrearUsuario
 */
public class CrearUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearUsuario() {
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
		
		Usuario objus = new Usuario();
		UsuarioDAO daous = new UsuarioDAO();
		
		
		// Obtener los datos del formulario
		String  nombre, tipo, email, clave;
		
		nombre = request.getParameter("inputNombre");
		tipo = request.getParameter("inputTipo");
		email = request.getParameter("inputEmail");
		clave = request.getParameter("inputClave");
		
		// Se llena el objeto Usuario
		objus.setNombre(nombre);
		objus.setTipo(tipo);
		objus.setEmail(email);
		objus.setClave(clave);
		
		//se envia el obj a crearUsuario
		daous.crearUsuario(objus);
		response.sendRedirect("ListarUsuarioBD");

	 }


	}


