package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Closest_Threesum {
	public static int threeSumClosest(int[] nums, int target) {
	    int min = Integer.MAX_VALUE;
		int result = 0;
	 
		Arrays.sort(nums);
	 
		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				int diff = Math.abs(sum - target);
	 
				if(diff == 0) return sum;
	 
				if (diff < min) {
					min = diff;
					result = sum;
				}
				if (sum <= target) {
					j++;
				} else {
					k--;
				}
			}
		}
	 System.out.println(result);
		return result;
	}
	public static void main(String args[]){
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
	      threeSumClosest(nums,target);
	      
	}
}
