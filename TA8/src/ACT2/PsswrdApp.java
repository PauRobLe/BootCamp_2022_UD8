package ACT2;
/**
 * 
 * @author Pau Robuste
 *
 */
public class PsswrdApp {
	
	public static void main(String[] args) {
		
		//Creamos una contrasenya
		Psswrd p1 = new Psswrd();
		Psswrd p2 = new Psswrd(5);
		
		System.out.println(p1.getPsswrd());
		System.out.println(p2.getPsswrd());

	}
}
