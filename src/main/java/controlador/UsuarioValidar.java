package controlador;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import modelo.Usuario;

/**
 * Servlet implementation class UsuarioValidar
 */
public class UsuarioValidar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsuarioValidar() {
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
		String nombre = request.getParameter("inputNombre");
		String clave = request.getParameter("inputClave");

		if (nombre.equalsIgnoreCase("admin")) {

			if (clave.equalsIgnoreCase("1234")) {
				Usuario us = new Usuario();
				HttpSession sesion = request.getSession();
				sesion.setAttribute("usu", us);
				request.getRequestDispatcher("Inicio.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("Login.jsp").forward(request, response);
			}
		} else {
			request.getRequestDispatcher("Login.jsp").forward(request, response);
		}

	}
	}


