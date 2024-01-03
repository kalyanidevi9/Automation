package com.UserDefindMethod;

public class MethodExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodExample3 m3 = new MethodExample3();
		System.out.println(" Subtraction Method of MethodExample3 Java Class ");
		m3.subtraction();

		System.out.println(" Multiplication Method of MethodExample3 Java Class ");
		m3.multiplication();
		System.out.println(" Subtraction Method of MethodExample3 Java Class ");
		m3.subtraction();
/*
		MethodExample2 m = new MethodExample2();
		System.out.println(" Addition Method of MethodExample2 Java Class ");
		m.addition();

		}

		protected void multiplication() // can be accessed in the same class
		// can also be accessed in another class of the same Package
		{
		int var1=20;
		int var2=30;
		int var3;
		
		
		var3=var1*var2;
		System.out.println(" The value of the variable var3 after Multiplication is :- "+var3);
*/
		//private void subtraction() // can be accessed only within the class in which it is created
        // can also be accessed in the same class for multiple number of Times
        // private methods cannot be accessed in any other different class
     {
     int var1=20;
     int var2=30;
     int var3;

     var3=var1-var2;
     System.out.println(" The value of the variable var3 after Subtraction is :- "+var3);

}
	}

	private void multiplication() {
		// TODO Auto-generated method stub
		
	}

	public void subtraction() {
		// TODO Auto-generated method stub
		
	}

	
	

}
