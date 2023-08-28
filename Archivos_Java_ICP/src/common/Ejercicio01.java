package common;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejercicio01 {

	public static void main(String[] args) {
		String linea = "";
		
		String[] dias = {"", "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve",
                "Diez", "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciséis", "Diecisiete",
                "Dieciocho", "Diecinueve", "Veinte", "Veintiuno", "Veintidós", "Veintitrés", "Veinticuatro",
                "Veinticinco", "Veintiséis", "Veintisiete", "Veintiocho", "Veintinueve", "Treinta", "Treinta y Uno"};
		String[] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		try {
			File file = new File("/home/ivan/Curso Java Agosto-Septiembre/ARCHIVOS/FechasNumero.txt");
			File nuevoArchivo = new File("/home/ivan/Curso Java Agosto-Septiembre/ARCHIVOS/FechasTexto.txt");
			
			//LEER
			FileReader fr = new FileReader(file);
			BufferedReader buffer = new BufferedReader(fr);
			//ESCRIBIR
			FileWriter writer = new FileWriter(nuevoArchivo);
			
			//LEER
			while ((linea = buffer.readLine()) != null ) {				
				String diaS = linea.substring(0, 2);
				String mesS = linea.substring(2, 4);
				String anioS = linea.substring(4);

				int dia = Integer.parseInt(diaS);
				int mes = Integer.parseInt(mesS);
				int anio = Integer.parseInt(anioS);
				
				String fechaTexto = dias[dia]+" de "+meses[mes]+" del "+anio;
				System.out.println("Fecha en numero: "+linea);
				writer.write("Fecha en texto: "+fechaTexto+"\n");
			}
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
