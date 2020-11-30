package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Three_Sum {
	public List<List<Integer>> threeSum(int[] nums) {
	    Arrays.sort(nums);
	 
	    ArrayList<List<Integer>> result = new ArrayList<>();
	 
	    for (int i = 0; i < nums.length; i++) {
	        int j = i + 1;
	        int k = nums.length - 1;
	 
	        if (i > 0 && nums[i] == nums[i - 1]) {
	            continue;
	        }
	 
	        while (j < k) {
	            if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
	                k--;
	                continue;
	            }
	 
	            if (nums[i] + nums[j] + nums[k] > 0) {
	                k--;
	            } else if (nums[i] + nums[j] + nums[k] < 0) {
	                j++;
	            } else {
	                ArrayList<Integer> l = new ArrayList<>();
	                l.add(nums[i]);
	                l.add(nums[j]);
	                l.add(nums[k]);
	                result.add(l);
	                j++;
	                k--;
	            }
	        }
	    }
	 System.out.println(result);
	    return result;
	}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = s.nextInt();
	      int [] n = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         n[i] = s.nextInt();
	      }
		Three_Sum d = new Three_Sum();
		d.threeSum(n);
		
	}
}
