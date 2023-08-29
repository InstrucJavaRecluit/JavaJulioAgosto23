package common;

public abstract class Calculadora {
	
	String color;
	String modelo;
	boolean encendido;
	
	public Calculadora() {
		
	}

	public Calculadora(String color, String modelo, boolean encendido) {
		this.color = color;
		this.modelo = modelo;
		this.encendido = encendido;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

//	@Override
//	public String toString() {
//		return "Calculadora [color=" + color + ", modelo=" + modelo + ", encendido=" + encendido + "]";
//	}
	
	public void prender(boolean encendido) {
		this.encendido = encendido;
	}
	
	//METODOS ABSTRACTOS
	public abstract double sumar(double a, double b);
	public abstract double restar(double a, double b);
	
}
