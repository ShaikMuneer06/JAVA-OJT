package day8;

import java.util.Scanner;

public class Peak_Element {
	 public static int findPeakElement(int[] num) {
	        int max = num[0];
	        int index = 0;
	        for(int i=1; i<=num.length-2; i++){
	            int prev = num[i-1];
	            int curr = num[i];
	            int next = num[i+1];
	 
	            if(curr > prev && curr > next && curr > max){
	                index = i;
	                max = curr;
	            }
	        }
	 
	        if(num[num.length-1] > max){
	        	System.out.println(num.length-1);
	            return num.length-1;
	        }
	 System.out.println(index);
	        return index;
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
	    findPeakElement(myArray);

	}

}
