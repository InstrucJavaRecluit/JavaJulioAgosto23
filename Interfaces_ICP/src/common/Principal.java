package common;

public class Principal {
	
	public static void main(String[] args) {
		
		Cientifica cf = new Cientifica();
		
		System.out.println(cf.sumar(4, 9));
		System.out.println(cf.restar(4, 6));
		System.out.println(cf.seno(40));
		System.out.println(cf.tangente(40));
		System.out.println(cf.potencia(40, 3));
		System.out.println();
		cf.graficarMatriz(5, 4);
	}
	
}
