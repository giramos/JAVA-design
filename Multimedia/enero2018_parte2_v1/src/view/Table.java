package view;

import java.util.*;

import model.*;

public abstract class Table {

	

	// -- Métodos públicos
	// -------------------------------------------------------------

	public void insertRowCD(CompactDisc cd) {
		rowsCD.add(cd);
	}
	
	public void insertRowMobile(Mobile m) {
		rowsMobile.add(m);
	}
	
	public void insertRowBook(Book b) {
		rowsBook.add(b);
	}

	public void drawTable() {
		computeRowWidths();

		printHeader();
		dibujar();
		printSeparator();
		System.out.println();

	}

	protected abstract void dibujar();
//	{
//		for (CompactDisc cd : rows)
//			printRow(cd.getTitle(), cd.getArtist());
//	}

	// -- Métodos privados
	// -------------------------------------------------------------

//	private void computeRowWidths() {
//		longestTitle = longestArtist = 0;
//		for (CompactDisc disco : rows) {
//			if (disco.getTitle().length() > longestTitle)
//				longestTitle = disco.getTitle().length();
//
//			if (disco.getArtist().length() > longestArtist)
//				longestArtist = disco.getArtist().length();
//		}
//	}
	
	protected abstract void computeRowWidths();
//	longestTitle = longestArtist = 0;
//	for (CompactDisc disco : rows) {
//		if (disco.getTitle().length() > longestTitle)
//			longestTitle = disco.getTitle().length();
//
//		if (disco.getArtist().length() > longestArtist)
//			longestArtist = disco.getArtist().length();
//	}

	protected abstract void printHeader(); 
//	{
//		printSeparator();
//		printRow("Título", "Artista");
//		printSeparator();
//	}

//	private void printRow(String title, String artist) {
//		System.out.print("| ");
//		System.out.print(fillWithBlanks(title, longestTitle));
//		System.out.print(" | ");
//		System.out.print(fillWithBlanks(artist, longestArtist));
//		System.out.println(" |");
//	}

	protected abstract void printSeparator();
//	{
//		System.out.print("+");
//		System.out.print(createDashedLine(longestTitle + 2));
//		System.out.print("+");
//		System.out.print(createDashedLine(longestArtist + 2));
//		System.out.println("+");
//	}

	/**
	 * Si el ancho del texto recibido como parámetro es menor que el deseado añade
	 * espacios hasta que el texto tenga el número de caracteres deseado.
	 * 
	 * Ejemplo: fillWithBlanks("abc", 5) -> "abc " (añade dos espacios)
	 */
	public static String fillWithBlanks(String text, int width) {
		return String.format("%1$-" + width + "s", text);
	}

	/**
	 * Devuelve una raya de tantos caracteres como indique el parámetro.
	 * 
	 * Ejemplo: createDashedLine(5) -> "-----"
	 */
	protected String createDashedLine(int ancho) {
		return String.format("%0" + ancho + "d", 0).replace('0', '-');
	}

	protected List<CompactDisc> rowsCD = new ArrayList<CompactDisc>();
	protected List<Book> rowsBook = new ArrayList<Book>();
	protected List<Mobile> rowsMobile = new ArrayList<Mobile>();
//	private int longestTitle = 0, longestArtist = 0;
}
