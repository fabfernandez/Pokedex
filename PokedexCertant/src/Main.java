import database.PokemonDB;
import pokemon.Pokemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        PokemonDB.fillDb();

        printOptions();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String selectedOption = reader.readLine();

        switch (selectedOption) {
            case "1":
                PokemonDB.listAllPokemons();
                break;
            case "2":
                System.out.println("Welcome to the POKEDEX APP");
                BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
                String searchedPokemon = input2.readLine();
                Pokemon found2 = PokemonDB.getPokemon(searchedPokemon);
                found2.printProperties();
                break;
            case "3":
                BufferedReader input3 = new BufferedReader(new InputStreamReader(System.in));
                String searchedEvos = input3.readLine();
                Pokemon found3 = PokemonDB.getPokemon(searchedEvos);
                found3.printEvolutionProperties();
                break;
            case "4":
                BufferedReader input4 = new BufferedReader(new InputStreamReader(System.in));
                String newPKMN = input4.readLine();
                break;

        }
    }

    private static void printOptions(){
        System.out.println("Welcome to the POKEDEX APP");
        System.out.println("What would yo like to know?");
        System.out.println("Type 1 to list ALL Pokemon on this POKEDEX");
        System.out.println("Type 2 to search for a Pokemon");
        System.out.println("Type 3 to search for a Pokemon's Evolutions");
        System.out.println("Type 4 to add a NEW Pokemon");
        System.out.println("Type 5 to EDIT a known Pokemon");
    }
}
