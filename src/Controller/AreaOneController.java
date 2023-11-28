package Controller;

import java.util.Random;

import Model.MainModel;
import View.View;

public class AreaOneController implements BackToMainMenu {
    private final View view;
    private final MainModel model;
    private int horizontal;
   

    public AreaOneController(View view, MainModel model) {
        this.view = view;
        this.model = model;
        this.horizontal = 100;

        view.getAreaOneView().setActionListenerRight(e ->{

         moveRight();
            Random random = new Random();
            if(random.nextInt(1,100) <=40){
                closePanel();
                openBattlePhase();
                view.getBattleScreenView().setEnemyPokemon();
            }
        });
        view.getAreaOneView().setActionListenerLeft(e ->{

         moveLeft();
            Random random = new Random();
            if(random.nextInt(1,100) <=40){
                closePanel();
                openBattlePhase();
                view.getBattleScreenView().setEnemyPokemon();
            }
        });
        
        view.getAreaOneView().setActionListenerExit(e -> {
            openMainMenu();
            closePanel();
            horizontal = 50;
            view.getAreaOneView().setBoundsPlayer(50);

         });
    }

    public void openBattlePhase(){
        view.getBattleScreenView().setVisible(true);
    }

    

    public void moveRight() {
        this.horizontal+=100;
        view.getAreaOneView().setBoundsPlayer(horizontal);
    }

    public void moveLeft(){
        this.horizontal-=100;
        view.getAreaOneView().setBoundsPlayer(horizontal);
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
