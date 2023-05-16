package com.demo.practice;

public class Test {

	public static void main(String[] args) 
	{
		C c = new C();
		c.dis();
		
	}


}

class A
{
	public void display()
	{
		System.out.println("grandparent");
	}
}
class B extends A
{
	public void dis()
	{
		System.out.println("superparent");
	}
}
class C extends B
{
	public void di()
	{
		System.out.println("child");
	}
}

