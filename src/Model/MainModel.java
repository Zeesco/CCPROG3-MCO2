package Model;

public class MainModel {
    
    private final Player player;
    private final AreaOne areaOne;
    private final AreaTwo areaTwo;
    private final AreaThree areaThree;

    
    

    public MainModel(){
        this.player = new Player();
        this.areaOne = new AreaOne(100);
        this.areaTwo = new AreaTwo(100, 100);
        this.areaThree = new AreaThree(100, 100);
    
        
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
