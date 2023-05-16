package com.demo.practice;

import java.util.Arrays;

public class RemoveZero 
{
	static int arr1[] = {0,0,5,4,3,0,0,8,7};
	public static void main(String[] args)
	{
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<i; j++)
			{
				int temp=0;
				if(arr1[i] < arr1[j])
				{
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] =temp;
				}
			}
			
		}
		System.out.println(" "+Arrays.toString(arr1));

		
		/*int temp = arr1.length;
		int count = 0;
		
		System.out.println("Zero Length--->"+temp);
		System.out.println("Zero Length--->"+count);
		
		
		for(int i=0;i<temp;i++)
		{
			if(arr1[i] == 0)
			{
				count++;
			}
		}
		System.out.println(temp);
		
		int new_length = temp - count;
		
		int[] new_array = new int[new_length];
		
		System.out.println("New Length--->"+new_length);
		
		int z = 0;											
		
		for(int k=count; k<temp ; k++)						
		{
			new_array[z++] = arr1[k]; 						
		}
		
		System.out.println("new Array----->"+Arrays.toString(new_array));
		
		for(int i=0; i<new_array.length;i++)
		{
			
			
		}
		*/
		
		
		/*for(int i=0; i<new_array.length; i++)
		{
			for(int j=i+1; j<i; j++)
			{
				int flag=0;
				if(arr1[i] < arr1[j])
				{
					flag = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] =flag;
				}
			}
			
		}
		System.out.println(" "+Arrays.toString(arr1));*/
 	}

}
