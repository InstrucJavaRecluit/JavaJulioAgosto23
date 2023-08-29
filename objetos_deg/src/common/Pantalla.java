package common;

public class Pantalla {
	
	Double tama�o;
	String tipoPantalla;
	int frecuencia;
	int resolucion;
	int pipi;
	
	public Pantalla() {
		
	}

	public Pantalla(Double tama�o, String tipoPantalla, int frecuencia, int resolucion, int pipi) {
		super();
		this.tama�o = tama�o;
		this.tipoPantalla = tipoPantalla;
		this.frecuencia = frecuencia;
		this.resolucion = resolucion;
		this.pipi = pipi;
	}

	public Double getTama�o() {
		return tama�o;
	}

	public void setTama�o(Double tama�o) {
		this.tama�o = tama�o;
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
		return "Pantalla [tama�o=" + tama�o + ", tipoPantalla=" + tipoPantalla + ", frecuencia=" + frecuencia
				+ ", resolucion=" + resolucion + ", pipi=" + pipi + "]";
	}
    
}   
