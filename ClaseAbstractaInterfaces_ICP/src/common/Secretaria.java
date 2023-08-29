package common;

public class Secretaria extends Empleado {
	
	
	
	public Secretaria() {
		
	}
	
	@Override
	public void trabajar() {
		System.out.println("Contestar llamadas, agendar citar,"
				+ " control de agenda, redaccion de documentos");
	}
	
}
