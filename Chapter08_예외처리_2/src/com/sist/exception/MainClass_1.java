package com.sist.exception;
/*
 * << 객체지향의 3대 특성>>
 * 
 *  => 캡슐화 : private변수 / 읽기,쓰기 메소드 기능 추가
 *                         -------- getter, setter
 *  => 재사용
 *     상속(is-a) / 포함(has-a)
 *  => 수정, 추가 => 다형성 
 *     --------
 *        |
 *     오버라이딩 , 오버로딩
 * ---------------------------------------------------------
 * 
 * 클래스의 종류
 * ----------
 *    ------------------------
 *   = 추상클래스 : 단일 상속 , 멤버변수, 생성자, 구현된 메소드, 구현이 안된메소드 
 *   = 인터페이스 *** : 다중 상속, 상수, 구현이 안된 메소드가 중심
 *                    => 구현된 메소드를 만든다면 => default, static 
 *   ------------------------- 미완성 클래스 => 메소드 구현이 안된 상태
 *                             => 단점 : 메모리 할당 불가 (new 사용 불가)
 *                             => 상속을 내려서 구현 후 사용해야함 => 오버라이딩
 *                             => 관려된 클래스를 한개의 객체명으로 관리
 *  => 상속을 내렸을 때
 *      class =========> class
 *            extends
 *      interface =========> interface
 *                 extends
 *      interface =================> class
 *                  implements
 *   ---------------------------------------------
 *    class A
 *    class C
 *    class B extends A,C => 단일상속만 가능하기때문에 오류
 *    
 *    class A
 *    class C extends A
 *    class B extends C => 정상 코드
 *    ---------------------------------------------
 *    
 *    interface A
 *    interface B extends A
 *    interface C extends B
 *    interface D extends A,B ==> 가장 많이 사용되는 형식 (다중상속)
 *    ---------------------------------------------
 *    
 *    class A
 *    interface B
 *    interface C
 *    class D extends A implements B,C
 *    ------------------------------------------
 *    
 *    interface A
 *    interface V
 *    class C implements A,V
 *    
 *    interface => Container역할 , Controller 역할 (모아서 제어함)
 *                   | 묶어주는 역할   | 찾기, 제어 역할
 *                 -----------------------------
 *                 | 스프링 : 라이브러리 => 스프링은 interface기반
 *                         ==> AOP
 *                => 소프트웨어 용어
 *   
 *    
 *    
 *    
 */
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
