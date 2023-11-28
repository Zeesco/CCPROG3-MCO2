package View;

import javax.swing.ImageIcon;

public class GenerateImageCreature {

    public GenerateImageCreature(){
        
    }
    
    public ImageIcon generatePicture(String name ){

        if(name.equals("STRAWANDER")){
           return new ImageIcon("src/images/pokemon cards/strawander.png");
        }else if(name.equals("STRAWLEON")){
             return new ImageIcon("src/images/pokemon cards/strawleon.png");
        }else if(name.equals("STRAWIZARD")){
             return new ImageIcon("src/images/pokemon cards/strawizard.png");
        }else if(name.equals("CHOCOWOOL")){
            return new ImageIcon("src/images/pokemon cards/chocowool.png");
        }else if(name.equals("CHOCOFLUFF")){
            return new ImageIcon("src/images/pokemon cards/chocofluff.png");
        }else if(name.equals("CANDAROS")){
            return new ImageIcon("src/images/pokemon cards/candaros.png");
        }else if(name.equals("PARFWIT")){
            return new ImageIcon("src/images/pokemon cards/parfwit.png");
        }else if(name.equals("PARFURE")){
            return new ImageIcon("src/images/pokemon cards/parfure.png");
        }else if(name.equals("PARFELURE")){
            return new ImageIcon("src/images/pokemon cards/parfelure.png");
        }else if(name.equals("BROWNISAUR")){
            return new ImageIcon("src/images/pokemon cards/brownisaur.png");
        }else if(name.equals("CHOCOSAUR")){
            return new ImageIcon("src/images/pokemon cards/chocosaur.png");
        }else if(name.equals("FUDGASAUR")){
            return new ImageIcon("src/images/pokemon cards/fudgasaur.png");
        }else if(name.equals("FRUBAT")){
            return new ImageIcon("src/images/pokemon cards/frubat.png");
        }else if(name.equals("GOLBERRY")){
            return new ImageIcon("src/images/pokemon cards/golberry.png");
        }else if(name.equals("CROBERRY")){
            return new ImageIcon("src/images/pokemon cards/croberry.png");
        }else if(name.equals("MALTS")){
            return new ImageIcon("src/images/pokemon cards/malts.png");
        }else if(name.equals("KIRLICAKE")){
            return new ImageIcon("src/images/pokemon cards/kirlicake.png");
        }else if(name.equals("VELVEVOIR")){
            return new ImageIcon("src/images/pokemon cards/velvoir.png");
        
        }else if(name.equals("SQUIRPIE")){
            return new ImageIcon("src/images/pokemon cards/squirpie.png");
        }else if(name.equals("TARTOILE")){
            return new ImageIcon("src/images/pokemon cards/tartoile.png");
        }else if(name.equals("PIESTOISE")){
            return new ImageIcon("src/images/pokemon cards/piestoise.png");
        }else if(name.equals("CHOCOLITE")){
            return new ImageIcon("src/images/pokemon cards/chocolite.png");
        }else if(name.equals("CHOCOLISH")){
            return new ImageIcon("src/images/pokemon cards/chocolish.png");
        }else if(name.equals("ICESUNDAE")){
            return new ImageIcon("src/images/pokemon cards/icesundae.png");
        }else if(name.equals("OSHACONE")){
            return new ImageIcon("src/images/pokemon cards/oshacone.png");
        }else if(name.equals("DEWICE")){
            return new ImageIcon("src/images/pokemon cards/dewice.png");
        }else if(name.equals("SAMURACONE")){
            return new ImageIcon("src/images/pokemon cards/samuracone.png");
        }else{
            return null;
        }
    }
}
