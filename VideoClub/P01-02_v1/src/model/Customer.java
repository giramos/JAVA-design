package model;

import java.util.*;

// Cliente del videoclub

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public String status() {
		double totalPrice = 0;
		int totalPoints = 0;
		String result = "Alquileres de: " + getName() + "\n";

		for (Rental rental : rentals) {

			// 1) Calcula el importe de cada alquiler
			double price = rental.getMovie().getPrice(rental);

			// 3) Acumula los totales
			totalPrice += price;
			totalPoints += rental.getMovie().getPoints(rental);

			// 4) Muestra el importe de esta película alquilada
			result += "\t" + rental.getMovie().getTitle() + "\t" + price + " €\n";
		}

		result += "La deuda es de " + totalPrice + " €\n";
		result += "Has obtenido " + totalPoints + " puntos en tu tarjeta";

		return result;
	}
}
