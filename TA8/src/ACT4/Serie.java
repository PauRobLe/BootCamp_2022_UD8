package ACT4;
/**
 * 
 * @author Pau Robuste
 *
 */
public class Serie {
	
	private final boolean ENTREGADO = false;
	private final int TEMPORADAS = 3;
	
	//Variables
	private String titulo;
	private int temporadas = TEMPORADAS;
	private boolean entregado = ENTREGADO;
	private String genero;
	private String creador;

	//Constructor Default
	public Serie() {
		this.titulo = "";
		this.temporadas = TEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = "";
	}

	//Constructor Variables titulo y creador
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = TEMPORADAS;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = creador;
	}

	//Constructor con todas las Variables
	public Serie(String titulo, int temporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = ENTREGADO;
		this.genero = genero;
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [ENTREGADO=" + ENTREGADO + ", TEMPORADAS=" + TEMPORADAS + ", titulo=" + titulo + ", temporadas="
				+ temporadas + ", entregado=" + entregado + ", genero=" + genero + ", creador=" + creador + "]";
	}
}
