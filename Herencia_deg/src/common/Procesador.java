package common;

public class Procesador {
	
	String fabricante;
	String modelo;
	int numNucleos;
	double velocidadBase;
	Boolean hyperthreading;
	
	public Procesador () {
		
	}

	public Procesador(String fabricante, String modelo, int numNucleos, double velocidadBase, Boolean hyperthreading) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.numNucleos = numNucleos;
		this.velocidadBase = velocidadBase;
		this.hyperthreading = hyperthreading;
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

	public int getNumNucleos() {
		return numNucleos;
	}

	public void setNumNucleos(int numNucleos) {
		this.numNucleos = numNucleos;
	}

	public double getVelocidadBase() {
		return velocidadBase;
	}

	public void setVelocidadBase(double velocidadBase) {
		this.velocidadBase = velocidadBase;
	}

	public Boolean getHyperthreading() {
		return hyperthreading;
	}

	public void setHyperthreading(Boolean hyperthreading) {
		this.hyperthreading = hyperthreading;
	}

	@Override
	public String toString() {
		return "Procesador [fabricante=" + fabricante + ", modelo=" + modelo + ", numNucleos=" + numNucleos
				+ ", velocidadBase=" + velocidadBase + ", hyperthreading=" + hyperthreading + "]";
	}
    //metodo nativo
	
	public void renderizar() {
		System.out.println("Renderizar con nucleos logicos ....");
	}
}
