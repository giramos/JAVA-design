package view;

import java.util.ArrayList;
import java.util.List;

import multimedia.Multimedia;

public class Table {
	// -- Métodos públicos
	// -------------------------------------------------------------

	public void insertRow(Multimedia m) {
		multimedia.add(m);
	}

	public void drawTable(String string1, String string2) {
		computeRowWidths();

		printHeader(string1, string2);
		for (Multimedia m : multimedia)
			printRow(m.getString1(), m.getString2());
		printSeparator();
		System.out.println();
	}

	// -- Métodos privados
	// -------------------------------------------------------------

	private void computeRowWidths() {
		longestStr1 = longestStr2 = 0;
		for (Multimedia m : multimedia) {
			if (m.getString1().length() > longestStr1)
				longestStr1 = m.getString1().length();

			if (m.getString2().length() > longestStr2)
				longestStr2 = m.getString2().length();
		}
	}

	private void printHeader(String string1, String string2) {
		printSeparator();
		printRow(string1, string2);
		printSeparator();
	}

	private void printRow(String str1, String str2) {
		System.out.print("| ");
		System.out.print(fillWithBlanks(str1, longestStr1));
		System.out.print(" | ");
		System.out.print(fillWithBlanks(str2, longestStr2));
		System.out.println(" |");
	}

	private void printSeparator() {
		System.out.print("+");
		System.out.print(createDashedLine(longestStr1 + 2));
		System.out.print("+");
		System.out.print(createDashedLine(longestStr2 + 2));
		System.out.println("+");
	}

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
	private String createDashedLine(int ancho) {
		return String.format("%0" + ancho + "d", 0).replace('0', '-');
	}

	private List<Multimedia> multimedia = new ArrayList<>();
//	private List<CompactDisc> rows = new ArrayList<CompactDisc>();
	private int longestStr1 = 0, longestStr2 = 0;
}
