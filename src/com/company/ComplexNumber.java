package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double r, double i){
        this.real = r;
        this.imaginary = i;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
    public void add(double r, double i){
        this.real += r;
        this.imaginary += i;
    }
    public void add(ComplexNumber c){
        add(c.getReal(), c.getImaginary());
    }
    public void subtract(double r, double i){
        this.real -= r;
        this.imaginary  -= i;
    }
    public void subtract(ComplexNumber c){
        subtract(c.getReal(), c.getImaginary());
    }
}
