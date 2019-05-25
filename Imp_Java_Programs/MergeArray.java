package com.lara10;

public class MergeArray 
{
	public static int[] merge(int [] array1, int[] array2)
	{
		int length1 = array1.length;
		int length2 = array2.length;
		int [] newArray = new int[length1+length2];
		int i = 0, j= 0;
		for(int k = 0; k < newArray.length; k++)
		{
			if(i >= length1)
			{
				newArray[k] = array2[j];
				j++;
			}
			else if(j >= length2)
			{
				newArray[k] = array1[i];
				i++;
			}
			else
			{
				if(array1[i] < array2[j])
				{
					newArray[k] = array1[i];
					i++;
				}
				else
				{
					newArray[k] = array2[j];
					j++;
				}
			}
		}
		return newArray;
	}
	public static void main(String[] args) 
	{
		int [] x1 = {10, 20, 30, 40};
		int [] x2 = {5, 15, 25};
		int [] result = merge(x1, x2);
		for(int i = 0; i < result.length; i++)
		{
			System.out.print(result[i]+",");
		}
	}
}
