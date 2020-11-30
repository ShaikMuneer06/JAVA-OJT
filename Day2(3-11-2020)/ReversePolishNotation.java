package com;

import java.util.Stack;

public class ReversePolishNotation {
    public static int reversePolishNotation(String[] tokens) {
        Stack<Integer> to = new Stack<Integer>();
        for(String s : tokens){
            if(s.equals("+")){
                int num1 = to.pop();
                int num2 = to.pop();
                to.push(num1+num2);
            }else if(s.equals("-")){
                int num1 = to.pop();
                int num2 = to.pop();
                to.push(num2-num1);
            }else if(s.equals("*")){
                int num1 = to.pop();
                int num2 = to.pop();
                to.push(num1*num2);
            }else if(s.equals("/")){
                int num1 = to.pop();
                int num2 = to.pop();
                to.push(num2/num1);
            }
            else if(s.equals("%")){
                int num1 = to.pop();
                int num2 = to.pop();
                to.push(num2%num1);
            }
            else{
                to.push(Integer.parseInt(s));
            }
        }
        return to.pop();
    }
    public static void main(String [] args){
    	String[] st = new String[]{"10","20","+","50","*"};
    	System.out.println(reversePolishNotation(st));
    }
}