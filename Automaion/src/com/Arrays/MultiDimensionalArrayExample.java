package com.Arrays;

public class MultiDimensionalArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String array1[][]=new String[2][2];
		
		
		array1[0][0]="Veknat sir";
		array1[0][1]="Manual testing";
		
		array1[1][0]="srini";
		//array1[1][1]="selenium";
		
		/*
		array1[2][0]="LoadRunner";
		array1[2][1]="Performance Testing";
		*/
		
		/*
        System.out.println(array1[0][0]);
		System.out.println(array1[0][1]);
		
		
		//System.out.println(array1[2][0]);
		
		System.out.println(array1[1][0]);
		System.out.println(array1[1][1]);
		*/
		
		for(int arrayRowindex=0;arrayRowindex<array1.length;arrayRowindex++)
		{
		
	for(int arrayRowofCellindex=0;arrayRowofCellindex<array1.length;arrayRowofCellindex++)
	{
	System.out.println(array1[arrayRowindex][arrayRowofCellindex]+" |");	
		
	}	
	System.out.println();	
	}
		
	}

}
