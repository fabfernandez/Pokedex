package pokemon;

import java.util.ArrayList;
import java.util.LinkedList;


public class Pokemon {
    private String name;
    private ArrayList<String> types;
    private int lvl;
    private ArrayList<String> abilities;
    private LinkedList<Pokemon> evolutions;
    private int evolvesAtLvl;


    //CONSTRUCTOR
    public Pokemon(String name, ArrayList<String> types, int lvl, ArrayList<String> abilities, LinkedList<Pokemon> evolutions, int evolvesAtLvl) {
        this.name = name;
        this.types = types;
        this.lvl = lvl;
        this.abilities = abilities;
        this.evolutions = evolutions;
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

    public LinkedList<Pokemon> evolutions() {
        return evolutions;
    }

    //------------------------------SETTERS---------------------------------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setTypesArray(ArrayList types) {
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

    public void setEvolutions(LinkedList<Pokemon> evolutions) {
        this.evolutions = evolutions;
    }


    public void addEvolution(Pokemon newEvo) {
        this.evolutions.addFirst(newEvo);
        System.out.println(newEvo + " is now the next evolution to " + this.name);

    }

    public void removeEvolution(Pokemon evo) {

    }
}