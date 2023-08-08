package Book3.Chapter6;

public class Employee2 {
    private String lastName;
    private String firstName;

    public Employee2(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public boolean equals(Object emp) {
        if (emp instanceof Employee2) {
            Employee2 e = (Employee2) emp;

            return (this.firstName.equals(this.firstName)) && (this.lastName.equals(this.lastName));
        }
        return false;

    }
}
