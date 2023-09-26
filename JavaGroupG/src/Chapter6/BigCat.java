package Chapter6;

public class BigCat {
    protected double size;
}

 class Jaguar extends BigCat{
    public Jaguar(){
        size =10.2;
    }
    public void printDetails(){
        System.out.println(size); // a child class will have access to protected and public member of the parent just like here
    }

    class Spider{
        public void printDetail(){
//            System.out.println(size); // won't compile because it's not a child class
        }
    }

}
