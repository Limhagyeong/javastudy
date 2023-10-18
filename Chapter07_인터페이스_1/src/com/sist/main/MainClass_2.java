package com.sist.main;
/*
 *  인터페이스 // 무조건 public! 
 *   기본 문법) 
 *            변수는 사용할 수 없다 (상수만 사용 가능)
 *            int i; => 오류
 *            int i=10; ==> 생략된 것이 있다 : public static final int i=10;
 *                                        --------------------- 생략 (변수)
 *                                        => static final int i=10;
 *                                           // 상수
 *                                           final int i=10;
 *                                           // 상수형 변수
 *                                           int i=10;
 *                                           // 변수
 *            메소드 
 *              구현이 안된 메소드 => 구현내용이 여러개인 경우 선언만!
 *              (public abstract) void display();
 *               ---------------  생략 (메소드)
 *              구현이 된 메소드 => 공통으로 사용되는 부분 정의
 *                => 새로운 기능 추가 (default로 구현 => 필요한 부분에만 가져다 씀)
 *               (public) default void aaa(){}
 *               -------- 생략
 *                (public) static void bbb(){}
 *               --------- 생략
 *           ===> 메소드나 상수를 선언하면 public가 생략된다! 
 *        상속 : 인터페이스도 클래스다
 *             ----------------- 상속을 내리면 상위 클래스가 된다
 *             class => 단일 상속만 가능
 *             interface => 다중 상속까지 가능
 *             => extends(interface=>interface), implements(interface=>class)
 *             => 다중 상속 시 ,로 구분
 *             => class A
 *                interface B
 *                interface C
 *                class D extends A implements B,C
 *             
 *             
 */
//interface A
//{
//	/*public static final*/ int a = 0;
//}

interface A
{
	void aaa();
}
interface B //extends A
{
	void bbb();
}
class C implements B,A // => 다중상속 시 하위클래스로 받아야 모든 객체 사용 가능
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("aaa() Call");
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		System.out.println("bbb() Call");
	}
	
}
public class MainClass_2 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*B b=new C();
       b.bbb();
       //b.aaa();
       A a=new C();
       a.aaa();*/
		C c=new C();
		c.aaa();
		c.bbb();
       
	}

}
