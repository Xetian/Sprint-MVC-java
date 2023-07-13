package implementar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Conector;
import modelo.Usuario;
import interfaces.IUsuario;


public class UsuarioDAO implements IUsuario{
	
	
	
	
	private Connection con = null;
	

	@Override
	public void crearUsuario(Usuario obj) {
		String sql = "INSERT INTO usuarios (nombre, tipo, email, clave) VALUES (?,?,?,?);";
		try {
			con = Conector.getCon();
			PreparedStatement us = con.prepareStatement(sql);
			
			us.setString(1, obj.getNombre());
			us.setString(2, obj.getTipo());
			us.setString(3, obj.getEmail());
			us.setString(4, obj.getClave());
			
			
			
			if(!us.execute()) {
				System.out.println("Registro Creado");
			}else {
				System.out.println("Registro fallo");
			}
			us.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	

	@Override
	public List<Usuario> listarUsuarios() {
		
		List<Usuario>lisu = new ArrayList<Usuario>();
		String nombre,tipo,email,clave;
		int cod;
		
		try {
			Connection conusu=Conector.getCon();
			Statement obju = conusu.createStatement();
			ResultSet usucons = obju.executeQuery("SELECT * FROM usuarios");
			while (usucons.next()) { 
				
			cod = usucons.getInt("id");
			nombre = usucons.getString("nombre");
			tipo = usucons.getString("tipo");
			email = usucons.getString("email");
			clave = usucons.getString("clave");
			
			
			Usuario usua = new Usuario();
			
			usua.setId(cod);
			usua.setNombre(nombre);
			usua.setTipo(tipo);
			usua.setEmail(email);
			usua.setClave(clave);
			
			
			lisu.add(usua);
			}
			obju.close();
			usucons.close();
			}catch(Exception e){
			System.out.println("no conectado "+e.getMessage());
		}
		return lisu;
	}

	
	
	
	
	
	@Override
	public Usuario buscarUsuario(int id) {
		Usuario usu = new Usuario();
		String nombre,tipo,email,clave;
		int cod;
		try {
			Connection conusu=Conector.getCon();
			Statement obju = conusu.createStatement();
			ResultSet usucons = obju.executeQuery("SELECT * FROM usuarios WHERE id="+id);
			while (usucons.next()) { 
				
			cod = usucons.getInt("id");
			nombre = usucons.getString("nombre");
			tipo = usucons.getString("tipo");
			email = usucons.getString("email");
			clave = usucons.getString("clave");
			
			usu.setId(cod);
			usu.setNombre(nombre);
			usu.setTipo(tipo);
			usu.setEmail(email);
			usu.setClave(clave);
			}
			
			}catch(Exception e){
			System.out.println("no conectado "+e.getMessage());
		}
		return usu;
	}

	
	
	
	
	
	@Override
	public void actualizarUsuario(Usuario obj) {
		
		String sql = "UPDATE usuarios SET nombre= ?, tipo = ?, email = ?, clave = ? WHERE id = ?;";
		try {
			con = Conector.getCon();
			PreparedStatement us = con.prepareStatement(sql);
			
			// Insertar la nueva capacitación en la base de datos
			us.setString(1, obj.getNombre());
			us.setString(2, obj.getTipo());
			us.setString(3, obj.getEmail());
			us.setString(4, obj.getClave());
			us.setInt(5, obj.getId());
			//us.executeUpdate();
			
			
			
			if(!us.execute()) {
				System.out.println("Registro Actualizado");
			}else {
				System.out.println("Registro fallo");
			}
			us.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void eliminarUsuarioID(int id) {
		try {
			String sql = "DELETE  FROM usuarios WHERE id ="+id;
			Connection usucon = Conector.getCon();
			Statement objusu = usucon.createStatement();
			objusu.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	

}
