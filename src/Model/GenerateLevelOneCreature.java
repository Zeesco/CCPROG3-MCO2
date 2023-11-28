package Model;

public class GenerateLevelOneCreature extends Creature implements GenerateCreature{
    
    public GenerateLevelOneCreature(String name){
        super(name,1);
        this.name = name.toUpperCase();
    }


  


    @Override
    public Creature findCreature() {
        // TODO Auto-generated method stub
        if(name.equals("STRAWANDER")){
            return new Creature(name,"FIRE",'A',1);

        }else if (name.equals("CHOCOWOOL")){
            return new Creature("CHOCOWOOL", "FIRE", 'B', 1);

        }else if (name.equals("PARFWIT")){
            return new Creature("PARFWIT", "FIRE", 'C', 1);

        }else if (name.equals("BROWNISAUR")){
            return new Creature("BROWNISAUR", "LEAF", 'D', 1);

        }else if (name.equals("FRUBAT")){
             return new Creature("FRUBAT", "LEAF", 'E', 1);

        }else if (name.equals("MALTS")){
             return new Creature("MALTS", "LEAF", 'F', 1);

        }else if (name.equals("SQUIRPIE")){
             return new Creature("SQUIRPIE", "WATER", 'G', 1);

        }else if (name.equals("CHOCOLITE")){
             return new Creature("CHOCOLITE", "WATER", 'H', 1);

        }else if (name.equals("OSHACONE")){
             return new Creature("OSHACONE", "WATER", 'I', 1);

        }else {
            return null;
        }
    }

   
}


