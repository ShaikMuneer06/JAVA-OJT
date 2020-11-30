package com;

import java.util.Scanner;

public class Array_Rotation {
	 void rotate(int arr[], 
             int y, int n) 
{ 
for (int i = n; i > y; i--) 
    rotateOnebyOne(arr, n); 
} 

void rotateOnebyOne(int arr[], int n) 
{ 
int i, temp; 
temp = arr[0]; 
for (i = 0; i < n - 1; i++) 
    arr[i] = arr[i + 1]; 
arr[i] = temp; 
} 

//function to print rotated array 
void printrotatedArray(int arr[], int n) 
{ 
for (int i = 0; i < n; i++) 
    System.out.print(arr[i] + " "); 
} 

// main method to execute program
public static void main(String[] args) 
{ 
Array_Rotation ar = new Array_Rotation(); 
//Scanner to take inputs from user
Scanner s = new Scanner(System.in);
System.out.println("Enter the length of the array:");
int length = s.nextInt();
int [] arr = new int[length];
System.out.println("Enter the elements of the array:");

for(int i=0; i<length; i++ ) {
   arr[i] = s.nextInt();
}
System.out.println("Enter the number from where you want to rotate");
int x = s.nextInt();
ar.rotate(arr, x, arr.length);
System.out.println("Rotation of Array");
ar.printrotatedArray(arr, arr.length); 
} 
} 
	  
	

