package Book3.Chapter2;

public class ActorApp {
    public static void main(String[] args) {
//        Actor actor1 = new Actor("Arnold","Schwarzenegger");
        Actor actor2 = new Actor("Nash","MaCash",true);


//        System.out.println("Is " +actor1.firstName + " a good Actor?  " + actor1.isGood );
        System.out.println("Is " + actor2.firstName+ " a good Actor? " +  actor2.isGood );

        actor2.printOdj();
//        actor1.printOdj();

    }
}
