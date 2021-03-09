public class Main {
    public static void main(String[] args){
//        Car porsche = new Car();
//        Car mercedes = new Car();
//        porsche.setModel("Carrera");
//        System.out.println(porsche.getModel());
        Person peep = new Person();
        peep.setFirstName("Ada");
        peep.setLastName("Lovelace");
        peep.setAge(36);
        System.out.println(peep.getFirstAndLast());
    }
}
