package Controller;

import java.util.Random;

import Model.MainModel;
import View.View;

public class AreaTwoController implements BackToMainMenu {
    private final View view;
    private final MainModel model;
    private int horizontal;
    private int vertical;

    public AreaTwoController(View view, MainModel model) {
        this.view = view;
        this.model = model;
        this.horizontal = 50;
        this.vertical = 50;

        view.getAreaTwoView().setActionListenerDown(e ->{

         moveDown();
            Random random = new Random();
            if(random.nextInt(1,100) <=40){
                closePanel();
                openBattlePhase();
                view.getBattleScreenView().setEnemyPokemon();
            }
        });
        view.getAreaTwoView().setActionListenerUp(e ->{

         moveUp();
            Random random = new Random();
            if(random.nextInt(1,100) <=40){
                closePanel();
                openBattlePhase();
                view.getBattleScreenView().setEnemyPokemon();
            }
        });
        
        view.getAreaTwoView().setActionListenerRight(e ->{

         moveRight();
            Random random = new Random();
            if(random.nextInt(1,100) <=40){
                closePanel();
                openBattlePhase();
                view.getBattleScreenView().setEnemyPokemon();
            }
        });
        view.getAreaTwoView().setActionListenerLeft(e ->{

         moveLeft();
            Random random = new Random();
            if(random.nextInt(1,100) <=40){
                closePanel();
                openBattlePhase();
                view.getBattleScreenView().setEnemyPokemon();
            }
        });
        
      
        view.getAreaTwoView().setActionListenerExit(e -> {
            openMainMenu();
            closePanel();
            horizontal = 50;
            vertical = 50;
            view.getAreaTwoView().setBoundsPlayer(50, 50);

         });
    }



    public void openBattlePhase(){
        view.getBattleScreenView().setVisible(true);
    }

    public void moveRight() {
        horizontal += 100;
        view.getAreaTwoView().setBoundsPlayer(horizontal, vertical);
    }

    public void moveLeft() {
        horizontal -= 100;
        view.getAreaTwoView().setBoundsPlayer(horizontal, vertical);
    }

    public void moveUp() {
        vertical -= 100;
        view.getAreaTwoView().setBoundsPlayer(horizontal, vertical);
    }

    public void moveDown() {
        vertical += 100;
        view.getAreaTwoView().setBoundsPlayer(horizontal, vertical);
    }

    @Override
    public void openMainMenu() {
        view.getMainMenu().setVisible(true);
    }

    @Override
    public void closePanel() {
        view.getAreaTwoView().setVisible(false);
    }
}
