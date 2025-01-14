package adapter;

import google.maps.BookMark;
import google.maps.Coordinates;
import google.maps.Navigator;
import model.Restaurant;

public class AdapterRestaurant implements BookMark {

	private Restaurant bar;

	private Navigator navigator = new Navigator();

	public AdapterRestaurant(Restaurant restaurant) {
		this.bar = restaurant;
	}

	@Override
	public Coordinates getCoordinates() {
		return navigator.getCoordinates(bar.getAddress());
	}

	@Override
	public String getTooltipInfo() {
		return "Nombre: " + bar.getName() + " - Teléfono: " + bar.getPhone();
	}

	@Override
	public void open() {
		bar.call();

	}

}
