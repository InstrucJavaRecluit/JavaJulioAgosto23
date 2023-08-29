package common;

public class Principal {

	public static void main(String[] args) {
		
		Personaje per1 = new Personaje();
		
		per1.setNombre("Superman");
		per1.setAltura(2.00);
		per1.setEdad(60);
		per1.setGenero('M');
		
		Personaje per2 = new Personaje("Batman",53,'M',1.95);

		//System.out.println(per2);
		//System.out.println(per1);
		
//--------------------------------------------------------------------------------------------------------------------------- 
		
		Telefono tel1 = new Telefono();
		Pantalla pan = new Pantalla(7.5,"OLED",120,1080,2000);
		Procesador proc = new Procesador("Snapdragon 680",6,2.0);
		
		tel1.setMarca("XIAOMI");
		tel1.setColor("Azul cielo");
		tel1.setModelo("2201117TL");
		tel1.setNumSerie("14.0.2");
		tel1.setPantalla(pan);
		tel1.setProcesador(proc);
		
		System.out.println(tel1);
	}
}
