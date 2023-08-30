package common;

public class PrimerClase {
	
	private int valorEntero;
	protected String mensaje;
	public double decimal;
	
	public PrimerClase() {
		
	}

	public PrimerClase(int valorEntero, String mensaje, double decimal) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(decimal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((mensaje == null) ? 0 : mensaje.hashCode());
		result = prime * result + valorEntero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrimerClase other = (PrimerClase) obj;
		if (Double.doubleToLongBits(decimal) != Double.doubleToLongBits(other.decimal))
			return false;
		if (mensaje == null) {
			if (other.mensaje != null)
				return false;
		} else if (!mensaje.equals(other.mensaje))
			return false;
		if (valorEntero != other.valorEntero)
			return false;
		return true;
	}
	
	

}
