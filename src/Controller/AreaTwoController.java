package Controller;



import Model.MainModel;
import View.View;

public class AreaTwoController implements BackToMainMenu {
    private final View view;
    private final MainModel model;
 

    public AreaTwoController(View view, MainModel model) {
        this.view = view;
        this.model = model;
     

        view.getAreaTwoView().setActionListenerDown(e ->{
         moveDown();

         if( model.getAreaTwo().getMaximumStepsVertical() > 0 && model.getAreaTwo().getMaximumStepsVertical() < 2 ){
         if(model.getAreaTwo().youHaveEncounteredACreature()){
            view.getBattleScreenView().setEnemyPokemon(model.getAreaTwo().encounterEnemyCreature());
            closePanel();
            openBattlePhase();
         }
        }
            
        });
        view.getAreaTwoView().setActionListenerUp(e ->{

         moveUp();
    
         if(model.getAreaTwo().getMaximumStepsVertical() > 0 && model.getAreaTwo().getMaximumStepsVertical() < 2  ){
         if(model.getAreaTwo().youHaveEncounteredACreature()){
            view.getBattleScreenView().setEnemyPokemon(model.getAreaTwo().encounterEnemyCreature());
            closePanel();
            openBattlePhase();
         }
        }
            
        });
        
        view.getAreaTwoView().setActionListenerRight(e -> {
            moveRight();

            if (model.getAreaTwo().getMaximumStepsHorizontal() > 0 && model.getAreaTwo().getMaximumStepsHorizontal() < 2) {
                if (model.getAreaTwo().youHaveEncounteredACreature()) {
                    view.getBattleScreenView().setEnemyPokemon(model.getAreaTwo().encounterEnemyCreature());
                    closePanel();
                    openBattlePhase();
                }
            }
        });

        view.getAreaTwoView().setActionListenerLeft(e -> {
            moveLeft();

            if (model.getAreaTwo().getMaximumStepsHorizontal() > 0 && model.getAreaTwo().getMaximumStepsHorizontal() < 2) {
                if (model.getAreaTwo().youHaveEncounteredACreature()) {
                    view.getBattleScreenView().setEnemyPokemon(model.getAreaTwo().encounterEnemyCreature());
                    closePanel();
                    openBattlePhase();
                }
            }
        });
        
      
        view.getAreaTwoView().setActionListenerExit(e -> {
            openMainMenu();
            closePanel();
            model.getAreaTwo().resetHorizontal();
            model.getAreaTwo().resetVertical();
            model.getAreaTwo().resetSteps();
            model.getAreaTwo().resetVerticalSteps();
            view.getAreaTwoView().setBoundsPlayer(150, 50);

         });
    }



    public void openBattlePhase(){
        view.getBattleScreenView().setVisible(true);
    }

    public void moveRight() {
        model.getAreaTwo().moveRight();
        view.getAreaTwoView().setBoundsPlayer(model.getAreaTwo().getHorizontal(), model.getAreaTwo().getVertical());
    }

    public void moveLeft() {
        model.getAreaTwo().moveLeft();
        view.getAreaTwoView().setBoundsPlayer(model.getAreaTwo().getHorizontal(), model.getAreaTwo().getVertical());
    }

    public void moveUp() {
        model.getAreaTwo().moveUp();
        view.getAreaTwoView().setBoundsPlayer(model.getAreaTwo().getHorizontal(), model.getAreaTwo().getVertical());
    }

    public void moveDown() {
        model.getAreaTwo().moveDown();
       view.getAreaTwoView().setBoundsPlayer(model.getAreaTwo().getHorizontal(), model.getAreaTwo().getVertical());
    }

    @Override
    public void openMainMenu() {
        view.getMainMenu().setVisible(true);
    }

    @Override
    public void closePanel() {
        view.getAreaTwoView().setVisible(false);
    }
}
