package pokemon;
import java.util.ArrayList;

public class Pokemon {
    String name;
    ArrayList<String> types;
    int lvl;
    String [] abilities;
    ArrayList<Pokemon> evolutions;
    int evolvesAtLvl;


    //CONSTRUCTOR
    public Pokemon(String name, ArrayList<String> types, int lvl, String [] abilities, ArrayList<Pokemon> evolutions, int evolvesAtLvl){
        this.name=name;
        this.types=types;
        this.lvl=lvl;
        this.abilities=abilities;
        this.evolutions=evolutions;
        this.evolvesAtLvl=evolvesAtLvl;
    }


    //-------------------------------GETTERS
    public String name() {
        return name;
    }

    public ArrayList<String> type() {
        return types;
    }

    public int lvl() {
        return lvl;
    }

    public String[] abilities() {
        return abilities;
    }

    public ArrayList<Pokemon> evolutions() {
        return evolutions;
    }

    public void evolvesAtLvl(){
        if(this.evolvesAtLvl==999){
            this.isFinalEvo();
        }
        else{ this.returnLvl(this.evolvesAtLvl); }
    }

    private int returnLvl(int level) {
        return level;
    }

    private void isFinalEvo() {
        System.out.println("This is " + this.name() + " final evolution.");
    }

    //------------------------------SETTERS
    public void name(String name) {
        this.name = name;
    }

    public void changeTypeArray(ArrayList types) {
        this.types = types;
    }

    public void addType(String newType){
        this.types.add(newType);
    }

    public void removeType(String typeToRmv){
        int index = this.types.indexOf(typeToRmv);
        this.types.remove(index);
        System.out.println("The type "+ typeToRmv + " has been removed from "+ this.name);
    }


    public void lvl(int lvl) {
        this.lvl = lvl;
    }

    public void abilities(String[] abilities) {
        this.abilities = abilities;
    }

    public void evolutions(ArrayList<Pokemon> evolutions) {
        this.evolutions = evolutions;
    }

    public void evolvesAtLvl(int evolvesAtLvl) {
        this.evolvesAtLvl = evolvesAtLvl;
    }

    public void addEvolution(Pokemon newEvo){

    }
}
