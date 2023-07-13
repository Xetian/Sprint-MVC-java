package interfaces;

import java.util.List;

import modelo.Capacitacion;

public interface ICapacitacion {

	void crearCapacitacion(Capacitacion obj);
	
	List<Capacitacion>listarCapacitacion();
	
	Capacitacion buscarCapacitacion(int id);
	
	void actualizarCapacitacion(Capacitacion obj);
	
	void eliminarCapacitacionID(int id);
	
}
