package common;

public class Alumno {
	
	//atributos
	int id;
	String nombre;
	String apellidos;
	int AñoIn;
	double promedio;

//clase vacia del contructor
    public Alumno() {
    	
    }
//clase con datos del constructor

public Alumno(int id, String nombre, String apellidos, int fechaN, double promedio) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.AñoIn = fechaN;
	this.promedio = promedio;
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

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public int getFechaN() {
	return AñoIn;
}

public void setFechaN(int fechaN) {
	this.AñoIn = fechaN;
}

public double getPromedio() {
	return promedio;
}

public void setPromedio(double promedio) {
	this.promedio = promedio;
}

// evaluacion del estado de la clase
@Override
public String toString() {
	return "Alumno [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaN=" + AñoIn + ", promedio="
			+ promedio + "]";
}
	
    
    
 }