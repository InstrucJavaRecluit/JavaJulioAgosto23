package common;

public abstract class Calculadora {

	String color;
	String modelo;
	boolean encedida;
	
	public Calculadora() {
		
		
	}

	public Calculadora(String color, String modelo, boolean encedida) {
		super();
		this.color = color;
		this.modelo = modelo;
		this.encedida = encedida;
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

	public boolean isEncedida() {
		return encedida;
	}

	public void prender(boolean encedida) {
		this.encedida = encedida;
	}
	
	public abstract double sumar(double a, double b);
	public abstract  double restar(double a, double b);
	

	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", modelo=" + modelo + ", encedida=" + encedida + "]";
	}
	
	
	
}
