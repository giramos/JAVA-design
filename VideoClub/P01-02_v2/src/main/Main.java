package main;

import videoclub.*;
/**
 * Cliente (Main)
 *
 */
public class Main {

    public static void main(String[] args) {

        Pelicula hotFuzz = new Pelicula("Hot Fuzz", new PeliculaNovedad());
        Pelicula toyStory = new Pelicula("Toy Story", new PeliculaInfantil());
        Pelicula zombiesParty = new Pelicula("Zombies Party", new PeliculaNormal());

        Cliente raul = new Cliente("Raúl");
        raul.addAlquiler(new Alquiler(hotFuzz, 2));
        raul.addAlquiler(new Alquiler(toyStory, 6));
        raul.addAlquiler(new Alquiler(zombiesParty, 8));

        raul.imprimeInforme();
    }
}
