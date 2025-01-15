package multimedia;

import model.Book;

public class MultimediaBook implements Multimedia {

	private Book book;

	public MultimediaBook(Book book) {
		this.book = book;
	}
	@Override
	public String getString1() {
		return book.getTitle();
	}

	@Override
	public String getString2() {
		return book.getAuthor();
	}

}
