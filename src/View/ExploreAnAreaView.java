package View;

import java.awt.Font;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExploreAnAreaView extends JFrame {

    private JButton bAreaOne;
    private JButton bAreaTwo;
    private JButton bAreaThree;
    private JButton bBackButton;
    private JPanel pPanel;
    private ImageIcon backImageIcon;
    private JLabel backgroundImage;

    public ExploreAnAreaView() {

        backImageIcon = new ImageIcon("src/images/explore an area.png");
        backgroundImage = new JLabel(backImageIcon);
        bAreaOne = new JButton("Area One");
        bAreaTwo = new JButton("Area Two");
        bAreaThree = new JButton("Area Three");
        bBackButton = new JButton("Back");
        backgroundImage.setBounds(0, 0, 800, 600);
        bAreaOne.setBounds(50, 260, 180, 30);
        bAreaTwo.setBounds(50, 310, 180, 30);
        bAreaThree.setBounds(50, 350, 180, 30);
        bBackButton.setBounds(50, 400, 300, 30);

        pPanel = new JPanel(null);
        pPanel.add(bAreaOne);
        pPanel.add(bAreaTwo);
        pPanel.add(bAreaThree);
        pPanel.add(bBackButton);
        pPanel.add(backgroundImage);

        bAreaOne.setOpaque(false);
        bAreaOne.setContentAreaFilled(false);
        bAreaOne.setBorderPainted(false);
        bAreaOne.setFont(new Font("Sans Serif",Font.PLAIN,0));

        bAreaTwo.setOpaque(false);
        bAreaTwo.setContentAreaFilled(false);
        bAreaTwo.setBorderPainted(false);
        bAreaTwo.setFont(new Font("Sans Serif",Font.PLAIN,0));

        bAreaThree.setOpaque(false);
        bAreaThree.setContentAreaFilled(false);
        bAreaThree.setBorderPainted(false);
        bAreaThree.setFont(new Font("Sans Serif",Font.PLAIN,0));

        bBackButton.setOpaque(false);
        bBackButton.setContentAreaFilled(false);
        bBackButton.setBorderPainted(false);
        bBackButton.setFont(new Font("Sans Serif",Font.PLAIN,0));
        

        this.getContentPane().add(pPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null); 
    }


    public void setActionListenerAreaOne(ActionListener actionListener){
        bAreaOne.addActionListener(actionListener);
    }

    public void setActionListenerAreaTwo(ActionListener actionListener){
        bAreaTwo.addActionListener(actionListener);
    }

    public void setActionListenerAreaThree(ActionListener actionListener){
        bAreaThree.addActionListener(actionListener);
    }

    public void setActionListenerBack(ActionListener actionListener){
        bBackButton.addActionListener(actionListener);
    }


}