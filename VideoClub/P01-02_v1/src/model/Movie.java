package model;

public class Movie // Pel�cula
{
	private String title;

	public Movie(String title, MovieType movie) {
		this.title = title;
		this.movieType = movie;
	}

	public String getTitle() {
		return title;
	}

	double getPrice(Rental rental) {
		return movieType.getPrice(rental);
	}

	int getPoints(Rental rental) {
		return movieType.getPoints(rental);
	}

	MovieType movieType;

	public MovieType getMovieType() {
		return movieType;
	}

	public void setMovieType(MovieType movieType) {
		this.movieType = movieType;
	}
}
