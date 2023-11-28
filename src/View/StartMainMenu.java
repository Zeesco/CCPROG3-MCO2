package View;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;

import java.awt.event.ActionListener;


public class StartMainMenu extends JFrame{
   
    
    private JPanel pPanel;
    private JButton bPlay;
    private JButton bQuit;
    private ImageIcon pPicture;
    private ImageIcon pTitle;
    private JLabel lTitle;

    public StartMainMenu(){
        super();
        pPanel = new JPanel(null);
        pPicture = new ImageIcon("src/images/StartMainMenu.png");
        


        lTitle = new JLabel("POKEMON");
        lTitle.setBounds(250, 100, 300, 100);

       

        bPlay = new JButton("PLAY");
        bPlay.setBounds(305, 248, 190, 45);
        bQuit = new JButton("QUIT");

        bPlay.setOpaque(false);
        bPlay.setContentAreaFilled(false);
        bPlay.setBorderPainted(false);
        bPlay.setFont(new Font("Sans Serif",Font.PLAIN,0));

        bQuit.setOpaque(false);
        bQuit.setContentAreaFilled(false);
        bQuit.setBorderPainted(false);
        bQuit.setFont(new Font("Sans Serif",Font.PLAIN,0));

        
        bQuit.setBounds(305, 325, 190, 45);

        

       
        JLabel backgroundLabel = new JLabel(pPicture);
        JLabel titleGamePicture = new JLabel (pTitle);
        backgroundLabel.setBounds(0, 0, 800, 600);
        titleGamePicture.setBounds(0, -100, 800, 600);

        pPanel.add(bPlay);
        pPanel.add(bQuit);
        pPanel.add(titleGamePicture);
        pPanel.add(backgroundLabel);
        
    
        this.getContentPane().add(pPanel);

        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }


    public void setActionListenerPlay(ActionListener actionListener){
        bPlay.addActionListener(actionListener);
    }

    public void setActionListenerQuit(ActionListener actionListener){
        bQuit.addActionListener(actionListener);
    }



}
