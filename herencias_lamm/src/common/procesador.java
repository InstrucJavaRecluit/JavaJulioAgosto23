package common;

public class procesador {

	String fabricante;
    String modelo;
    int numnucleos;
    double velocidadbase;
    boolean hyperthreading;
    
    
    
    public procesador() {
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



	public int getNumnucleos() {
		return numnucleos;
	}



	public void setNumnucleos(int numnucleos) {
		this.numnucleos = numnucleos;
	}



	public double getVelocidadbase() {
		return velocidadbase;
	}



	public void setVelocidadbase(double velocidadbase) {
		this.velocidadbase = velocidadbase;
	}



	public boolean isHyperthreading() {
		return hyperthreading;
	}



	public void setHyperthreading(boolean hyperthreading) {
		this.hyperthreading = hyperthreading;
	}



	public procesador(String fabricante, String modelo, int numnucleos, double velocidadbase, boolean hyperthreading) {
		super();
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.numnucleos = numnucleos;
		this.velocidadbase = velocidadbase;
		this.hyperthreading = hyperthreading;
	}



	@Override
	public String toString() {
		return "procesador [fabricante=" + fabricante + ", modelo=" + modelo + ", numnucleos=" + numnucleos
				+ ", velocidadbase=" + velocidadbase + ", hyperthreading=" + hyperthreading + "]";
	}



public void renderizar() {
	
	System.out.println("renderizar con nucleos graficos");
}


}