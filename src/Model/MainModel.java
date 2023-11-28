package Model;

public class MainModel {
    
    private final Player player;
    private final AreaOne areaOne;
    private final AreaTwo areaTwo;
    private final AreaThree areaThree;

    
    

    public MainModel(){
        this.player = new Player();
        this.areaOne = new AreaOne(110);
        this.areaTwo = new AreaTwo(150, 50);
        this.areaThree = new AreaThree(110, 40);
    
        
    }

    public Player getPlayer() {
        return player;
    }

    public GenerateLevelOneCreature getGenerateLevelOneCreature(String name) {
        return new GenerateLevelOneCreature(name);
    }

    public AreaOne getAreaOne() {
        return areaOne;
    }

    public AreaThree getAreaThree() {
        return areaThree;
    }

    public AreaTwo getAreaTwo() {
        return areaTwo;
    }
}
