package common;

public class Personaje {
	
	//Atributos - QUE
	String nombre;
	int edad;
	char sexo;
	double altura;
	
	
	//Miembros por default de cualquier clase
	
	
	//Constructores
	public Personaje(){
		
	}


	public Personaje(String nombre, int edad, char sexo, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.altura = altura;
	}

	
	//Getter & Setter
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}

	//toString
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", altura=" + altura + "]";
	}

	
	//Comportamiento (3 formas) - COMO
	
	/*
	 * Metodos nativos (nacen aqui mismo)
	 * Metodos heredados (comunmente se sobreescriben)
	 * Metodos implementados (traidos de interfaces)
	 */
	
	
	

}
