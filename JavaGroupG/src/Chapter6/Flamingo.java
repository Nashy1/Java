package Chapter6;

public class Flamingo {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color;
    }

    public static void main(String[] args) {
        var f = new Flamingo();
        f.setColor("Pink");
        System.out.println(f.color);
    }
}
