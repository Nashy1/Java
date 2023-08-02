package Book2.Chapter3;

public class RoundingApp {
    public static void main(String[] args) {
        double x=29.4,y=93.5,z=-19.3;
        Math.round(x);
        System.out.println("Round x= " +x);
        Math.round(y);
        System.out.println("Round y=" +y);
        Math.round(z);
        System.out.println("Round z= " +z);

        Math.ceil(x);
        System.out.println("Ceil x= " +x);
        Math.ceil(y);
        System.out.println("Ceil y= " +y);
        Math.ceil(z);
        System.out.println("Ceil z= " +z);


        Math.floor(x);
        System.out.println("floor x= " +x);
        Math.floor(y);
        System.out.println("floor y= " +y);
        Math.floor(z);
        System.out.println("floor z= " +z);

        Math.rint(x);
        System.out.println("rint x= "+x);
        Math.rint(y);
        System.out.println("rint y= "+y);
        Math.rint(z);
        System.out.println("rint z= "+z);
    }
}
