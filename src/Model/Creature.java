package Model;

import java.util.Random;

public  class Creature {
    protected String name;
       private String type;
       private char family;
       private  int level;
       private double health;
       private double damage;
       
       
       public Creature(String name){
         this.name = name;
        
       }

       public Creature(String name,int level){
         this.name = name;
         this.level = level;
        
       }

       public Creature(String name, String type, char family, int level){
         this.name = name;
         this.level = level;
       }


       public void setFamily(char family) {
           this.family = family;
       }

       public void setLevel(int level) {
           this.level = level;
       }

       public void setName(String name) {
           this.name = name;
       }

       public void setType(String type) {
           this.type = type;
       }


       public char getFamily() {
           return family;
       }

       public int getLevel() {
           return level;
       }
       public String getName() {
           return name;
       }
       public String getType() {
           return type;
       }

       public void attackCreature(Creature enemyCreature){
        Random random = new Random();
        damage = random.nextInt(1,10) * this.level;
        if(enemyCreature.getType().equals("FIRE") && this.type.equals("WATER")){
           
           enemyCreature.receiveDamage(damage * 1.5);
        
        }else if(enemyCreature.getType().equals("LEAF") && this.type.equals("FIRE")){
            enemyCreature.receiveDamage(damage* 1.5);
           
        }else if(enemyCreature.getType().equals("WATER") && this.type.equals("GRASS")){
            enemyCreature.receiveDamage(damage* 1.5);
            
        }
       }
      

       public void receiveDamage(double damage){
            this.health-=damage;
       }
   
   
    
       public double getHealth(){
           return this.health;
       }
   
     
       public double getDamage(){
           return damage;
       }

       
    }

       
       

