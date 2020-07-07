package test;
import pokemon.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public abstract class PokedexTests implements Test {
    @Test

    public void pokemonTest() {
        Pokemon pikachu = new Pokemon(
                "Pikachu",
                new String[]{"Electric"},
                10,
                new String[]{"Tacle"},
                new String[]{"Raichu"}
        );

        //User user = new User();

        // assert statements
        assertEquals("Electric", pikachu.type(), "Pikachu's type is electric");
        assertEquals("Pikachu", pikachu.name(), "Pikachu's name");
        assertEquals("10", pikachu.lvl(), "Pikachu is found at lvl 10 in the wild");
        assertEquals("Tackle", pikachu.abilities(), "Pikachu's only initial ability is tackle");
        assertEquals("Raichu", pikachu.evolutions(), "Pikachu's only evolution is Raichu");

    }

}
