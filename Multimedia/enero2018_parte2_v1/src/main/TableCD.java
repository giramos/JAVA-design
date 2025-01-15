package main;

import model.CompactDisc;
import view.Table;

public class TableCD extends Table {
	// B) Mostrar los discos en una tabla (que ponga "Título", "Artista" y 
	//    "Género" en la cabecera)
	private int longestTitulo = 0, longestArtista = 0, longestGenero = 0;

	@Override
	protected void dibujar() {

		for (CompactDisc cd : rowsCD)
			printRow(cd.getTitle(), cd.getArtist(), cd.getGenre());
	}

	private void printRow(String model, String brand, String string) {
		System.out.print("| ");
		System.out.print(fillWithBlanks(model, longestTitulo));
		System.out.print(" | ");
		System.out.print(fillWithBlanks(brand, longestArtista));
		System.out.print(" | ");
		System.out.print(fillWithBlanks(string, longestGenero));
		System.out.println(" |");

	}

	@Override
	protected void computeRowWidths() {
		longestTitulo = longestArtista = longestGenero =0;
		for (CompactDisc cd : rowsCD) {
			if (cd.getTitle().length() > longestTitulo)
				longestTitulo = cd.getTitle().length();

			if (cd.getArtist().length() > longestArtista)
				longestArtista = cd.getArtist().length();
			
			if (cd.getGenre().length() > longestGenero)
				longestGenero = cd.getGenre().length() ;
		}

	}

	@Override
	protected void printHeader() {
		printSeparator();
		printRow("Título", "Artista", "Género");
		printSeparator();

	}

	@Override
	protected void printSeparator() {
		System.out.print("+");
		System.out.print(createDashedLine(longestTitulo + 2));
		System.out.print("+");
		System.out.print(createDashedLine(longestArtista + 2));
		System.out.print("+");
		System.out.print(createDashedLine(longestGenero + 2));
		System.out.println("+");

	}

}
