package adapter;

import google.maps.BookMark;
import google.maps.Coordinates;
import google.maps.Navigator;
import model.Monument;

public class AdapterMonument implements BookMark {

	private Monument m;
	private Navigator n = new Navigator();

	public AdapterMonument(Monument monumento) {
		this.m = monumento;
	}
	@Override
	public Coordinates getCoordinates() {
		return n.getCoordinates(m.getAddress());
	}

	@Override
	public String getTooltipInfo() {
		return "Nombre: " + m.getName() + " - Autor: " + m.getAuthor();
	}

	@Override
	public void open() {
		System.out.println( "Pulsado en Monumento: Navegar hasta el "+ m.getName() + " con el GPS");

	}

}
