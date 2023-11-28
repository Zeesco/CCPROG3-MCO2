package View;

import javax.swing.JFrame;

public class View extends JFrame{
    private final StartMainMenu startMainMenu;
    private final ChoosingType choosingType;
    private final ChoosingPokemon choosingPokemon;
    private final MainMenu mainMenu;
    private final InventoryView inventoryView;
    private final ExploreAnAreaView exploreAnAreaView;
    private final EvolveCreaturesView evolveCreaturesView;
    private final AreaOneView areaOneView;
    private final AreaTwoView areaTwoView;
    private final AreaThreeView areaThreeView;
    private final AreaView areaView;
    private final BattleScreenView battleScreenView;
    private final GenerateImageCreature generateImageCreature;
    
    
    public  View(){
        this.startMainMenu = new StartMainMenu();
        this.choosingType = new ChoosingType();
        this.choosingPokemon = new ChoosingPokemon();
        this.mainMenu = new MainMenu();
        this.inventoryView = new InventoryView();
        this.exploreAnAreaView = new ExploreAnAreaView();
        this.evolveCreaturesView = new EvolveCreaturesView();
        this.battleScreenView = new BattleScreenView();
        this.areaOneView = new AreaOneView();
        this.areaTwoView = new AreaTwoView();
        this.areaThreeView = new AreaThreeView();
        this.areaView = new AreaView();
        this.generateImageCreature = new GenerateImageCreature();
        
        
    }

    public StartMainMenu getStartMainMenu() {
        return startMainMenu;
    }
    
   public ChoosingType getChoosingType() {
       return choosingType;
   }
   
   public ChoosingPokemon getChoosingPokemon() {
       return choosingPokemon;
   }

   public MainMenu getMainMenu() {
       return mainMenu;
   }
   
   public InventoryView getInventoryView() {
       return inventoryView;
   }
   
   public ExploreAnAreaView getExploreAnAreaView() {
       return exploreAnAreaView;
   }

   public EvolveCreaturesView getEvolveCreaturesView() {
       return evolveCreaturesView;
   }

   public AreaOneView getAreaOneView() {
       return areaOneView;
   }

   public AreaTwoView getAreaTwoView() {
        return areaTwoView;
   }

   public AreaThreeView getAreaThreeView() {
        return areaThreeView;
   }

   public AreaView getAreaView() {
        return areaView;
   }
   
   public BattleScreenView getBattleScreenView() {
       return battleScreenView;
   }
   public GenerateImageCreature getGenerateImageCreature() {
       return generateImageCreature;
   }
    
}
