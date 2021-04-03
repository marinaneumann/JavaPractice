package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
//	    javapractice1_6Ch();
//        compositionPractice();
        polymorphismPractice();
    }
    public static void polymorphismPractice(){
        Computer comp = new Computer("Dell", 800, 500,2001);
        System.out.println(comp.startComputer());
        comp.finderSearch("Penguin Taco Unicorns");
        System.out.println();

        Apple ap = new Apple("Macbook Pro", 2400, 850,2020, "10.15.03", "Pro", 4, "Blah");
        System.out.println(ap.startComputer());
        ap.finderSearch("Penguin Taco Unicorns");
        System.out.println();

        Microsoft micro = new Microsoft("Macbook Pro", 2400, 850,2020, "10.15.03", "Pro", 4, "Blah");
        System.out.println(micro.startComputer());
        micro.finderSearch("Penguin Taco Unicorns");


    }
    public static void compositionPractice(){
        Dimensions dim = new Dimensions(20, 20,5);
        Case theCase = new Case("220B", "Dell", "240" ,dim);
        Monitor theMonitor = new Monitor("27inch beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");
        PC thePC = new PC(theCase,theMonitor, theMotherboard);
//        thePC.getMonitor().drawPixelAt(1500,1200,"red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();
    }
    public static void javapractice1_6Ch(){
        // write your code here
//        carClassPractice();
//        personClassPractice();
//        bankClassPractice();
//        vipClassPractice();
//        wallClassPracitce();
//        pointClassPractice();
//        complexNumPractice();
//        System.out.println("Hmm");
//        Animal animal = new Animal("Animal", 1,1,5,5);
//        Dog dog = new Dog("Bernese Mountain Dog", 8, 20, 2,4,1, 20, 4, 5, "long");
//        dog.eat();
//        dog.walk();
//        System.out.println("Hmm");
//        dog.run();
//        Fish nemo = new Fish("marlin",4,3,10,2,3);
//        nemo.move(5);

        Mercedes merz = new Mercedes(40);
        merz.steer(45);
        merz.accelerate(30);
        merz.accelerate(20);
        merz.accelerate(-42);
    }
    public static void carClassPractice(){
        Car porsche = new Car();
        Car mercedes = new Car();
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());
    }
    public static void personClassPractice(){
        Person peep = new Person();
        peep.setFirstName("Ada");
        peep.setLastName("Lovelace");
        peep.setAge(36);
        System.out.println(peep.getFirstAndLast());
    }
    public static void bankClassPractice(){
        BankAccount bobsAccount = new BankAccount();
        bobsAccount.setBalance(0.00);
        bobsAccount.setAccountNumber("12345");
        bobsAccount.setCustomerName("Bobby Bobson");
        bobsAccount.setEmail("email@email.com");
        bobsAccount.setPhone("911-911-0911");
        bobsAccount.withdrawl(100.0);

        bobsAccount.deposit(500.00);
        bobsAccount.withdrawl(125.00);

        BankAccount lilyAccount = new BankAccount("91111", 0.00, "Lily Lorana Lugerdson", "lilyemail.com", "918-383-9311");
        System.out.println(lilyAccount.getCustomerName());
    }
    public static void vipClassPractice(){
        VipCustomer vip = new VipCustomer();
        System.out.println(vip.getName());

        VipCustomer vip2 = new VipCustomer("Bob", 250000.00);
        System.out.println(vip2.getName());

        VipCustomer vip3 = new VipCustomer("Kyle", 500.00, "kyle@email.com");
        System.out.println(vip3.getName());
    }
    public static void wallClassPracitce(){
        Wall w = new Wall();
        w.setHeight(50);
        w.setWidth(92);
        System.out.println("Area of " + w.getWidth() + " and " + w.getHeight() +" is " + w.getArea());

        Wall d = new Wall(45, 29);
        System.out.println("Area of this is " + d.getArea());
    }
    public static void pointClassPractice(){
        Point test = new Point(3,5);
        Point it = new Point();
        it.setX(6);
        it.setY(3);
        System.out.println("Distance from " + it.getX() + ", " + it.getY() + "to the points " + test.getX() + ", " + test.getY() + " is " + it.distance(test));
    }
    public static void complexNumPractice(){
        ComplexNumber a = new ComplexNumber(3,5);
        ComplexNumber b = new ComplexNumber(2,9);
        a.add(9, 2);
        a.subtract(b);
        a.subtract(2, 4);
        a.add(b);

    }
}
