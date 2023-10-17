package com.sist.main2;
class Super // double
{
	 
}
class Sub extends Super // int
{
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 묵시적 형변환 => 자동 형변환
		Super su=new Sub();
		// double su=10; => 묵시적 형변환!
		
		// 강제 형변환
		Sub s=(Sub) su;
		// int a=(int)10.5 => 강제 형변환!
		
		String str="";
		StringBuffer sb=new StringBuffer();
		Object obj=new Object();
		
		// 객체 비교 연산자 => instanceof
		if(str instanceof Object) // 항상 오른쪽이 크거나 같아야한다
			System.out.println("true"); // object의 상속을 받았다면 true
		else
			System.out.println("false");
		
		if(sb instanceof Object)
			System.out.println("true"); // object의 상속을 받았다면 true
		else
			System.out.println("false");
		
		if(obj instanceof String)
			System.out.println("true"); // string의 상속을 받았다면 true
		else
			System.out.println("false");
//		if(sb instanceof String) // => 아무 관계가 없음 => 에러!
//			System.out.println("true"); 
//		else
//			System.out.println("false");
	}

}
