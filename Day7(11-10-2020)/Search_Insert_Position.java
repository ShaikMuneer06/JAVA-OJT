package day4;

import java.util.Scanner;

public class Search_Insert_Position {
	public static void searchInsert(int[] nums, int target) {
	    if(target>nums[nums.length-1]){
	        System.out.println(nums.length);
	    }
	 
	    int l=0;
	    int r=nums.length-1;
	 
	    while(l<r){
	        int m = l+(r-l)/2;
	        if(target>nums[m]){
	            l=m+1;
	        }else{
	            r=m;
	        }
	    }
	 
	    System.out.println(l);
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
	      System.out.println("enter the number");
	      int d = s.nextInt();
	      searchInsert(arr1,d);
	}
}
