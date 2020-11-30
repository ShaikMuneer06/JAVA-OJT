package day10;

import java.util.Scanner;

public class Container_With_Most_Water {
	public static int maxArea(int[] height) {
		if (height == null || height.length < 2) {
			return 0;
		}
	 
		int max = 0;
		int left = 0;
		int right = height.length - 1;
	 
		while (left < right) {
			max = Math.max(max, (right - left) * Math.min(height[left], height[right]));
			if (height[left] < height[right])
				left++;
			else
				right--;
		}
	 System.out.println(max);
		return max;
	}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	     System.out.println("Enter the length of the gas");
	     int length = s.nextInt();
	     int [] myArray = new int[length];
	     System.out.println("Enter the elements of the gas");

	     for(int i=0; i<length; i++ ) {
	        myArray[i] = s.nextInt();
	     }
	     maxArea(myArray);
	}

}
