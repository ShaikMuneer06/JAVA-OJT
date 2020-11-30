package day2;

import java.util.Scanner;

public class Regularexpression_Matching {
public static boolean isMatch(String x , String y){
	if(y.length() == 0){
		return x.length()==0;
	}
	if(y.length()==1){
		if(x.length()<1){
			return false;
		}
		else if((x.charAt(0) != y.charAt(0))&&(y.charAt(0) != '.')){
		return false;
	}
	else{
		return isMatch(x.substring(1),y.substring(1));
	}
	}
	if(y.charAt(1)!='*'){
		if(x.length()<1){
			return false;
		}
	if((y.charAt(0) != x.charAt(0))&&(y.charAt(0) != '.')){
		return false;
		}
	else{
		return isMatch(x.substring(1),y.substring(1));
	}
	}
	else{
		if(isMatch(x,y.substring(2))){
			return true;
		}
		int i = 0;
		while(i<x.length()&&(x.charAt(1)== y.charAt(0)|| y.charAt(0)== '.')){
			if(isMatch(x.substring(i+1),y.substring(2))){
				return true;
			}
		}
	}
	return false;
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String st1 = sc.nextLine();
		System.out.println("Enter the second String");
		String st2 = sc.nextLine();
		boolean b = isMatch(st1, st2);
		System.out.println(b);
	}

}
