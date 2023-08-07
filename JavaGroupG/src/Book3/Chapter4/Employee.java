package Book3.Chapter4;

import java.text.NumberFormat;
import java.util.Scanner;

public class Employee {



    //main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your salaries or hourly:");
        String wageType = sc.nextLine();
        System.out.println("Please enter rate or salary ");
        double wage = sc.nextDouble();


        if(wageType.equalsIgnoreCase("salary")){
            Employee emp = new SalariedEmployee(wage);
            ((SalariedEmployee) emp).getFormattedSalary();
        } else if (wageType.equalsIgnoreCase("hourly")) {
            Employee emp = new HourlyEmployee(wage);
            ((HourlyEmployee) emp).getFormattedRate();
        } else{
            System.out.println("incorrect input.");
        }


//        Employee emp = new SalariedEmployee(5000.00);
//        Employee emp = new HourlyEmployee(200.00);
//        String msg;
//        if (emp instanceof SalariedEmployee) {
//             ((SalariedEmployee) emp).getFormattedSalary();
//        }
//        else {
//            ((HourlyEmployee) emp).getFormattedRate();
//        }
    }




    public Employee getEmployee(){
        return this;
    }

}

class SalariedEmployee extends Employee{
    double salary;
    public SalariedEmployee(double salary){
        this.salary=salary;
    }
    public void getFormattedSalary(){
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("The employee's salary is " +nf.format(this.salary));
    }
}

class HourlyEmployee extends Employee{
    double rate;
    public HourlyEmployee(double rate){
        this.rate=rate;
    }
    public void getFormattedRate(){
        NumberFormat rf = NumberFormat.getCurrencyInstance();
        System.out.println("The employee's hourly rate is " + rf.format(this.rate) );

    }

}
