package View;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;

public class EvolveCreaturesView extends JFrame {

    private JPanel pPanel;
    private JButton bEvolve;
    private JButton bBack;
    
    public EvolveCreaturesView(){
        pPanel = new JPanel();
        this.bBack = new JButton("BACK");
        this.bEvolve = new JButton("EVOLVE NOW");

        bEvolve.setBounds(50, 50, 150, 30);
        bBack.setBounds(210, 50, 150, 30);
 
        pPanel.add(bEvolve);
        pPanel.add(bBack);


        this.getContentPane().add(pPanel);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }


    public void setActionListenerBack(ActionListener actionListener){
        bBack.addActionListener(actionListener);
    }

    public void setActionListenerEvolve(ActionListener actionListener){
        bEvolve.addActionListener(actionListener);
    }
}