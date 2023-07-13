package controlador;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Contacto
 */
public class Contacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contacto() {
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
		PrintWriter obj = response.getWriter();

		String espacio, titulo, rut, nombre, texto;

		espacio = "<br>";
		titulo = "Sus consulta sera revisada en breve :" + "<hr />";
		rut = "Rut : " + request.getParameter("inputRut");
		nombre = "Nombre : " + request.getParameter("inputNombre");
		texto = "Texto : " + request.getParameter("inputTexto");

		request.setAttribute("espacio", espacio);
		request.setAttribute("titulo", titulo);
		request.setAttribute("rut", rut);
		request.setAttribute("nombre", nombre);
		request.setAttribute("texto", texto);

		RequestDispatcher enviar;
		enviar = request.getRequestDispatcher("Contacto.jsp");
		enviar.forward(request, response);

		obj.close();

	}
	}


