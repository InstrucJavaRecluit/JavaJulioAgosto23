package common;

public class Albañil extends Empleado{
	
	public Albañil(){
		
	}

	@Override
	public void trabajar() {
		System.out.println("Pegar blocs, "
				+ "crear mezcal, "
				+ "medir niveles, "
				+ "colocar tabiques, "
				+ "pegar lozeta");
	}
}
