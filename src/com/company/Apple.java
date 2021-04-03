package com.company;

public class Apple extends Computer {
    private String OS;
    private String type;
    private int numPorts;
    private String appleAccount;

    public Apple(String name, double cost, int memory, int yearBuilt, String OS, String type, int numPorts, String appleAccount) {
        super(name, cost, memory, yearBuilt);
        this.OS = OS;
        this.type = type;
        this.numPorts = numPorts;
        this.appleAccount = appleAccount;
    }

    @Override
    public String startComputer() {
        return "Apple -> startComputer()";
    }

    @Override
    public void finderSearch(String search) {
        System.out.println("Apple searched for " + search);
    }
}
