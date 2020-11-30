package day6;

import java.util.Scanner;

public class Remove_Duplicates_From_Sorted_Array2 {
	public static int removeDuplicates(int[] nums) {
	    if(nums==null){
	    	System.out.println("0");
	        return 0;
	    }
	    if(nums.length<3){
	    	System.out.println(nums.length);
	        return nums.length;
	    }
	    int i=0;
	    int j=1;
	    while(j<nums.length){
	        if(nums[j]==nums[i]){
	            if(i==0){
	                i++;
	                j++;
	            }else if(nums[i]==nums[i-1]){
	                j++;
	            }else{    
	                i++;
	                nums[i]=nums[j];
	                j++;
	            }
	        }else{
	            i++;
	            nums[i]=nums[j];
	            j++;
	        }
	    }
	 System.out.println(i+1);
	    return i+1;
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
	      removeDuplicates(arr);
}
}
