package View;

import javax.swing.*;

import Model.Creature;


public class BattleScreenView extends ExploreAnAreaView {
    private JButton attackButton;
    private JButton swapButton;
    private JButton catchCreatureButton;
    private JButton runAwayButton;
    private JLabel enemyPokemon;
    private JLabel activePokemon;

    public BattleScreenView() {
        JPanel pPanel = new JPanel();
        pPanel.setLayout(null);
    
        attackButton = new JButton("Attack");
        attackButton.setBounds(50, 50, 150, 30);
    
        swapButton = new JButton("Swap");
        swapButton.setBounds(200, 50, 150, 30);
    
        catchCreatureButton = new JButton("Catch Creature");
        catchCreatureButton.setBounds(500, 50, 150, 30);

        runAwayButton = new JButton("RUN AWAY");
        runAwayButton.setBounds(700, 50, 150, 30);
    
        enemyPokemon = new JLabel();
        enemyPokemon.setBounds(50, 200, 150, 30);
    
        activePokemon = new JLabel();
    
        pPanel.add(attackButton);
        pPanel.add(swapButton);
        pPanel.add(catchCreatureButton);
        pPanel.add(enemyPokemon);
        pPanel.add(activePokemon);
    
        this.getContentPane().add(pPanel);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
    }
    

    public void setEnemyPokemon(Creature enemyCreature) {
        
        enemyPokemon.setText("Name: "+ enemyCreature.getName()+"\n"+"Health"+ enemyCreature.getHealth());
    }
}
