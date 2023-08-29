package common;

public class Cientifica extends Calculadora implements OperacionesCientifica, IGraficacion{

	
	//Metodos heredados y sobreescritos (forma 2)
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

	//Metodos implementados (forma 3)
	@Override
	public double seno(double num) {
		// TODO Auto-generated method stub
		return Math.sin(num);
	}

	@Override
	public double potencia(double base, double exponente) {
		// TODO Auto-generated method stub
		return Math.pow(base,  exponente);
	}

	@Override
	public double tangente(double num) {
		// TODO Auto-generated method stub
		return Math.tan(num);
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
