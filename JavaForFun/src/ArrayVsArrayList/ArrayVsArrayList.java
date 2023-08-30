package ArrayVsArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        // An Array can basically hold anything, it can hold a primitive data type and objects
        //THIS IS A ARRAY of T STRING.Arrays in java have a fixed size,mean after you have declared your array , it cant increase or decrease
        String[] friendsArray =  new String[3];
        //you can also do like this. Note this array will always have three values inside of it.
        String[] friendsArray2 = {"JJ","OO","PP"};

        //this is a ArrayList of T String, and we define that inside our diamond operator(generics).
        //arrayList do not have a fixed size, they will dynamically either expand or contract their size automatically
        //An arrylist can only hold objects not primitives.But you can use the wrapper class of whatever primitive data type.
        ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("JJ","OO","PP"));


        System.out.println(friendsArray2[2]);
        //for arrylist we use method calls
        System.out.println(friendsArrayList2.get(2));
    }

}
