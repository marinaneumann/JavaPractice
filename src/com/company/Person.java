package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String n){
        if (!n.isEmpty()) {
            this.firstName = n;
        }else{
            this.firstName = "Unknown";
        }
    }
    public void setLastName(String n){
        if(!n.isEmpty()){
            this.lastName = n;
        }else{
            this.lastName = "Unknown";
        }
    }
    public void setAge(int n){
        if(n >0) {
            this.age = n;
        }else{
            this.age = 0;
        }
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public String getFirstAndLast(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty()){
            return " ";
        }else if(this.firstName.isEmpty()){
            return this.lastName;
        }else if(this.lastName.isEmpty()){
            return this.firstName;
        }
        return this.firstName + " " + this.lastName;
    }
}
