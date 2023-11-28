package Controller;

import Model.MainModel;
import View.View;

public class EvolveCreatureController implements BackToMainMenu {
    private final View view;
    private final MainModel model;
    
    public EvolveCreatureController(View view, MainModel model){
        this.view = view;
        this.model = model;
        view.getEvolveCreaturesView().setActionListenerBack(e -> {
            openMainMenu();
            closePanel();
        });
       
    }

    @Override
    public void openMainMenu() {
        view.getMainMenu().setVisible(true);
    }

    @Override
    public void closePanel() {
        view.getEvolveCreaturesView().setVisible(false);
    
    }
}
