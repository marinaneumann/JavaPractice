package com.company;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String add1Name;
    private double add1Price;

    private String add2Name;
    private double add2Price;

    private String add3Name;
    private double add3Price;

    private String add4Name;
    private double add4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.add1Name = name;
        this.add1Price = price;
    }
    public void addHamburgerAddition2(String name, double price){
        this.add2Name = name;
        this.add2Price = price;
    }
    public void addHamburgerAddition3(String name, double price){
        this.add3Name = name;
        this.add3Price = price;
    }
    public void addHamburgerAddition4(String name, double price){
        this.add4Name = name;
        this.add4Price = price;
    }
    public double itemizeBurger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll, price is " + this.price);
        if(this.add1Name != null){
            hamburgerPrice += this.add1Price;
            System.out.println("Added " + this.add1Name);
        }
        if(this.add2Name != null){
            hamburgerPrice += this.add2Price;
            System.out.println("Added " + this.add2Name);
        }
        if(this.add3Name != null){
            hamburgerPrice += this.add3Price;
            System.out.println("Added " + this.add3Name);
        }
        if(this.add4Name != null){
            hamburgerPrice += this.add4Price;
            System.out.println("Added " + this.add4Name);
        }
        return hamburgerPrice;
    }
}
