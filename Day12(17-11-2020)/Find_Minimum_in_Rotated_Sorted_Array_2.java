package day8;

import java.util.Scanner;

public class Find_Minimum_in_Rotated_Sorted_Array_2 {
	public static int findMin(int[] nums) {
	    int i=0;
	    int j=nums.length-1;
	 
	    while(i<=j){
	        while(nums[i]==nums[j] && i!=j){
	            i++;
	        }
	 
	        if(nums[i]<=nums[j]){
	            return nums[i];
	        }
	 
	        int m=(i+j)/2;
	        if(nums[m]>=nums[i]){
	            i=m+1;
	        }else{
	            j=m;
	        }
	    }
	 System.out.println(-1);
	    return -1;
	}
public static void main(String [] args){
	Scanner s = new Scanner(System.in);
    System.out.println("Enter the length of the array:");
    int length = s.nextInt();
    int [] myArray = new int[length];
    System.out.println("Enter the elements of the array:");

    for(int i=0; i<length; i++ ) {
       myArray[i] = s.nextInt();
    }
    findMin(myArray);
}
}
