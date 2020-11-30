package day6;

import java.util.ArrayList;

public class Triangle {
	public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		int[] total = new int[triangle.size()];
		int l = triangle.size() - 1;
	 
		for (int i = 0; i < triangle.get(l).size(); i++) {
			total[i] = triangle.get(l).get(i);
		}
		for (int i = triangle.size() - 2; i >= 0; i--) {
			for (int j = 0; j < triangle.get(i + 1).size() - 1; j++) {
				total[j] = triangle.get(i).get(j) + Math.min(total[j], total[j + 1]);
			}
		}
	 System.out.println(total[0]);
		return total[0];
	}
	public static void main(String [] args){
		ArrayList<ArrayList<Integer>> i = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1 = new ArrayList<Integer>(); 
        a1.add(2); 
        i.add(a1); 
        ArrayList<Integer> a2 = new ArrayList<Integer>(); 
        a2.add(3); 
        a2.add(4); 
        i.add(a2); 
        ArrayList<Integer> a3 = new ArrayList<Integer>(); 
        a3.add(6); 
        a3.add(5); 
        a3.add(7); 
        i.add(a3); 
        ArrayList<Integer> a4 = new ArrayList<Integer>(); 
        a4.add(4); 
        a4.add(1); 
        a4.add(8); 
        a4.add(3); 
        i.add(a4); 
        minimumTotal(i);
	}
} 
