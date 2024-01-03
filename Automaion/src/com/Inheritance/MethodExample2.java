package com.Inheritance;



public class MethodExample2 extends MethodExample1 {
	
	private void subtraction()
	{
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var2-var1;
		System.out.println("The value of the variable var3 after subtraction is :-"+var3);
		
	}
	
	protected void multiplication()
	{
		int var1=20;
		int var2=30;
		int var3;
		
		var3=var1*var2;
		System.out.println("The value of the variable var3 after Multipilcation is :-"+var3);
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample2 m2=new MethodExample2();
		System.out.println("********Method of methodExample2 class********");
		m2.subtraction();
		m2.multiplication();
		System.out.println();
		
		
		MethodExample1 m1=new MethodExample1();
		System.out.println("********Methods of MethodExample1 class*********");
		m1.addition();
		
	}

}
