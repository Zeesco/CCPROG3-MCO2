package Controller;


import Model.MainModel;
import View.View;

public class MainMenuController  {
    private final View view;
    private final MainModel model;
    

    public MainMenuController(View view, MainModel model ){
        this.view = view;
        this.model = model;
        view.getMainMenu().setActionListenerInventory(e->{
            openInventory();
            view.getInventoryView().caughtCreatures(model.getPlayer().getInventory().getCreaturesList());
            view.getInventoryView().setActiveCreatureImage(model.getPlayer().getActiveCreature().getName());
        });
        
        view.getMainMenu().setActionListenerInventory(e->closePanel());

        view.getMainMenu().setActionListenerExploreAnArea(e->openExploreAnArea());
        view.getMainMenu().setActionListenerExploreAnArea(e->closePanel());

        view.getMainMenu().setActionListenerEvolveCreature(e->openEvolveCreature());
        view.getMainMenu().setActionListenerEvolveCreature(e->closePanel());
        
        view.getMainMenu().setActionListenerQuitGame(e-> finishGame());
        
        
    }
    public MainModel getModel() {
        return model;
    }

    private void openInventory(){
        view.getInventoryView().setVisible(true);
    }

    private void openExploreAnArea(){
        view.getExploreAnAreaView().setVisible(true);
    }

    private void openEvolveCreature(){
        view.getEvolveCreaturesView().setVisible(true);
    }

    private void closePanel(){
        view.getMainMenu().setVisible(false);
    }
    


    public void finishGame(){
        System.exit(0);
    }
}
