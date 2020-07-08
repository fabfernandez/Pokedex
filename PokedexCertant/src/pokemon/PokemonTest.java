package pokemon;

import jdk.nashorn.internal.codegen.SpillObjectCreator;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class PokemonTest {
    Pokemon pikachu = new Pokemon(
                "Pikachu",
                new String[]{"Electric"},
                10,
                new String[]{"Tacle"},
                new String[]{"Raichu"}
        );

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
        String[] t =new String[] {"Electric"};
        assertArrayEquals(t, pikachu.type());
        pikachu.type(new String[] {"Electric","Mouse"});
        String [] tt =new String[] {"Electric","Mouse"};
        assertArrayEquals(tt, pikachu.type());
    }

    @Test
    void lvl() {
        assertEquals(10, pikachu.lvl());
        pikachu.lvl(11);
        assertEquals(11, pikachu.lvl());
    }

    @org.junit.jupiter.api.Test
    void abilities() {
        String[] a = new String[]{"Tacle"};
        assertArrayEquals(a, pikachu.abilities());
        String[] aa = new String[]{"Tacle","Electroshock"};
        pikachu.abilities(new String[]{"Tacle","Electroshock"});
        assertArrayEquals(aa, pikachu.abilities());
    }

    @org.junit.jupiter.api.Test
    void evolutions() {
        String[] e = new String[]{"Raichu"};
        assertArrayEquals(e, pikachu.evolutions());
        String[] ee = new String[]{"Pichu","Raichu"};
        pikachu.evolutions(new String[]{"Pichu","Raichu"});
        assertArrayEquals(ee, pikachu.evolutions());
    }
}
