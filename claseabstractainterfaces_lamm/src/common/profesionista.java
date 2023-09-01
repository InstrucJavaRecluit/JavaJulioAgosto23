package common;

public class profesionista {

String nombre;
String cedula;
String carrera;

public profesionista() {
	
	
	
	
}

@Override
public String toString() {
	return "profesionista [nombre=" + nombre + ", cedula=" + cedula + ", carrera=" + carrera + "]";
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
	
	
}
