package View;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AreaThreeView extends JFrame{
    private JPanel pPanel;
    private JButton upButton;
    private JButton downButton;
    private JButton leftButton;
    private JButton rightButton;
    private JButton exitButton;
    private ImageIcon playerImageIcon;
    private ImageIcon backImageIcon;
    private JLabel background;
    private JLabel player;
    

    public AreaThreeView(){
        super();

        pPanel = new JPanel(null);
        playerImageIcon = new ImageIcon("src/images/ash png.png");
        backImageIcon = new ImageIcon("src/images/area3.png");
        player = new JLabel(playerImageIcon);
        background = new JLabel(backImageIcon);
        player.setBounds(110, 40, 200, 200);
        background.setBounds(0,0,800,600);
        upButton = new JButton("^");
        upButton.setBounds(260, 420, 50, 50);
        downButton = new JButton("v");
        downButton.setBounds(260, 520, 50, 50);
        leftButton = new JButton("<");
        leftButton.setBounds(200, 465, 50, 50);
        rightButton = new JButton(">");
        rightButton.setBounds(300, 465, 50, 50);
        exitButton = new JButton("Exit");
        exitButton.setBounds(450, 490, 100, 100);

        pPanel.add(upButton);
        pPanel.add(player);
        pPanel.add(downButton);
        pPanel.add(leftButton);
        pPanel.add(rightButton);
        pPanel.add(exitButton);
        pPanel.add(background);

        rightButton.setOpaque(false);
        rightButton.setContentAreaFilled(false);
        rightButton.setBorderPainted(false);
        leftButton.setOpaque(false);
        leftButton.setContentAreaFilled(false);
        leftButton.setBorderPainted(false);
        exitButton.setOpaque(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);
        upButton.setOpaque(false);
        upButton.setContentAreaFilled(false);
        upButton.setBorderPainted(false);
        downButton.setOpaque(false);
        downButton.setContentAreaFilled(false);
        downButton.setBorderPainted(false);

        upButton.setFont(new Font("Sans Serif",Font.PLAIN,0));
        downButton.setFont(new Font("Sans Serif",Font.PLAIN,0));
        rightButton.setFont(new Font("Sans Serif",Font.PLAIN,0));
        leftButton.setFont(new Font("Sans Serif",Font.PLAIN,0));
        exitButton.setFont(new Font("Sans Serif",Font.PLAIN,0));


      
          

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
        player.setBounds(horizontal, vertical, 200, 200);
    }
}
