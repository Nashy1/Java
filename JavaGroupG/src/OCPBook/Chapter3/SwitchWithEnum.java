package OCPBook.Chapter3;

public class SwitchWithEnum {
   static enum Season {WINTER, SPRING, SUMMER, FALL}

    public static void main(String[] args) {
        System.out.println(getWeather(Season.SPRING));
    }
    static String getWeather(Season value) {
        return switch(value) {
            case WINTER -> "Cold";
            case SPRING -> "Rainy";
            case SUMMER -> "Hot";
            case FALL -> "Warm";
        };
    }
}
