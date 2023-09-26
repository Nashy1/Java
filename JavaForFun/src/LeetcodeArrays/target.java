package LeetcodeArrays;

import java.util.ArrayList;

public class target {
    static int target =9;
   static int[] nums ={1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
        for (int i =0;i<nums.length;i++){
            for (int j = i+1;j<nums.length; j++){
                if (nums[j]==target -nums[i]){
//                    System.out.println(new int[]{i,j}.toString());
                    System.out.println(nums[i] +"," +nums[j]);
                }
            }
        }
    }


}
