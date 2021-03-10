public class Main {
    public static void main(String[] args){
//        carClassPractice();
//        personClassPractice();
//        bankClassPractice();
//        vipClassPractice();
//        wallClassPracitce();
        pointClassPractice();
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
}
