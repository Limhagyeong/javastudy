package com.sist.main;
/*
 *   1. 상속
 *      => 멤버 변수, *** 메소드(기능 => 상속)
 *         ------
 *         | 접근지정어 (private, default)
 *                             -------- 패키지가 다른 경우 사용 불가
 *         => 메소드를 재사용하거나 변경해서 사용 (기능)
 *         => 객체 지향 관련 => 메소드
 *         => 라이브러리는 변수가 없다 => 대부분 메소드!
 *                      --
 *                       | 상수(O)
 *       => 형식
 *          단일 상속만 가능
 *          class SubClass extends SuperClass
 *                         -------
 *                         기존의 클래스를 확장(수정,추가)
 *          {
 *             SuperClass가 가지고 있는 모든 메소드 사용이 가능
 *             => 변경해서 사용 가능 (오버라이딩)
 *           }
 *           
 *       => 호출
 *          class A
 *          class B extends A
 *                --        --
 *                sub       super => super > sub
 *                                => 상속을 내리는 클래스가 상속을 받는 클래스보다 크다
 *                                => 모든 클래스의 상위 클래스는 Object 이다
 *                                => 자바에서 지원하는 라이브러리의 메소드 => Object를 리턴한다
 *                           => 확장(클래스 사용시에는 확장된 클래스를 사용한다)
 *                           B b=new B(); => 기본형
 *                           A a=new B(); => 특별한 경우에 사용
 *                                           => A로부터 상속 받는 모든 클래스를 묶어서 사용할 때
 *                           ------------
 *                            | 네이버 카페 => 게시판 
 *                            *** 상위 클래스는 하위 클래스에있는 변수, 메소드를 사용할 수 없다
 *                            B b=new B(); 
 *                            A a=new B();
 *                            
 *                            class A
 *                            {
 *                              int a,b; ==> c
 *                              void aaa(){}
 *                              void bbb(){}
 *                              ---------------------------------------a
 *                            }
 *                            
 *                            class B extends A
 *                            {
 *                               int c,d;
 *                               -----------
 *                                int a,b;
 *                                -----------
 *                                void aaa(){} => 변경시
 *                                void bbb(){} => 변경시
 *                                void ccc(){}
 *                               ------------ // 보이진 않지만 상속 받음
 *                               ---------------------------------------b
 *                            }
 *                            A a=new A();
 *                            B b=new B();
 *                            A c=new B(); // => 메소드는 B에 있는 메소드가 호출됨
 *                                            => 변수는 A에 있는 변수 호출됨
 *                              c는 접근이 불가능 => 변수 (c,d)
 *                                               메소드 (void ccc)
 *                                               => A에 없는 메소드!
 *                                                   aaa, bbb는 A에 있고 
 *                                                   B에서 새롭게 덮어씌어진것!
 *                            클래스 객체명
 *                            --------- => 객체는 클래스에 있는 변수,메소드만 사용한다
 *                            A a=> A클래스에 정의된 변수 , 메소드
 *                            
 *                            상위클래스 = 하위클래스
 *                            -------   -------
 *                              |          |
 *                             변수        메소드  =====> 메소드는 상위 클래스에 있는 것만 받을 수 있음
 */
class A
{
	int a,b;
	void aaa() {System.out.println("A:aaa() Call");}
	void bbb() {System.out.println("A:bbb() Call");}
}
class B extends A
{
	int a=100,b=200,c=300,d=400;
	void aaa() {System.out.println("B:aaa() Call");}
	void bbb() {System.out.println("B:bbb() Call");}
	void ccc() {System.out.println("B:ccc() Call");}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A aa=new A();
        System.out.println("aa.a="+aa.a);
        System.out.println("aa.b="+aa.b);
        aa.aaa();
        aa.bbb();
        System.out.println("=========================");// 가장 빈번하게 사용 (bb)
        B bb=new B();
        System.out.println("bb.a="+bb.a);
        System.out.println("bb.b="+bb.b);
        System.out.println("bb.c="+bb.c);
        System.out.println("bb.d="+bb.d);
        bb.aaa();
        bb.bbb();
        bb.ccc();
        System.out.println("========================="); // 인터페이스 (클래스 여러개를 묶어서 사용) ==> 30%
        A cc=new B();
        System.out.println("cc.a="+cc.a); // 0
        System.out.println("cc.b="+cc.b); // 0
        cc.aaa(); // B
        cc.bbb(); // B
        
        // 멤버변수: 반드시 클래스 변수를 가져온다 
        // 메소드: 범위는 클래스이지만 생성자의 메소드를 가져온다 (생성자의 모든 메소드를 가져오는 것이 아님)
        
	}

}
