package com.sist.main;

/*
 *  7장 정리 
 *  ------- JSP, Spring, Spring-Boot => 기본 자바
 *         => HTML / CSS / JavaScript
 *         => 데이터 저장 => 오라클 / MySQL
 *         ---------------------------- 데이터 분석 (파이썬)
 *  *** 인터페이스는 같은 기능을 가지는 클래스를 만들어서 제어
 *               -------- 강제화
 *      interface I
 *      {
 *          void aaa();
 *          void bbb();
 *          void ccc();
 *          //void ddd();
 *          //void eee();
 *          //void kkk(); => 형식으로 쓰게되면 필요 없는 클래스에도 강제로 가져다놔야됨
 *          => 보완
 *          //void default ddd();
 *          //void default eee();
 *          //void default kkk(); => 필요한 클래스에서만 가져다 쓸 수 있음!
 *          
 *      }
 *      class A implements I
 *      {
 *          void aaa(){}
 *          void bbb(){}
 *          void ccc(){}
 *          void ddd(){}
 *      }
 *      class B
 *      {
 *          void aaa(){}
 *          void bbb(){}
 *          void ccc(){}
 *          void eee(){}
 *      }
 *      class C
 *      {
 *          void aaa(){}
 *          void bbb(){}
 *          void ccc(){}
 *          void kkk(){}
 *      }
 *      인터페이스로 관리할 수 없다 =>
 *      I i=new A(); => i를 가지고 A가 가지고있는 메소드를 제어하겠다
 *      but, I에 없는 메소드를 A에 추가하게되면 I를 통해 제어 불가
 *      => A a=new A(); 로 접근해야되기때문에 interface로 묶어준 의미가 없음
 *      
 *      ===> A,B,C가 유형이 같은 경우 한개의 이름으로 제어하는 것이 편하다 => I
 *           목적 : 서로 다른 클래스를 묶어주기 위함
 *                 -------- => 서로 다르지만 관련이 있는! 
 *               => 관리 용이함 (소스 코딩을 줄일 수 있다) => 간결!
 *               => 인터페이스의 메소드 동일
 *               예)
 *                         DriverManager (interface개념)
 *                                |
 *                ------------------------------------  
 *                |       |        |     |    |       |  
 *               오라클    MySQL   MSSQL  DB2 SQLITE 사이베이스...
 *               VATCHAR2 VARCHAR
 *               CLOB     TEXT
 *               NUMBER   INT / DOUBLE 등 데이터형은 다르지만 메소드 등 형식은 동일!
 *               => SQL => ANSI(표준화)로 사용하기 때문
 *               
 *               컬렉션 (CRUD)
 *               Collection 
 *                  |
 *             ------------
 *             |
 *            List (interface)
 *             |
 *         ------------------------------------------
 *         |         |        |          |          |
 *       ArrayList  Vector   LinkdeList  Stack      Queue => 라이브러리 
 *               
 *                     
 *  1) 인터페이스 VS 추상클래스
 *     ------------------------------------------------------------------- 
 *                     인터페이스                  추상클래스
 *     --------------------------------------------------------------------
 *     구현된 메소드      선언된 메소드            선언된 메소드, 구현된 메소드
 *                   public void display1();
 *                 1.8version) 
 *                    구현된 메소드 사용 
 *                    => default (구분자)
 *                       (접근지정어 X)
 *                    public default void display2();
 *                    => static
 *                     => 접근시에 반드시 인터페이스명으로만
 *                        접근이 가능하다
 *     ------------------------------------------------------------------- 
 *     인스턴스 변수     사용할 수 없다                사용 가능하다
 *                    => 공용                     => private 사용 가능
 *                    => 상수형 변수 사용 가능
 *                    => public만 사용 가능!
 *                    => openjdk
 *                       jdk => 1.9(private가 가능)
 *     ------------------------------------------------------------------- 
 *     생성자          생성자가 없다                  생성자가 있다
 *     -------------------------------------------------------------------
 *     접근범위         모든 내용을 공개               한정한다 (모든 접근지정어 사용이 가능하기 때문)
 *                    => 메소드, 변수
 *     -------------------------------------------------------------------
 *     상속           다중상속 가능                  단일상속만 가능
 *                   implements                  extends
 *                   interface => interface
 *                             |
 *                            extends
 *                   interface => class
 *                             |
 *                            implements
 *                    => 사용자 정의, 라이브러리
 *                       => 단일 상속이 중심이다
 *                    => 윈도우 : 여러개 받는 경우가 있다
 *      -------------------------------------------------------------------
 *      ** 공통점 : new를 이용해서 메모리 할당이 불가하다
 *                => 상속을 내려서 상속 받은 클래스가 구현해서 사용할 수 있도록 한다
 *      ** 목적 : 서로 다른 클래스를 연결해서 사용이 가능하도록 한다
 *               관련된 클래스를 모아서 사용할 때 주로 사용
 *      --------------------------------------------------------------------
 *      인터페이스의 구성 요소
 *      public interface interface명 
 *      {
 *         ------------------------------------
 *         상수 : 반드시 초기값 명시적 설정
 *         => int a=10;
 *         (public static final) int a=10;
 *         --------------------- 생략 시 접근지정어와 제어어를 추가시켜준다 (컴파일러) 
 *         ------------------------------------
 *         구현이 안된 메소드 : 프로그램에 맞게 구현 => default가 없는 상태
 *         => 개발자가 알아서 구현 
 *         (public abstract) void display();
 *         ------------------------------------
 *         구현이 된 메소드 => default가 있는 상태
 *         => 공통으로 사용되는 부분
 *           => 필요시마다 변경해서 사용
 *           (public) default void method(){}
 *                    -------- 접근지정어가 아닌 선언문과 구분하기 위한 구분자
 *            (public) static void method(){}
 *            ==> 인터페이스명.메소드명()
 *                ------------------
 *         ------------------------------------
 *      }
 *      *** 만약에 기능 추가가 있는 경우에는 default를 이용한다
 *                                   --------
 *         
 */
import java.util.*;
interface I
{
	//private int a=10;
    // public 생략하면 컴파일러에 의해 자동 추가된다
	public static void display()
	{
		System.out.println("I:display() Call");
	}
}
class A
{
	public static void aaa()
	{
		System.out.println("A:aaa() Call");
	}
}
class B extends A
// extends => 상속
{
	public void bbb()
	{
		aaa(); // 1. A클래스의 메소드명으로 접근 가능
		A.aaa(); // 2. A클래스명으로 접근 가능
	}
}
class C implements I
// implements =>  구현(상속)
{
	public void ccc()
	{
		//display(); => 오류
		I.display(); // => 무조건 인터페이스명으로 접근해야한다
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List list=new Vector(); // list 인터페이스 안에  ArrayList,Vector,LinkdeList,Stack,Queue
                                // 등이 들어있음 => 생성자만 바꿔주면 편리하게 쓸 수 있음
        list.add("aaa");
        list.add("bbb");
        
	}

}







