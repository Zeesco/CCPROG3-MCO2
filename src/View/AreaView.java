package View;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AreaView extends MainMenu{
    private JPanel pPanel;
    private JButton areaOneButton;
    private JButton areaTwoButton;
    private JButton areaThreeButton;
    private JButton exitButton;

   public AreaView() {

        pPanel = new JPanel(null);

        areaOneButton = new JButton("AREA ONE");
        areaOneButton.setBounds(50, 100, 150, 100);

        areaTwoButton = new JButton("AREA TWO");
        areaTwoButton.setBounds(600, 250, 150, 100);

        areaThreeButton = new JButton("AREA THREE");
        areaThreeButton.setBounds(250, 325, 150, 100);

        exitButton = new JButton("EXIT");
        exitButton.setBounds(250, 400, 150, 100); 
        
        pPanel.add(areaOneButton);
        pPanel.add(areaTwoButton);
        pPanel.add(areaThreeButton);
        pPanel.add(exitButton);

        this.getContentPane().add(pPanel);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
   }

        public void setActionListenerAreaOne(ActionListener actionListener){
            areaOneButton.addActionListener(actionListener);
        }

        public void setActionListenerAreaTwo(ActionListener actionListener){
            areaTwoButton.addActionListener(actionListener);
        }

        public void setActionListenerAreaThree(ActionListener actionListener){
            areaThreeButton.addActionListener(actionListener);
        }

        public void setActionListenerBack(ActionListener actionListener){
            exitButton.addActionListener(actionListener);
        }



}
