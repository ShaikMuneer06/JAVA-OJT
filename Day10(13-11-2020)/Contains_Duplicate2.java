package day6;

import java.util.HashMap;
import java.util.Scanner;

public class Contains_Duplicate2 {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	 
	    for(int i=0; i<nums.length; i++){
	        if(map.containsKey(nums[i])){
	            int pre = map.get(nums[i]);
	            if(i-pre<=k)
	            	System.out.println("true");
	                return true;
	        }
	 
	        map.put(nums[i], i);
	    }
	 System.out.println("false");
	    return false;
	}
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = s.nextInt();
	      int [] arr = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         arr[i] = s.nextInt();
	      }
	      System.out.println("Enter the target");
	      int t = s.nextInt();
	      containsNearbyDuplicate(arr,t);
	}
}
