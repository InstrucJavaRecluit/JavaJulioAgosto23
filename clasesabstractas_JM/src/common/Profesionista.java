package common;

public class Profesionista {

	
	String nombre;
	String cedula;
	String carrera;
	
	public Profesionista() {
		
		
	}

	public Profesionista(String nombre, String cedula, String carrera) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Profesionista [nombre=" + nombre + ", cedula=" + cedula + ", carrera=" + carrera + "]";
	}
	
	
}
