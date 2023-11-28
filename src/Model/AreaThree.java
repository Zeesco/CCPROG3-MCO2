package Model;

import java.util.Random;

public class AreaThree extends AreaOne{
     private int vertical;
     private int maximumStepsVertical;


    public AreaThree(int horizontal,int vertical) {
        super(horizontal);
        this.vertical = vertical;
        this.maximumStepsVertical = 5;
        
    }


    @Override
    public Creature encounterEnemyCreature(){
        int chooseLevel = new Random().nextInt(1,2);
        int choosePokemon = new Random().nextInt(1,9);
        
        if(chooseLevel == 1){
        
        switch (choosePokemon) {

            case 1:
                return new Creature("STRAWIZARD", "FIRE", 'A', 3);
            case 2:
                return new Creature("CANDAROS", "FIRE", 'B', 3);
            case 3:
                return new Creature("PARFELURE", "FIRE", 'C', 3);
            case 4:
                return new Creature("FUDGASAUR", "LEAF", 'D', 3);
            case 5:
                return new Creature("CROBERRY", "LEAF", 'E', 3);
            case 6:
                return new Creature("VELVOIR", "LEAF", 'F', 3);
            case 7:
                return new Creature("PIESTOISE", "WATER", 'G', 3);
            case 8:
                return new Creature("ICESUNDAE", "WATER", 'H', 3);
            case 9:
                return new Creature("SAMURACONE", "WATER", 'I', 3);
           default:
                return null;
        }
    }else{
        switch (choosePokemon) {
       
           
            case 1:
                return new Creature("STRAWLEON", "FIRE", 'A', 2);
            case 2:
                return new Creature("CHOCOFLUFF", "FIRE", 'B', 2);
            case 3:
                return new Creature("PARFURE", "FIRE", 'C', 2);
            case 4:
                return new Creature("CHOCOSAUR", "LEAF", 'D', 2);
            case 5:
                return new Creature("GOLBERRY", "LEAF", 'E', 2);
            case 6:
                return new Creature("KIRLICAKE", "LEAF", 'F', 2);
            case 7:
                return new Creature("TARTORTLE", "WATER", 'G', 2);
            case 8:
                return new Creature("CHOCOLISH", "WATER", 'H', 2);
            case 9:
                return new Creature("DEWICE", "WATER", 'I', 2);
           default:
                return null;
        }
    }
}



public void moveUp(){
    if(maximumStepsVertical > 5){
    maximumStepsVertical++;
    vertical-=100;
    }else{
        System.out.println("Cant move up");
    }
}

public void moveDown(){
    if(maximumStepsVertical > 1){
        maximumStepsVertical--;
        vertical+=100;
    }else{
        System.out.println("Cant move down");
    }
}
    

    public void resetVertical(){
        this.vertical = 100;
    }

    public void resetVerticalSteps(){
        this.maximumStepsVertical = 5;
    }   
    

    public int getVertical() {
        return vertical;
    }

    public int getMaximumStepsVertical() {
        return maximumStepsVertical;
    }

   

   
}
