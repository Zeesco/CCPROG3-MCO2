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
            boolean pokemonFound = false;
    ArrayList<Creature> tempCreaturesList = model.getPlayer().getInventory().getCreaturesList();
for (int i = 0; i < tempCreaturesList.size(); i++) {
    Creature creature = tempCreaturesList.get(i);

    if (view.getInventoryView().searchPokemonArea().getText().toUpperCase().equals(creature.getName())) {
        model.getPlayer().getInventory().setActiveCreature(creature);
        view.getInventoryView().setActiveCreatureImage(model.getPlayer().getInventory().getActiveCreature().getName().toUpperCase());
        pokemonFound = true;
        break; // If found, no need to check further
    }
}

// Set messages outside the loop
if (pokemonFound) {
    view.getInventoryView().getSearchPokemonArea().setText("");
    view.getInventoryView().getMessage().setText("SUCCESSFULLY SWAPPED");
} else {
    view.getInventoryView().getSearchPokemonArea().setText("");
    view.getInventoryView().getMessage().setText("CANNOT FIND POKEMON! TRY AGAIN");
}
        });
       
    }
        
      

    
    
    public MainModel getModel() {
        return model;
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
