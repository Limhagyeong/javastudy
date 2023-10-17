package com.sist.main;
/*
 *  재사용 기법
 *  -------- 기존의 클래스를 사용 (라이브러리)
 *  => 라이브러리는 상속보다 포함
 *     -------
 *     | 상속을 할 수 없는 클래스 => 종단 클래스
 *       종단 클래스 : public final class ClassName
 *       --------------------------------------- => 더이상 확장할 수 없는 클래스 (final) / 상속 받기 불가
 *       => java.lang (220P)
 *          String , Math, System, StringBuffer ...
 *          => 변경할 수 없다 (완제품)
 *  => 상속 (is-a)
 *  => 포함 (has-a)
 *  ---------------- 클래스를 비교할 수 있다 / 일반클래스는 비교 불가
 *  class A
 *  {
 *   int a,b,c,d,e,f;
 *  }
 *  class B
 *  {
 *   int a,b
 *  }
 *  
 *  A > B (크기를 잴 수 없다) ==> 상속 / 포함 관계가 아니기 때뭉 ==> 오류발생!
 *  
 *  class A
 *  {
 *  }
 *  class B extends A
 *  {
 *  }
 *  
 *  A > B ==> 상속 내린 클래스의 크기가 크다! / 범위를 기준으로 => 공통성이 많은 클래스가 크다
 *  
 *     나무
 *      |
 * -------------
 * |           |
 * 침엽수      활엽수    ===> 나무 > 침엽수, 활엽수
 * 
 * class A
 * class B
 * {
 *    A a; 
 * }
 * => 포함 클래스 : A < B
 * 
 * => 포함 : 변경없이 있는 그대로 사용
 * => 상속 : 변경이 필요한 부분 => 오버라이딩
 * 
 * 예)
 *    윈도우 => 자동차 모양으로 윈도우를 변경해서 사용 => 상속
 *             class Login extends JFrame
 *             {
 *             }
 *             
 *    윈도우 => 사각형 모양으로 윈도우 그대로 사용 => 포함
 *            class Login
 *            {
 *               JFrame fr=new JFrame(); // 포함 클래스
 *               
 *               // 메소드에 선언 => 포함 클래스가 아니다
 *               public void display()
 *               {
 *                  JFrame fr=new JFrame();
 *               } // 메소드 영역 안에 들어간건 지역변수! (포함 클래스가 아니다)
 *            }
 *            
 *            Login log=new Login();
 *            log.fr.메소드()
 *            
 *            ==> 포함 클래스가 가장 많다
 *  
 *  
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
