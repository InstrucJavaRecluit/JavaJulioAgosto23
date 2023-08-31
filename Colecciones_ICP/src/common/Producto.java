package common;

public class Producto {
	
	String nombre;
	double precio;
	String departamento;
	
	public Producto() {
		
	}

	public Producto(String nombre, double precio, String departamento) {
		this.nombre = nombre;
		this.precio = precio;
		this.departamento = departamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", departamento=" + departamento + "]";
	}
	
	
}
