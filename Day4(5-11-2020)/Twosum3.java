package day3;

import java.util.*;

 class Twosum {
	private HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();
	 
	public void add(int number) {
		if (elements.containsKey(number)) {
			elements.put(number, elements.get(number) + 1);
		} else {
			elements.put(number, 1);
		}
	}
 
	public boolean find(int value) {
		for (Integer i : elements.keySet()) {
			int target = value - i;
			if (elements.containsKey(target)) {
				if (i == target && elements.get(target) < 2) {
					continue;
				}
				System.out.println("true");
				return true;
				
			}
		}
		System.out.println("false");
		return false;
	}
 }
	public class Twosum3{
	public static void main(String[] args){
		Twosum t=new Twosum();
		t.add(1);
		t.add(3);
		t.add(5);
		t.find(4);
		t.find(7);
	}
}
