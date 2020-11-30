package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Pascals_Triangle {
	public static ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (numRows <= 0)
			return result;
	 
		ArrayList<Integer> pre = new ArrayList<Integer>();
		pre.add(1);
		result.add(pre);
	 
		for (int i = 2; i <= numRows; i++) {
			ArrayList<Integer> cur = new ArrayList<Integer>();
	 
			cur.add(1); //first
			for (int j = 0; j < pre.size() - 1; j++) {
				cur.add(pre.get(j) + pre.get(j + 1)); //middle
			}
			cur.add(1);//last
	 
			result.add(cur);
			pre = cur;
		}
	 System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r  = sc.nextInt();
		generate(r);
	}

}
