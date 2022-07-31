package com.timbuchalka;

public class Vehicle {
    private String name;
    private int mass;

    private int speed;
    private int direction;

    public Vehicle(String name, int mass) {
        this.name = name;
        this.mass = mass;

        this.speed = 0;
        this.direction = 0;
    }

    public void steer(int direction){
        this.direction += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.direction + " degrees.");
    }

    public void move(int speed, int direction){
        this.speed = speed;
        this.direction = direction;
        System.out.println("Vehicle.move(): Moving at " + this.speed
                + " in direction " + this.direction);
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    public void stop(){
        this.speed = 0;
    }
}
