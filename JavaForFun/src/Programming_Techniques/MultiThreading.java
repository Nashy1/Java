package Programming_Techniques;

public class MultiThreading {
   /* multi -threading is the ability to execute multiple different paths of code at
    same time*/
   public static void main(String[] args) {
      /*this will create five threads at the same time*/
      for (int i = 0; i<5; i++){
         ThreadExtend TE = new ThreadExtend();
         Thread mTE = new Thread(TE);
         mTE.start();
      }
//      throw new RuntimeException();

//
//      ThreadExtend TE = new ThreadExtend();
//      ThreadExtend TE2 = new ThreadExtend();
//      /*the start method allows us to run two threads at the same time*/
//      TE.start();
//      TE2.start();
   }
}
