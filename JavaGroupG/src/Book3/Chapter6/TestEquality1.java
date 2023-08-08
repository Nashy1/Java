package Book3.Chapter6;

public class TestEquality1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Lot","Jot");
        Employee emp2 = new Employee("Lot","Jot");

        if (emp1==emp2){
            System.out.println("This emp are the same.");
        } else {
            System.out.println("This emp are different");
        }
    }
}
