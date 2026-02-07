package platzi.play;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;
import platzi.play.utils.ScannerUtils;

public class Main {
	public static final String NOMBRE_PLATAFORMA = "PLATZI PLAY 🍿";
	public static final String VERSION = "1.0.0";
	
	public static void main(String[] args) {
		System.out.println(NOMBRE_PLATAFORMA + " v" + VERSION);
		
		String nombre = ScannerUtils.capturarTexto("Nombre del contenido?: ");
		String genero = ScannerUtils.capturarTexto("Genero del contenido?: ");
		int duracion = ScannerUtils.capturarNumero("Duracion del contenido?: ");
		double calificacion = ScannerUtils.capturarDecimal("Calificacion del contenido?: ");
		
		Pelicula pelicula = new Pelicula(nombre, duracion, genero);
		pelicula.fechaEstreno = LocalDate.of(2018, 10, 15);
		pelicula.calificar(calificacion);
		
		System.out.println(pelicula.obtenerFichaTecnica());
		
		Usuario usuario = new Usuario("Juan", "juan@platzi.com");
		
		System.out.println(usuario.fechaRegistro);
		
		usuario.ver(pelicula);
		
	
	}
}



































