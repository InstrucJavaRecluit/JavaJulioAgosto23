package common;

public class Pantalla {
	
	double tamanio;
	String tipo;
	int tazaActualizacion;
	int resolucion;
	int ppi;
	
	public Pantalla() {
	}

	public Pantalla(double tamanio, String tipo, int tazaActualizacion, int resolucion, int ppi) {
		super();
		this.tamanio = tamanio;
		this.tipo = tipo;
		this.tazaActualizacion = tazaActualizacion;
		this.resolucion = resolucion;
		this.ppi = ppi;
	}

	public double getTamanio() {
		return tamanio;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTazaActualizacion() {
		return tazaActualizacion;
	}

	public void setTazaActualizacion(int tazaActualizacion) {
		this.tazaActualizacion = tazaActualizacion;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public int getPpi() {
		return ppi;
	}

	public void setPpi(int ppi) {
		this.ppi = ppi;
	}

	@Override
	public String toString() {
		return "Pantalla [tamanio=" + tamanio + ", tipo=" + tipo + ", tazaActualizacion=" + tazaActualizacion
				+ ", resolucion=" + resolucion + ", ppi=" + ppi + "]";
	}
	
	
}
