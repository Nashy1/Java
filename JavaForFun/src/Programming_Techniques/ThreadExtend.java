package Programming_Techniques;

public class ThreadExtend extends Thread {
    /*first way is to have a class extend the tread class. */
    /*to make this a multi threadalbe we have to override the threads run method  */
@Override
    public void run(){
        for (int i = 1 ; i<=5; i++){
            System.out.println(i);



            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
