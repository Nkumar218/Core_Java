package com.lara9;

public class kell 
{
	public static boolean isSherlock(int arr[])
    {

        int length = arr.length;
        int sum = 0;

        for(int i=0; i<length; ++i)
            sum += arr[i];

        int rightSum = sum-arr[0];
        int leftSum = 0;

        for(int i=0; i<length-1; ++i){

            if(leftSum == rightSum)
                return true;

            leftSum += arr[i];
            rightSum -= arr[i+1];
        }

    if (leftSum == rightSum)
        return true;

    return false;
    }
	public static void main(String[] args)
	{
		int [] x = {0, 2, 3, 1, 4};
		//isSherlock(x);
		System.out.println(isSherlock(x));
	}
}
