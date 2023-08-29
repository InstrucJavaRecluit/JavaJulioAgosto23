package common;

public class Telefono {
	
	String marcar;
	String modelo;
	String color;
	String numeoroSerie;
	
	Pantalla pantalla;
	Procesador procesador;
	
	public Telefono () {
		
	}

	public Telefono(String marcar, String modelo, String color, String numeoroSerie, Pantalla pantalla,
			Procesador procesador) {
		super();
		this.marcar = marcar;
		this.modelo = modelo;
		this.color = color;
		this.numeoroSerie = numeoroSerie;
		this.pantalla = pantalla;
		this.procesador = procesador;
	}

	public String getMarcar() {
		return marcar;
	}

	public void setMarcar(String marcar) {
		this.marcar = marcar;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumeoroSerie() {
		return numeoroSerie;
	}

	public void setNumeoroSerie(String numeoroSerie) {
		this.numeoroSerie = numeoroSerie;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	@Override
	public String toString() {
		return "Telefono [marcar=" + marcar + ", modelo=" + modelo + ", color=" + color + ", numeoroSerie="
				+ numeoroSerie + ", pantalla=" + pantalla + ", procesador=" + procesador + "]";
	}
	


}
