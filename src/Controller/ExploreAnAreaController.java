package Controller;

import Model.MainModel;
import View.View;

public class ExploreAnAreaController implements BackToMainMenu {
    private final View view;
   
    
    public ExploreAnAreaController(View view){
        this.view = view;
       

        view.getExploreAnAreaView().setActionListenerAreaOne(e->{
            openAreaOne();
            closePanel();

        });

         view.getExploreAnAreaView().setActionListenerAreaTwo(e->{
            openAreaTwo();
            closePanel();
        });

         view.getExploreAnAreaView().setActionListenerAreaThree(e->{
            openAreaThree();
            closePanel();
        });



        view.getExploreAnAreaView().setActionListenerBack(e -> {
            openMainMenu();
            closePanel();
        });
    }

    public void openAreaOne(){
        view.getAreaOneView().setVisible(true);
    }

    public void openAreaTwo(){
        view.getAreaTwoView().setVisible(true);
    }

    public void openAreaThree(){
        view.getAreaThreeView().setVisible(true);
    }

    @Override
    public void openMainMenu() {
        view.getMainMenu().setVisible(true);
    }

    @Override
    public void closePanel() {
        view.getExploreAnAreaView().setVisible(false);
    
    }
}
