package dash;

import java.util.ArrayList;
import java.util.List;

public class Dash {

	public Dash() {
		this.actions = new ArrayList<Action>();
	}

	public int buttonsCount() {
		return actions.size();
	}

	public void changeButton(int button, Action action) {
		checkIsValidButton(button);
		// Eliminamos la acción a sustituir
		actions.remove(button);
		// La reemplazamos por la nueva acción
		actions.add(button, action);
	}

	public void pressButton(int button) {
		checkIsValidButton(button);
		Action action = actions.get(button);
		action.accion();
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("-----------------------\n");
		buffer.append("Dash. Botones actuales:\n");
		for (int button = 0; button < buttonsCount(); button++) {
			Action action = actions.get(button);
			String description = "No hacer nada";
			if (action != null) {
				description = action.descripcion();
			}
			buffer.append(button + ": " + description + '\n');
		}
		return buffer.toString();
	}

	private void checkIsValidButton(int button) {
		if (button < 0 || button >= actions.size())
			throw new IllegalArgumentException("¡" + button + " no es un número de botón válido!");
	}

	private List<Action> actions;
	private int buttonsCount;

	public void addAction(Action act) {
		actions.add(act);
	}
}
