package common;

public class Principal {
	public static void main(String args []) {
		
//		Personaje per1 = new Personaje();
//		per1.setNombre("Superman");
//		per1.setAltura(2.00);
//		per1.setEdad(60);
//		per1.setSexo('M');
//		Personaje per2 = new Personaje("batman", 53, 'M', 1.75);
//		
//		System.out.println(per1);
//		System.out.println(per2);
		
	 Telefono tel = new Telefono();
	 Pantalla pan = new Pantalla (7.5, "OLED", 120, 1080, 360);
	 Procesador pro = new Procesador ("qualcom", 8, 3);
	  tel.setMarcar("SAMSUNG");
	  tel.setColor("Negro");
	  tel.setModelo("Galaxy");
	  tel.setNumeoroSerie("DEEG99494E");
	}
	

}
