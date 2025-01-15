package dash;

public class TellTheTime implements Action {

	@Override
	public void accion() {
		System.out.println("Son las 12:00");

	}

	@Override
	public String descripcion() {
		return "Decir la hora";
	}

}
