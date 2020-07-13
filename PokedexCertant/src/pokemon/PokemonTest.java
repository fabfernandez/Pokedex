package pokemon;

import database.PokemonDB;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PokemonTest {

    @org.junit.jupiter.api.Test
    void certant() {
        PokemonDB.reloadDb();

        PokemonDB.listAllPokemons();

        Pokemon pichu = PokemonDB.getPokemon("Pichu");
        assertNotNull(pichu, "Se encontro al pokemon buscado");

        pichu.printProperties();

        pichu.printEvolutionProperties();

        Pokemon snorlax = new Pokemon(
                "Snorlax",
                new ArrayList<String>(Arrays.asList("Normal")),
                30,
                new ArrayList<String>(Arrays.asList("Sleep")),
                null,
                30
        );
        PokemonDB.addPokemon(snorlax);

        Pokemon encontrado = PokemonDB.getPokemon("Snorlax");
        assertNotNull(encontrado, "Se encontro al pokemon buscado");

    }

    @org.junit.jupiter.api.Test
    void name() {
        PokemonDB.reloadDb();

        String n = "Pikachu";
        Pokemon pika = PokemonDB.getPokemon(n);
        assertNotNull(pika, "Se encontro al pokemon buscado");

        assertEquals(n, pika.name(), "El pokemon encontrado tiene el nombre que buscamos");

        String newName = "Pike";
        pika.setName(newName);

        assertEquals(newName, pika.name(), "Cabiar el nombre a un pokemon");

        assertNull("Da null porque no encuentra Pikachu porque le cambiamos el nombre", PokemonDB.getPokemon("Pikachu"));
    }

    @org.junit.jupiter.api.Test
    void type() {
        PokemonDB.reloadDb();

        Pokemon raichu = PokemonDB.getPokemon("Raichu");
        assertNotNull(raichu, "Se encontro al pokemon buscado");

        ArrayList<String> testType = new ArrayList<>(Arrays.asList("Electric"));
        assertEquals(testType, raichu.type(), "Raichu es tipo electrico");

        raichu.addType("Mouse");
        testType.add("Mouse");
        assertEquals(testType, raichu.type(), "Agregar un tipo a un pokemon");

        raichu.removeType("Electric");
        testType.remove("Electric");
        assertEquals(testType, raichu.type(), "Quitar un tipo de un pokemon");
    }

    @org.junit.jupiter.api.Test
    void lvl() {
        PokemonDB.reloadDb();

        Pokemon pichu = PokemonDB.getPokemon("Pichu");
        assertNotNull(pichu, "Se encontro al pokemon buscado");

        int testLevel = pichu.lvl();

        pichu.setLvl(testLevel + 1);
        assertEquals(testLevel + 1, pichu.lvl(), "Rare Candy");
    }

    @org.junit.jupiter.api.Test
    void abilities() {
        PokemonDB.reloadDb();

        Pokemon charmander = PokemonDB.getPokemon("Charmander");
        assertNotNull(charmander, "Se encontro al pokemon buscado");

        ArrayList<String> testAbil = charmander.abilities();
        charmander.addAbility("Cut");
        testAbil.add("Cut");
        assertEquals(testAbil, charmander.abilities(), "Agregar una habilidad a un pokemon");

        charmander.removeAbility("Tacle");
        testAbil.remove("Tacle");
        assertEquals(testAbil, charmander.abilities(), "Quitarle una habilidad a un pokemon");

    }

    @org.junit.jupiter.api.Test
    void evolutions() {
        PokemonDB.reloadDb();
        Pokemon charizard = PokemonDB.getPokemon("Charizard");
        assertNotNull(charizard, "Se encontro al pokemon buscado");

        Pokemon missingno = PokemonDB.getPokemon("MissingNO");
        assertNotNull(missingno, "Se encontro al pokemon buscado");

        charizard.addEvolution(missingno, 99);
        assertEquals(missingno, charizard.evolution(), "Agregar una evolucion");
        assertEquals(99, charizard.evolvesAtLvl(), "Actualizar el nivel en el cual el pkmn evoluciona");

        Pokemon charmander = PokemonDB.getPokemon("Charmander");
        assertNotNull(charmander, "Se encontro a pokemon buscado");

        Pokemon charmeleon = PokemonDB.getPokemon("Charmeleon");
        assertNotNull(missingno, "Se encontro al pokemon buscado");

        ArrayList<Pokemon> testEvolutions = new ArrayList<Pokemon>(Arrays.asList(charmeleon, charizard, missingno));

        assertEquals(testEvolutions, charmander.allEvolutions(), "Todas las evoluciones de un pokemon");

        charizard.removeEvolution();
        testEvolutions.remove(missingno);
        assertEquals(testEvolutions, charmander.allEvolutions(), "Borrar la evolucion de un pokemon funciona");


        charmeleon.removeEvolution();
        assertNotNull(charmeleon);
        assertNull(charmeleon.evolution());
        testEvolutions.remove(charizard);
        assertEquals(testEvolutions, charmander.allEvolutions(), "Borrar la evolucion de un pokemon funciona");

        Pokemon pichu = PokemonDB.getPokemon("Pichu");
        assertNotNull(pichu, "Se encontro al pokemon buscado");

        Pokemon pikachu = PokemonDB.getPokemon("Pikachu");
        assertNotNull(pikachu, "Se encontro al pokemon buscado");

        Pokemon raichu = PokemonDB.getPokemon("Raichu");
        assertNotNull(raichu, "Se encontro al pokemon buscado");


        assertEquals(new ArrayList<Pokemon>(Arrays.asList(pikachu, raichu)), pichu.allEvolutions(), "Todas las evoluciones de Pichu");
    }
}
