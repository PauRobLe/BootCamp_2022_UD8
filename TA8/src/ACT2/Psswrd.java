package ACT2;
/**
 * 
 * @author Pau Robuste
 *
 */
public class Psswrd {
	
	//Variables
	private int longitud;
	private int contraseña;
	
	//Constructor Default
	public Psswrd() {
		this.longitud = 8;
		this.contraseña = genPsswrd(longitud);
	}

	//Constructor con Variables
	public Psswrd(int longitud) {
		this.longitud = longitud;
		this.contraseña = genPsswrd(longitud);
	}
	
	//Metodo generar contraseña
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
		return contraseña;
	}
}
