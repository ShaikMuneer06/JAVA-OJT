package day9;

import java.util.Scanner;

public class Longest_Common_Prefix {
	public static String longestCommonPrefix(String[] strs) {
	    if(strs==null || strs.length ==0){
	        System.out.println("");
	    }
	 
	    if(strs.length == 1){
	        System.out.println(strs[0]);
	    }
	 
	    int i=0;
	    while(true){
	        boolean flag = true;
	        for(int j=1; j<strs.length; j++){
	            if(strs[j].length()<=i || strs[j-1].length() <=i 
	               || strs[j].charAt(i) != strs[j-1].charAt(i)){
	                flag = false;
	                break;
	            }               
	        }
	 
	        if(flag){
	            i++;
	        }else{
	            break;
	        }
	    }
	 System.out.println(strs[0].substring(0,i));
	    return strs[0].substring(0, i);
	}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	      System.out.println("Enter the length of the array:");
	      int length = s.nextInt();
	      String [] myArray = new String[length];
	      System.out.println("Enter the elements of the array:");
	      for(int i=0; i<length; i++ ) {
	         myArray[i] = s.nextLine();
	      }
	      longestCommonPrefix(myArray);
	}

}
