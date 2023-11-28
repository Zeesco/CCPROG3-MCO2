package Model;

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

    

}
