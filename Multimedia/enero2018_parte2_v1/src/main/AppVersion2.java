package main;

import java.util.*;

import model.*;
import server.*;
import view.Table;

public class AppVersion2 {
	public static void main(String[] args) {
		AppVersion2 store = new AppVersion2();
		store.openWindow();
	}

	public void openWindow() {
		Server server = new Server();

		List<Mobile> mobiles = server.downloadMobiles();
		List<CompactDisc> discs = server.downloadCompactDiscs();
		List<Book> books = server.downloadBooks();

		// ---------------------------------------------------------------------------------
				// A) Mostrar los móviles en una tabla (que ponga "Modelo" y "Marca" en la cabecera)
				
				/*
					+-----------+---------+
					| Modelo    | Marca   | 
					+-----------+---------+
					| Galaxy S8 | Samsung | 
					| iPhone 8  | Apple   | 
					+-----------+---------+
				*/
				
				// table = new Table...;
				// Insertar móviles
				// table.drawTable();
		
		// 1. Mostrando los datos del servidor
		Table tablem = new TableMobile();
		for (Mobile movil : mobiles) {
			tablem.insertRowMobile(movil);
		}
		tablem.drawTable();

				// ---------------------------------------------------------------------------------
				// B) Mostrar los discos en una tabla (que ponga "Título", "Artista" y 
				//    "Género" en la cabecera)
				

				/*
					+---------------+----------------+--------+
					| Título        | Artista        | Género | 
					+---------------+----------------+--------+
					| Despacito     | Luis Fonsi     | Latino | 
					| Dragon's Kiss | Marty Friedman | Metal  | 
					+---------------+----------------+--------+ 
				 */

				// table = new Table...;
				// Insertar discos
				// table.drawTable();
		Table tablec = new TableCD();
		for (CompactDisc cd : discs) {
			tablec.insertRowCD(cd);
		}
		tablec.drawTable();

				// ---------------------------------------------------------------------------------
				// C) Mostrar los libros en una tabla (que ponga "Título", "Autor",
				//    "Editorial" e "Idioma" en la cabecera)
				
				/*
					+--------------------+-------------+----------------+---------+
					| Título             | Autor       | Editorial      | Idioma  |
					+--------------------+-------------+----------------+---------+
					| El Código Da Vinci | Dan Brown   | Planeta        | Español |
					| Design Patterns    | Erich Gamma | Addison-Wesley | Español |
					+--------------------+-------------+----------------+---------+
				*/

				// table = new Table...;
				// Insertar libros
				// table.drawTable();

		Table tableb = new TableBook();
		for (Book b : books) {
			tableb.insertRowBook(b);
		}
		tableb.drawTable();
				// ---------------------------------------------------------------------------------
				// D) Mostrar los discos, móviles y libros en una tabla de 3 columnas 
				//    (que ponga "Título", "Propietario" e "Información" en la cabecera)
				//    - Los móviles muestran su modelo, marca y la tercera columna en blanco.
				//    - Los discos muestran su título, artista y género en cada columna.
				//    - Los libros muestran su título, autor e idioma

				/*
					+--------------------+----------------+-------------+
					| Título             | Propietario    | Información |
					+--------------------+----------------+-------------+
					| Galaxy S8          | Samsung        |             |
					| iPhone 8           | Apple          |             |
					| Despacito          | Luis Fonsi     | Latino      |
					| Dragon's Kiss      | Marty Friedman | Metal       |
					| El Código Da Vinci | Dan Brown      | Español     |
					| Design Patterns    | Erich Gamma    | Español     |
					+--------------------+----------------+-------------+
				*/

				// table = new Table...;
				// Insertar móviles, discos y libros
				// table.drawTable();

		Table tableModelo = new TableModelo();
		for (Mobile movil : mobiles) {
			tableModelo.insertRowMobile(movil);
		}
		for (CompactDisc cd : discs) {
			tableModelo.insertRowCD(cd);
		}
		for (Book b : books) {
			tableModelo.insertRowBook(b);
		}
		tableModelo.drawTable();
		
		server.uploadMobiles(mobiles);
		server.uploadCompactDiscs(discs);
		server.uploadBooks(books);
	}
}
