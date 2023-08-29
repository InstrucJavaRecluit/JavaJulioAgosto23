package common;

public class Apu extends Procesador {
	
	int vram;
	int cudaCores;
	double frecuenciaBase;
	
	public Apu() {
		
	}

	public Apu(String fabricante, String modelo, int numeroNucleos, double velocidadBase, boolean hyperthreding,
			int vram, int cudaCores, double frecuenciaBase) {
		super(fabricante, modelo, numeroNucleos, velocidadBase, hyperthreding);
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
				+ fabricante + ", modelo=" + modelo + ", numeroNucleos=" + numeroNucleos + ", velocidadBase="
				+ velocidadBase + ", hyperthreding=" + hyperthreding + "]";
	}
	
	
	public void renderizar() {
		System.out.println("Renderizado  con nucleos");
		
	}
	

}
