package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Majority_Element {
	public static int majorityElement(int[] num) {
		if (num.length == 1) {
			System.out.println(num[0]);
		}
	 
		Arrays.sort(num);
		System.out.println( num[num.length / 2]);
		return num[num.length / 2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = s.nextInt();
	      int [] myArray = new int[length];
	      System.out.println("Enter the elements of the array:");

	      for(int i=0; i<length; i++ ) {
	         myArray[i] = s.nextInt();
	      }
	      majorityElement(myArray);
	}

}
