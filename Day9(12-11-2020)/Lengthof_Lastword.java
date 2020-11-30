package day5;

import java.util.Scanner;

public class Lengthof_Lastword {
	public static int lengthOfLastWord(String s) { 
	    if(s==null || s.length() == 0)
	        System.out.println("0");
	 
	    int result = 0;
	    int len = s.length();
	 
	    boolean flag = false;
	    for(int i=len-1; i>=0; i--){
	        char c = s.charAt(i);
	        if((c>='a' && c<='z') || (c>='A' && c<='Z')){
	            flag = true;
	            result++;
	        }else{
	            if(flag)
	                System.out.println(result);
	        }
	    }
	 
	    
		return result;
	}
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		lengthOfLastWord(s);

	}

}
