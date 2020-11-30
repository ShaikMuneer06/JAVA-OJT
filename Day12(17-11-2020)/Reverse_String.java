package day7;

import java.util.Scanner;

public class Reverse_String {
	public static String reverseWords(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
 
		
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; --i) {
			if (!arr[i].equals("")) {
				sb.append(arr[i]).append(" ");
			}
		}
		System.out.println( sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1));
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the String");
	      String s = sc.nextLine();
	      reverseWords( s);
	}
	}
