package com.UserDefindMethod;

public class MethodExample6 {
	public void addition()  // User-Defined Method WithOut Parameters
	// public methods can be accessed in any Java Class
	 // User-Defined Method Names should be always be Unique
	{
	// local Variables
	int var1=20;
	int var2=30;
	int var3;

	var3=var1+var2;
	System.out.println(" The value of the variable var3 after addition is(WithOut Parameters) :- "+var3);
	}
	
	public void addition(int var1,int var2)//user_Defind Method With parameters
	{
		int var3;
		var3=var1+var2;
		
		System.out.println("the value of the variable var3 after addition is:-"+var3);
		
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
