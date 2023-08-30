package Book4.Chapter3;



import Book4.Chapter2.Array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 implements Iterable {
    public static void main(String[] args) {
//        //    ArrayList signs = new ArrayList();
//        ArrayList sign = new ArrayList(200);
//        sign.add(300);
//        sign.add("hi");
//        System.out.println(sign);

//        Employee emp = new Employee("Jabez","Lot");
//        ArrayList<Employee> sign = new ArrayList();
////        sign.add("Mac P");
//        sign.add(emp);
//        System.out.println(sign);


        ArrayList<String> nums = new ArrayList(2);
        nums.add("one");
        nums.add("two");
        nums.add("three");
        nums.add("four");
//        System.out.println(nums);
//        nums.add(10, "ten");//err index does not exist
//        for(int i= 0; i <nums.size();i++){
//            System.out.println(nums.get(i));
//        }

//        for(String e : nums){
//            int i = nums.indexOf(e);
//            System.out.println("Item" + i + ": " + e);
//        }

//        Iterator e = nums.iterator();
//        while(e.hasNext()){
//            String s = (String) e.next();
//            System.out.println(s);
//        }


//       String uno = nums.set(0,"Uno");
//        String dos =  nums.set(1,"Dos");
//        String tres =  nums.set(2,"Tres");
//        String cuatro =  nums.set(3,"Cuatro");
//        System.out.println(uno);
//        System.out.println(dos);
//        System.out.println(tres);
//        System.out.println(cuatro);

        ArrayList<String> newItems = new ArrayList(2);
        newItems.add("Uno");
        newItems.add("Dos");
        newItems.add("Tres");
        newItems.add("Cuatro");

        for (int i =0; i < nums.size();i++){
            System.out.println(nums.set(i,newItems.get(i)));
        }
        System.out.println(nums);



    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
class Employee{
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
