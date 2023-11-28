package Controller;


import java.util.Random;

import Model.MainModel;
import View.View;

public class AreaThreeController implements BackToMainMenu{
    private final View view;
    private final MainModel model;
    private int horizontal;
    private int vertical;
    
    public AreaThreeController(View view, MainModel model){
        this.view = view;
        this.model = model;
        this.horizontal = 50;
        this.vertical = 50;
        
        view.getAreaThreeView().setActionListenerDown(e ->{

         moveDown();
            Random random = new Random();
            if(random.nextInt(1,100) <=40){
                closePanel();
                openBattlePhase();
                view.getBattleScreenView().setEnemyPokemon();
            }
        });
        view.getAreaThreeView().setActionListenerUp(e ->{

         moveUp();
            Random random = new Random();
            if(random.nextInt(1,100) <=40){
                closePanel();
                openBattlePhase();
                view.getBattleScreenView().setEnemyPokemon();
            }
        });
        
        view.getAreaThreeView().setActionListenerRight(e ->{

         moveRight();
            Random random = new Random();
            if(random.nextInt(1,100) <=40){
                closePanel();
                openBattlePhase();
                view.getBattleScreenView().setEnemyPokemon();
            }
        });
        view.getAreaThreeView().setActionListenerLeft(e ->{

         moveLeft();
            Random random = new Random();
            if(random.nextInt(1,100) <=40){
                closePanel();
                openBattlePhase();
                view.getBattleScreenView().setEnemyPokemon();
            }
        });
        
      
        view.getAreaThreeView().setActionListenerExit(e -> {
            openMainMenu();
            closePanel();
            horizontal = 50;
            vertical = 50;
            view.getAreaTwoView().setBoundsPlayer(50, 50);

         });
        

        view.getAreaThreeView().setActionListenerExit(e -> {
            openMainMenu();
            closePanel();
            horizontal = 50;
            vertical = 50;
            view.getAreaThreeView().setBoundsPlayer(50, 50);
         });
        
        
        


    }

    public void openBattlePhase(){
        view.getBattleScreenView().setVisible(true);
    }

    public void moveRight() {
        horizontal += 100;
        view.getAreaThreeView().setBoundsPlayer(horizontal, vertical);
    }

    public void moveLeft() {
        horizontal -= 100;
        view.getAreaThreeView().setBoundsPlayer(horizontal, vertical);
    }

    public void moveUp() {
        vertical -= 100;
        view.getAreaThreeView().setBoundsPlayer(horizontal, vertical);
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
        view.getAreaThreeView().setVisible(false);
    
    }
}
