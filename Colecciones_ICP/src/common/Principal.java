package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//List es una interface
		//ArrayList es una implementacion de esta interface
		
		/*
		 * Array vs ArrayList
		 * Array: Estructura de datos del mismo tipo (estatica)
		 * ArrayList: Coleccion de datos del mismo tipo (dinamica)
		 */
		//Producto p = new Producto();
		
		String nombre;
		double precio;
		String departamento;
		
		List<Producto> lista = new ArrayList<Producto>();
		
		Producto p = null;
		int opcion = 0;
		Scanner s = new Scanner(System.in);
		s.useLocale(Locale.US);
		
		do {
			System.out.println("======MENU=====");
			System.out.println("1. Agregar producto");
			System.out.println("2. Buscar producto");
			System.out.println("3. Editar producto");
			System.out.println("4. Eliminar producto");
			System.out.println("5. Listar productos");
			System.out.println("6. Salir");
			System.out.print("opcion: ");
			opcion = s.nextInt();
			
			switch (opcion) { 
				case 1: s.nextLine();
					System.out.println("\n*****AGREGAR PRODUCTO*****");
					System.out.println("Inserta el nombre del producto: ");
					nombre = s.nextLine();
					System.out.println("Inserta el precio del producto: ");
					precio = s.nextDouble();
					s.nextLine();
					System.out.println("Inserta el departamento: ");
					departamento = s.nextLine();
					
					p = new Producto(nombre, precio, departamento);
					lista.add(p);
					System.out.println("*****Producto Registrado*****\n");
					break;

				case 2: s.nextLine();
					System.out.println("\n*****BUSCAR PRODUCTO*****");
					System.out.println("Inserta el nombre del producto: ");
					nombre = s.nextLine();
					
					if (nombre.isEmpty()) {
						System.out.println("No se encuentra o no existe ese producto\n");
					} else {
						System.out.println("\n****Producto Encontrado****");
						for (int i = 0; i < lista.size(); i++) {
							if (lista.get(i).getNombre().equals(nombre)) {
								p = lista.get(i);
								break; //Se rompe el ciclo
							}
						}
					}					
					if (p != null) {						
						System.out.println("Producto: "+p);
					} 
					System.out.println();
					break;
					
				case 3: s.nextLine();					
					System.out.println("Inserta el nombre del producto a editar: ");
					nombre = s.nextLine();
					
					for (int i = 0; i < lista.size(); i++) {
						if (lista.get(i).getNombre().equals(nombre)) {
							System.out.println("\n*****EDITAR PRODUCTO*****");
							System.out.println("Inserta el precio del producto: ");
							precio = s.nextDouble();
							System.out.println("Inserta el departamento: ");
							departamento = s.next();
							
							lista.get(i).setPrecio(precio);
							lista.get(i).setDepartamento(departamento);
							System.out.println("*****Producto Actualizado*****\n");
						}
					}
					break;
					
				case 4: s.nextLine();
					System.out.println("\n*****ELIMINAR PRODUCTO*****");
					System.out.println("Ingresa el nombre del producto: ");
					nombre = s.nextLine();
					
					if (nombre.isEmpty()) {
						System.out.println("No existe ese producto\n");
					} else {
						for (int i = 0; i < lista.size(); i++) {
							if (lista.get(i).getNombre().equals(nombre)) {
								lista.remove(i);
								break;
							}
						}
						System.out.println("*****Producto Eliminado*****");
					}
					break;
					
				case 5: s.nextLine();
					System.out.println("\n*****LISTAR PRODUCTOS*****");
					if (lista.isEmpty()) {
						System.out.println("No existen ningun producto\n");
					} else {
						for (Producto producto : lista) {
							System.out.println("PRODUCTO ["
											 + producto.getNombre()+" - $"
											 + producto.getPrecio()+" - "
											 + producto.getDepartamento()+"]");
						}							
					}					
					System.out.println();
					break;
				
				case 6: System.out.println("Saliendo de la coleccion...");
					break;
					
				default: System.out.println("OPCION INVALIDA\n");
					break;
			}			
		} while (opcion >= 0 && opcion <= 5);
		s.close();
	}

}
