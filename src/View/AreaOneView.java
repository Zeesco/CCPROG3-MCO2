package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;


public class AreaOneView extends MainMenu {
    private JPanel pPanel;
    private JButton leftButton;
    private JButton rightButton;
    private JButton exitButton;
    private JButton player;

    public AreaOneView(){
        super();

        pPanel = new JPanel(null);
        leftButton = new JButton("<");
        leftButton.setBounds(25, 250, 50, 50);
        rightButton = new JButton(">");
        rightButton.setBounds(125, 250, 50, 50);
        exitButton = new JButton("Exit");
        exitButton.setBounds(50, 500, 100, 25);

        player = new JButton(":)");
         player.setBounds(50, 50, 100, 100);
         
        pPanel.add(player);
        pPanel.add(leftButton);
        pPanel.add(rightButton);
        pPanel.add(exitButton);
          

        this.getContentPane().add(pPanel);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public void setActionListenerLeft(ActionListener actionListener){
        leftButton.addActionListener(actionListener);
    }

    public void setActionListenerRight(ActionListener actionListener){
        rightButton.addActionListener(actionListener);
    }

    public void setActionListenerExit(ActionListener actionListener){
        exitButton.addActionListener(actionListener);
    }

    public void setBoundsPlayer(int horizontal){
        player.setBounds(horizontal, 50, 100, 100);
    }
}
