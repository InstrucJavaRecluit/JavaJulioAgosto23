package common;

public class primeraclase {
	
	private int valorentero;
	protected String mensage;
	public double decimal;
	
public primeraclase(int valorentero, String mensaje, double decimal){
		this.valorentero= valorentero;
		this.mensage= mensaje;
		this.decimal= decimal;
		
	
}

public primeraclase() {
	// TODO Auto-generated constructor stub
}

public int getValorentero() {
	return valorentero;
}

public void setValorentero(int valorentero) {
	this.valorentero = valorentero;
}

public String getMensage() {
	return mensage;
}

public void setMensage(String mensage) {
	this.mensage = mensage;
}

public double getDecimal() {
	return decimal;
}

public void setDecimal(double decimal) {
	this.decimal = decimal;
}
	
	
	
	
	
	
	
	
	
}
