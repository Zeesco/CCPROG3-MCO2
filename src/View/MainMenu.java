package View;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JFrame {
    private JPanel pPanel;
    private JButton bInventory;
    private JButton bExploreAnArea;
    private JButton bEvolveCreatures;
    private JButton bQuit;
    private ImageIcon backImageIcon;
    private JLabel backgroundImage;


    public MainMenu() {


        pPanel = new JPanel(null);

        backImageIcon = new ImageIcon("src/images/main menu.png");
        backgroundImage = new JLabel(backImageIcon);
        backgroundImage.setBounds(0, 0, 800, 600);


        bInventory = new JButton("INVENTORY");
        bInventory.setBounds(280, 115, 240, 20);

        bExploreAnArea = new JButton("EXPLORE AN AREA");
        bExploreAnArea.setBounds(280, 160, 240, 20);

        bEvolveCreatures = new JButton("EVOLVE A CREATURE");
        bEvolveCreatures.setBounds(280, 200, 240, 20);

        bQuit = new JButton("QUIT");
        bQuit.setBounds(280, 240, 240, 20);

        bInventory.setOpaque(false);
        bInventory.setContentAreaFilled(false);
        bInventory.setBorderPainted(false);
        bInventory.setFont(new Font("Sans Serif",Font.PLAIN,0));

        bExploreAnArea.setOpaque(false);
        bExploreAnArea.setContentAreaFilled(false);
        bExploreAnArea.setBorderPainted(false);
        bExploreAnArea.setFont(new Font("Sans Serif",Font.PLAIN,0));

        bEvolveCreatures.setOpaque(false);
        bEvolveCreatures.setContentAreaFilled(false);
        bEvolveCreatures.setBorderPainted(false);
        bEvolveCreatures.setFont(new Font("Sans Serif",Font.PLAIN,0));

        bQuit.setOpaque(false);
        bQuit.setContentAreaFilled(false);
        bQuit.setBorderPainted(false);
        bQuit.setFont(new Font("Sans Serif",Font.PLAIN,0));

        pPanel.add(bInventory);
        pPanel.add(bExploreAnArea);
        pPanel.add(bEvolveCreatures);
        pPanel.add(bQuit);
        pPanel.add(backgroundImage);
       

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
