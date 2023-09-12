package Book8.Chapter2;

import java.io.*;
import java.text.NumberFormat;

public class ReadFile {
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        BufferedReader in = getReader("Movies.txt");

    }
    private static BufferedReader getReader(String name){
        BufferedReader in = null;
        try{
            File file = new File(name);
            in = new BufferedReader(new FileReader(file));
        }catch (FileNotFoundException e){
            System.out.println("The file doesn't exist.");
            System.exit(0);
        }
        return in;
    }
    private static Movie readMovie(BufferedReader in){
        String title;
        int year;
        double price;
        String line = "";
        String[] data;
        try {
            line= in.readLine();
        }catch (IOException e){
            System.out.println("I/O Error");
            System.exit(0);
        }
        if (line ==null){
            return null;
        }else {
            data = line.split("\t");
            title =data[0];
            year =Integer.parseInt(data[1]);
            price =Double.parseDouble(data[2]);
            return new Movie(title,year,price);
        }
    }


    private static class Movie{
        public String title;
        public int year;
        public double price;
        public Movie(String title,int year,double price){
            this.title =title;
            this.year=year;
            this.price =price;
        }
    }
}