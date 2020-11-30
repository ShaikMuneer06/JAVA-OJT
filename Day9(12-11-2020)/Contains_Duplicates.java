package day6;

import java.util.HashSet;
import java.util.Scanner;

public class Contains_Duplicates {
	public static boolean containsDuplicate(int[] nums) {
	    if(nums==null || nums.length==0)
	    	System.out.println("false");
	       
	 
	    HashSet<Integer> set = new HashSet<Integer>();
	    for(int i: nums){
	        if(!set.add(i)){
	        	System.out.println("true");
	            return true;
	        }
	    }
	 System.out.println("false");
	    return false;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = s.nextInt();
	      int [] arr = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         arr[i] = s.nextInt();
	      }
containsDuplicate(arr);
	}

}
