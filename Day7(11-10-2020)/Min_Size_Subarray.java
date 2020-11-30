package day4;

import java.util.Scanner;

public class Min_Size_Subarray {
	public static int minSubArrayLen(int s, int[] nums) {
	    if(nums==null || nums.length==1)
	       System.out.println(0);
	 
	    int result = nums.length;
	 
	    int start=0;
	    int sum=0;
	    int i=0;
	    boolean exists = false;
	 
	    while(i<=nums.length){
	        if(sum>=s){
	            exists=true; 
	            if(start==i-1){
	                System.out.println(1);;
	            }
	 
	            result = Math.min(result, i-start);
	            sum=sum-nums[start];
	            start++;
	 
	        }else{
	            if(i==nums.length)
	                break;
	            sum = sum+nums[i];
	            i++;    
	        }
	    }
	 
	    if(exists)
	        System.out.println(result);
	    else
	        System.out.println(0);
		return i;
	}
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int n1 = s.nextInt();
	      int [] arr1 = new int[n1];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<n1; i++ ) {
	         arr1[i] = s.nextInt();
	      }
	      int d = 7;
	      minSubArrayLen(d,arr1);
	}
}
