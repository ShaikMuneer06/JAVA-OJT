package day8;

import java.util.Scanner;

class Elem{
    public int value;
    public int min;
    public Elem next;
 
    public Elem(int value, int min){
        this.value = value;
        this.min = min;
    }
}
 
public class Min_Stack {
	 public static Elem top;
	    public Min_Stack() {
	 
	    }
	 
	    public static void push(int x) {
	        if(top == null){
	            top = new Elem(x, x);
	        }else{
	            Elem e = new Elem(x, Math.min(x,top.min));
	            e.next = top;
	            top = e;
	        }
	 
	    }
	 
	    public static void pop() {
	        if(top == null)
	            return;
	        Elem temp = top.next;
	        top.next = null;
	        top = temp;
	 
	    }
	 
	    public static int top() {
	        if(top == null)
	            return -1;
	        System.out.println(top.value);
			return top.value;
	    }
	 
	    public static int getMin() {
	        if(top == null)
	            return -1;
	        System.out.println(top.min);
	        return top.min;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice\n1.push\n2.pop\n3.top\n4.getMin");
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number");
			int x = 10;
			push(x);
			break;
		case 2:
			pop();
			break;
		case 3:
			top();
			break;
		case 4:
			getMin();
			break;
			default:
				System.out.println("Enter Valid Option");
			
		}
	}

}
