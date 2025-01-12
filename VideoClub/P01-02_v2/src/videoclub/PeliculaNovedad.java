package videoclub;

public class PeliculaNovedad implements TipoPelicula {

	@Override
	public int getPuntos(Alquiler alquiler) {
		int puntosAlquiler = 1;
		if (alquiler.getDias() > 1)
		    puntosAlquiler = 2;
		return puntosAlquiler;
	}

	@Override
	public double getPrecio(Alquiler alquiler) {
		double precioAlquiler = 0;
        precioAlquiler += alquiler.getDias() * 3;
		return precioAlquiler;
	}

}
