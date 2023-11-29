    package Controller;

    import Model.Creature;
import Model.MainModel;
    import View.View;

    public class BattlePhaseController {
        private View view;
        private MainModel model;

        public BattlePhaseController(View view, MainModel model){
            this.view = view;
            this.model = model;
            

            view.getBattleScreenView().setActionListenerAttack(e->attackEnemyCreature());
            view.getBattleScreenView().setActionListenerCatch(e->catchCreature());
            view.getBattleScreenView().setActionListenerSwap(null);
            view.getBattleScreenView().setActionListenerRun(null);

        }

        public void attackEnemyCreature(){
           
            Creature actiCreature = model.getPlayer().getInventory().getActiveCreature();
            Creature enemCreature = view.getBattleScreenView().yourEnemy();

            actiCreature.attackCreature(enemCreature);

            System.out.println(actiCreature.getDamage());
            System.out.println(enemCreature.getHealth());
        
            
        }
        public void catchCreature(){
            model.getPlayer().catchCreature(view.getBattleScreenView().yourEnemy());
        }

        public void swapCreature(){

        }

        public void runAway(){
            view.getBattleScreenView().setVisible(false);
        }

        public void openExploreAnArea(){
            view.getExploreAnAreaView().setVisible(true);
        }

        



       

       
    }
