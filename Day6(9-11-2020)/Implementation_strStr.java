package day4;

import java.util.Scanner;

public class Implementation_strStr {
	public static int strStr(String haystack, String needle) {
	    if(haystack==null || needle==null)
	    	System.out.println("0");
	 
	    if(needle.length() == 0)
	    	System.out.println(0);
	        
	 
	    for(int i=0; i<haystack.length(); i++){
	        if(i + needle.length() > haystack.length())
	        	System.out.println(-1);
	   int m = i;
	        for(int j=0; j<needle.length(); j++){
	            if(needle.charAt(j)==haystack.charAt(m)){
	                if(j==needle.length()-1)
	                System.out.println(i);
	                m++;
	            }else{
	                break;
	            }
	 
	        }    
	    }   
	    System.out.println(-1);
	    return -1;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String m = sc.nextLine();
		System.out.println("Enter the second string");
		String n  = sc.nextLine();
		strStr(m,n);
	}
}
