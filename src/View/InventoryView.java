package View;


import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Model.Creature;

public class InventoryView extends JFrame{

    private JPanel pPanel;
    private JButton bBackButton;
    private JButton bSearchButton;
    private JTextArea searchPokemonArea;
    private JTextArea caughtCreatures;

    public InventoryView(){
        pPanel = new JPanel(null);
        bBackButton = new JButton("BACK");
        bBackButton.setBounds(400, 325, 300, 100);
        bSearchButton = new JButton("SEARCH");
        bSearchButton.setBounds(250, 325, 300, 100);
        searchPokemonArea = new JTextArea();
        searchPokemonArea.setBounds(100, 325, 300, 100);

        caughtCreatures = new JTextArea("CAUGHT CREATURES:\n");
        caughtCreatures.setBounds(50, 100, 300, 100);
        caughtCreatures.setEditable(false);


        


        pPanel.add(bBackButton);
        pPanel.add(bSearchButton);
        pPanel.add(searchPokemonArea);
        pPanel.add(caughtCreatures);    
    


        this.getContentPane().add(pPanel);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }



    public void setActionListenerBack(ActionListener actionListener){
        bBackButton.addActionListener(actionListener);
    }

    public void setActionListenerSearch(ActionListener actionListener){
        bSearchButton.addActionListener(actionListener);
    }


    public JTextArea searchPokemonArea() {
        return searchPokemonArea;
    }

   



    public JTextArea getCaughtCreatures() {
        return caughtCreatures;
    }

    public void caughtCreatures(ArrayList <Creature> caughtCreaturesList){
        caughtCreatures.setText("");
        for(Creature creature: caughtCreaturesList){
            caughtCreatures.append(creature.getName() +"\n");
        }
    }
}

    
