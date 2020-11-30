package day10;

import java.util.Scanner;

public class Count_Say {
	public static String countAndSay(int n) {
		if (n <= 0)
			return null;
	 
		String result = "1";
		int i = 1;
	 
		while (i < n) {
			StringBuilder sb = new StringBuilder();
			int count = 1;
			for (int j = 1; j < result.length(); j++) {
				if (result.charAt(j) == result.charAt(j - 1)) {
					count++;
				} else {
					sb.append(count);
					sb.append(result.charAt(j - 1));
					count = 1;
				}
			}
	 
			sb.append(count);
			sb.append(result.charAt(result.length() - 1));
			result = sb.toString();
			i++;
		}
	 System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int r  = sc.nextInt();
		countAndSay(r);
	}

}
