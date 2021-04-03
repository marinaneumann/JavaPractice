package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1;
    private double healthyExtra1Price;

    private String healthyExtra2;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown Rye");

    }
    public void addHealthExtra1(String name, double price){
        this.healthyExtra1 = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthExtra2(String name, double price){
        this.healthyExtra2 = name;
        this.healthyExtra2Price = price;
    }
}
