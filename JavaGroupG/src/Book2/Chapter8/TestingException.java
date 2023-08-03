package Book2.Chapter8;

import java.util.InputMismatchException;

public class TestingException {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            System.out.println(a / b);
        } catch (InputMismatchException e) {
            System.out.println("err is " + e);
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally {
            System.out.println("Testing Finally");
        }
    }
}
