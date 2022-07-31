package com.timbuchalka;

public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("Player K.O.");
            //Reduce number of lives
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
