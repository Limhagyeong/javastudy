package com.sist.main;
/*
 *  1. => 194P ***
 *        목적, 형식
 *  2. => 199, 200p 
 *        논리적 포함 관계
 *        
 *           동물
 *            |    
 *           포유류        | 올라갈수록 추상화 => 공통점이 많이 있다
 *            |
 *           인간         | 내려갈수록 구체화 => 
 *            |
 *         --------
 *         |       |
 *        남자     여자
 *    abstract => 추상적인 => 공통적인
 *    게시판
 *     = 글쓰기 
 *     = 상세보기
 *     = 목록
 *     = 수정
 *     = 삭제
 *     = 검색
 *     
 *     ====> 답변형 게시판
 *     ====> 묻고 답하기
 *     ====> 갤러리 게시판
 *     ====> 댓글형 게시판
 *     ====> 추상 / 인터페이스 => 벤치마킹
 *     
 *     201~202, 204,206p
 *      = 단일 상속 => 변수 충돌
 *      = 오버라이딩 => 재정의 => 메소드 변경
 *        변수 오버라이딩 / 메소드 오버라이딩 
 *                      ------------- 기본
 *      = 오버로딩 / 오버라이딩
 *        ----------------
 *                | 재정의 (기존 메소드를 수정)
 *         |중복함수정의  (기존 메소드에 새로운 기능 추가)
 *         
 *     207p
 *      = 접근지정어
 *        => private 변수는 접근이 불가능하다
 *        
 *     211,213,215p 생성자
 *      class A
 *      {
 *           public A()
 *           {
 *              Super() ==> Object
 *           } // 자동 추가! => 눈에 보이지 않음
 *      }
 *      class B extends A
 *      {
 *         public B()
 *         {
 *             Super() => 상위 클래스의 new A() 호출 ==> 생성자 첫줄에 써야한다
 *                                      this() ===> 생성자 첫줄에 써야한다
 *                                      =======> this와 Super는 동시에 쓸 수 없음
 *         } // 자동 추가
 *      }
 *      B b=new B(); => new A() => new B()
 *      
 *      = 자신의 객체 ===> This
 *      = 자신의 생성자 호출 ===> this()
 *      = 상위 클래스의 객체 ===> super
 *      = 상위 클래스의 생성자 호출 ==> super()
 *      
 *      ===> 상속을 받은 클래스는 자신과 관련된 메소드, 변수, 상위클래스의 변수, 메소드 사용이 가능하다
 *           상속을 내린 클래스는 자신고 관련된 메소드, 변수만 사용이 가능하다
 *     
 *     217p => final ==> 변수는 상수형이다
 *                       메소드는 확장이 안된다 => java.lang
 *     221, 227, 229p 
 *      객체의 형변환
 *      ---------- 클래스의 크기가 있다
 *                 ----------
 *                 | 반드시 상속, 포함
 *                class A
 *                {
 *                 int a,b;
 *                }
 *                Class B
 *                {
 *                 int a;
 *                } 
 *                ----------------> 크기 비교 불가
 *                class A
 *                {
 *                }
 *                class B extends A
 *                {
 *                }
 *                -----------------> A > B => 상속 내린 클래스 크기가 크다
 *                class A
 *                {
 *                  B b=new B();
 *                 }
 *                class B
 *                {
 *                
 *                }
 *                 -----------------> A > B 
 *                
 *                => 묵시적 형변환
 *                  class A
 *                  class B extends A
 *                  
 *                  A a=new B();
 *                  ============= B b=(B)a; => 강제 형변환
 *                  B b=new B();
 *                  A a=b;
 *                   
 *                  클래스도 데이터형이다
 *                  => 자바에서 지원하지 않는 데이터형이라서 사용자 정의 데이터형으로 직접 만듦
 *                  
 *     *** 제어자
 *     접근지정어 : private protected public default 
 *     그 외 : static final abstract synchronizer
 *     static : 공통적인 (공통으로 사용하는) => 공유 변수
 *         ==> 클래스, 메소드, 변수 ==> 지역변수에서는 사용 불가
 *     final : 마지막 (종단) => 메소드 수정, 상속 받을 수 없음
 *         ==> 클래스, 메소드, 멤버변수, 지역변수
 *         예) public final class A => 확장할 수 없는 클래스
 *              => 상속 내릴 수 없는 클래스
 *              => String , Math, System ... (java.lang)
 *             public final void display(){} => 오버라이딩 불가 (변경)
 *             public final int a=10; => 값 변경 불가 => 상수
 *     abstract : 추상적인(공통성), 미완성
 *               => 추상클래스, 인터페이스
 *     synchronized => 동기적인 (네트워크, 쓰레드)
 *        = 비동기 => 속도 빠름 ==> AJax
 *        = 동기적 => 충돌부분에서 안전 => 속도 느림
 *        
 *     조합 ***
 *     -----------------------------
 *     대상              조합
 *     클래스         public default final abstract
 *                  protected private => 사용시 오류
 *     변수            private final static
 *     메소드         public final static abstract
 *     지역변수        final
 *                
 *     
 */
public class MainClass3 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
