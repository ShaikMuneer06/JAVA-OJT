package day6;

import java.util.Scanner;

public class Remove_Duplicates_From_Sorted_Array {
	public static int removeDuplicates(int[] A) {
		if (A.length < 2)
			return A.length;
	 
		int j = 0;
		int i = 1;
	 
		while (i < A.length) {
			if (A[i] != A[j]) {
				j++;
				A[j] = A[i];
			}
	 
	                i++;
		}
	 System.out.println(j+1);
		return j + 1;
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
