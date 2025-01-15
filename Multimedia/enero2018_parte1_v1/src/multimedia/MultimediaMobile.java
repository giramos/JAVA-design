package multimedia;

import model.Mobile;

public class MultimediaMobile implements Multimedia {
	
	private Mobile movil;

	public MultimediaMobile(Mobile movil) {
		this.movil = movil;
	}

	@Override
	public String getString1() {
		return movil.getBrand();
	}

	@Override
	public String getString2() {
		return movil.getModel();
	}

}
