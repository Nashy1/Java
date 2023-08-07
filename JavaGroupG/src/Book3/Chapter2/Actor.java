package Book3.Chapter2;

public class Actor {
    String firstName;
    String lastName;
    boolean isGood;

//    public Actor (String first,String last ){
//        this.firstName = first;
//        this.lastName=last;
//    }
    public Actor (String first,String last,boolean isGood ){
        this.firstName = first;
        this.lastName=last;
        this.isGood = isGood;
    }

    public void printOdj(){
        System.out.println(this);
    }
    @Override
    public String toString(){
        return this.firstName + " " + this.lastName;
    }
}
