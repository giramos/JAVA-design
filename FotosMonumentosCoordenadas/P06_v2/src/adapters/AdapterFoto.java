package adapters;

import google.maps.BookMark;
import google.maps.Coordinates;
import model.Photo;

public class AdapterFoto extends Photo implements BookMark {

	public AdapterFoto(String user, String description, Coordinates coordinates) {
		super(user, description, coordinates);
	}


	@Override
	public String getTooltipInfo() {
		return null;
	}

	@Override
	public void open() {
		// TODO Auto-generated method stub

	}

}
