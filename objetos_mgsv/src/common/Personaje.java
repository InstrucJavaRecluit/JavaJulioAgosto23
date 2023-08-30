package common;

public class Personaje {
	//Atributos QUE
	String nombre;
	int edad;
	char sexo;
	double altura;
	
	
	
	
	//Miembros por default de cualquier clase 
	
	
	//cosntructores
	public Personaje(String nombre, int edad, char sexo, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.altura = altura;
	}
	
	public Personaje(String nombre, double altura) {
		super();
		this.nombre = nombre;
		this.altura = altura;
	}

	//getter & setters
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

	
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", altura=" + altura + "]";
	}
	
	
	
	
	
	
	
	//Comportamientos (3 formas) - COMO
	
	
	
	
	
	
}
