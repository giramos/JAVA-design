package database;

import google.maps.Coordinates;

import java.util.*;

import model.*;

// Clase que simula el acceso al a Base de Datos
public class Database {

	public Collection<Monument> selectMonuments() {
		List<Monument> monumentos = new ArrayList<>();
		monumentos.add(new Monument("Coliseo", "Vespasiano", "Viale del Coliseo 1. Roma"));
		monumentos.add(new Monument("Fontana di Trevi", "Niccolo Salvi", "Piazza di Trevi. Roma"));
		return monumentos;
	}

	public Collection<Photo> selectPhotos() {
		List<Photo> fotos = new ArrayList<>();
		fotos.add(new Photo("Raúl", "El Coliseo de noche", new Coordinates(20, 20)));
		fotos.add(new Photo("Raúl", "Un perro mordiendo a un turista", new Coordinates(40, 40)));
		return fotos;
	}

	public Collection<Restaurant> selectRestaurants() {
		List<Restaurant> restaurantes = new ArrayList<>();
		restaurantes.add(new Restaurant("Il Gladiatore", "Via dei Trionfo 2. Roma", "555 123 456"));
		restaurantes.add(new Restaurant("Pane e Salame",
				"Santa Maria in Via 19, Roma, Italia", "+39 06 679 1352"));
		return restaurantes;
	}
}
