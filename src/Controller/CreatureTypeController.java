package Controller;


import View.View;



public class CreatureTypeController implements PanelBehavior{
    private View view;
    public CreatureTypeController(View view){
        this.view = view;
        
        view.getChoosingType().setActionListenerFireType(e-> closePanel());
        view.getChoosingType().setActionListenerFireType(e-> openNewPanel());
        view.getChoosingType().setActionListenerFireType(e-> setButtonsForType(view.getChoosingType().getbFire().getText()));


        view.getChoosingType().setActionListenerLeafType(e-> closePanel());
        view.getChoosingType().setActionListenerLeafType(e-> openNewPanel());
        view.getChoosingType().setActionListenerLeafType(e-> setButtonsForType(view.getChoosingType().getbLeaf().getText()));

        view.getChoosingType().setActionListenerWaterType(e-> closePanel());
        view.getChoosingType().setActionListenerWaterType(e-> openNewPanel());
        view.getChoosingType().setActionListenerWaterType(e-> setButtonsForType(view.getChoosingType().getbWater().getText()));
    }
    
    public void setButtonsForType(String type){
        view.getChoosingPokemon().setChosenType(type);
    }

     @Override
    public void openNewPanel(){
        view.getChoosingPokemon().setVisible(true);
    }

    @Override
    public void closePanel(){
        view.getChoosingType().setVisible(false);
    }
}
