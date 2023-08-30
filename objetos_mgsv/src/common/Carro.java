package common;

public class Carro {
	
	//Atributos QUE
	String placa;
	int num_llantas;
	String color;
	
	
	//Cosntructores
	
	public Carro(String placa, int num_llantas, String color) {
		super();
		this.placa = placa;
		this.num_llantas = num_llantas;
		this.color = color;
	}
	
	public Carro(String placa,  String color) {
		super();
		this.placa = placa;
		this.color = color;
	}
	
	public Carro() {

	}
	
	//getter & setters

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getNum_llantas() {
		return num_llantas;
	}

	public void setNum_llantas(int num_llantas) {
		this.num_llantas = num_llantas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", num_llantas=" + num_llantas + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
