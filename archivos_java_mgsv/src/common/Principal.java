package common;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

public class Principal {
	public static void main (String[] args) {
		String linea ="";
		String mensaje =" \n ESTE ES UN NUMVO MENSAJE";
		
		
		try {
			File file =new File ("C:\\Users\\marco\\OneDrive\\Escritorio\\notas.txt");
			FileWriter writer = new FileWriter(file, true);
			
			FileReader fr = new FileReader(file);
			BufferedReader buffer = new BufferedReader(fr);
			
			while ((linea=buffer.readLine())!= null ) {
				System.out.println(linea);	
			}
			//writer.write(mensaje);
			//writer.close();
		} catch (Exception ex) {
			ex.printStackTrace ();
		}
	}
}
