package common;

public class Telefono {
	
	String marca;
	String color;
	String modelo;
	String numSerie;
	Pantalla pantalla;
	Procesador procesador;
	
	public Telefono() {
	}

	public Telefono(String marca, String color, String modelo, String numSerie, Pantalla pantalla, Procesador procesador) {
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.numSerie = numSerie;
		this.pantalla = pantalla;
		this.procesador = procesador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
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
		return "Telefono [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", numSerie=" + numSerie
				+ ", pantalla=" + pantalla + ", procesador=" + procesador + "]";
	}
	
}
