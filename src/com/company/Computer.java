package com.company;

public class Computer {
    private String name;
    private double cost;
    private int memory;
    private int yearBuilt;

    public Computer(String name, double cost, int memory, int yearBuilt) {
        this.name = name;
        this.cost = cost;
        this.memory = memory;
        this.yearBuilt = yearBuilt;
    }

    public String startComputer(){
        return "Computer-> startComputer()";
    }

    public void finderSearch(String search){
        System.out.println("Computer searched for " + search);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
}
