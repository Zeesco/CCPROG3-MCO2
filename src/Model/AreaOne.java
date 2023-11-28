package Model;

import java.util.Random;

public  class AreaOne {

    private int horizontal;
    private int maxStepsHorizontal;
   

    public AreaOne (int horizontal){
        this.horizontal = horizontal;
        this.maxStepsHorizontal = 0;
       
    }

    public boolean youHaveEncounteredACreature(){
        int randomNumber = new Random().nextInt(1,100) ;
        if(randomNumber <= 40 ){
            return true;
        }
        return false;
    }
    
    public Creature encounterEnemyCreature(){
        int randomNumber = new Random().nextInt(1,9) ;

        
        switch (randomNumber) {
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
    


    public void moveRight(){
        if(maxStepsHorizontal <5){
        maxStepsHorizontal++;
        horizontal+=100; 
        }else{
            System.out.println("CANT GO RIGHT");
        }
        
        
    }
    public void moveLeft(){
        
        if(maxStepsHorizontal>1){
            maxStepsHorizontal--;
           horizontal+=100; 
        }else{
            System.out.println("CANT GO LEFT");
        }
    }

    public int getHorizontal() {
        return horizontal;
    }

    public void resetHorizontal() {
        this.horizontal = 100;
    }

    public void resetSteps(){
        this.maxStepsHorizontal = 0;
    }

    public int getMaximumStepsHorizontal() {
        return maxStepsHorizontal;
    }

    







    
}
