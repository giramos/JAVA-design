package dash;

public class DoNothing implements Action {

	@Override
	public void accion() {
		System.out.println("[Botón sin configurar]");
	}

	@Override
	public String descripcion() {
		return "No hacer nada.";
	}
}
