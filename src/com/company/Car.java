package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;


    public void setModel(String m){
       if(m != null){
           this.model = m;
       }
    }
    public String getModel(){
        if(this.model != null){
            return this.model;
        }
        return "N/A";
    }

}
