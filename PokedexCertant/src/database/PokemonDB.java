package database;

import pokemon.Pokemon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class PokemonDB {

    private static ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();

    public static Pokemon getPokemon(String nombre) {

        for (Pokemon pokemon : PokemonDB.pokemones) {
            if (pokemon.name().equals(nombre)) {
                return pokemon;
            }
        }
        return null;
    }


    public static ArrayList<Pokemon> getPokemones() {
        return PokemonDB.pokemones;
    }

    public static void addPokemon(Pokemon pokemon) {
        PokemonDB.pokemones.add(pokemon);
    }

    public static void removePokemon(Pokemon pokemon) {
        PokemonDB.pokemones.remove(pokemon);
    }

    public static void fillDb() {
        Pokemon raichu = new Pokemon(
                "Raichu",
                new ArrayList<String>(Arrays.asList("Electric")),
                35,
                new ArrayList<String>(Arrays.asList("Electroshock", "Iron Tail", "Tacle")),
                new LinkedList<Pokemon>(),
                0
        );
        PokemonDB.addPokemon(raichu);

        Pokemon pikachu = new Pokemon(
                "Pikachu",
                new ArrayList<String>(Arrays.asList("Electric")),
                10,
                new ArrayList<String>(Arrays.asList("Tacle")),
                new LinkedList<Pokemon>(Arrays.asList(raichu)),
                35
        );
        PokemonDB.addPokemon(pikachu);


        Pokemon pichu = new Pokemon(
                "Pichu",
                new ArrayList<String>(Arrays.asList("Electric")),
                2,
                new ArrayList<String>(Arrays.asList("Tacle")),
                new LinkedList<Pokemon>(Arrays.asList(pikachu)),
                10
        );
        PokemonDB.addPokemon(pichu);
    }

    public static void cleanDb(){
        PokemonDB.pokemones = new ArrayList<Pokemon>();
    }

    public static void reloadDb() {
        PokemonDB.cleanDb();
        PokemonDB.fillDb();
    }
}
