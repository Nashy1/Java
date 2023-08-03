package Book2.Chapter7;

public class RandomNumber {
    public static void main(String[] args) {
        int number = getRandomNumber();
        System.out.println("The number is " + number);
    }
    public static int getRandomNumber(){
        int num =(int)Math.floor((Math.random()*20)+1);
        if(num !=12){
            return num;
        }else {
            return 11;
        }
    }
}
