package Book3.Chapter6;

public class TestEquality3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Lot","Jot");
        Employee2 emp2 = new Employee2("Lot","Jot");


        if (emp1.equals(emp2)){
            System.out.println("This emp are the same.");
        } else {
            System.out.println("This emp are different");
        }
    }
}
