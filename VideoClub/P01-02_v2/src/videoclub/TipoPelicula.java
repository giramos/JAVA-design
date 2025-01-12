package videoclub;

/**
 * Estrategia (interfaz)
 * 
 * Metodos: algorithInterface() : int getPuntos(Alquiler alquiler) AND double
 * getPrecio(Alquiler alquiler)
 *
 */
public interface TipoPelicula {

	int getPuntos(Alquiler alquiler);

	double getPrecio(Alquiler alquiler);
}
