package videoclub;

public class Pelicula {
	private String titulo;

	TipoPelicula tipoPelicula;

	public Pelicula(String titulo, TipoPelicula tipo) {
		this.titulo = titulo;
		this.tipoPelicula = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	int getPuntos(Alquiler alquiler) {
		return tipoPelicula.getPuntos(alquiler);
	}

	double getPrecio(Alquiler alquiler) {
		return tipoPelicula.getPrecio(alquiler);
	}
}
