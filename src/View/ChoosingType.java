package View;


import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class ChoosingType extends JFrame {
    private JPanel pPanel;
    private ImageIcon image;
    private JButton bFire;
    private JButton bWater;
    private JButton bLeaf;


    
    public ChoosingType(){
        image = new ImageIcon("/Users/yuanbutiong/Desktop/MCO2/src/View/BackgroundInterfaces/ChooseType.png");
        JLabel chooseType = new JLabel(image);
        chooseType.setBounds(1, -20, 800, 600);
       
        pPanel = new JPanel(null);

        bFire = new JButton("FIRE");
        bFire.setBounds(115, 485, 125, 45);

        bFire.setOpaque(false);
        bFire.setContentAreaFilled(false);
        bFire.setBorderPainted(false);
        bFire.setFont(new Font("Sans Serif",Font.PLAIN,0));

        bWater = new JButton("WATER");
        bWater.setBounds(340, 485, 125, 45);

        bWater.setOpaque(false);
        bWater.setContentAreaFilled(false);
        bWater.setBorderPainted(false);
        bWater.setFont(new Font("Sans Serif",Font.PLAIN,0));

        bLeaf = new JButton("LEAF");
        bLeaf.setBounds(570, 485, 124, 45);
        
        bLeaf.setOpaque(false);
        bLeaf.setContentAreaFilled(false);
        bLeaf.setBorderPainted(false);
        bLeaf.setFont(new Font("Sans Serif",Font.PLAIN,0));

        

        pPanel.add(bFire);
        pPanel.add(bWater);
        pPanel.add(bLeaf);
        pPanel.add(chooseType);
        
       
        

        this.getContentPane().add(pPanel);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }

    public JButton getbFire() {
        return bFire;
    }

    public JButton getbLeaf() {
        return bLeaf;
    }
    public JButton getbWater() {
        return bWater;
    }

    public void setActionListenerFireType(ActionListener actionListener){
        bFire.addActionListener(actionListener);
    }
    public void setActionListenerWaterType(ActionListener actionListener){
        bWater.addActionListener(actionListener);
    }
    public void setActionListenerLeafType(ActionListener actionListener){
        bLeaf.addActionListener(actionListener);
    }

    

   
} 