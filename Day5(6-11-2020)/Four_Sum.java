package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Four_Sum {
	  private static List<Integer[]> fourSum(int[] nums, int target) {
	    List<Integer[]> result = new ArrayList<>();
	    for (int i = 0; i < nums.length; i++) {
	      for (int j = i + 1; j < nums.length; j++) {
	        for (int k = j + 1; k < nums.length; k++) {
	        	for (int l = k + 1; l < nums.length; l++) {
	          if (nums[i] + nums[j] + nums[k]+ nums[l] == target) {
	            result.add(new Integer[] { nums[i], nums[j], nums[k], nums[l] });
	          }
	        }
	      }
	    }
	    }
	    return result;
	  }

	  public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = s.nextInt();
	      int [] nums = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         nums[i] = s.nextInt();
	      }
	      System.out.println("Enter the target of the array:");
	      int target =  s.nextInt();
	    List<Integer[]> result = fourSum(nums, target);

	    for(Integer[] four: result) {
	      for(int num: four) {
	        System.out.print(num + " ");
	      }
	      System.out.println();
	    }
	  }
}
