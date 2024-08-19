package com.accessModifier;

public class C_04_Public extends B {

	public static void main(String[] args) {
		C_04_Public obj = new C_04_Public();
		int op = obj.x;
		System.out.println("Value of x is: " + op);
		obj.b1();

	}

}
