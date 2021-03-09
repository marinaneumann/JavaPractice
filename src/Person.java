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
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
}
