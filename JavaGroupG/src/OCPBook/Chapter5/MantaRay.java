package OCPBook.Chapter5;



public class MantaRay {
    private String name ="Nashy";

    public static void main(String[] args) {
        first();
        second();
//        third(); this won't compile
        MantaRay n =new MantaRay();
        n.third(); // can only access an instance method with an instance reference
    }
    public static void first(){
    }
    public static void second(){ }
    public  void  third(){
        System.out.println(name);
    }
}
