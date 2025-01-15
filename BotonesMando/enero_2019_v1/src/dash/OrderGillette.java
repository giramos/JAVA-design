package dash;

public class OrderGillette implements Action {

	@Override
	public void accion() {
		System.out.println("Conectando con el servidor...");
        System.out.println("Pedido online realizado de Gillete");
	}

	@Override
	public String descripcion() {
		return "Pedir online Gillette";

	}

}
