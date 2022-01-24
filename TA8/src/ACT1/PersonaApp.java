package ACT1;
/**
 * 
 * @author Pau Robuste
 *
 */
public class PersonaApp {
	
	public static void main(String[] args) {
		
		//Creacion Personas
		Persona persona1=new Persona("91100723M");
		Persona persona2=new Persona("Andres", 19, "91100724N", 'H');
		Persona persona3=new Persona("Luis", 22, "91100724O", 'H', 66.30, 1.55);
		
		//Mostrar Personas
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());
	}
}
