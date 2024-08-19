package com.accessModifier;

public class C_03_Protected extends B{

	public static void main(String[] args) {
		C_03_Protected obj = new C_03_Protected();
		int op = obj.z;
		System.out.println("Value of z is : "+op);
		obj.protectedMethod();

	}

}
