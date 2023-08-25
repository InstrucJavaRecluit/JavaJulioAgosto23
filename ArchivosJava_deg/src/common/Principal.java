package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Principal {
	public static void main(String srgs[]) {
		
		String linea="";
		
		String mensaje = "";
		
		try {
			File file = new File("C:\\Users\\halo2\\OneDrive\\Escritorio\\texto.txt");
//			FileWriter writer = new FileWriter(file,true);
			
			FileReader fr = new FileReader(file);//CARGAR EL CONTENIDO DEL ARVCHIVO EN UNA CACHE
			BufferedReader buffer = new BufferedReader(fr);//permite leer el contenido del cache
			while((linea=buffer.readLine())!=null) {
				System.out.println(linea);
				
				//System.out.println(linea.toLowerCase());// para hacerlo minusculas
				//System.out.println(linea.charAt(0));//imprime la prime letra de cada linea
			}
//			writer.write(mensaje);
//			writer.close();
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

}
