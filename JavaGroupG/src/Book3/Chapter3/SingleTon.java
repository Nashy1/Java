package Book3.Chapter3;

public class SingleTon {
    private static SingleTon instance;

    private SingleTon(){
    }
    public static SingleTon getSingleTon(){
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;

    }
    public static void main(String[] args) {
        SingleTon s = SingleTon.getSingleTon();
        SingleTon s1 = SingleTon.getSingleTon();
        if(s==s1){
            System.out.println("The objects are the same");
        }else {
            System.out.println("The objects are not the same");
        }
    }
}
