package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
	private static Connection con = null;


	private Conector() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prevencion_riesgos","root","etian123");
			if(con!= null) {
				System.out.println("Conectadoo");
			}else { 
				System.out.println("NO conectado");
			} 
		}catch(ClassNotFoundException e) {
			System.out.println("NO conectado : ClassNotFoundException");
			e.printStackTrace();
			
		}catch(SQLException e) {
			System.out.println("NO conectado : SQLException");
			e.printStackTrace();
			
		}
	}


	public static Connection getCon() {
		if(con == null) {
			new Conector();
		}
		return con;
	}
}
