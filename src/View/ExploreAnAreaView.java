package View;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExploreAnAreaView extends MainMenu {

    private JButton bAreaOne;
    private JButton bAreaTwo;
    private JButton bAreaThree;
    private JButton bBackButton;
    private JPanel pPanel;

    public ExploreAnAreaView() {

        bAreaOne = new JButton("Area One");
        bAreaTwo = new JButton("Area Two");
        bAreaThree = new JButton("Area Three");
        bBackButton = new JButton("Back");

        bAreaOne.setBounds(50, 50, 150, 30);
        bAreaTwo.setBounds(250, 50, 150, 30);
        bAreaThree.setBounds(450, 50, 150, 30);
        bAreaThree.setBounds(550, 50, 150, 30);
        bBackButton.setBounds(750, 50, 150, 30);

        pPanel = new JPanel(null);
        pPanel.add(bAreaOne);
        pPanel.add(bAreaTwo);
        pPanel.add(bAreaThree);
        pPanel.add(bBackButton);

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