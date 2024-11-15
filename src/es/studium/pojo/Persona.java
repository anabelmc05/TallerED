 package es.studium.pojo;

public class Persona {
	/*Atributo*/
	private String nombre;
	private String apellidos;
	private int edad; 
	private boolean haPagado;
	private int aula;

	/*Constructor por defecto*/	
	public Persona() {
		nombre = "";
		apellidos = "";
		edad = 0;
		haPagado = false;
		aula = 0;
	}
	/*Constructor por parámetros*/
	public Persona(String nombre, String apellidos, int edad, boolean haPagado, int aula) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.haPagado = haPagado;
		this.aula = aula;
	}
	/*Métodos get y set*/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean getHaPagado() {
		return haPagado;
	}
	public void setHaPagado(boolean haPagado) {
		this.haPagado = haPagado;
	}
	public int getAula() {
		return aula;
	}
	public void setAula(int aula) {
		this.aula = aula;
	}
	
}
