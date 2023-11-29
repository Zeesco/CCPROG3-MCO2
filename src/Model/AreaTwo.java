package Model;

import java.util.Random;

public class AreaTwo extends AreaOne{
    
    private int vertical;
    private int maximumStepsVertical;

    public AreaTwo(int horizontal,int vertical) {
        super(horizontal);
        this.vertical = vertical;
        this.maximumStepsVertical =0;
        this.horizontal = horizontal;
    }


    @Override
    public Creature encounterEnemyCreature(){
        int chooseLevel = new Random().nextInt(1,2) ;
        int choosePokemon = new Random().nextInt(1,9) ;

        if(chooseLevel==2){
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
    }else{
        switch (choosePokemon) {
            case 1:
                return new Creature("STRAWANDER", "FIRE", 'A', 1);
            case 2:
                return new Creature("CHOCOWOOL", "FIRE", 'B', 1);
            case 3:
                return new Creature("PARFWIT", "FIRE", 'C', 1);
            case 4:
                return new Creature("BROWNISAUR", "LEAF", 'D', 1);
            case 5:
                return new Creature("FRUBAT", "LEAF", 'E', 1);
            case 6:
                return new Creature("MALTS", "LEAF", 'F', 1);
            case 7:
                return new Creature("SQUIRPIE", "WATER", 'G', 1);
            case 8:
                return new Creature("CHOCOLITE", "WATER", 'H', 1);
            case 9:
                return new Creature("OSHACONE", "WATER", 'I', 1);
           default:
                return null;
        }
    }
    }
    @Override
    public void moveRight(){
        if(maxStepsHorizontal <2){
        maxStepsHorizontal++;
        horizontal+=100; 
        }else{
            System.out.println("CANT GO RIGHT");
        }
        
        
    }

    @Override
    public void moveLeft(){
        
        if(maxStepsHorizontal>=1){
            maxStepsHorizontal--;
           horizontal-=100; 
        }else{
            System.out.println("CANT GO LEFT"+maxStepsHorizontal);
        }
    }


    public void moveUp() {
        System.out.println("steps vertical" + getMaximumStepsVertical());
        if (maximumStepsVertical >0) {
            maximumStepsVertical--;
            vertical -= 90;
        } else {
            System.out.println("Cant move up");
        }
    }
    
    public void moveDown() {
        System.out.println("steps vertical" + getMaximumStepsVertical());
        if (maximumStepsVertical < 2) {
            maximumStepsVertical++;
            vertical += 90;
        } else {
            System.out.println("Cant move down");
        }
    }

    public void resetVerticalSteps(){
        this.maximumStepsVertical = 0;
    }   

    public int getMaximumStepsVertical() {
        return maximumStepsVertical;
    }

    public int getVertical() {
        return vertical;
    }

    public void resetVertical(){
        this.vertical = 50;
    }

    public void resetHorizontal(){
        horizontal = 150;
    }

   
}
