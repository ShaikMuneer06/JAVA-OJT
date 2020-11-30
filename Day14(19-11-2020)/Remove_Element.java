package day8;

import java.util.Scanner;

public class Remove_Element {
	public static int removeElement(int[] A, int elem) {
	    int i=0;
	    int j=0;
	 
	    while(j < A.length){
	        if(A[j] != elem){
	            A[i] = A[j];
	            i++; 
	        }
	 
	        j++;
	    }
	 System.out.println(i);
	    return i;
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
	      System.out.println("Enter the element to remove");
	      int x =s.nextInt();
	      removeElement(myArray,x);
	}

}
