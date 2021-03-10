public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(){
        this("Default name", 5000.000, "email@email.com");
        System.out.println("Default constructor called");
    }
    public VipCustomer(String n, double credit){

    }
    public VipCustomer(String n, double c,String e){
        this.name   = n;
        this.creditLimit = c;
        this.email = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
