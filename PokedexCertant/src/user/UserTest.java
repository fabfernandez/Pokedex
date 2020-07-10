package user;
import pokemon.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    Pokemon raichu = new Pokemon(
            "Raichu",
            new ArrayList<String>(Arrays.asList("Electric")),
            35,
            new String[]{"Tacle"},
            new ArrayList<Pokemon>(),
            999
    );

    Pokemon pikachu = new Pokemon(
            "Pikachu",
            new ArrayList<String>(Arrays.asList("Electric")),
            10,
            new String[]{"Tacle"},
            new ArrayList<Pokemon>(Arrays.asList(raichu)),
            35
    );


    Pokemon[] ashpokes = new Pokemon[] {pikachu, pikachu, pikachu};

    User ash = new User(ashpokes);

    @org.junit.jupiter.api.Test
    void user() {
        Pokemon[] pokes = new Pokemon[] {pikachu, pikachu, pikachu};
        assertArrayEquals(pokes, ash.pokemons);
    }

}