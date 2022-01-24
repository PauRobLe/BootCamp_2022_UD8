package ACT2;
/**
 * 
 * @author Pau Robuste
 *
 */
public class Psswrd {
	
	//Variables
	private int longitud;
	private int contrase�a;
	
	//Constructor Default
	public Psswrd() {
		this.longitud = 8;
		this.contrase�a = genPsswrd(longitud);
	}

	//Constructor con Variables
	public Psswrd(int longitud) {
		this.longitud = longitud;
		this.contrase�a = genPsswrd(longitud);
	}
	
	//Metodo generar contrase�a
	public int genPsswrd(int longitud) {
		String contrasenyaS = "";
				
		for (int i = 0; i<longitud; i++) {
			int valor = (int) (Math.random() * (9 - 0));
			String valorS = Integer.toString(valor);
			contrasenyaS = contrasenyaS + valorS;
		} 
		int contrasenya = Integer.parseInt(contrasenyaS);
		
		return contrasenya; 
	}
	
	//Getters & Setters
	public int getPsswrd() {
		return contrase�a;
	}
}
