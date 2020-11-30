package day9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Largest_Number {
	public static String largestNumber(int[] nums) {
	    String[] arr = new String[nums.length];
	    for(int i=0; i<nums.length; i++){
	        arr[i]=String.valueOf(nums[i]);
	    }
	    Arrays.sort(arr, new Comparator<String>(){
	        public int compare(String a, String b){
	            return (b+a).compareTo(a+b);
	        }
	    });
	    StringBuilder sb = new StringBuilder();
	    for(String s: arr){
	        sb.append(s);
	    }
	    while(sb.charAt(0)=='0'&&sb.length()>1)
	        sb.deleteCharAt(0);
	 System.out.println(sb.toString());
	    return sb.toString();
	}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = s.nextInt();
	      int [] myArray = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         myArray[i] = s.nextInt();
	      }
      largestNumber(myArray);
	}

}
