package common;

public class Principal {

	public static void main(String[] args) {
		
		
		Telefono telefono =  new Telefono();
		Pantalla pantalla =  new Pantalla(7.5,"OLED", 120,1080,2000);
		Procesador procesador = new Procesador("qualcom",8,3.5);
		
		telefono.setMarca("SONY");
		telefono.setColor("Negro");
		telefono.setModelo("xperia");
		telefono.setNumeroSerie("DFGGERWE223");
		telefono.setPantalla(pantalla);
		telefono.setProcesador(procesador);
		
		System.out.println(telefono);
	}
	
}
