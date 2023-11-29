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
        Random random = new Random();
         this.name = name;
         this.level = level;
         this.type = type;
         this.level = level;
         this.health = 200;
         
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
        this.damage = random.nextInt(1,10) * this.level;
        System.out.println("enemyCreature: " + enemyCreature.getName());
        System.out.println("enemyCreature.getType(): " + enemyCreature.getType());
        
        if(enemyCreature.getType().equals("FIRE") && this.type.equals("WATER")){
           
           enemyCreature.receiveDamage(this.damage * 1.5);
        
        }else if(enemyCreature.getType().equals("LEAF") && this.type.equals("FIRE")){
            enemyCreature.receiveDamage(this.damage* 1.5);
           
        }else if(enemyCreature.getType().equals("WATER") && this.type.equals("GRASS")){
            enemyCreature.receiveDamage(this.damage* 1.5);
            
        }
       }
      

       public void receiveDamage(double damage) {
        this.health -= damage;
        
       
        if (this.health < 0) {
            this.health = 0;
        }
    }
   
   
    
       public double getHealth(){
           return this.health;
       }
   
     
       public double getDamage(){
           return damage;
       }

       
    }

       
       

