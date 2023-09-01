package common;

public class personaje {
//Atributos - que
	
//herencias
	//acomplamiento
	//atraccion
	//polimorfismo
	
	
	String nombre;
	int edad;
	char sexo;
	double altura;
	//miembros por fedaukt
	//constructores
	
	
	public personaje() {
		
	
	}
	
	
		
	public personaje(String nombre, int edad, char sexo, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.altura = altura;
	}



	
	
	
	
	public personaje(String nombre,   double altura) {
		this.nombre=nombre;
		this.altura=altura;
			
		}
	//getter y setter
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
		return "personaje [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", altura=" + altura + "]";
		
	}







	
	
	
	
	
	





}
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//comportamiento (3 formas)
	
	
	

