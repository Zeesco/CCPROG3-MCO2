package Controller;



import Model.MainModel;


import Model.Creature;
import Model.GenerateLevelOneCreature;
import View.View;


public class ChosenCreatureController implements PanelBehavior {
    private View view;
    private MainModel model;

    public ChosenCreatureController(MainModel model, View view){
        this.view = view;
        this.model =model;

        view.getChoosingPokemon().setActionListenerOnePokemon(e->openNewPanel());
        view.getChoosingPokemon().setActionListenerOnePokemon(e-> closePanel());
        view.getChoosingPokemon().setActionListenerOnePokemon(e-> setActiveCreatureButton(view.getChoosingPokemon().getB1_Pokemon().getText()));
        
        

        view.getChoosingPokemon().setActionListenerTwoPokemon(e->openNewPanel());
        view.getChoosingPokemon().setActionListenerTwoPokemon(e-> closePanel());
        view.getChoosingPokemon().setActionListenerTwoPokemon(e-> setActiveCreatureButton(view.getChoosingPokemon().getB2_Pokemon().getText()));
        

        view.getChoosingPokemon().setActionListenerThreePokemon(e->openNewPanel());
        view.getChoosingPokemon().setActionListenerThreePokemon(e-> closePanel());
        view.getChoosingPokemon().setActionListenerThreePokemon(e-> setActiveCreatureButton(view.getChoosingPokemon().getB3_Pokemon().getText()));
        
    }

    private  void setActiveCreatureButton(String name){
        GenerateLevelOneCreature creature = new GenerateLevelOneCreature(name);
        Creature generatedCreature = creature.findCreature();

        if (generatedCreature != null) {
            model.getPlayer().getInventory().setActiveCreature(generatedCreature);
            model.getPlayer().getInventory().addCreatureInInventory(generatedCreature);
            
         } 
    }

    public MainModel getModel(){
        return model;
    }


    public void showStarter(){
        System.out.println(model.getPlayer().getInventory().getActiveCreature().getName());
    }

    @Override
    public void openNewPanel(){
        view.getMainMenu().setVisible(true);
    }

    @Override
    public void closePanel(){
         view.getChoosingPokemon().setVisible(false);
    }
}
