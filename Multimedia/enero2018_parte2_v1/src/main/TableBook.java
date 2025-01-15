package main;

import model.Book;
import model.CompactDisc;
import view.Table;

public class TableBook extends Table {
	// C) Mostrar los libros en una tabla (que ponga "Título", "Autor",
	//    "Editorial" e "Idioma" en la cabecera)

	private int longestTitulo = 0, longestAutor = 0, longestEditorial = 0, longestIdioma = 0;

	@Override
	protected void dibujar() {

		for (Book b : rowsBook)
			printRow(b.getTitle(), b.getAuthor(), b.getEditorial(), b.getLanguage());
	}

	private void printRow(String model, String brand, String string, String string2) {
		System.out.print("| ");
		System.out.print(fillWithBlanks(model, longestTitulo));
		System.out.print(" | ");
		System.out.print(fillWithBlanks(brand, longestAutor));
		System.out.print(" | ");
		System.out.print(fillWithBlanks(string, longestEditorial));
		System.out.print(" | ");
		System.out.print(fillWithBlanks(string2, longestIdioma));
		System.out.println(" |");

	}

	@Override
	protected void computeRowWidths() {
		longestTitulo = longestAutor = longestEditorial = longestIdioma = 0;
		for (Book b : rowsBook) {
			if (b.getTitle().length() > longestTitulo)
				longestTitulo = b.getTitle().length();

			if (b.getAuthor().length() > longestAutor)
				longestAutor = b.getAuthor().length();
			
			if (b.getEditorial().length() > longestEditorial)
				longestEditorial = b.getEditorial().length() ;
			
			if (b.getLanguage().length() > longestIdioma)
				longestIdioma = b.getLanguage().length()  ;
		}

	}

	@Override
	protected void printHeader() {
		printSeparator();
		printRow("Título", "Autor", "Editorial", "Idioma");
		printSeparator();

	}

	@Override
	protected void printSeparator() {
		System.out.print("+");
		System.out.print(createDashedLine(longestTitulo + 2));
		System.out.print("+");
		System.out.print(createDashedLine(longestAutor + 2));
		System.out.print("+");
		System.out.print(createDashedLine(longestEditorial + 2));
		System.out.print("+");
		System.out.print(createDashedLine(longestIdioma + 2));
		System.out.println("+");

	}


}
