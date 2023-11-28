package Controller;


import Model.MainModel;
import View.View;

public class AreaThreeController implements BackToMainMenu{
    private final View view;
    private final MainModel model;
   
    
    public AreaThreeController(View view, MainModel model){
        this.view = view;
        this.model = model;
        
        view.getAreaThreeView().setActionListenerDown(e ->{
         moveDown();

         if(model.getAreaThree().youHaveEncounteredACreature()){
            view.getBattleScreenView().setEnemyPokemon(model.getAreaThree().encounterEnemyCreature());
         }
            
        });
        view.getAreaThreeView().setActionListenerUp(e ->{

         moveUp();
          if(model.getAreaThree().youHaveEncounteredACreature()){
            view.getBattleScreenView().setEnemyPokemon(model.getAreaThree().encounterEnemyCreature());
         }
            
        });
        
        view.getAreaThreeView().setActionListenerRight(e ->{

         moveRight();
          if(model.getAreaThree().youHaveEncounteredACreature()){
            view.getBattleScreenView().setEnemyPokemon(model.getAreaThree().encounterEnemyCreature());
         }
           
        });
        view.getAreaThreeView().setActionListenerLeft(e ->{

         moveLeft();
          if(model.getAreaThree().youHaveEncounteredACreature()){
            view.getBattleScreenView().setEnemyPokemon(model.getAreaThree().encounterEnemyCreature());
         }
            
        });
        
      
        view.getAreaThreeView().setActionListenerExit(e -> {
            openMainMenu();
            closePanel();
            model.getAreaThree().resetHorizontal();
            model.getAreaThree().resetVertical();
            view.getAreaTwoView().setBoundsPlayer(50, 50);

         });
        

        view.getAreaThreeView().setActionListenerExit(e -> {
            openMainMenu();
            closePanel();
            model.getAreaThree().resetHorizontal();
            model.getAreaThree().resetVertical();
            view.getAreaThreeView().setBoundsPlayer(50, 50);
         });
        
        
        


    }

    public void openBattlePhase(){
        view.getBattleScreenView().setVisible(true);
    }

    public void moveRight() {
        model.getAreaTwo().moveRight();
        view.getAreaThreeView().setBoundsPlayer(model.getAreaTwo().getHorizontal(),model.getAreaTwo().getVertical());
    }

    public void moveLeft() {
       model.getAreaTwo().moveLeft();
        view.getAreaThreeView().setBoundsPlayer(model.getAreaTwo().getHorizontal(),model.getAreaTwo().getVertical());
    }

    public void moveUp() {
        model.getAreaTwo().moveUp();
        view.getAreaThreeView().setBoundsPlayer(model.getAreaTwo().getHorizontal(),model.getAreaTwo().getVertical());
    }

    public void moveDown() {
        model.getAreaTwo().moveDown();
        view.getAreaThreeView().setBoundsPlayer(model.getAreaTwo().getHorizontal(),model.getAreaTwo().getVertical());
    }

    @Override
    public void openMainMenu() {
        view.getMainMenu().setVisible(true);
    }

    @Override
    public void closePanel() {
        view.getAreaThreeView().setVisible(false);
    
    }
}
