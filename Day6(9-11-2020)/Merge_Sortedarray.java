package day4;

import java.util.Scanner;

public class Merge_Sortedarray {
		public static void mergeArrays(int[] arr1, int[] arr2, int n1, 
									int n2, int[] arr3) 
		{ 
			int i = 0, j = 0, k = 0; 
			while (i<n1 && j <n2) 
			{ 
				if (arr1[i] < arr2[j]) 
					arr3[k++] = arr1[i++]; 
				else
					arr3[k++] = arr2[j++]; 
			} 
			while (i < n1) 
				arr3[k++] = arr1[i++]; 
			while (j < n2) 
				arr3[k++] = arr2[j++]; 
		} 
		
		public static void main (String[] args) 
		{ 
			Scanner s = new Scanner(System.in);
		      System.out.println("Enter the length of the array:");
		      int n1 = s.nextInt();
		      int [] arr1 = new int[n1];
		      System.out.println("Enter the elements of the array:");

		      for(int i=0; i<n1; i++ ) {
		         arr1[i] = s.nextInt();
		      }
		      System.out.println("Enter the length of the array:");
		      int n2 = s.nextInt();
		      int [] arr2 = new int[n2];
		      System.out.println("Enter the elements of the array:");

		      for(int i=0; i<n1; i++ ) {
		         arr2[i] = s.nextInt();
		      }
			int[] arr3 = new int[n1+n2]; 
			
			mergeArrays(arr1, arr2, n1, n2, arr3); 
		
			System.out.println("Array after merging"); 
			for (int i=0; i < n1+n2; i++) 
				System.out.print(arr3[i] + " "); 
		} 
	} 



