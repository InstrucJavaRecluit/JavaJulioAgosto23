package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class dato {
	public static void main(String args[]) {
		
		String linea = "" ;
		
		String[] dia = {"","uno","dos","tres","cuatro","cinco","sies","siete","ocho","nueve","diez","once","doce","trece","catorce",
				"quince","diesiseis,","diecisiete","dieciocho", "dicinueve", "veinte", "veintiuno", "veintidos", " veintitres",
				"veinticuatro", "veinticinco", "veintiseis" , "veintisiete", "veintiocho" , "veintinueve", "treinta", "treintaiuno"};
		
		String [] mes = {"","enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
		
		String  ano = "";
		
		try {
			File file = new File("C:\\Users\\halo2\\OneDrive\\Escritorio\\texto.txt");
			File file2 = new File("C:\\Users\\halo2\\OneDrive\\Escritorio\\Escritura.txt");
			
			FileReader fr = new FileReader(file2);
			BufferedReader buffer = new BufferedReader(fr);
			while((linea=buffer.readLine())!=null) {
			System.out.println(linea);
			
			}
			
		}catch (Exception ex) {
			
		
		}
		
	}

}
