package com;
import java.io.*; 
import java.util.*; 
class Isomorphic 
{ 
	// Function returns true if str1 and str2 are ismorphic 
	static boolean isomorphic(String str1, String str2) 
	{ 
		int m = str1.length(); 
		int n = str2.length(); 
		
		// Length of both strings must be same for one to one 
		if(m != n) 
			return false; 
			
		// To mark visited characters in str2 
		Boolean[] marked = new Boolean[256]; 
		Arrays.fill(marked, Boolean.FALSE); 
		
		// To store mapping of every character
		int[] map = new int[256]; 
		Arrays.fill(map, -1); 
		
		// Process all characters one by on 
		for (int i = 0; i < n; i++) 
		{
			if (map[str1.charAt(i)] == -1) 
			{ 
				if (marked[str2.charAt(i)] == true) 
					return false; 
				marked[str2.charAt(i)] = true; 
				map[str1.charAt(i)] = str2.charAt(i); 
			} 
			else if (map[str1.charAt(i)] != str2.charAt(i)) 
			return false; 
		} 

		return true; 
	} 
	// main method
	public static void main (String[] args) 
	{ Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first String");
	String st1 = sc.nextLine();
	System.out.println("Enter the second String");
	String st2 = sc.nextLine();
		boolean b = isomorphic(st1, st2); 
		System.out.println(b); 
	} 
} 
