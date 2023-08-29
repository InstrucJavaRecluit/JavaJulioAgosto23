package common;

public class Apu extends Procesador{
	
	int vram;
	int cudaCores;
	double frecuenciaBase;
	
	public Apu() {
		
	}

	public Apu(int vram, int cudaCores, double frecuenciaBase) {
		this.vram = vram;
		this.cudaCores = cudaCores;
		this.frecuenciaBase = frecuenciaBase;
	}

	public Apu(String fabricante, String modelo, int numNucleos, double velocidadBase, boolean hyperthreading, int vram,
			int cudaCores, double frecuenciaBase) {
		super(fabricante, modelo, numNucleos, velocidadBase, hyperthreading);
		this.vram = vram;
		this.cudaCores = cudaCores;
		this.frecuenciaBase = frecuenciaBase;
	}

	public int getVram() {
		return vram;
	}

	public void setVram(int vram) {
		this.vram = vram;
	}

	public int getCudaCores() {
		return cudaCores;
	}

	public void setCudaCores(int cudaCores) {
		this.cudaCores = cudaCores;
	}

	public double getFrecuenciaBase() {
		return frecuenciaBase;
	}

	public void setFrecuenciaBase(double frecuenciaBase) {
		this.frecuenciaBase = frecuenciaBase;
	}

	@Override
	public String toString() {
		return "Apu [vram=" + vram + ", cudaCores=" + cudaCores + ", frecuenciaBase=" + frecuenciaBase + ", fabricante="
				+ fabricante + ", modelo=" + modelo + ", numNucleos=" + numNucleos + ", velocidadBase=" + velocidadBase
				+ ", hyperthreading=" + hyperthreading + "]";
	}
	
	//2: Metodo heredado (sobreescrito)
	@Override
	public void renderizar() {
		System.out.println("Renderizar con nucleos graficos/cuda ..... ");
	}
}
