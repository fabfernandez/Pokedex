package database;

import pokemon.Pokemon;

import java.util.ArrayList;
import java.util.Arrays;

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

        Pokemon missingno = new Pokemon(
                "MissingNO",
                new ArrayList<String>(Arrays.asList("Normal", "Bird")),
                100,
                new ArrayList<String>(Arrays.asList("Glitch")),
                null,
                100
        );
        PokemonDB.addPokemon(missingno);

        Pokemon charizard = new Pokemon(
                "Charizard",
                new ArrayList<String>(Arrays.asList("Fire", "Dragon")),
                40,
                new ArrayList<String>(Arrays.asList("Fly", "Ember", "Flamethrower")),
                null,
                36
        );
        PokemonDB.addPokemon(charizard);

        Pokemon charmeleon = new Pokemon(
                "Charmeleon",
                new ArrayList<String>(Arrays.asList("Fire")),
                20,
                new ArrayList<String>(Arrays.asList("Ember", "Flamethrower")),
                charizard,
                36
        );
        PokemonDB.addPokemon(charmeleon);

        Pokemon charmander = new Pokemon(
                "Charmander",
                new ArrayList<String>(Arrays.asList("Fire")),
                10,
                new ArrayList<String>(Arrays.asList("Ember", "Tacle")),
                charmeleon,
                16
        );
        PokemonDB.addPokemon(charmander);

        Pokemon raichu = new Pokemon(
                "Raichu",
                new ArrayList<String>(Arrays.asList("Electric")),
                35,
                new ArrayList<String>(Arrays.asList("Electroshock", "Iron Tail", "Tacle")),
                null,
                35
        );
        PokemonDB.addPokemon(raichu);

        Pokemon pikachu = new Pokemon(
                "Pikachu",
                new ArrayList<String>(Arrays.asList("Electric")),
                10,
                new ArrayList<String>(Arrays.asList("Tacle")),
                raichu,
                35
        );
        PokemonDB.addPokemon(pikachu);


        Pokemon pichu = new Pokemon(
                "Pichu",
                new ArrayList<String>(Arrays.asList("Electric")),
                2,
                new ArrayList<String>(Arrays.asList("Tacle")),
                pikachu,
                10
        );
        PokemonDB.addPokemon(pichu);
    }

    public static void cleanDb() {
        PokemonDB.pokemones = new ArrayList<Pokemon>();
    }

    public static void reloadDb() {
        PokemonDB.cleanDb();
        PokemonDB.fillDb();
    }
}
