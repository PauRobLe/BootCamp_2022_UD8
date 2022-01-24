package ACT4;
/**
 * 
 * @author Pau Robuste
 *
 */
public class SerieApp {
	
	public static void main(String[] args) {
		
		//Creamos Series
		Serie s1 = new Serie();
		Serie s2 = new Serie("Spiderman", "Tobey Maguire");
		Serie s3 = new Serie("I Robot", 4, "Accio", "Will");
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
	}
}
