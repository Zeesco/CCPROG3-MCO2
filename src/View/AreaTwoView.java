package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

public class AreaTwoView extends MainMenu {
    private JPanel pPanel;
    private JButton upButton;
    private JButton downButton;
    private JButton leftButton;
    private JButton rightButton;
    private JButton exitButton;
    private JButton player;

    public AreaTwoView(){
        super();

        pPanel = new JPanel(null);
        player = new JButton();
        player.setBounds(50, 50, 50, 50);
        upButton = new JButton("^");
        upButton.setBounds(75, 200, 50, 50);
        downButton = new JButton("v");
        downButton.setBounds(75, 300, 50, 50);
        leftButton = new JButton("<");
        leftButton.setBounds(25, 250, 50, 50);
        rightButton = new JButton(">");
        rightButton.setBounds(125, 250, 50, 50);
        exitButton = new JButton("Exit");
        exitButton.setBounds(50, 500, 100, 25);

        pPanel.add(upButton);
        pPanel.add(player);
        pPanel.add(downButton);
        pPanel.add(leftButton);
        pPanel.add(rightButton);
        pPanel.add(exitButton);
          

        this.getContentPane().add(pPanel);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

  
    public void setActionListenerUp(ActionListener actionListener){
        upButton.addActionListener(actionListener);
    }

    public void setActionListenerDown(ActionListener actionListener){
        downButton.addActionListener(actionListener);
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

    public void setBoundsPlayer(int horizontal, int vertical){
        player.setBounds(horizontal, vertical, 50, 50);
    }
     
}
