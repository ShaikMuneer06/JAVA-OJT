package day3;

import java.util.Scanner;

public class Stringto_Integer {
	public static int atoi(String str) {
		if (str == null || str.length() < 1)
			
			System.out.println(0);
	 
		// trim white spaces
		str = str.trim();
	 
		char flag = '+';
	 
		// check negative or positive
		int i = 0;
		if (str.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (str.charAt(0) == '+') {
			i++;
		}
		// use double to store result
		double result = 0;
	 
		// calculate value
		while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			result = result * 10 + (str.charAt(i) - '0');
			i++;
		}
	 
		if (flag == '-')
			result = -result;
	 
		// handle max and min
		if (result > Integer.MAX_VALUE)
			System.out.println(Integer.MAX_VALUE);
	 
		if (result < Integer.MIN_VALUE)
			System.out.println( Integer.MIN_VALUE);
		
	 System.out.println("result"+result);
	return i;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String st =sc.nextLine();
		atoi(st);
	}
} 
