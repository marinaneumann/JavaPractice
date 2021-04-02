package com.company;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){

    }
    private void moveMusceles(){
        System.out.println("Fish moved musceles");
    }
    private void moveBackFin(){
        System.out.println("Fish moved back fin");
    }

    @Override
    public void move(int speed) {
        swim(speed);
        super.move(speed);
    }

    private void swim(int speed){
        moveMusceles();
        moveBackFin();
    }
}
