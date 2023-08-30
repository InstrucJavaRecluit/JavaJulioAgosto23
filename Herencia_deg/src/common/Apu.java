package common;

public class Apu extends Procesador{

	int vram;
	int cuadCores;
	double frecuencia;
	
	public Apu () {
		
	}

	public Apu(int vram, int cuadCores, double frecuencia) {
		
		this.vram = vram;
		this.cuadCores = cuadCores;
		this.frecuencia = frecuencia;
	}

	public Apu(String fabricante, String modelo, int numNucleos, double velocidadBase, Boolean hyperthreading, int vram,
			int cuadCores, double frecuencia) {
		super(fabricante, modelo, numNucleos, velocidadBase, hyperthreading);
		this.vram = vram;
		this.cuadCores = cuadCores;
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Apu [vram=" + vram + ", cuadCores=" + cuadCores + ", frecuencia=" + frecuencia + "]";
	}

	public int getVram() {
		return vram;
	}

	public void setVram(int vram) {
		this.vram = vram;
	}

	public int getCuadCores() {
		return cuadCores;
	}

	public void setCuadCores(int cuadCores) {
		this.cuadCores = cuadCores;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	//metodo  heredado sobreescrito
	@Override
	public void renderizar () {
		System.out.println("Renderizar con nucleos graficos/cuda ...");
	}
	
	
}
