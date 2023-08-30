package Book4.Chapter5;


class Employee {
    String lastname;
    String firstname;
    public Employee(String lastname, String firstname){
        this.firstname = firstname;
        this.lastname = lastname;

    }
    public String toString(){
        return this.lastname + " " + this.firstname;
    }
}
