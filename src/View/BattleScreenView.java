package View;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.*;

import Model.Creature;


public class BattleScreenView extends JFrame {
    private JButton attackButton;
    private JButton swapButton;
    private JButton catchCreatureButton;
    private JButton runAwayButton;
    private JLabel enemyPokemon;
    private JLabel activePokemon;
    private ImageIcon backgrouImageIcon;
    private JLabel backgroundImage;
    private Creature enemyCreature;
    private JLabel activeCreatureDamage;
    private JLabel enemyCreatureHealth;

    public BattleScreenView() {
        JPanel pPanel = new JPanel();
        pPanel.setLayout(null);
        backgrouImageIcon = new ImageIcon("src/images/battle screen.png");

        backgroundImage = new JLabel(backgrouImageIcon);
        backgroundImage.setBounds(0,0,800,600);
        attackButton = new JButton("Attack");
        attackButton.setBounds(340, 520, 50, 50);
    
        swapButton = new JButton("Swap");
        swapButton.setBounds(400, 520, 50, 50);
    
        catchCreatureButton = new JButton("Catch Creature");
        catchCreatureButton.setBounds(475, 520, 50, 50);

        runAwayButton = new JButton("RUN AWAY");
        runAwayButton.setBounds(535, 520, 50, 50);
    
        enemyPokemon = new JLabel();
        activePokemon = new JLabel();
        activePokemon.setBounds(155, 300, 400, 400);
        enemyPokemon.setBounds(495, -110, 400, 400);

         

        activeCreatureDamage = new JLabel();
        enemyCreatureHealth = new JLabel();
        activeCreatureDamage.setBounds(155, 300, 400, 400);
        enemyCreatureHealth.setBounds(495, -110, 400, 400);
    
    
    
        pPanel.add(attackButton);
        pPanel.add(swapButton);
        pPanel.add(enemyCreatureHealth);
        pPanel.add(activeCreatureDamage);
        pPanel.add(catchCreatureButton);
        pPanel.add(enemyPokemon);
        pPanel.add(activePokemon);
        pPanel.add(runAwayButton);
        pPanel.add(backgroundImage);

        attackButton.setOpaque(false);
        attackButton.setContentAreaFilled(false);
        attackButton.setBorderPainted(false);
        attackButton.setFont(new Font("Sans Serif",Font.PLAIN,0));

        swapButton.setOpaque(false);
        swapButton.setContentAreaFilled(false);
        swapButton.setBorderPainted(false);
        swapButton.setFont(new Font("Sans Serif",Font.PLAIN,0));

        catchCreatureButton.setOpaque(false);
        catchCreatureButton.setContentAreaFilled(false);
        catchCreatureButton.setBorderPainted(false);
        catchCreatureButton.setFont(new Font("Sans Serif",Font.PLAIN,0));

        runAwayButton.setOpaque(false);
        runAwayButton.setContentAreaFilled(false);
        runAwayButton.setBorderPainted(false);
        runAwayButton.setFont(new Font("Sans Serif",Font.PLAIN,0));

        

    
        
       
        this.getContentPane().add(pPanel);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
    }
    
    public void setActionListenerAttack(ActionListener actionListener){
        attackButton.addActionListener(actionListener);
    }

    public void setActionListenerSwap(ActionListener actionListener){
        swapButton.addActionListener(actionListener);
    }

    public void setActionListenerCatch(ActionListener actionListener){
        catchCreatureButton.addActionListener(actionListener);
    }

    public void setActionListenerRun(ActionListener actionListener){
        runAwayButton.addActionListener(actionListener);
    }


    public void setEnemyPokemon(Creature enemyCreature) {
        GenerateImageCreature generateImageCreature = new GenerateImageCreature();
    
        // Get the width and height of the searchPokemonArea
        int searchAreaWidth = 175;
        int searchAreaHeight = 175;
    
        // Resize the image to match the dimensions of the searchPokemonArea
        ImageIcon resizedIcon = resizeIcon(generateImageCreature.generatePicture(enemyCreature.getName()), searchAreaWidth, searchAreaHeight);
    
        this.enemyPokemon.setIcon(resizedIcon);
    }

    public void setActiveCreature(Creature activePokemon) {
        GenerateImageCreature generateImageCreature = new GenerateImageCreature();
    
        // Get the width and height of the searchPokemonArea
        int searchAreaWidth = 150;
        int searchAreaHeight = 150;
    
        // Resize the image to match the dimensions of the searchPokemonArea
        ImageIcon resizedIcon = resizeIcon(generateImageCreature.generatePicture(activePokemon.getName()), searchAreaWidth, searchAreaHeight);
    
        this.activePokemon.setIcon(resizedIcon);
    }

    public void setEnemyCreature(Creature enemyCreature) {
        this.enemyCreature = enemyCreature;
    }
    public Creature yourEnemy(){
        return enemyCreature;

    }
    
    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }


    public void setEnemyCreatureHealth(double health){
        String numberAsString = String.valueOf(health);
        enemyCreatureHealth.setText(numberAsString);

    }   

    public void damageDealt(double damage){
        String numberAsString = String.valueOf(damage);
        activeCreatureDamage.setText(numberAsString);
    }   



}
