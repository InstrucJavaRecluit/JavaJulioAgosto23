package common;

public class Cientifica extends Calculadora implements OperacionesCientificas, IGraficacion{
	
	//Metodos heredados y sobreescritos (forma 2)
	@Override
	public double sumar(double a, double b) {
		return a+b;
	}

	@Override
	public double restar(double a, double b) {
		return a-b;
	}

	@Override
	public double seno(double num) {
		return Math.sin(num);
	}
	
	//Metodos implementados (forma 3)
	@Override
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}

	@Override
	public double tangente(double num) {
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
