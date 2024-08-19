package com.accessModifier;

class B{
	int x=10;
	public void b1() {
		System.out.println("This is jst print method");
	}
	
	protected int z=200;
	protected void protectedMethod() {
		System.out.println("This is a protected method");
	}
}
public class C_02_Default {

	public static void main(String[] args) {
		B obj = new B();
		int op = obj.z;
		System.out.println("value of Z is: " + op);
		obj.b1();
		obj.protectedMethod();

	}

}
