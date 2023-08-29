package common;

public class Pantalla {

	
	double tamano;
	String tipo;
	int tazaActualizacion;
	int resolucion;
	int ppi;
	
	
	
	
	
	public Pantalla() {
	
	}





	public Pantalla(double tamano, String tipo, int tazaActualizacion, int resolucion, int ppi) {
		super();
		this.tamano = tamano;
		this.tipo = tipo;
		this.tazaActualizacion = tazaActualizacion;
		this.resolucion = resolucion;
		this.ppi = ppi;
	}





	public double getTamano() {
		return tamano;
	}





	public void setTamano(double tamano) {
		this.tamano = tamano;
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
		return "Pantalla [tamano=" + tamano + ", tipo=" + tipo + ", tazaActualizacion=" + tazaActualizacion
				+ ", resolucion=" + resolucion + ", ppi=" + ppi + "]";
	}
	
	
	
	
}
