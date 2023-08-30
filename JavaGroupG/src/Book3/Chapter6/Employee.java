package Book3.Chapter6;

public class Employee  implements Cloneable{
    private String lastName;
    private String firstName;
    private Double salary;
    public Address address;

    public Employee(String lastName,String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = new Address();
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public Double getSalary()
    {
        return this.salary;

    }

    public void setSalary(Double salary)
    {
        this.salary = salary;
    }



    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }

    public boolean equals(Object emp){
        if (this == emp) {
            return true;
        }
        if (emp == null){
            return false;
        }
        if(emp instanceof Employee) {
            Employee e = (Employee) emp;

            return (this.firstName.equals(e.firstName)) && (this.lastName.equals(e.lastName));
        }return false;

    }

    public Object clone()
    {
        Employee emp;
        try{
             emp= (Employee) super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }


        return emp;
    }

}
