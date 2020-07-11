package pokemon;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PokemonTest {
    public Pokemon raichu = new Pokemon(
            "Raichu",
            new ArrayList<String>(Arrays.asList("Electric")),
            35,
            new ArrayList<String> (Arrays.asList("Electroshock", "Iron Tail", "Tacle")),
            new ArrayList<Pokemon>(),
            999
    );

    public Pokemon pikachu = new Pokemon(
                "Pikachu",
                new ArrayList<String>(Arrays.asList("Electric")),
                10,
                new ArrayList<String> (Arrays.asList("Tacle")),
                new ArrayList<Pokemon>(Arrays.asList(raichu)),
                35
    );

    @org.junit.jupiter.api.Test
    void testDatabase(){
        ArrayList<Pokemon> db = new ArrayList<Pokemon>(Arrays.asList(pikachu, raichu));

    }

    @org.junit.jupiter.api.Test
    void name() {
        String n = "Pikachu";
        assertEquals(n, pikachu.name());

        pikachu.name("pika");
        String nn ="pika";
        assertEquals(nn, pikachu.name());
    }

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
        ArrayList<String> a = new ArrayList<String>(Arrays.asList("Tacle"));
        assertEquals(a, pikachu.abilities());

        ArrayList<String> aa = new ArrayList<String>(Arrays.asList("Tacle","Electroshock"));
        pikachu.abilities(aa);
        assertEquals(aa, pikachu.abilities());
    }

    @org.junit.jupiter.api.Test
    void evolutions() {
        String[] e = new String[]{"Raichu"};
        //assertArrayEquals(e, pikachu.evolutions());
        String[] ee = new String[]{"Pichu","Raichu"};
        //pikachu.evolutions(new String[]{"Pichu","Raichu"});
        //assertArrayEquals(ee, pikachu.evolutions());
    }
}
