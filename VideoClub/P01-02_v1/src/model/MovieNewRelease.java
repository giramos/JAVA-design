package model;

public class MovieNewRelease implements MovieType {

	@Override
	public double getPrice(Rental rental) {
		double price = 0;
		price += rental.getDays() * 3;
		return price;
	}

	@Override
	public int getPoints(Rental rental) {
		int points = 1;
		if (rental.getDays() > 1)
			points = 2;
		return points;
	}

}
