package Book4.Chapter5;

public class GenStackTest {
    public static void main(String[] args) {
        GenStack<String> gs = new GenStack<>();

        System.out.println(" Pushing four items onto the stack");
        gs.push("one ");
        gs.push("two ");
        gs.push("three ");
        gs.push("four ");

        System.out.println("There are " + gs.size() + " items in the stack.\n");
        System.out.println("The top item is : " +gs.peek() + "\n");
        System.out.println("Popping everything: ");
        while(gs.hasItem()){
            System.out.println(gs.pop());
        }

    }
}
