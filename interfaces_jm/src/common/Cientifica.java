package common;

public class Cientifica extends Calculadora implements IOperacionesCientificas, IGraficacion {

	@Override
	public double seno(double num) {
		// TODO Auto-generated method stub
		return Math.sin(num);
	}

	@Override
	public double potencia(double base, double exponente) {
		// TODO Auto-generated method stub
		return Math.pow(base, exponente);
	}

	@Override
	public double tangentte(double num) {
		// TODO Auto-generated method stub
		return Math.tan(num);
	}

	@Override
	public double sumar(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double restar(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public void graficarMatriz(int base, int altura) {
		
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
		
		
		
	}

}
