package Book3.Chapter6;

public class TestEquality3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Lot","Jot");
        Employee emp2 = new Employee("Lot","Jot");
        

        if (emp1.equals(emp3)){
            System.out.println("This emp are the same.");
        } else {
            System.out.println("This emp are different");
        }
    }
}
