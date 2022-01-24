package ACT1;
/**
 * 
 * @author Pau Robuste
 *
 */
public class Persona {
	
	private final char SEXO = 'H';
	
	//Atributos
	private String nombre;
	private int edad;
	private String dni;
	private char sexo = SEXO;
	private double peso;
	private double altura;
	
	//Constructor Default
	public Persona(String dni) {
		this.nombre = "";
		this.edad = 0;
		this.dni = dni;
		this.sexo = SEXO;
		this.peso = 0;
		this.altura = 0;
	}
	
	//Constructor con variables edad , sexo y DNI
	public Persona(String nombre, int edad, String dni, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;
	}
	
	//Constructor con todas las variables
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
}

