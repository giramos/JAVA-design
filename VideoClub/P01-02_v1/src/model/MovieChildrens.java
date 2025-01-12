package model;

public class MovieChildrens implements MovieType {

	@Override
	public double getPrice(Rental rental) {
		double price = 0;
		price += 1.5;
		if (rental.getDays() > 3)
			price += (rental.getDays() - 3) * 1.5;
		return price;
	}

	@Override
	public int getPoints(Rental rental) {
		return 1;
	}

}
