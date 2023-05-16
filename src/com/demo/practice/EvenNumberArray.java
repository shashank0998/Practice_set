package com.demo.practice;

import java.util.Arrays;

public class EvenNumberArray 
{
	//static int arr1[] = {21,22,23,24,25,26,27,28,29,30}; 
	static int arr1[] = {30,25,23,24,28,29,21,20};
	
	public static void main(String[] args) 
	{
		
		/*for(int i=0;i<arr1.length;i++)
		{
		
			if(arr1[i]%2==0)
			{
				System.out.println("Even number---"+arr1[i]);
				
			}
			
			
		}
*/		
		
		// sorting array using for loop
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				int temp=0;
				if(arr1[i] < arr1[j])
				{
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
				//System.out.println(Arrays.toString(arr1));
			}
			
		}
		System.out.println(" "+Arrays.toString(arr1));
		
	}

}
