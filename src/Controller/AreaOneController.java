package Controller;



import Model.MainModel;
import View.View;

public class AreaOneController implements BackToMainMenu {
    private final View view;
    private final MainModel model;
  
   

    public AreaOneController(View view, MainModel model) {
        this.view = view;
        this.model = model;

        view.getAreaOneView().setActionListenerRight(e ->{

         moveRight();
            if(model.getAreaOne().getMaximumStepsHorizontal()<5 && model.getAreaOne().getMaximumStepsHorizontal()>1){
                if(model.getAreaOne().youHaveEncounteredACreature()){
                 closePanel();
                 openBattlePhase();
                 view.getBattleScreenView().setEnemyPokemon(model.getAreaOne().encounterEnemyCreature());
             }
            }
        });
        view.getAreaOneView().setActionListenerLeft(e ->{

         moveLeft();
            if(model.getAreaOne().getMaximumStepsHorizontal()<5 && model.getAreaOne().getMaximumStepsHorizontal()>1){
                if(model.getAreaOne().youHaveEncounteredACreature()){
                 closePanel();
                 openBattlePhase();
                 view.getBattleScreenView().setEnemyPokemon(model.getAreaOne().encounterEnemyCreature());
             }
            }
        });
        
        view.getAreaOneView().setActionListenerExit(e -> {
            openMainMenu();
            closePanel();
            model.getAreaOne().resetHorizontal();
            model.getAreaOne().resetSteps();
            
            view.getAreaOneView().setBoundsPlayer(50);

         });
    }

    public void openBattlePhase(){
        view.getBattleScreenView().setVisible(true);
    }

    

    public void moveRight() {
        model.getAreaOne().moveRight();
        view.getAreaOneView().setBoundsPlayer(model.getAreaOne().getHorizontal());
    }

    public void moveLeft(){
        model.getAreaOne().moveLeft();
        view.getAreaOneView().setBoundsPlayer(model.getAreaOne().getHorizontal());
    }

    @Override
    public void openMainMenu() {
        view.getMainMenu().setVisible(true);
    }

    @Override
    public void closePanel() {
        view.getAreaOneView().setVisible(false);
    }
}
