package com.sist.main;
/*
 *  interface의 목적
 *  => 서로 다른 클래스를 연결해줄 때 사용
 *  => 결합성이 낮은 프로그램을 짤 때 사용
 *  => 개발자가 같은 메소드를 사용해야할 때 => 표준화
 *  => 관련된 클래스를 묶어서 한개의 이름으로 관리
 *     --------------------------------
 *         Model => 형식 => interface
 *  => class A
 *     class B extends A
 *     
 *     A a=new A() => a에 있는 변수, 메소드만 호출
 *     B b=new B() => b에 있는 변수, 메소드만 호출
 *     A c=new B() => a에 있는 변수, b에 있는 메소드 호출 (오버라이딩 된 메소드)
 *     
 *     interface I
 *     class A implement I
 *     class B implement I
 *     class C implement I
 *     
 *     I i=new A();
 *     I i=new B();
 *     I i=new C();
 *     
 *     ==> I가 가지고 있는 메소드를 가지고오되, 오버라이딩 된 값을 출력해온다
 *    
 *     
 *  class A
 *  class B
 *  class C
 *  Object[] obj = {new A(), new B(), new C()};
 *  
 *  A a=(A)obj[0];
 *  
 *  => interface로 하나로 묶어서 처리해주는게 편리함!
 *  
 *  상위클래스 객체명 = new 하위클래스()
 *  => 변수 접근 : 상위클래스
 *     메소드 접근 : 상위클래스 but, 하위클래스에서 오버라이드 된 값만 가지고옴
 *     
 *  => 인터페이스를 통해서 클래스에 접근
 *     ------- 인터페이스에 있는 메소드만 가지고 있어야 효율적이다
 *  interface A
 *  {
 *     void aaa();
 *     void bbb();
 *  }
 *  class B implements A
 *  {       ----------
 *     void aaa(){}
 *     void bbb(){}
 *     void ccc(){}
 *  }
 *  
 *  A a=new B(); => 가급적 사용 X => ccc에는 접근할 수 없음
 *  B b=new B(); => 전부 접근 가능
 *  
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
