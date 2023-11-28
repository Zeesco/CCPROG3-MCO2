package View;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;


public class AreaOneView extends JFrame {
    private JPanel pPanel;
    private JButton leftButton;
    private JButton rightButton;
    private JButton exitButton;
    private JLabel player;
    private JLabel backImage;
    private ImageIcon pictureAsh;
    private ImageIcon backImageIcon;


    public AreaOneView(){
  
        pictureAsh = new ImageIcon("src/images/ash png.png");
        backImageIcon = new ImageIcon("src/images/area1.png");

        pPanel = new JPanel(null);
        leftButton = new JButton("<");
        leftButton.setBounds(200, 465, 50, 50);
        rightButton = new JButton(">");
        rightButton.setBounds(300, 465, 50, 50);
        exitButton = new JButton("Exit");
        exitButton.setBounds(450, 490, 100, 100);

        player = new JLabel(pictureAsh);
        player.setBounds(110, 130, 250, 200);
        backImage = new JLabel(backImageIcon);
        backImage.setBounds(0, 0, 800, 600);
         
        pPanel.add(player);
        pPanel.add(leftButton);
        pPanel.add(rightButton);
        pPanel.add(exitButton);
        pPanel.add(backImage);

        rightButton.setOpaque(false);
        rightButton.setContentAreaFilled(false);
        rightButton.setBorderPainted(false);
        leftButton.setOpaque(false);
        leftButton.setContentAreaFilled(false);
        leftButton.setBorderPainted(false);
        exitButton.setOpaque(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setBorderPainted(false);
        leftButton.setFont(new Font("Sans Serif",Font.PLAIN,0));
        rightButton.setFont(new Font("Sans Serif",Font.PLAIN,0));
        exitButton.setFont(new Font("Sans Serif",Font.PLAIN,0));
          

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
        player.setBounds(horizontal, 130, 250, 200);
    }
}
