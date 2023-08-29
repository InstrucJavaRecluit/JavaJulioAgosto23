package common;

public class Pantalla {
	
	Double tamaño;
	String tipoPantalla;
	int frecuencia;
	int resolucion;
	int pipi;
	
	public Pantalla() {
		
	}

	public Pantalla(Double tamaño, String tipoPantalla, int frecuencia, int resolucion, int pipi) {
		super();
		this.tamaño = tamaño;
		this.tipoPantalla = tipoPantalla;
		this.frecuencia = frecuencia;
		this.resolucion = resolucion;
		this.pipi = pipi;
	}

	public Double getTamaño() {
		return tamaño;
	}

	public void setTamaño(Double tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipoPantalla() {
		return tipoPantalla;
	}

	public void setTipoPantalla(String tipoPantalla) {
		this.tipoPantalla = tipoPantalla;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public int getPipi() {
		return pipi;
	}

	public void setPipi(int pipi) {
		this.pipi = pipi;
	}

	@Override
	public String toString() {
		return "Pantalla [tamaño=" + tamaño + ", tipoPantalla=" + tipoPantalla + ", frecuencia=" + frecuencia
				+ ", resolucion=" + resolucion + ", pipi=" + pipi + "]";
	}
    
}   
