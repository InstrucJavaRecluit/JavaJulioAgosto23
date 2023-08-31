package common;

public class Empleado {
	
	String curp;
	String nombre;
	int edad;
	String estado;
	String estadoCivil;
	double salarioBase;
	
	public Empleado() {
		
	}

	public Empleado(String curp, String nombre, int edad, String estado, String estadoCivil, double salarioBase) {
		this.curp = curp;
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.estadoCivil = estadoCivil;
		this.salarioBase = salarioBase;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	@Override
	public String toString() {
		return "Empleado [curp=" + curp + ", nombre=" + nombre + ", edad=" + edad + ", estado=" + estado
				+ ", estadoCivil=" + estadoCivil + ", salarioBase=$" + salarioBase + "]";
	}
	
	
	
}
