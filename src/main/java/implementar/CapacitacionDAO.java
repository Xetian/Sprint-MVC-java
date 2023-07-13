package implementar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import conexion.Conector;
import interfaces.ICapacitacion;
import modelo.Capacitacion;


public class CapacitacionDAO implements ICapacitacion{

	
	private Connection con = null;
	
	
	
	@Override
	public void crearCapacitacion(Capacitacion obj) {
		
		try {
			
			String sql = "INSERT INTO capacitaciones (rutCliente, dia, hora, lugar, duracion, cantidad) VALUES (?,?,?,?,?,?);";
			Connection con = Conector.getCon();
			PreparedStatement objin = con.prepareStatement(sql);

            
			objin.setString(1,obj.getRutCliente());
			objin.setString(2,obj.getDia());
			objin.setString(3,obj.getHora());
			objin.setString(4,obj.getLugar());
			objin.setString(5,obj.getDuracion());
			objin.setInt(6,obj.getCantidad());
			objin.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            
        }
    }
		
	

	@Override
	public List<Capacitacion> listarCapacitacion() {
		
		List<Capacitacion>lista = new ArrayList<Capacitacion>();
		String cod, rut, dia, hora, ciudad, duracion, cant;
		
		try {
			Connection con=Conector.getCon();
			Statement objesta = con.createStatement();
			ResultSet consult = objesta.executeQuery("SELECT * FROM capacitaciones");
			while (consult.next()) { 
				
			cod = consult.getString("id");
			rut = consult.getString("rutCliente");
			dia = consult.getString("dia");
			hora = consult.getString("hora");
			ciudad = consult.getString("lugar");
			duracion = consult.getString("duracion");
			cant = consult.getString("cantidad");
			
			Capacitacion ca = new Capacitacion();
			
			ca.setIdentificador(cod);
			ca.setRutCliente(rut);
			ca.setDia(dia);
			ca.setHora(hora);
			ca.setLugar(ciudad);
			ca.setDuracion(duracion);
			ca.setCantidad(Integer.parseInt(cant));
			lista.add(ca);
			}
			objesta.close();
			consult.close();
		}catch(Exception e){
			System.out.println("no conectado "+e.getMessage());
		}
			return lista;
	
		}
	
	
	
	@Override
	public Capacitacion buscarCapacitacion(int id) {
		
		Capacitacion cap = new Capacitacion();
		String identificador,rutCliente, dia,hora,lugar,duracion,cantidad;
		
		try {
			Connection con=Conector.getCon();
			Statement crear = con.createStatement();
			ResultSet result = crear.executeQuery("SELECT * FROM capacitaciones WHERE id="+id);
			while (result.next()) { 
				
			identificador = result.getString("id");
			rutCliente = result.getString("rutCliente");
			dia = result.getString("dia");
			hora = result.getString("hora");
			lugar = result.getString("lugar");
			duracion = result.getString("duracion");
			cantidad = result.getString("cantidad");
			
			cap.setIdentificador(identificador);
			cap.setRutCliente(rutCliente);
			cap.setDia(dia);
			cap.setHora(hora);
			cap.setLugar(lugar);
			cap.setDuracion(duracion);
			cap.setCantidad(Integer.parseInt(cantidad));
			}
			
			}catch(Exception e){
			System.out.println("no conectado "+e.getMessage());
		}
		return cap;
	}

	
	
	
	
	@Override
	public void actualizarCapacitacion(Capacitacion obj) {
		String sql = "UPDATE capacitaciones SET rutCliente= ?, dia = ?, hora = ?, lugar = ?,duracion = ?,cantidad = ? WHERE id = ?;";
		try {
			con = Conector.getCon();
			PreparedStatement cap = con.prepareStatement(sql);
			
			// Insertar la nueva capacitación en la base de datos
			cap.setString(1, obj.getRutCliente());
			cap.setString(2, obj.getDia());
			cap.setString(3, obj.getHora());
			cap.setString(4, obj.getLugar());
			cap.setString(5, obj.getDuracion());
			cap.setInt(6, obj.getCantidad());
			cap.setString(7,obj.getIdentificador());
			cap.executeUpdate();
			
			
			
			if(!cap.execute()) {
				System.out.println("Registro Actualizado");
			}else {
				System.out.println("Registro fallo");
			}
			cap.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	
	
	@Override
	public void eliminarCapacitacionID(int id) {
		try {
			String sql = "DELETE  FROM capacitaciones WHERE id ="+id;
			Connection cap = Conector.getCon();
			Statement objcap = cap.createStatement();
			objcap.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
