package common;

public class Telefono {

	String marca;
	String modelo;
	String color;
	String numeroSerie;
	
	Pantalla pantalla ;
	Procesador procesador;
	


	public Telefono() {
		
		
	}

	public Telefono(String marca, String modelo, String color, String numeroSerie, Pantalla pantalla, Procesador procesador) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.numeroSerie = numeroSerie;
		this.pantalla = pantalla;
		this.procesador = procesador; 
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
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
		return "Telefono [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", numeroSerie=" + numeroSerie
				+ ", pantalla=" + pantalla + ", procesador=" + procesador + "]";
	}


	
	
	
	
}
