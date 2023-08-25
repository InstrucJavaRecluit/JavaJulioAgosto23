package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.xml.bind.ParseConversionEvent;

public class Principal {
	

	
	
    
	public static void main(String[] args) {
		
		String [] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo","Junio","Julio","Agosto","Septiembre","Octubre", "Noviembre","Diciembre"};
		   
		String unidades[] = new String[]{"", "primero", "dos", "tres", "cuatro", "cinco", "seis",
	            "siete", "ocho", "nueve"};

	    String especiales[] = new String[]{"diez","once", "doce", "trece", "catorce", "quince", "dieciseis",
	            "diecisiete", "dieciocho", "diecinueve"};
		
		String veintenas[] = new String[] {"veinte","veintiuno","veintidos","veintitres","veinticuatro","veinticinco","veintiseis","veintisiete","veintiocho","vaintinueve","treinta","trainta y uno"};
		
		
		String linea="";
		String mensaje = "";
		String n="";
		String variable2="";
		String variable3="";
		int numero=0;
		int numero2=0;
		char a;
		char b;
		char c;
		char d;
		char f;
		char g;
		char h;
		char j;
		
		
		try {
			
			String variable= "";
			
	   
		File file = new File("C:\\Users\\losga\\OneDrive\\Desktop\\nota.txt");
		File file2 = new File("C:\\Users\\losga\\OneDrive\\Desktop\\escritura.txt");
		 FileWriter writer = new FileWriter(file2, true);	
		FileReader fr= new FileReader(file);
		BufferedReader buffer =  new BufferedReader(fr);

		while((linea=buffer.readLine())!=null) {
			
			System.out.println(linea);
			for (int i = 0; i < 2; i++) {
				a = linea.charAt(0);
				b = linea.charAt(1);
				c= linea.charAt(2);
				d= linea.charAt(3);
				f = linea.charAt(4);
				g = linea.charAt(5);
				h= linea.charAt(6);
				j= linea.charAt(7);
				

				variable=Character.toString(a)+Character.toString(b);
				variable2=Character.toString(c)+Character.toString(d);
				variable3=Character.toString(f)+Character.toString(g)+Character.toString(h)+Character.toString(j);
				numero= Integer.parseInt(variable);
				numero2= Integer.parseInt(variable2);
				
				
			}
			
			if(numero<10) {
				System.out.println(unidades[numero]);
				numero=0;
				if(numero2<=12){
					
					System.out.println(numero+" de "+meses[numero2-1]+  " del " +variable3);
					
					
					mensaje = n+" de "+meses[numero2-1]+  " del " +variable3+"\n";

					numero=0;
					numero2=0;
				}
				
			}
			if (numero< 20) {
				//System.out.println(especiales[numero-10]);
				n=especiales[numero-10];
				
				
				if(numero2<=12){
					
					System.out.println(n+" de "+meses[numero2-1]+  " del " +variable3);
					
					
					mensaje = n+" de "+meses[numero2-1]+  " del " +variable3+"\n";

					numero=0;
					numero2=0;
				}
				
			}
			if(numero<32) {
				if(numero>0){

				//System.out.println(numero-20);
				
			//	System.out.println(veintenas[numero-20]);
				
				if(numero2<=12){
					
					
					System.out.println(veintenas[numero-20]   +" de "+meses[numero2-1] + " del " +variable3);
					
					
					mensaje = veintenas[numero-20]   +" de "+meses[numero2-1] + " del " +variable3+"\n";
					
					
					numero=0;
					numero2=0;
				}
				
				
				}
			}
			writer.write(mensaje);
								

	}

		writer.close();	

		

		
		

		

	//	System.out.println(variable+variable2);
		
		
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			
			
		
			
//			
//			
//	File file = new File("C:\\Users\\losga\\OneDrive\\Desktop\\nota.txt");
//	FileWriter writer = new FileWriter(file, true);
////			FileReader fr= new FileReader(file);
//			BufferedReader buffer =  new BufferedReader(fr);
////			
//			while((linea=buffer.readLine())!=null) {
//				
//				System.out.println(linea);
	
//				
//			}
//					
	
//	writer.write(mensaje);
//	writer.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//			
//		}
		
	}
	
	

}
