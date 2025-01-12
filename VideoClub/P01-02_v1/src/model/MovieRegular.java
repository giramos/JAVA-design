package model;

public class MovieRegular implements MovieType {

	@Override
	public double getPrice(Rental rental) {
		double price = 0;
		price += 2;
		if (rental.getDays() > 2)
			price += (rental.getDays() - 2) * 1.5;
		return price;
	}

	@Override
	public int getPoints(Rental rental) {
		return 1;
	}

}
