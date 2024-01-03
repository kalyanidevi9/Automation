package com.UserDefindMethod;

import com.Inheritance.MethodExample3extendsMethodExample2;

public class MethodExample4 {
	
	void division()
	{
	int var1=20;
	int var2=10;
	int var3;
	
	var3=var1/var2;
	System.out.println("The value of the variable var3 after Division is:-"+var3);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
      MethodExample4 m4= new MethodExample4();
      System.out.println("Division Method of MethodExample4");
   
      m4.division();
      System.out.println();
      
      
      MethodExample2 m2= new MethodExample2();
      System.out.println("Addition Method of MethodExample2");
      
      m2.addition();
      System.out.println();
      
     MethodExample3 m3=new MethodExample3();
     System.out.println("subtration Method of MethodExample3");
     
     m3.subtraction();
     System.out.println();
     
     
    
      
      
      
      
	}

}
