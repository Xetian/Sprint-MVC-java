package modelo;

public class Profesional {
	private String titulo;
    private String fechaIng;
	/**
	 * 
	 */
	public Profesional() {
		super();
	}
	/**
	 * @param titulo
	 * @param fechaIng
	 */
	public Profesional(String titulo, String fechaIng) {
		super();
		this.titulo = titulo;
		this.fechaIng = fechaIng;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFechaIng() {
		return fechaIng;
	}
	public void setFechaIng(String fechaIng) {
		this.fechaIng = fechaIng;
	}
    
    
    
    
    
}
