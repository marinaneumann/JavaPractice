public class Main {
    public static void main(String[] args){
        Car porsche = new Car();
        Car mercedes = new Car();
        porsche.setModel("Carrera");
        String res = porsche.getModel();
        System.out.println(res);
    }
}
