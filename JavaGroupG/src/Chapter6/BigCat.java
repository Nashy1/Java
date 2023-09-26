package Chapter6;

public class BigCat {
    protected double size;

    public static void main(String[] args) {
        Jaguar j =new Jaguar();
        j.printDetails();

        Spider s =new Spider();
        s.printDetail();
    }
}

 class Jaguar extends BigCat{
    public Jaguar(){
        size =10.2;
    }
    public void printDetails(){
        System.out.println(size); // a child class will have access to protected and public member of the parent just like here
    }
}
class Spider{
public void printDetail(){
//            System.out.println(size); // won't compile because it's not a child class
        }
}