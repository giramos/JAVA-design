package main;

import model.Customer;
import model.Movie;
import model.MovieChildrens;
import model.MovieNewRelease;
import model.MovieRegular;
import model.Rental;

public class Main {

	public static void main(String[] args) {

		Customer raul = new Customer("Raúl");

		Movie hotFuzz = new Movie("Hot Fuzz", new MovieNewRelease());
		Movie toyStory = new Movie("Toy Story", new MovieChildrens());
		Movie zombiesParty = new Movie("Zombies Party", new MovieRegular());

		raul.addRental(new Rental(hotFuzz, 2));
		raul.addRental(new Rental(toyStory, 6));
		raul.addRental(new Rental(zombiesParty, 8));

		System.out.println(raul.status());

	}
}
