package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {

	public static void main(String[] args) {
		String linea = "";
		
		String mensaje = "Otro mensaje\n";
		
		try {
			File file = new File("/home/ivan/Curso Java Agosto-Septiembre/ARCHIVOS/Archivo.txt");
//			FileWriter writer = new FileWriter(file, true); //true guarda el texto en el archivo - false borra el texto en el archivo
			FileReader fr = new FileReader(file);
			BufferedReader buffer = new BufferedReader(fr);
			
			while ((linea = buffer.readLine()) != null) {
				System.out.println(linea);
			}
//		writer.write(mensaje);
//		writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}

	}

}
