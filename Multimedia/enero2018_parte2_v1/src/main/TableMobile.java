package main;

import model.Mobile;
import view.Table;

public class TableMobile extends Table {
	private int longestBrand = 0, longestModel = 0;


	@Override
	protected void dibujar() {

		for (Mobile m : rowsMobile)
			printRow(m.getModel(), m.getBrand());
	}

	private void printRow(String model, String brand) {
		System.out.print("| ");
		System.out.print(fillWithBlanks(model, longestModel));
		System.out.print(" | ");
		System.out.print(fillWithBlanks(brand, longestBrand));
		System.out.println(" |");

	}

	@Override
	protected void computeRowWidths() {
		longestBrand = longestModel = 0;
		for (Mobile m : rowsMobile) {
			if (m.getModel().length() > longestModel)
				longestModel = m.getModel().length();

			if (m.getBrand().length() > longestBrand)
				longestBrand = m.getBrand().length();
		}

	}

	@Override
	protected void printHeader() {
		printSeparator();
		printRow("Modelo", "Marca");
		printSeparator();

	}

	@Override
	protected void printSeparator() {
		System.out.print("+");
		System.out.print(createDashedLine(longestModel + 2));
		System.out.print("+");
		System.out.print(createDashedLine(longestBrand + 2));
		System.out.println("+");

	}

}
