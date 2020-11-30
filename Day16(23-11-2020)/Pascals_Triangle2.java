package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascals_Triangle2 {
	public static List<Integer> getRow(int rowIndex) {
		ArrayList<Integer> result = new ArrayList<Integer>();
	 
		if (rowIndex < 0)
			return result;
	 
		result.add(1);
		for (int i = 1; i <= rowIndex; i++) {
			for (int j = result.size() - 2; j >= 0; j--) {
				result.set(j + 1, result.get(j) + result.get(j + 1));
			}
			result.add(1);
		}
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int r  = sc.nextInt();
		getRow(r);


	}

}
