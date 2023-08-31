package common;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Mapas {

	public static void main(String[] args) {
		
		//Map es una interface
		//HashMap es una clase que implementa esta interface
		Map<String, Empleado> registro = new HashMap<String, Empleado>();		
		Empleado e = new Empleado();		
		Scanner s = new Scanner(System.in);
		String nombre;
		String curp;
		int edad;
		String estado;
		String estadoCivil;
		double salarioBase;
		int opcion = 0;		
		s.useLocale(Locale.US);
		
		do {
			System.out.println("======MENU=====");
			System.out.println("1. Agregar empleado");
			System.out.println("2. Buscar empleado");
			System.out.println("3. Editar empleadoo");
			System.out.println("4. Eliminar empleado");
			System.out.println("5. Listar empleados");
			System.out.println("6. Salir");
			System.out.print("opcion: ");
			opcion = s.nextInt();
			
			switch (opcion) {
			case 1: s.nextLine();
				System.out.println("\n+++++REGISTRO DE EMPLEADO*****");
				System.out.print("Ingresa el curp del empleado: ");
				curp = s.next();
				System.out.print("Ingresa el nombre del empleado: ");
				nombre = s.next();
				System.out.print("Ingresa la edad del empleado: ");
				edad = s.nextInt();
				System.out.print("Ingresa el estado del empleado: ");
				estado = s.next();
				System.out.print("Ingresa el estado civil del empleado: ");
				estadoCivil = s.next();
				System.out.print("Ingresa el salario del empleado: ");
				salarioBase = s.nextDouble();
				
				e = new Empleado(curp, nombre, edad, estado, estadoCivil, salarioBase);
				registro.put(curp, e);
				System.out.println("****EMPLEADO REGISTRADO*****\n");
				break;
				
			case 2: System.out.println("\n*****BUSQUEDA DE EMPLEADO*****");
				System.out.print("Ingresa el curp del empleado a buscar: ");
				curp = s.next();
				
				for (int i = 0; i < registro.size(); i++) {
					if (registro.containsKey(curp)) {
						e = registro.get(curp);
						break;
					}
				}
				if (e != null) {
					System.out.println("***EMPLEADO ENCONTRADO***");
					System.out.println(e+"\n");
				} else {
					System.out.println("No se encuentra o no existe ese empleado\n");
				}
				break;
				
			case 3: System.out.println("\n*****EDITAR EMPLEADO*****");
				System.out.print("Ingresa el curp del empleado para editar: ");
				curp = s.next();
				
				if (registro.containsKey(curp)) {
					System.out.println("\n**CONTACTO ENCONTRADO**");
					System.out.print("Ingresar el Nombre: ");
					nombre = s.next();
					System.out.print("Ingresar la edad: ");
					edad = s.nextInt();
					System.out.print("Ingresa el estado del empleado: ");
					estado = s.next();
					System.out.print("Ingresa el estado civil del empleado: ");
					estadoCivil = s.next();
					System.out.print("Ingresa el salario del empleado: ");
					salarioBase = s.nextDouble();
					
					e = new Empleado(curp, nombre, edad, estado, estadoCivil, salarioBase);
					registro.put(curp, e);
					
					System.out.println("*****Empleado Actualizado*****\n");
				} else {
					System.out.println("No existe ese empleado\n");
				}
				break;
				
			case 4: System.out.println("\n*****ELIMINAR EMPLEADO*****");
				System.out.print("Ingresa el curp del empleado: ");
				curp = s.next();
				if (curp.isEmpty()) {
					System.out.println("No existe ese empleado\n");
				} else {
					if(registro.containsKey(curp)) {
						registro.remove(curp);
					}					
					System.out.println("*****Empleado Eliminado*****\n");
				}
				break;
				
			case 5: System.out.println("\n*****LISTA DE EMPLEADO*****");
				if (registro.isEmpty()) {
					System.out.println("No existe ningun empleado");
				} else {
					for (String key: registro.keySet()) {
						System.out.println(registro.get(key));
					}
				}
				System.out.println();
				break;
				
			case 6: System.out.println("Saliendo...");
				break;
				
			default: System.out.println("OPCION INVÁLIDA");
				break;
			}
		} while (opcion >= 0 && opcion <= 5);
		s.close();
	}
}
