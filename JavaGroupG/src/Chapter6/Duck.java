package Chapter6;

public class Duck {
    private String color;
    private int height;
    private int getHeight;

    public void setData(int lenght, int theHeight ){
        lenght =this.lenght;
        height =theHeight;
        this.color ="white";
    }

    public static void main(String[] args) {
        Duck b = new Duck();
        b.setData(1,2);
        System.out.println(b.lenght + " " + b.height + " " +b.color);
    }
}
