package com.app2;

public class MissingNumber 
{
	static int getMissing(int []x, int n)
	{
		int i, total;
		total = (n+1)*(n+2)/2;
		for(i=0; i <n; i++)
		{
			total -= x[i];
		}
		return total;
	}

	static int getMissingNo(int a[], int n) 
	{ 
		int x1 = a[0]; 
		int x2 = 1; 

/* For xor of all the elements in array

a = 5 = 0101 (In Binary)
b = 7 = 0111 (In Binary)

Bitwise XOR Operation of 5 and 7
  0101
^ 0111
 ________
  0010  = 2 (In decimal)
*/
		for (int i = 1; i < n; i++) 
			x1 = x1 ^ a[i]; 

		/* For xor of all the elements  
           from 1 to n+1 */
		for (int i = 2; i <= n + 1; i++) 
			x2 = x2 ^ i; 

		return (x1 ^ x2); 
	} 

	public static void main(String[] args) {
		int []x = {1, 2, 3, 5, 6, 7, 8};
		int miss=getMissing(x, x.length);
		System.out.println(miss);
		System.out.println("--------------------------");
		int a[] = { 1, 2, 4, 5, 6 }; 
		int mis = getMissingNo(a, 5); 
		System.out.println(mis); 

	}
}
