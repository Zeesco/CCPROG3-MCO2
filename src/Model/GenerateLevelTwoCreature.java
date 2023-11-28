package Model;

public class GenerateLevelTwoCreature extends Creature implements GenerateCreature{
    
    public GenerateLevelTwoCreature(String name){
        super(name,2);
        this.name = name.toUpperCase();
    }

    
    @Override
    public Creature findCreature() {
        // TODO Auto-generated method stub
        if(name.equals("STRAWLEON")){
            return new Creature(name,"FIRE",'A',2);

        }else if (name.equals("CHOCOFLUFF")){
            return new Creature(name, "FIRE", 'B', 2);

        }else if (name.equals("PARFURE")){
            return new Creature(name, "FIRE", 'C', 2);

        }else if (name.equals("CHOCOSAUR")){
            return new Creature(name, "LEAF", 'D', 2);

        }else if (name.equals("GOLBERRY")){
             return new Creature(name, "LEAF", 'E', 2);

        }else if (name.equals("KIRLICAKE")){
             return new Creature(name, "LEAF", 'F', 2);

        }else if (name.equals("TARTOILE")){
             return new Creature(name, "WATER", 'G', 2);

        }else if (name.equals("CHOCOLISH")){
             return new Creature(name, "WATER", 'H', 2);

        }else if (name.equals("DEWICE")){
             return new Creature(name, "WATER", 'I', 2);

        }else {
            return null;
        }
    }
}


