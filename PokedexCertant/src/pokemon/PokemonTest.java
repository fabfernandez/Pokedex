package pokemon;

import database.PokemonDB;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class PokemonTest {

    @org.junit.jupiter.api.Test
    void name() {
        PokemonDB.reloadDb();

        String n = "Pikachu";
        Pokemon pika = PokemonDB.getPokemon(n);

        assertNotNull(pika);
        assertEquals(n, pika.name());

        String newName ="Pike";
        pika.setName(newName);

        assertEquals(newName, pika.name());

        assertNull("Da null porque no encuentra Pikachu porque le cambiamos el nombre", PokemonDB.getPokemon("Pikachu"));
    }
/*
    @org.junit.jupiter.api.Test
    void type() {
        ArrayList<String> t =new ArrayList<>(Arrays.asList("Electric"));
        assertEquals(t, pikachu.type());

        pikachu.addType("Mouse");
        ArrayList<String> tt =new ArrayList<>(Arrays.asList("Electric", "Mouse"));
        assertEquals(tt, pikachu.type());

        pikachu.removeType("Electric");
        ArrayList<String> ttt =new ArrayList<>(Arrays.asList("Mouse"));
        assertEquals(ttt, pikachu.type());
    }

    @org.junit.jupiter.api.Test
    void lvl() {
        assertEquals(10, pikachu.lvl());
        pikachu.lvl(11);
        assertEquals(11, pikachu.lvl());
    }

    @org.junit.jupiter.api.Test
    void abilities() {

        pikachu.addAbility("Thunder");
        ArrayList<String> testadd = new ArrayList<String>(Arrays.asList("Tacle", "Thunder"));
        assertEquals(testadd, pikachu.abilities());

        pikachu.removeAbility("Tacle");
        ArrayList<String> testrmv = new ArrayList<String>(Arrays.asList("Thunder"));
        assertEquals(testrmv, pikachu.abilities());

    }

    @org.junit.jupiter.api.Test
    void evolutions() {
        String[] e = new String[]{"Raichu"};
        //assertArrayEquals(e, pikachu.evolutions());
        String[] ee = new String[]{"Pichu","Raichu"};
        //pikachu.evolutions(new String[]{"Pichu","Raichu"});
        //assertArrayEquals(ee, pikachu.evolutions());
    }*/
}
