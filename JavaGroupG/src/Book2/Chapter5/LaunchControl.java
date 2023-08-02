package Book2.Chapter5;

public class LaunchControl {
    public static void main(String[] args) {
        System.out.print("We are going to launch in T minus ");
        for (int count=10;count>=0;count--){
            if(count==5) {
                System.out.println("Ignition sequence start!");
            }
                else{
                    System.out.println(count + "...");
            }
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    System.out.println(e);
                }
        }
        System.out.println("All engines running!");
        System.out.println("LiftOFF!");
    }
}
