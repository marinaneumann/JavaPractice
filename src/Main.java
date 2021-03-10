public class Main {
    public static void main(String[] args){
//        carClassPractice();
//        personClassPractice();
//        bankClassPractice();
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
}
