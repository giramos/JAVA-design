package multimedia;

import model.CompactDisc;

public class MultimediaCD implements Multimedia {
	
	private CompactDisc cd;

	public MultimediaCD(CompactDisc cd) {
		this.cd = cd;
	}

	@Override
	public String getString1() {
		return cd.getTitle()	;
	}

	@Override
	public String getString2() {
		return cd.getArtist();
	}

}
