package Model;

public class GenerateLevelThreeCreature extends Creature implements GenerateCreature{
    
    public GenerateLevelThreeCreature(String name){
        super(name,3);
        this.name = name.toUpperCase();
    }

    
    @Override
    public Creature findCreature() {
        // TODO Auto-generated method stub
        if(name.equals("STARWIZARD")){
            return new Creature(name,"FIRE",'A',2);

        }else if (name.equals("CANDAROS")){
            return new Creature(name, "FIRE", 'B', 2);

        }else if (name.equals("PARFELURE")){
            return new Creature(name, "FIRE", 'C', 2);

        }else if (name.equals("FUDGASAUR")){
            return new Creature(name, "LEAF", 'D', 2);

        }else if (name.equals("CROBERRY")){
             return new Creature(name, "LEAF", 'E', 2);

        }else if (name.equals("VELVOIR")){
             return new Creature(name, "LEAF", 'F', 2);

        }else if (name.equals("PIESTOICE")){
             return new Creature(name, "WATER", 'G', 2);

        }else if (name.equals("ICESUNDAE")){
             return new Creature(name, "WATER", 'H', 2);

        }else if (name.equals("SAMURCONE")){
             return new Creature(name, "WATER", 'I', 2);

        }else {
            return null;
        }
    }
}


