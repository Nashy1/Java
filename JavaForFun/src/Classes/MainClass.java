package Classes;

public class MainClass {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.heyThere();
        //non static innerclass,we create this by using the instance of the outerclass
//        OuterClass.InnerClass inner = outer.new InnerClass();
//        inner.whatsUp();

        //static innerclass is not tied to the object of the outerclass, so we can just create an instance of the inner by itself
        OuterClass.InnerClass inner2 = new OuterClass.InnerClass();
        inner2.whatsUp();

    }
}
