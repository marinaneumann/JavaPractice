package com.company;

public class Microsoft extends Computer {
    private String OS;
    private String type;
    private int numPorts;
    private String appleAccount;

    public Microsoft(String name, double cost, int memory, int yearBuilt, String OS, String type, int numPorts, String appleAccount) {
        super(name, cost, memory, yearBuilt);
        this.OS = OS;
        this.type = type;
        this.numPorts = numPorts;
        this.appleAccount = appleAccount;
    }

    @Override
    public String startComputer() {
        return "Microsoft -> startComputer()";
    }

    @Override
    public void finderSearch(String search) {
        System.out.println("Microsoft searched for " + search);
    }
}
