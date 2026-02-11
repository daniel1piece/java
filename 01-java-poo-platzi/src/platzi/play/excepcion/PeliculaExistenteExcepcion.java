package platzi.play.excepcion;

public class PeliculaExistenteExcepcion extends RuntimeException {
	public PeliculaExistenteExcepcion(String titulo) {
		super("El contenido " + titulo + " ya existe.");
	}
}
