package Model;

import java.util.ArrayList;

public class Inventory {
    private Creature activeCreature;
     private final  ArrayList<Creature> creaturesList;

    public Inventory(){
        this.creaturesList = new ArrayList<>();
    }

    public void addCreatureInInventory(Creature creature){
        creaturesList.add(creature);
    }

    public ArrayList<Creature> getCreaturesList() {
        return creaturesList;
    }

    public void setActiveCreature(Creature activeCreature) {
        this.activeCreature = activeCreature;
    }

    public Creature getActiveCreature() {
        return activeCreature;
    }

}
