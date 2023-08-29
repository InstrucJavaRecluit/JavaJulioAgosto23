package common;

public class Procesador {

	String fabricante;
	String modelo;
	int numeroNucleos;
	double velocidadBase;
	boolean hyperthreding;
	
	
	
	public Procesador() {
		
	}



	public Procesador(String fabricante, String modelo, int numeroNucleos, double velocidadBase,
			boolean hyperthreding) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.numeroNucleos = numeroNucleos;
		this.velocidadBase = velocidadBase;
		this.hyperthreding = hyperthreding;
	}



	public String getFabricante() {
		return fabricante;
	}



	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getNumeroNucleos() {
		return numeroNucleos;
	}



	public void setNumeroNucleos(int numeroNucleos) {
		this.numeroNucleos = numeroNucleos;
	}



	public double getVelocidadBase() {
		return velocidadBase;
	}



	public void setVelocidadBase(double velocidadBase) {
		this.velocidadBase = velocidadBase;
	}



	public boolean isHyperthreding() {
		return hyperthreding;
	}



	public void setHyperthreding(boolean hyperthreding) {
		this.hyperthreding = hyperthreding;
	}



	@Override
	public String toString() {
		return "Procesador [fabricante=" + fabricante + ", modelo=" + modelo + ", numeroNucleos=" + numeroNucleos
				+ ", velocidadBase=" + velocidadBase + ", hyperthreding=" + hyperthreding + "]";
	}
	
	
	public void renderizar() {
		System.out.println("Renderizado  con multinucleos ");
		
	}
	
	
}
