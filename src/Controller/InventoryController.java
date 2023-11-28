package Controller;

import java.util.ArrayList;

import Model.Creature;
import Model.MainModel;
import View.View;

public class InventoryController implements BackToMainMenu {
    private final View view;
    private final MainModel model;
    
    public InventoryController(View view, MainModel model){
        this.view = view;
        this.model = model;

        view.getInventoryView().setActionListenerBack(e -> {
            openMainMenu();
            closePanel();
        });

        view.getInventoryView().setActionListenerSearch(e-> {
            
            ArrayList <Creature>tempCreatureList = model.getPlayer().getInventory().getCreaturesList();
            for (int i = 0; i < tempCreatureList.size(); i++) {
                Creature creature = tempCreatureList.get(i);
            
                if (view.getInventoryView().searchPokemonArea().getText().toUpperCase().equals(creature.getName())) {
                    System.out.println("FOUND");
                } else {
                    System.out.println("NOT FOUND");
                }
            }
        });
       
    }
        
      

    
    

    @Override
    public void openMainMenu() {
        view.getMainMenu().setVisible(true);
    }

    @Override
    public void closePanel() {
        view.getInventoryView().setVisible(false);
    
    }
}
