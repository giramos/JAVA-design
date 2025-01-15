package multimedia;

import model.Mobile;

public class MultimediaMobile_v1 implements Multimedia {
	
	private Mobile movil;

	public MultimediaMobile_v1(Mobile movil) {
		this.movil = movil;
	}

	@Override
	public String getString2() {
		return movil.getBrand();
	}

	@Override
	public String getString1() {
		return movil.getModel();
	}

}
