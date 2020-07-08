package user;
import pokemon.*;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    Pokemon pikachu = new Pokemon(
        "Pikachu",
        new String[]{"Electric"},
        10,
        new String[]{"Tacle"},
        new String[]{"Raichu"}
        );

    Pokemon[] ashpokes = new Pokemon[] {pikachu, pikachu, pikachu};

    User ash = new User(ashpokes);

    @org.junit.jupiter.api.Test
    void user() {
        Pokemon[] pokes = new Pokemon[] {pikachu, pikachu, pikachu};
        assertArrayEquals(pokes, ash.pokemons);
    }

}