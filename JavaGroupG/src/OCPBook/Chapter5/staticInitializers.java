package OCPBook.Chapter5;



public class staticInitializers {
    private static int one;
    private static final int two;
    private static final int three =3;
//    private static final int four; // this won't compile because no value has been assigned

    static {
        one = 1;// you can reassign a new to this because it's not final
        two = 2;
//        three = 3; // won't compile because three already has a value

    }

//    public static Init (int age){
//        this.age =1;
//
//    }
//
//    public static void main(String[] args) {
//
//    }


}
