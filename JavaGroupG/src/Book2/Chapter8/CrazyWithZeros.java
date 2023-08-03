package Book2.Chapter8;

public class CrazyWithZeros {
    public static void main(String[] args) {
        try {
            int answer = divideTheseNumber(5,0);
        } catch (Exception e){
            System.out.println("Tried twice, still didnt work!");
        }
    }
    public static int divideTheseNumber(int a , int b)
        throws Exception{
        int c;
        try {
            c=a/b;
            System.out.println("It worked!");
        }catch (Exception e){
            System.out.println("Didnt work the first time.");
            c=a/b;
            System.out.println("It worked the second time!");
        }
        finally {
            System.out.println("Better clean up my mess.");
        }
        System.out.println("It worked after all.");
        return c;
    }
}
