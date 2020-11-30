package day5;

import java.util.Scanner;

public class Valid_Paindrome {
	public static boolean isPalindrome(String s) {
	    if(s==null){
	    	System.out.println("false");
	        return false;
	    }
	 
	    s = s.toLowerCase();
	 
	    int i=0;
	    int j=s.length()-1;
	
	    while(i<j){
	        while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z')|| (s.charAt(i)>='0'&&s.charAt(i)<='9'))){
	            i++;
	        }
	 
	        while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z') || (s.charAt(j)>='0'&&s.charAt(j)<='9'))){
	            j--;
	        }
	 
	        if(s.charAt(i) != s.charAt(j)){
	        	System.out.println("false");
	            return false;
	        }
	 
	        i++;
	        j--;
	    }
	    System.out.println("true");
	    return true;
	}
	public static void main(String [] args){
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the string");
		String pal = sc.nextLine();
		isPalindrome(pal);
	}
}
