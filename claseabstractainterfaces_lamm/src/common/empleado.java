package common;

public class empleado {

	private String nombre;
	private int edad;
	private double salario;
	
	public empleado() {
		
		
	}
	
	
	public empleado(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return "empleado [nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + "]";
	}
	public  void trabajar() {
	
	}
}
