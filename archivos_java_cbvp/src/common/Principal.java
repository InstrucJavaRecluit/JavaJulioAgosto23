package common;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	public static void main(String[] args) {
		
		String linea="";
//		String mensaje="ESTE ES UN NUEVO MENSAJE QUE DEBE ESTAR DENTRO DEL TXT";
		String destino="";
		String MES[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
	    String DIA[] = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince", "dieciseis", "diecisiete", "dieciocho", "diecinueve", "veinte", "veintiuno", "veintidos", "veintitres", "veinticuatro", "veinticinco", "veintiseis", "veintisiete", "veintiocho", "veintinueve", "treinta", "treintauno"};
		String dia;
		String mes;
		String anio;	
		String dia2 = "";
		String mes2 = "";
			
		
		try {
			File file = new File("C:\\Users\\cbvp_\\OneDrive\\Escritorio\\notas.txt");
			File file2 = new File("C:\\Users\\cbvp_\\OneDrive\\Escritorio\\destino.txt");
		
//			Codigo de lectrura
			FileReader fr = new FileReader(file);
			BufferedReader buffer = new BufferedReader(fr);
			
			while((linea=buffer.readLine())!=null) {
				dia = Character.toString(linea.charAt(0)) + Character.toString(linea.charAt(1));
				mes = Character.toString(linea.charAt(2)) + Character.toString(linea.charAt(3));
				anio = Character.toString(linea.charAt(4)) + Character.toString(linea.charAt(5)) + Character.toString(linea.charAt(6)) + Character.toString(linea.charAt(7));		
//				System.out.println(dia+" "+mes+" "+anio);
				
				for (int i = 0; i < DIA.length; i++) {
//					System.out.println(dia +" "+DIA[i]);
					if(Integer.parseInt(dia)-1 == i) {
						dia2 = DIA[i];
					}
					
				}
				
				for (int i = 0; i < MES.length; i++) {
//					System.out.println(dia +" "+DIA[i]);
					if(Integer.parseInt(mes)-1 == i) {
						mes2 = MES[i];
					}
					
				}


				destino=dia2 + " de " + mes2 + " de " + anio + "\n";
			
				FileWriter writer = new FileWriter(file2, true);
				writer.write(destino);
				writer.close();
			}
			
//			Codigo de escritura
//			FileWriter writer = new FileWriter(file, true);
//			writer.write(mensaje);
//			writer.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
	}

}
