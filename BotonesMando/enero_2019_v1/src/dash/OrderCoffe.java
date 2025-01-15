package dash;

public class OrderCoffe implements Action {

	@Override
	public void accion() {
		System.out.println("Conectando con el servidor...");
        System.out.println("Pedido online realizado de café");
	}

	@Override
	public String descripcion() {
		return "Pedir online café";

	}

}
