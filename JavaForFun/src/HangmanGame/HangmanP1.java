//package HangmanGame;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//
//public class HangmanP1  {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc =new Scanner(new File("C:\\Users\\ghost\\IdeaProjects\\JavaForFun\\src\\HangmanGame\\words"));
//        Scanner scKb =new Scanner();
//        List<String> words = new ArrayList();
//
//
//
//        while (sc.hasNext()){
//           words.add(sc.nextLine());
//        }
//
//        Random ran =new Random();
//        String word = words.get(ran.nextInt(words.size()));
//        System.out.println(word);
//
//
//        List<Character> playerGuesses = new ArrayList<>();
//        for (int i = 0; i< word.length();i++){
//            if(playerGuesses.contains(word.charAt(i))){
//                System.out.print(word.charAt(i));
//            }else {
//                System.out.print("_");
//            }
//        }
//    }
//
//}
