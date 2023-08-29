package common;

public class Procesador {
	
	String marca;
	int nucleos;
	int velocidad;



   public Procesador () {
	   
   }
   
public Procesador(String marca, int nucleos, int velocidad) {
	super();
	this.marca = marca;
	this.nucleos = nucleos;
	this.velocidad = velocidad;
}

public String getMarca() {
	return marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public int getNucleos() {
	return nucleos;
}

public void setNucleos(int nucleos) {
	this.nucleos = nucleos;
}

public int getVelocidad() {
	return velocidad;
}

public void setVelocidad(int velocidad) {
	this.velocidad = velocidad;
}

@Override
public String toString() {
	return "Procesador [marca=" + marca + ", nucleos=" + nucleos + ", velocidad=" + velocidad + "]";
}
   
}