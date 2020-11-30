package com;

import java.util.Scanner;

class Median
	{
		static int  getMedian(int ar1[], int ar2[], int n)
		{ 
			int i = 0; 
			int j = 0; 
			int count;
			int m1 = -1, m2 = -1;
			for (count = 0; count <= n; count++)
			{
				if (i == n)
				{
					m1 = m2;
					m2 = ar2[0];
					break;
				}
				else if (j == n)
				{
					m1 = m2;
					m2 = ar1[0];
					break;
				}
				if (ar1[i] <= ar2[j])
				{ 
					m1 = m2; 
					m2 = ar1[i];
					i++;
				}
				else
				{
					m1 = m2; 
					m2 = ar2[j];
					j++;
				}
			}		
			return (m1 + m2)/2;
		}
		/* Driver program to test above function */
		public static void main (String[] args)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the length of  array:");
			int length = s.nextInt();
			int [] ar1 = new int[length];
			System.out.println("Enter the elements of first array:");

			for(int i=0; i<length; i++ ) {
			   ar1[i] = s.nextInt();
			}
			int [] ar2 = new int[length];
			System.out.println("Enter the elements of second array:");

			for(int i=0; i<length; i++ ) {
			   ar2[i] = s.nextInt();
			}
		
			int n1 = ar1.length;
			int n2 = ar2.length;
			if (n1 == n2)
				System.out.println("Median is " +getMedian(ar1, ar2, n1));
			else
				System.out.println("arrays are of unequal size");
		} 
	}


