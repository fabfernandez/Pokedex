import database.PokemonDB;
import pokemon.Pokemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        PokemonDB.fillDb();

        System.out.println("Welcome to the POKEDEX APP");

        printOptions();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String selectedOption = reader.readLine();

        executeOption(selectedOption);

    }

    private static void printOptions() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("What would you like to know?");
        System.out.println("Type 1, then ENTER to list ALL Pokemon on this POKEDEX");
        System.out.println("Type 2, then ENTER to search for a Pokemon");
        System.out.println("Type 3, then ENTER to search for a Pokemon's Evolutions");
        System.out.println("Type 4, then ENTER to add a NEW Pokemon");
        //System.out.println("Type 5, then ENTER to EDIT a known Pokemon");
    }

    private static void executeOption(String selectedOption) throws IOException {
        switch (selectedOption) {
            case "1":
                PokemonDB.listAllPokemons();

                printOptions();
                BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
                String selectedOption1 = input1.readLine();
                executeOption(selectedOption1);

            case "2":
                System.out.println("Insert the name of the pokemon you want to know about, first letter UPPERCASE please.");
                System.out.println("Example: Pikachu");
                BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
                String searchedPokemon = input2.readLine();
                Pokemon found2 = PokemonDB.getPokemon(searchedPokemon);

                printPokemonProperties(found2);

                printOptions();
                BufferedReader nextInput2 = new BufferedReader(new InputStreamReader(System.in));
                String selectedOption2 = nextInput2.readLine();
                executeOption(selectedOption2);

            case "3":
                System.out.println("EVOLUTIONS");
                System.out.println("Insert the name of the pokemon you want to know about, first letter UPPERCASE please.");
                System.out.println("Example: Pikachu");
                BufferedReader input3 = new BufferedReader(new InputStreamReader(System.in));
                String searchedEvos = input3.readLine();
                Pokemon found3 = PokemonDB.getPokemon(searchedEvos);

                printPokemonEvosProps(found3);

                printOptions();
                BufferedReader nextInput3 = new BufferedReader(new InputStreamReader(System.in));
                String selectedOption3 = nextInput3.readLine();
                executeOption(selectedOption3);

            case "4":
                System.out.println("NEW POKEMON");
                System.out.println("Insert the NAME of the pokemon, first letter UPPERCASE please.");
                System.out.println("Example: Pikachu");
                BufferedReader nameInput = new BufferedReader(new InputStreamReader(System.in));
                String name = nameInput.readLine();

                System.out.println("Insert a TYPE of the pokemon, first letter UPPERCASE please.");
                System.out.println("Example: Electric");
                BufferedReader typeInput = new BufferedReader(new InputStreamReader(System.in));
                ArrayList<String> type = new ArrayList<>(Arrays.asList(typeInput.readLine()));

                System.out.println("Insert the LEVEL of the pokemon");
                System.out.println("Example: 16");
                BufferedReader lvlInput = new BufferedReader(new InputStreamReader(System.in));
                int lvl = Integer.parseInt(lvlInput.readLine());

                System.out.println("Insert an ABILITY of the pokemon");
                System.out.println("Example: Iron Tail");
                BufferedReader abInput = new BufferedReader(new InputStreamReader(System.in));
                ArrayList<String> abi = new ArrayList<>(Arrays.asList(abInput.readLine()));

                Pokemon newPkmn = new Pokemon(name, type, lvl, abi, null, lvl);
                PokemonDB.addPokemon(newPkmn);

                System.out.println("Would you like to add an evolution to this new Pokemon?");
                System.out.println("WARNING You can only add evolutions known to this POKEDEX");
                System.out.println("Answer YES or NO");
                BufferedReader evoSelection = new BufferedReader(new InputStreamReader(System.in));
                String selection = evoSelection.readLine();

                switch (selection) {
                    case "YES":
                        System.out.println("Insert the Evolution's name, first letter UPPERCASE please.");
                        BufferedReader newEvoNameInput = new BufferedReader(new InputStreamReader(System.in));
                        String newEvoName = newEvoNameInput.readLine();

                        Pokemon found4 = PokemonDB.getPokemon(newEvoName);

                        System.out.println("At witch level does " + newPkmn.name() + " evolves to " + found4.name() + " ?");
                        BufferedReader newEvolvlInput = new BufferedReader(new InputStreamReader(System.in));
                        int newEvolvl = Integer.parseInt(newEvolvlInput.readLine());

                        newPkmn.addEvolution(found4, newEvolvl);
                    case "NO":

                }

                newPkmn.printProperties();
                printOptions();
                BufferedReader nextInput4 = new BufferedReader(new InputStreamReader(System.in));
                String selectedOption4 = nextInput4.readLine();
                executeOption(selectedOption4);


        }

    }

    private static void printPokemonProperties(Pokemon pokemon) {
        if (pokemon != null) {
            pokemon.printProperties();
        } else {
            System.out.println("Pokemon not found in this POKEDEX");
        }
    }

    private static void printPokemonEvosProps(Pokemon pokemon) {
        if (pokemon != null) {
            pokemon.printEvolutionProperties();
        } else {
            System.out.println("Pokemon not found in this POKEDEX");
        }
    }

}
