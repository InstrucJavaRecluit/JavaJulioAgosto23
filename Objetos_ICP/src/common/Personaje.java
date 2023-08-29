package common;

public class Personaje {
	
	//Atributos - QUE
	
	String nombre;
	int edad;
	char genero;
	double altura;
	
	//Miembros por default de cualquier clase
	
	//Constructores
	public Personaje() {
	}

	public Personaje(String nombre, int edad, char genero, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.altura = altura;
	}
	
	//Getter && Setters
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

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//toString / Sobreescritura
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", altura=" + altura + "]";
	}
	
	//Comportameinto (3 formas) - COMO
	
}
