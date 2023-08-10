package Book3.Chapter6;

public class CloneTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Jedi","Nash");
        Employee emp2 = (Employee) emp.clone();
        System.out.println("Employee 1 " +emp);
        System.out.println("Employee 2 " +emp2);
        System.out.println(emp.getClass().getName());
        System.out.println(emp2.getClass().getName());
    }
}
