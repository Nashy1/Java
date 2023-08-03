package Book2.Chapter8;

public class MyOwnException {
    public static void main(String[] args) throws Exception
    {
        try
        {
            doSomething(true);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void doSomething(boolean t)
            throws Exception
    {
        String name = "T";
        if (name.length()<2)
            throw new Exception("Name too Short");
    }
}
