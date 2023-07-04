package com.PayMoney;

public class CheckTransaction {
	
	void checkTransaction(int arr[],int value)
	{
		 for(int i=0;i<arr.length;i++)
		 {
			 
			 if(value>arr[arr.length-1])
			 {
				 System.out.println("Target can not be achieved");
				 break;
			 }
			 
			 if(value<=arr[i])
			 {
				 System.out.println("Target completed in "+(i+1)+" transactions");
				 break;
			 }		 
				 
		 }
		
	}

}
