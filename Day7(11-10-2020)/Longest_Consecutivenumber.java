package day5;

import java.util.HashSet;
import java.util.Scanner;

public class Longest_Consecutivenumber {
	public static int longest(int[] nums) {
		if(nums.length==0){
			return 0;
		}
	    HashSet<Integer> set = new HashSet<>();
	    for(int num: nums) set.add(num);
	 
	    int result = 0;
	 
	    for(int num: nums){
	        int count = 1;
	 
	        int down = num-1;
	        while(set.contains(down)){
	            set.remove(down);
	            down--;
	            count++;
	        }
	 
	        int up = num+1;
	        while(set.contains(up)){
	            set.remove(up);
	            up++;
	            count++;
	        }
	 
	        result = Math.max(result, count);
	    }
	 System.out.println("The length of longest consecutive number is "+result);
	    return result;
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
          longest(arr);
	}
}
