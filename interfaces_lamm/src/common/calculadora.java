package common;

public abstract class calculadora {

	String color;
	String modelo;
	
	boolean encedido;
	
	public calculadora() {
		
		
	}

	public calculadora(String color, String modelo, boolean encedido) {
		super();
		this.color = color;
		this.modelo = modelo;
		this.encedido = encedido;
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

	public boolean isEncedido() {
		return encedido;
	}

	public void prender(boolean encedido) {
		this.encedido = encedido;
	}
	
	
	public abstract double sumar(double a, double b);
	public abstract double restar(double a, double b);
	
	
	
	
	
	
	
}
