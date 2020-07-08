package user;
import pokemon.*;

public class User {
    Pokemon[] pokemons;

    public User(Pokemon[] pokemons){
        this.pokemons=pokemons;
    }

    public Pokemon[] pokemons() {
        return pokemons;
    }

    public void pokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }
}
