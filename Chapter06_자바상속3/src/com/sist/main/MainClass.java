package com.sist.main;
class A
{
	private int a;
	public A(int a) 
	{
		this.a=a;
	}
	
	/*public A()
	{
		
	}*/
}
class B extends A
{

	public B() 
	{
		super(1); // public A(int a) => 상위 클래스의 생성자를 호출함
		// TODO Auto-generated constructor stub
	}
	
     /*public B(int a) // 매개변수가 있는 생성자
     {
    	 // super(a); => 생략 불가능 
     }*/
	
	/*public B() // 매개변수가 없는 생성자
	{
		// super(); => 생략가능
	}*/
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
