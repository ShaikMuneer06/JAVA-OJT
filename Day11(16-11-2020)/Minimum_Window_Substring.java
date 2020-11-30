package day7;

import java.util.HashMap;
import java.util.Scanner;

public class Minimum_Window_Substring {
	public static String minWindow(String s, String t) {
	    HashMap<Character, Integer> goal = new HashMap<>();
	    int goalSize = t.length();
	    int minLen = Integer.MAX_VALUE;
	    String result = "";
	    for(int k=0; k<t.length(); k++){
	        goal.put(t.charAt(k), goal.getOrDefault(t.charAt(k), 0)+1);
	    }
	 
	    int i=0;
	    int total=0;
	    HashMap<Character, Integer> map = new HashMap<>();
	    for(int j=0; j<s.length(); j++){
	        char c = s.charAt(j);
	        if(!goal.containsKey(c)){
	            continue;
	        }
	        int count = map.getOrDefault(c, 0);
	        if(count<goal.get(c)){
	            total++;
	        }
	 
	        map.put(c, count+1);
	        if(total==goalSize){
	            while(!goal.containsKey(s.charAt(i)) || map.get(s.charAt(i))>goal.get(s.charAt(i))){
	                char pc = s.charAt(i);
	                if(goal.containsKey(pc) && map.get(pc)>goal.get(pc)){
	                    map.put(pc, map.get(pc)-1);
	                }
	 
	                i++;
	            }
	 
	            if(minLen>j-i+1){
	                    minLen = j-i+1;
	                    result = s.substring(i, j+1);
	            }
	        }            
	    }
	 System.out.println(result);
	    return result;
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the String");
	      String s = sc.nextLine();
	      System.out.println("Enter the target");
          String t = sc.nextLine();
          minWindow(s,t);
	}

}
