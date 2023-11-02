package com.sist.exam;

public class MainClass_4 /*implements Runnable*/{
	public void run()
	{
		System.out.println("run Call...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*MainClass_4 m=new MainClass_4(); // run메소드의 위치
		Thread t=new Thread(m);
		t.start();*/ // => implements Runnable
		
		/*Runnable r=()->{
			System.out.println("run Call...");
		}; // => run() 호출한거랑 동일 ==> 람다식
		Thread t=new Thread(r);
		t.start();*/
		
		/*Runnable r=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run Call...");
			}
		};
		Thread t=new Thread(r);
		t.start();*/
		/*
		 *  function aaa(){} => implements
		 *  let aaa=function(){}
		 *  let aaa=()=>{} : 최근 많이 사용하는 형식 (javascript) 함수의 주소값만 받아서 처리하는형식
		 *  메소드는 메소드명이 주소이다!
		 */
		
	}

}
