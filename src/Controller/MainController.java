package Controller;

import View.*;
import Model.*;



public class MainController implements PanelBehavior{
    
    private  final View   view;
    private  final MainModel  model;
    private  ChosenCreatureController chosenCreatureModel;
    public MainController(MainModel model, View view ){
        this.view = view;
        this.model = model;
        view.getStartMainMenu().setActionListenerPlay(e-> closePanel());
        view.getStartMainMenu().setActionListenerPlay(e-> openNewPanel());
        view.getStartMainMenu().setActionListenerQuit(e-> finishGame());
        new CreatureTypeController(view);
        chosenCreatureModel = new ChosenCreatureController(model,view);
        new MainMenuController(view,model);
        new InventoryController(view,chosenCreatureModel.getModel());
        new ExploreAnAreaController(view);
        new EvolveCreatureController(view, model);
        new AreaOneController(view, model);
        new AreaTwoController(view, model);
        new AreaThreeController(view, model);
        

        
       
        
    }
   
    

    public void startGame(boolean x){
        this.view.getStartMainMenu().setVisible(true);
    }
    public void finishGame(){
        System.exit(0);
    }
    
    @Override
    public void openNewPanel(){
        view.getChoosingType().setVisible(true);

    }

   


    @Override
    public void closePanel() {
        view.getStartMainMenu().setVisible(false);
    }

    public  MainModel getModel() {
        return model;
    }
}
