package Model;

import java.util.Random;

public class Player {
    private final Inventory inventory;
   
    public Player(){
        
        this.inventory = new Inventory();
    }

    public Inventory getInventory() {
        return inventory;
    }
    
    public Creature getActiveCreature(){
        return inventory.getActiveCreature();
    }

    public void catchCreature(Creature creature){
        getInventory().addCreatureInInventory(creature);
    }
    
    

    

    

}
