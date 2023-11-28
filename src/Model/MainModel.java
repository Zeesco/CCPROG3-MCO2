package Model;

public class MainModel {
    
    private final Player player;
    
    

    public MainModel(){
        this.player = new Player();
        
    }

    public Player getPlayer() {
        return player;
    }

    public GenerateLevelOneCreature getGenerateLevelOneCreature(String name) {
        return new GenerateLevelOneCreature(name);
    }
}
