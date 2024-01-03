package com.stringcomparison;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

public class stringcompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1="LiveTech";
		String string2="LiveTech";
		
		if(string1.equals(string2))
		{
			System.out.println("string2 variable value is equal to string1 variable value");
		}
		else
		{
			System.out.println("string2 variable value is NOT equal to string1 variable value");
		}
		
		System.out.println();
		System.out.println("*****************");
		
		
		String string3="LiveTech";
		String string4="LiveTech";
		
		if(string3.equalsIgnoreCase(string4))
		{
			System.out.println("string3 variable value is equal to string4 variable value");
			
		}
		else
		{
			System.out.println("string variable value is NOT equal to string4 variable value");
			
		}
		
		System.out.println();
		System.out.println("**************");
		
		String string5="Tech";
		
		String string6="LiveTech";
		
		if(string5.contains(string6))
		{
			System.out.println("string5 variable value is existing in string6 variable value");
			
		}
		else
		{
			System.out.println("string5 variable value is NOT existing in string6 variable value");
		}
		
		
		System.out.println();
		System.out.println("***********string To Lowercase*************");
		
		
		String string7="LiveTech";
		String string7Lowercase=string7.toLowerCase();
System.out.println("The value of the variable string7 after converting to Lowercase is:-"+string7Lowercase);
		
		System.out.println();
		System.out.println("********string to Uppercase*********");
		
		int string7Length=string7.length();
		System.out.println("The number of characters of the string string7 is :-"+string7Length);
		
		
		System.out.println();
		System.out.println("**************");
		
		
		String string8="LiveTech";
		String string9="LiveTech Testing";
		
		int string8Length=string8.length();
		System.out.println(string8Length);
		
		int string9Length=string9.length();
		System.out.println(string9Length);
		
		
		
				
		
				
		
		
				
		
		
		
			
		
	}

	
}
