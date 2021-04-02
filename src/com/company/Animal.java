package com.company;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("Animal.eat() is called.");
    }
    public void move(int speed){
        System.out.println("Animal.move() is called and  moving at " + speed);
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
