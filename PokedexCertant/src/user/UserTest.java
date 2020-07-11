package user;
import pokemon.Pokemon;
import pokemon.PokemonTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class UserTest {
    PokemonTest fixture = new PokemonTest();

    Pokemon[] ashpokes = {fixture.pikachu, fixture.raichu};

    User ash = new User(ashpokes);

    @org.junit.jupiter.api.Test
    void user() {
        Pokemon[] pokes = {fixture.raichu, fixture.pikachu};
        assertArrayEquals(pokes, ash.pokemons);
    }

}