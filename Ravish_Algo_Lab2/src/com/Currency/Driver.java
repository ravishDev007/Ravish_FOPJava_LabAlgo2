package com.Currency;

import java.util.Scanner;
import com.Service.*;

public class Driver {
	
	public static void main(String args[])
	{
		MergeSort mergeSort=new MergeSort();
		
		DenominationCount dc=new DenominationCount();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of currency denomination:");
		
		int totalDenominations=sc.nextInt();
		
		System.out.println("Enter the current denominations value:");
		
		int[] notes=new int[totalDenominations];
		
		for(int i=0;i<totalDenominations;i++)
		{
			notes[i]=sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay:");
		
		int amount=sc.nextInt();
		
		mergeSort.sort(notes,0,notes.length-1);
		dc.notesCountImplementation(notes,amount);
		
		
		sc.close();
		
	}
}
