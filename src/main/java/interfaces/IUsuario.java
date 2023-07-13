package interfaces;

import java.util.List;

import modelo.Usuario;

public interface IUsuario {

	void crearUsuario(Usuario obj);
	
	List<Usuario>listarUsuarios();
	
	Usuario buscarUsuario(int id);
	
	void actualizarUsuario(Usuario obj);
	
	void eliminarUsuarioID(int id);
	
	
}
