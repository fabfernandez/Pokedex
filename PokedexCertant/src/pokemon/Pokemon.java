package pokemon;

public class Pokemon {
    String name;
    String [] types;
    int lvl;
    String [] abilities;
    String [] evolutions;


    //CONSTRUCTOR
    public Pokemon(String name, String [] types, int lvl, String [] abilities, String [] evolutions){
        this.name=name;
        this.types=types;
        this.lvl=lvl;
        this.abilities=abilities;
        this.evolutions=evolutions;
    }


    //-------------------------------GETTERS
    public String name() {
        return name;
    }

    public String[] type() {
        return types;
    }

    public int lvl() {
        return lvl;
    }

    public String[] abilities() {
        return abilities;
    }

    public String[] evolutions() {
        return evolutions;
    }

    //------------------------------SETTERS
    public void name(String name) {
        this.name = name;
    }

    public void type(String[] types) {
        this.types = types;
    }

    public void lvl(int lvl) {
        this.lvl = lvl;
    }

    public void abilities(String[] abilities) {
        this.abilities = abilities;
    }

    public void evolutions(String[] evolutions) {
        this.evolutions = evolutions;
    }
}
