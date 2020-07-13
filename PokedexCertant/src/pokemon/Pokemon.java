package pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Pokemon {
    private String name;
    private ArrayList<String> types;
    private int lvl;
    private ArrayList<String> abilities;
    private Pokemon evolution;
    private int evolvesAtLvl;


    //CONSTRUCTOR
    public Pokemon(String name, ArrayList<String> types, int lvl, ArrayList<String> abilities, Pokemon evolution, int evolvesAtLvl) {
        this.name = name;
        this.types = types;
        this.lvl = lvl;
        this.abilities = abilities;
        this.evolution = evolution;
        this.evolvesAtLvl = evolvesAtLvl;
    }


    //-------------------------------GETTERS--------------------------------------------

    public String name() {
        return name;
    }

    public ArrayList<String> type() {
        return types;
    }

    public int lvl() {
        return lvl;
    }

    public ArrayList<String> abilities() {
        return abilities;
    }

    public Pokemon evolution() {
        return evolution;
    }

    public int evolvesAtLvl() {
        return evolvesAtLvl;
    }

    //------------------------------SETTERS---------------------------------------------

    public void setName(String name) {
        this.name = name;
    }

    private void setTypes(ArrayList<String> types) {
        this.types = types;
    }

    public void addType(String newType) {
        this.types.add(newType);
    }

    public void removeType(String typeToRmv) {
        this.types.remove(typeToRmv);
    }


    public void setLvl(int lvl) {
        this.lvl = lvl;
    }


    public void setAbilities(ArrayList<String> abilities) {
        this.abilities = abilities;
        //return this;
    }

    public void addAbility(String newAb) {
        this.abilities.add(newAb);
    }

    public void removeAbility(String abilityToRmv) {
        this.abilities.remove(abilityToRmv);
    }


    public void setEvolvesAtLvl(int evolvesAtLvl) {
        this.evolvesAtLvl = evolvesAtLvl;
    }

    private void setEvolution(Pokemon evolutions) {
        this.evolution = evolutions;
    }


    public void addEvolution(Pokemon newEvo, int evolvesAtLvl) {
        this.evolution = newEvo;
        this.evolvesAtLvl = evolvesAtLvl;
    }

    public void removeEvolution() {
        this.evolution = null;
    }

    public ArrayList<Pokemon> allEvolutions() {
        ArrayList<Pokemon> evolutions = new ArrayList<>();

        if (this.evolution() == null) {
            return evolutions;          // si es la evolucion final, devolver lista vacia
        }

        Pokemon actual = this;

        while (actual.evolution() != null) {
            evolutions.add(actual.evolution);
            actual = actual.evolution();
        }
        return evolutions;
    }

    public void printProperties() {
        System.out.println("Showing information about " + this.name());


        System.out.println("Types :");
        printSomeList(this.types);

        System.out.println("Level: " + this.lvl());

        System.out.println("Abilities: ");
        printSomeList(this.abilities);

        System.out.println("Evolutions :");
        printEvolutionNames();

        System.out.println("---------------------------0--------------------------------");
    }

    private <T> void printSomeList(List<T> list) {
        for (T string : list) {
            System.out.println(string);
        }
    }

    private void printEvolutionNames() {
        printSomeList(this.allEvolutions().stream().map(Pokemon::name).collect(Collectors.toList()));
    }

    public void printEvolutionProperties() {
        System.out.println("Showing information about " + this.name() + "'s evolutions:");
        System.out.println("____________");
        for (Pokemon pokemon : this.allEvolutions()) {
            pokemon.printProperties();
        }

    }
}