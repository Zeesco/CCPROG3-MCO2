                package Controller;


                import Model.Creature;
                import Model.MainModel;

                import View.View;

                public class AreaThreeController implements BackToMainMenu{
                    private final View view;
                    private final MainModel model;
                
                    
                    public AreaThreeController(View view, MainModel model){
                        this.view = view;
                        this.model = model;
                        
                        view.getAreaThreeView().setActionListenerDown(e ->{
                            moveDown();
                
                            if( model.getAreaThree().getMaximumStepsVertical() > 0 && model.getAreaThree().getMaximumStepsVertical() < 3){
                            if(model.getAreaThree().youHaveEncounteredACreature()){
                            view.getBattleScreenView().setEnemyPokemon(model.getAreaThree().encounterEnemyCreature());
                            view.getBattleScreenView().setActiveCreature(model.getPlayer().getActiveCreature());
                            closePanel();
                            openBattlePhase();
                            }
                        }
                            
                        });
                        view.getAreaThreeView().setActionListenerUp(e ->{
                
                            moveUp();
                    
                            if(model.getAreaThree().getMaximumStepsVertical() > 0 && model.getAreaThree().getMaximumStepsVertical() < 3  ){
                            if(model.getAreaThree().youHaveEncounteredACreature()){
                            view.getBattleScreenView().setEnemyPokemon(model.getAreaThree().encounterEnemyCreature());
                            view.getBattleScreenView().setActiveCreature(model.getPlayer().getActiveCreature());
                            
                            closePanel();
                            openBattlePhase();
                            }
                        }
                            
                        });
                        
                        view.getAreaThreeView().setActionListenerRight(e -> {
                            moveRight();
                
                            if (model.getAreaThree().getMaximumStepsHorizontal() >=1 && model.getAreaThree().getMaximumStepsHorizontal() < 3) {
                                if (model.getAreaThree().youHaveEncounteredACreature()) {
                                Creature enemyCreature = model.getAreaThree().encounterEnemyCreature();
                                enemyCreature.setFamily(enemyCreature.getFamily());
                                enemyCreature.setName(enemyCreature.getName());
                                enemyCreature.setType(enemyCreature.getType());
                                enemyCreature.setLevel(enemyCreature.getLevel());
                                
                                view.getBattleScreenView().setEnemyCreature(enemyCreature);
                                view.getBattleScreenView().setEnemyPokemon(enemyCreature);
                                view.getBattleScreenView().setActiveCreature(model.getPlayer().getInventory().getActiveCreature());
                                
                                
                                    closePanel();
                                    openBattlePhase();
                                }
                            }
                        });
                
                        view.getAreaThreeView().setActionListenerLeft(e -> {
                            moveLeft();
                
                            if (model.getAreaThree().getMaximumStepsHorizontal() >=1 && model.getAreaThree().getMaximumStepsHorizontal() < 3) {
                                if (model.getAreaThree().youHaveEncounteredACreature()) {
                                    view.getBattleScreenView().setEnemyPokemon(model.getAreaThree().encounterEnemyCreature());
                                    view.getBattleScreenView().setActiveCreature(model.getPlayer().getActiveCreature());
                                    closePanel();
                                    openBattlePhase();
                                }
                            }
                        });
                        
                    
                        view.getAreaThreeView().setActionListenerExit(e -> {
                            openMainMenu();
                            closePanel();
                            model.getAreaThree().resetHorizontal();
                            model.getAreaThree().resetVertical();
                            model.getAreaThree().resetSteps();
                            model.getAreaThree().resetVerticalSteps();
                            view.getAreaThreeView().setBoundsPlayer(110, 40);

                        });
                        

                        view.getAreaThreeView().setActionListenerExit(e -> {
                            openMainMenu();
                            closePanel();
                            model.getAreaThree().resetHorizontal();
                            model.getAreaThree().resetVertical();
                            view.getAreaThreeView().setBoundsPlayer(50, 50);
                        });
                        
                        
                        


                    }

                    public void openBattlePhase(){
                        view.getBattleScreenView().setVisible(true);
                    }

                    public void moveRight() {
                        model.getAreaThree().moveRight();
                        view.getAreaThreeView().setBoundsPlayer(model.getAreaThree().getHorizontal(),model.getAreaThree().getVertical());
                    }

                    public void moveLeft() {
                    model.getAreaThree().moveLeft();
                        view.getAreaThreeView().setBoundsPlayer(model.getAreaThree().getHorizontal(),model.getAreaThree().getVertical());
                    }

                    public void moveUp() {
                        model.getAreaThree().moveUp();
                        view.getAreaThreeView().setBoundsPlayer(model.getAreaThree().getHorizontal(),model.getAreaThree().getVertical());
                    }

                    public void moveDown() {
                        model.getAreaThree().moveDown();
                        view.getAreaThreeView().setBoundsPlayer(model.getAreaThree().getHorizontal(),model.getAreaThree().getVertical());
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
