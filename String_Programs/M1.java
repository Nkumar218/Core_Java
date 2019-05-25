package com.lara8;

public class M1
{
	public static boolean isPalindrome(String word)
    {
       char[] c1 = word.toCharArray();
        boolean flag = false;
        String rev = "";
        for(int i = c1.length-1; i>=0; i--)
        {
            rev += word.charAt(i);
        }
        if(rev.equalsIgnoreCase(word))
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
        return flag;
    }
    
    public static void main(String[] args) {
        System.out.println(M1.isPalindrome("Deleveled"));
        System.out.println(M1.isPalindrome("madam"));
    }
}

