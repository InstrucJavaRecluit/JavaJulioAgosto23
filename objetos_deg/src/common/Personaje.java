package common;

public class Personaje {
	
		
		//Atributos - QUE
		String  nombre;
		int edad;
		char sexo;
		double altura;
		
		//Miembro por default de cualquier clase
		
		
		//Constructores
		public Personaje() {
			
		}
//sobre carga de metodos
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
		
		
		//Getter % Setter
		public String getNombre() {
			return nombre;
		}
		//mecanismo de entrada del objeto
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		//mecanismo de salida del objeto
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
		
		//toString - conocer el estado del objeto
		@Override
		public String toString() {
			return "Personaje [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", altura=" + altura + "]";
		}
		
		//Comportaiento( 3 formas) - COMO
		
		
		//1: metodos nativos - son los mismo metodos que se hacen en la clase
		//2: metodos heredados - 
		//3: metodos implementados - son traidos de interfaces
		
		
	

}
