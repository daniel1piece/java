package platzi.play.contenido;
// This is immutable data
// so that the record does not 
// have any setters
public record ResumenContenido(
		String titulo, 
		int duracion, 
		Genero genero) {

}
