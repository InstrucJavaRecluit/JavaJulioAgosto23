package common;

public class cientifica extends calculadora implements operacionescientificas {

	@Override
	public double sumar(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double restar(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double seno(double num) {
		// TODO Auto-generated method stub
		return Math.asin(num);
	}

	@Override
	public double potencia(double base, double exponente) {
		// TODO Auto-generated method stub
		return Math.pow(base,exponente);
	}

	@Override
	public double tangente(double num) {
		// TODO Auto-generated method stub
		return Math.tan(num);
	}

}
