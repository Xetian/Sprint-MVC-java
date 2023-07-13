package modelo;

public class Cliente {
	private String nombres;
    private String apellidos;
    private int rut;
    private String telefono;
    private String afp;
    private int sistSalud;
    private String direccion;
    private String comuna;
    private int edad;
    
    
	public Cliente() {
		super();
	}


	public Cliente(String nombres, String apellidos, int rut, String telefono, String afp, int sistSalud,
			String direccion, String comuna, int edad) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.rut = rut;
		this.telefono = telefono;
		this.afp = afp;
		this.sistSalud = sistSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getRut() {
		return rut;
	}


	public void setRut(int rut) {
		this.rut = rut;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getAfp() {
		return afp;
	}


	public void setAfp(String afp) {
		this.afp = afp;
	}


	public int getSistSalud() {
		return sistSalud;
	}


	public void setSistSalud(int sistSalud) {
		this.sistSalud = sistSalud;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getComuna() {
		return comuna;
	}


	public void setComuna(String comuna) {
		this.comuna = comuna;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	
    
    
    
    
}
