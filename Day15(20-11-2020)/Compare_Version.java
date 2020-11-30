package day9;

import java.util.Scanner;

public class Compare_Version {
	public static int compareVersion(String version1, String version2) {
	    String[] arr1 = version1.split("\\.");
	    String[] arr2 = version2.split("\\.");
	 
	    int i=0;
	    while(i<arr1.length || i<arr2.length){
	        if(i<arr1.length && i<arr2.length){
	            if(Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])){
	            	System.out.println("-1");
	                return -1;
	            }else if(Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])){
	            	System.out.println("-1");
	                return 1;
	            }
	        } else if(i<arr1.length){
	            if(Integer.parseInt(arr1[i]) != 0){
	            	System.out.println("1");
	                return 1;
	            }
	        } else if(i<arr2.length){
	           if(Integer.parseInt(arr2[i]) != 0){
	        	   System.out.println("-1");
	                return -1;
	            }
	        }
	 
	        i++;
	    }
	 System.out.println("0");
	    return 0;
	}
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first version");
	String ver1 = sc.nextLine();
	System.out.println("Enter the second version");
	String ver2 = sc.nextLine();
	compareVersion(ver1,ver2);
}
}
