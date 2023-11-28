package View;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ChoosingPokemon extends JFrame {

    private  JButton b1_Pokemon;
    private JButton b2_Pokemon;
    private JButton b3_Pokemon;

    private ImageIcon p1_PokemonIcon;
    private ImageIcon p2_PokemonIcon;
    private ImageIcon p3_PokemonIcon;

    private JLabel p1_LabelPicture;
   
    private JPanel pPanel;

   

    public ChoosingPokemon()
    {
        super();
        this.pPanel = new JPanel(null);
        this.b1_Pokemon = new JButton();
        this.b2_Pokemon = new JButton();
        this.b3_Pokemon = new JButton();

        

        p1_PokemonIcon = new ImageIcon("src/images/3.png");
        p2_PokemonIcon = new ImageIcon("src/images/4.png");
        p3_PokemonIcon = new ImageIcon("src/images/leaf pokemons.png");

        

        this.p1_LabelPicture = new JLabel();
        p1_LabelPicture.setBounds(0, 0, 800, 600);
        
        
        pPanel.add(b1_Pokemon);
        pPanel.add(b2_Pokemon);
        pPanel.add(b3_Pokemon);
        pPanel.add(p1_LabelPicture);

        b1_Pokemon.setOpaque(false);
        b1_Pokemon.setContentAreaFilled(false);
        b1_Pokemon.setBorderPainted(false);
        b1_Pokemon.setFont(new Font("Sans Serif",Font.PLAIN,0));
        
        b2_Pokemon.setOpaque(false);
        b2_Pokemon.setContentAreaFilled(false);
        b2_Pokemon.setBorderPainted(false);
        b2_Pokemon.setFont(new Font("Sans Serif",Font.PLAIN,0));

        b3_Pokemon.setOpaque(false);
        b3_Pokemon.setContentAreaFilled(false);
        b3_Pokemon.setBorderPainted(false);
        b3_Pokemon.setFont(new Font("Sans Serif",Font.PLAIN,0));
        
       

        this.getContentPane().add(pPanel);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        
    }

        
    
    
    public void setChosenType(String name){
        if(name.equals("FIRE")){
        this.b1_Pokemon.setText("STRAWANDER");
        this.b2_Pokemon.setText("CHOCOWOOL");
        this.b3_Pokemon.setText("PARFWIT");
        this.p1_LabelPicture.setIcon(p1_PokemonIcon);
        b1_Pokemon.setBounds(200, 430,100, 25);
        b2_Pokemon.setBounds(350, 430, 100, 25);
        b3_Pokemon.setBounds(500, 430, 100, 25);
        

        }else if(name.equals("LEAF")){

        this.b1_Pokemon.setText("BROWNISAUR");
        this.b2_Pokemon.setText("FRUBAT");
        this.b3_Pokemon.setText("MALTS");
        this.p1_LabelPicture.setIcon(p3_PokemonIcon);

        b1_Pokemon.setBounds(190, 475,100, 25);
        b2_Pokemon.setBounds(350, 475, 100, 25);
        b3_Pokemon.setBounds(510, 475, 100, 25);
       

        
        
     

        }else if(name.equals("WATER")){
        this.b1_Pokemon.setText("SQUIRPIE");
        this.b2_Pokemon.setText("CHOCOLITE");
        this.b3_Pokemon.setText("OSHACONE");
        this.p1_LabelPicture.setIcon(p2_PokemonIcon);

        b1_Pokemon.setBounds(177, 390,100, 25);
        b2_Pokemon.setBounds(350, 390, 100, 25);
        b3_Pokemon.setBounds(525, 390, 100, 25);
     

        }
    }
    


    public void setActionListenerOnePokemon(ActionListener actionListener){
        b1_Pokemon.addActionListener(actionListener);
    }
    public JButton getB1_Pokemon() {
        return b1_Pokemon;
    }

    public void setActionListenerTwoPokemon(ActionListener actionListener){
         b2_Pokemon.addActionListener(actionListener);
    }
    public JButton getB2_Pokemon() {
        return b2_Pokemon;
    }

    public void setActionListenerThreePokemon(ActionListener actionListener){
         b3_Pokemon.addActionListener(actionListener);
    }
    public JButton getB3_Pokemon() {
        return b3_Pokemon;
    }


}