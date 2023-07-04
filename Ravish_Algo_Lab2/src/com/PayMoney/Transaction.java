package com.PayMoney;

import java.util.Scanner;

public class Transaction {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int size;
		System.out.println("Enter the size of transaction array:");
		size=s.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the values of each transaction:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Enter total no. of targets that needs to be achieved:");
		int target,value;
		target=s.nextInt();
		
		CheckTransaction ct=new CheckTransaction();
		
		for(int i=1;i<=target;i++)
		{ 
			System.out.println("Enter value of "+i+"th target:");
			value=s.nextInt();
			ct.checkTransaction(arr,value);
			
		}	
		
		s.close(); //scanner closed
	}

}
