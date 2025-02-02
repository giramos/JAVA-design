package videoclub;

/**
 * EstrategiaConcreta (PeliculaNormal)
 *
 */

public class PeliculaNormal implements TipoPelicula {

	@Override
	public int getPuntos(Alquiler alquiler) {
		return 1;
	}

	@Override
	public double getPrecio(Alquiler alquiler) {
		double precioAlquiler = 0;
		precioAlquiler += 2;
		if (alquiler.getDias() > 2)
			precioAlquiler += (alquiler.getDias() - 2) * 1.5;
		return precioAlquiler;
	}

}
