package View;

import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class MainMenu extends ChoosingPokemon {
    private JPanel pPanel;
    private JButton bInventory;
    private JButton bExploreAnArea;
    private JButton bEvolveCreatures;
    private JButton bQuit;

    public MainMenu() {


        pPanel = new JPanel(null);

        bInventory = new JButton("INVENTORY");
        bInventory.setBounds(50, 100, 150, 100);

        bExploreAnArea = new JButton("EXPLORE AN AREA");
        bExploreAnArea.setBounds(600, 250, 150, 100);

        bEvolveCreatures = new JButton("EVOLVE A CREATURE");
        bEvolveCreatures.setBounds(250, 325, 150, 100);

        bQuit = new JButton("QUIT");
        bQuit.setBounds(250, 400, 150, 100);

        pPanel.add(bInventory);
        pPanel.add(bExploreAnArea);
        pPanel.add(bEvolveCreatures);
        pPanel.add(bQuit);

        this.getContentPane().add(pPanel);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }


    public void setActionListenerInventory(ActionListener actionListener){
        bInventory.addActionListener(actionListener);
    }
    public void setActionListenerExploreAnArea(ActionListener actionListener){
        bExploreAnArea.addActionListener(actionListener);
    }
    public void setActionListenerEvolveCreature(ActionListener actionListener){
        bEvolveCreatures.addActionListener(actionListener);
    }
    public void setActionListenerQuitGame(ActionListener actionListener){
        bQuit.addActionListener(actionListener);
    }
}
