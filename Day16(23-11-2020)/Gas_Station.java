package day10;

import java.util.Arrays;
import java.util.Scanner;

public class Gas_Station {
	public static int canCompleteCircuit(int[] gas, int[] cost) {
		int sumRemaining = 0; // track current remaining
		int total = 0; // track total remaining
		int start = 0; 
	 
		for (int i = 0; i < gas.length; i++) {
			int remaining = gas[i] - cost[i];
	 
			//if sum remaining of (i-1) >= 0, continue 
			if (sumRemaining >= 0) { 
				sumRemaining += remaining;
			//otherwise, reset start index to be current
			} else {
				sumRemaining = remaining;
				start = i;
			}
			total += remaining;
		}
	 
		if (total >= 0){
			System.out.println(start);
			return start;
		}else{
			System.out.println(-1);
			return -1;
		}
	}
public static void main(String [] args){
	 Scanner s = new Scanner(System.in);
     System.out.println("Enter the length of the gas");
     int length = s.nextInt();
     int [] myArray = new int[length];
     System.out.println("Enter the elements of the gas");

     for(int i=0; i<length; i++ ) {
        myArray[i] = s.nextInt();
     }
     System.out.println("Enter the length of the cost");
     int length1 = s.nextInt();
     int [] myArray1 = new int[length1];
     System.out.println("Enter the elements of the end");

     for(int i=0; i<length; i++ ) {
        myArray1[i] = s.nextInt();
     }
     canCompleteCircuit(myArray,myArray1);
  	
}
}
