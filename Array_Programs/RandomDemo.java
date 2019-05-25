package com.lara4;

import java.util.Random;

public class RandomDemo
{
    public static void main(String[] args)
    {
        Random random = new Random();
 
        //Generating random integers using Random class
 
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random Integers : "+random.nextInt());
        }
 
        System.out.println("-----------------------------");
 
        //Generating random doubles using Random class
 
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random Doubles : "+random.nextDouble());
        }
 
        System.out.println("-----------------------------");
 
        //Generating random booleans using Random class
 
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random booleans : "+random.nextBoolean());
        }
        
      //Generating random doubles using Math.random()
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Random Doubles : "+Math.random());
        }
    }
}