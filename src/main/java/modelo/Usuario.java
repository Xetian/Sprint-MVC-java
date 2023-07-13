package modelo;

public class Usuario {
	private int id;
	private String nombre;
	private String tipo;
	private String email;
	private String clave;

	

	public Usuario() {
		super();
	}



	public Usuario(int id,String nombre, String tipo, String email, String clave) {
		super();
		this.id=id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.email = email;
		this.clave = clave;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		if(tipo.equalsIgnoreCase("cliente")||tipo.equalsIgnoreCase("administrativo")||tipo.equalsIgnoreCase("profesional")) {
			this.tipo = tipo;
		}else {
			System.out.println("no corresponde al tipo");
		}
		
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getClave() {
		return clave;
	}



	public void setClave(String clave) {
		this.clave = clave;
	}

}
