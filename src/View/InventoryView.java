package View;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Model.Creature;

public class InventoryView extends JFrame{

    private JPanel pPanel;
    private JButton bBackButton;
    private JButton bSearchButton;
    private JTextArea searchPokemonArea;
    private JTextArea caughtCreatures;
    private ImageIcon backImageIcon;
    private JLabel backgroundInventory;
    private JLabel message;

    private JLabel activeCreature;

    

    public InventoryView(){
        pPanel = new JPanel(null);
        message = new JLabel();
        activeCreature = new JLabel();
        activeCreature.setBounds(70, -65,800,800);
        message.setBounds(60, 500, 300, 25); // Adjust the width to accommodate the text
        message.setForeground(Color.RED); // Set the desired color
        message.setFont(new Font("Arial", Font.ITALIC, 14)); // Set the desired font and style
        
        backImageIcon = new ImageIcon("src/images/inventory.png");
        backgroundInventory = new JLabel(backImageIcon);
        backgroundInventory.setBounds(0,0,800,600);
        bBackButton = new JButton("BACK");
        bBackButton.setBounds(35, 535, 100, 25);

        bSearchButton = new JButton("SEARCH");
        bSearchButton.setBounds(266, 158, 75, 25);
        searchPokemonArea = new JTextArea();
        searchPokemonArea.setBounds(80, 157, 160, 25);

        caughtCreatures = new JTextArea();
        caughtCreatures.setBounds(420, 250, 315, 300);
        caughtCreatures.setEditable(false);
        caughtCreatures.setOpaque(false);

        searchPokemonArea.setOpaque(false);
        
        

        bSearchButton.setOpaque(false);
        bSearchButton.setContentAreaFilled(false);
        bSearchButton.setBorderPainted(false);
        bSearchButton.setFont(new Font("Sans Serif",Font.PLAIN,0));

        bBackButton.setOpaque(false);
        bBackButton.setContentAreaFilled(false);
        bBackButton.setBorderPainted(false);
        bBackButton.setFont(new Font("Sans Serif",Font.PLAIN,0));


        

        pPanel.add(activeCreature);
        pPanel.add(bBackButton);
        pPanel.add(bSearchButton);
        pPanel.add(searchPokemonArea);
        pPanel.add(caughtCreatures);  
        pPanel.add(activeCreature);
        pPanel.add(message);
        pPanel.add(backgroundInventory);  
    
    


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

    public JTextArea getSearchPokemonArea() {
        return searchPokemonArea;
    }


    public JTextArea searchPokemonArea() {
        return searchPokemonArea;
    }

    public JLabel getMessage() {
        return message;
    }

   
    public void setActiveCreatureImage(String name) {
        GenerateImageCreature generateImageCreature = new GenerateImageCreature();
    
        // Get the width and height of the searchPokemonArea
        int searchAreaWidth = 250;
        int searchAreaHeight = 250;
    
        // Resize the image to match the dimensions of the searchPokemonArea
        ImageIcon resizedIcon = resizeIcon(generateImageCreature.generatePicture(name), searchAreaWidth, searchAreaHeight);
    
        this.activeCreature.setIcon(resizedIcon);
    }
    
    private ImageIcon resizeIcon(ImageIcon icon, int width, int height) {
        Image image = icon.getImage();
        Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
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

    
