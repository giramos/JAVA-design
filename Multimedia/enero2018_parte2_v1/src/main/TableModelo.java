package main;

import model.Book;
import model.CompactDisc;
import model.Mobile;
import view.Table;

public class TableModelo extends Table {

	// D) Mostrar los discos, móviles y libros en una tabla de 3 columnas 
	//    (que ponga "Título", "Propietario" e "Información" en la cabecera)
	//    - Los móviles muestran su modelo, marca y la tercera columna en blanco.
	//    - Los discos muestran su título, artista y género en cada columna.
	//    - Los libros muestran su título, autor e idioma
	
		private int longestTitulo = 0, longestPropietario = 0, longestInformacion = 0;

		@Override
		protected void dibujar() {
			
			for (Mobile m : rowsMobile)
				printRow(m.getModel(), m.getBrand(), " ");

			for (CompactDisc cd : rowsCD)
				printRow(cd.getTitle(), cd.getArtist(), cd.getGenre());
			
			for (Book b : rowsBook)
				printRow(b.getTitle(), b.getAuthor(), b.getLanguage());

		}

		private void printRow(String model, String brand, String string) {
			System.out.print("| ");
			System.out.print(fillWithBlanks(model, longestTitulo));
			System.out.print(" | ");
			System.out.print(fillWithBlanks(brand, longestPropietario));
			System.out.print(" | ");
			System.out.print(fillWithBlanks(string, longestInformacion + 4));
			System.out.println(" |");

		}

		@Override
		protected void computeRowWidths() {
			longestTitulo = longestPropietario = longestInformacion =0;
			
			for (Mobile m : rowsMobile) {
				if (m.getModel().length() > longestTitulo)
					longestTitulo = m.getModel().length();

				if (m.getBrand().length() > longestPropietario)
					longestPropietario = m.getBrand().length();
				
				if (m.getBrand().length() > longestInformacion)
					longestInformacion = m.getBrand().length();
			}

			for (CompactDisc cd : rowsCD) {
				if (cd.getTitle().length() > longestTitulo)
					longestTitulo = cd.getTitle().length();

				if (cd.getArtist().length() > longestPropietario)
					longestPropietario = cd.getArtist().length();
				
				if (cd.getGenre().length() > longestInformacion)
					longestInformacion = cd.getGenre().length() ;
			}
			
			for (Book b : rowsBook) {
				if (b.getTitle().length() > longestTitulo)
					longestTitulo = b.getTitle().length();

				if (b.getAuthor().length() > longestPropietario)
					longestPropietario = b.getAuthor().length();
				
				if (b.getLanguage().length() > longestInformacion)
					longestInformacion = b.getLanguage().length()  ;
			}

		}

		@Override
		protected void printHeader() {
			printSeparator();
			printRow("Título", "Propietario", "Información");
			printSeparator();

		}

		@Override
		protected void printSeparator() {
			System.out.print("+");
			System.out.print(createDashedLine(longestTitulo + 2));
			System.out.print("+");
			System.out.print(createDashedLine(longestPropietario + 2));
			System.out.print("+");
			System.out.print(createDashedLine(longestInformacion + 4));
			System.out.println("  +");

		}


}
