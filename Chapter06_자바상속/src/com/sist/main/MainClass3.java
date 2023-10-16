package com.sist.main;
/*
 *  => 객체지향의 3대 특성
 *     ------
 *      데이터 손실 방지 : 캡슐화 (변수 private : 은닉화 / 기능 => 처리)
 *                           ---- 저장/읽기 => setter, getter
 *                           ---- HTML
 *      재사용 : 상속 / 포함 (***)
 *      수정 / 추가 : 유지보수 
 *      --------- 다형성(오버라이딩, 오버로딩)
 *      
 *    상속 : 재사용
 *    --- 상위 클래스 => 상속을 내리는 클래스 => 공통적으로 사용하는 내용(변수, 메소드)
 *        하위 클래스 => 상속을 받는 클래스 => 재사용을 하되, 확장하여 사용이 가능하다
 *        --------                                 ----  extends
 *         | 여러개의 하위 클래스를 묶어서 사용 => 상위클래스 이용 (사용 빈도수 낮음)
 *         | 단일 상속 , 키워드 extends
 *       --> 변경없이 사용 => 포함 => 상속 X 
 *       class Window
 *       {
 *         JFrame fr=new JFrame() ===> **사용빈도수 높음!**
 *       }
 *       --> 변경해서 사용 => 상속
 *      class Window extends JFrame
 *            ------         -------
 *            |하위            |상위
 *     => new를 이용하지 않아도 메모리 할당이 가능하다 (리플렉션)
 *     
 *   사용법
 *    class A
 *    class C
 *    class B extends A,C => 오류(단일 상속만 가능) => extends A
 *    ------------------------------------------------------
 *    class A
 *    class C extends A => A, C
 *    class B extends C => A, C, B
 *    => 가장 마지막에 상속을 받은 클래스가 메모리는 가장 크다 => 구체화
 *    => 클래스 크기는 가장 위에 있는 클래스가 가장 크다 => 공통 기반 (추상화)
 *    
 *           생물 << 상위 클래스 >>
 *            |
 *         --------
 *         |      |
 *        동물    식물
 *         |
 *       ----------------
 *       |     |    |   |
 *      포유류  양서류 파충류 조류 ...
 *     -----
 *     | | |
 *    인간 소 개
 *     |
 *    - -
 *    | |
 *    남 여 << 하위 클래스 >> 
 *    | |
 *   홍길동 심청이 => 상속 (위로 올라갈 수록 크기 커짐)
 *     
 *     class A 
 *     class B extends A A>B ==> is-a (상속)
 *     
 *     class A
 *     class B
 *     {
 *       A a=new A()  ==> B>A has-a (포함)
 *     }
 *     
 *  상속 예외 => static : 상속은 없다 => 공통 사용이 가능
 *            private : 상속은 가능 => 접근이 불가
 *           --------
 *           생성자
 *           초기화 블록
 *           --------
 *  ==> 메모리 할당
 *      여러개를 묶어서 사용 => 상위 클래스로 메모리 할당 (빈도수 거의 X)
 *      확장된 클래스로 메모리 할당 (기본)
 *      class A
 *      class B extends A => B, A
 *      class C extends A => C, A
 *      class D extends A => D, A
 *      class E extends A => E, A
 *      => B b=new B();
 *     
 *          
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
