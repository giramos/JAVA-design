package adapter;

import google.maps.BookMark;
import google.maps.Coordinates;
import model.Photo;

public class AdapterPhoto implements BookMark {

	private Photo foto;

	public AdapterPhoto(Photo foto) {
		this.foto = foto;
	}

	@Override
	public Coordinates getCoordinates() {
		return foto.getCoordinates();
	}

	@Override
	public String getTooltipInfo() {
		return "Descripción: " + foto.getDescription() + " - " + "Usuario: " + foto.getUser();
	}

	@Override
	public void open() {
		foto.download();

	}

}
