package common;

public class PrimeraClase {

	private int valorEntero;
	protected String mensaje;
	public double decimal;
	
	
	
	
	
	public PrimeraClase() {
		super();
	}


	public PrimeraClase(int valorEntero, String mensaje, double decimal) {
		super();
		this.valorEntero = valorEntero;
		this.mensaje = mensaje;
		this.decimal = decimal;
	}


	public int getValorEntero() {
		return valorEntero;
	}


	public void setValorEntero(int valorEntero) {
		this.valorEntero = valorEntero;
	}


	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	public double getDecimal() {
		return decimal;
	}


	public void setDecimal(double decimal) {
		this.decimal = decimal;
	}


	@Override
	public String toString() {
		return "PrimeraClase [valorEntero=" + valorEntero + ", mensaje=" + mensaje + ", decimal=" + decimal + "]";
	}
	
	
	
}
