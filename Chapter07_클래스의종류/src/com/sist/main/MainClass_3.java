package com.sist.main;
/*
 *  추상클래스 => 확장 (보완) => 인터페이스
 *  인터페이스
 *  -------
 *  1. 추상클래스의 일종 => 인터페이스도 클래스
 *     구분) 클래스 / 인터페이스
 *          ----   -------
 *          |단일상속  |다중상속
 *  2. 인터페이스는 구현된 메소드가 없이 추상 메소드만 가지고 있다
 *              ----------
 *               | 인터페이스에 메소드 추가가 되면 문제 발생
 *               | JDK 1.8 => 구현 메소드를 사용하게 만든다
 *                           ----------
 *                            default / static
 *         => 소프트공학 : 인터페이스는 고정을 해야 된다
 *  3. 형식 => 247P
 *     public interface interface명
 *     {
 *       -------------------------
 *        변수
 *         => 상수형 변수
 *         int a; ==> 오류
 *         int a=10;
 *         ---------
 *          추가 => public static final int a=10;
 *                 -------------------> 생략 가능 / 생략 시 자동 추가
 *       -------------------------
 *        구현이 안된 메소드
 *          void display(); ==> 구현 내용이 많은 경우 / 디폴트를 잡을 수 없는 경우
 *          => 프로그램에 맞게 구현해서 사용해라!
 *          => public abstract void display
 *             --------------- 생략
 *             *** 인터페이스는 모든 메소드가 public이어야 한다
 *       -------------------------
 *        구현이 된 메소드
 *        default void aaa()
 *        {
 *        
 *        }
 *        => (public) default void aaa()
 *        {
 *        
 *        }
 *        static void bbb()
 *        {
 *        
 *        }
 *        => (public) static void bbb()
 *        {
 *        
 *        }
 *       -------------------------
 *        생성자가 존재하지 않는다 (추상 클래스는 생성자가 있다)
 *       -------------------------
 *     }
 *     인터페이스는 모든 접근지정어가 public (변수, 메소드)
 *     변수는 반드시 명시적 초기화를 해야한다
 *     int a; => int a=10;
 *     
 *     상속
 *     ---
 *      implements => 구현해서 사용하겠다
 *     ------------------------------
 *      interface ====> interface : 상속 시 extends 사용해줘야함 => 확장의 의미
 *      interface A
 *      interface B (extends) A 
 *      
 *      interface ====> class : : 상속 시 implements 사용해줘야함
 *      interface A
 *      class B (implements) A
 *      
 *      class ====> interface
 *      class A
 *      interface B () A ==> 오류! ==> interface는 선언만 하기 때문에 class에서 구현한 내용이 같이 들어오기 때문!
 *      ---------------------------------------------------------------------------------------------
 *      interface A
 *      interface B extends A => A,B
 *      interface C extends B => A,B,C
 *      ------------------------------------ 아래 형식으로 사용 (다중 상속)
 *      interface D extends A,B
 *                         ------ 여러개 동시에 받기 가능
 *                                , 로 구분한다
 *      interface A
 *      interface B
 *      class C implements A,B ==> 다중상속
 *      
 *      interface A
 *      interface B
 *      class C
 *      class D extends C implement A,B
 *            ----------- -------------
 *             | 클래스 상속   | 인터페이스 상속
 *      => 윈도우 
 *      => 인터페이스에 설정된 모든 것 (메소드,변수)
 *         public만 사용이 가능 => public을 설정하지 않으면 자동 추가
 *      => 인터페이스 사용
 *         => 윈도우 이벤트 처리 (마우스 클릭 ...)
 *         => 사용자 정의 => 클래스 관리 (스프링: 클래스 찾기(DL))
 *            --------------------
 *             | => 인터페이스 대신 어노테이션으로 변경
 *                              --------
 *      => 설계 
 *         1. 개발기간이 단축 => 구현할 기능을 미리 선언하여 알려주기 때문!
 *            예)
 *              <예약>
 *              로그인
 *              맛집 선택
 *              예약일 선택
 *              예약시간 선택
 *              인원확인
 *              예약금 결제
 *              => 좌석 선택 
 *              -------------
 *         2. 인터페이스 => 표준화 (라이브러리..=> 구현은 다르지만 같은 메소드 사용)
 *         3. 서로 다른 클래스 연결해주는 역할 (스프링)
 *   -----------------------------------------------------------------------
 *   
 *   실무>
 *     
 *     개발기간 : 8개월
 *     
 *     1. 설계(요구사항분석) => 3개월 => 인터페이스 => 아키텍쳐
 *     
 *     2. 데이터베이스 설계 => 1개월 => DBA
 *     
 *     3. 화면 UI => 1개월 => 퍼블리셔
 *     
 *     4. 구현 => 2개월 => 웹프로그래머 (********)
 *     
 *     5. 테스트 배포 => 1개월 => 테스터
 *     
 *     *** 인터페이스는 자신이 메모리 할당을 할 수 없다
 *         => 구현된 클래스를 이용해서 메모리 할당한다
 *         
 *     interface A
 *     class B implements A
 *     
 *     => A a=new B();
 */
/*interface A
{
	void aaa();
	//void bbb();
}
class B implements A
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}
	
	
}
class C implements A
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}
	
}*/

/*interface A // => public이 생략되어있음
{
	int a=10; // = public int a=10; 
	void disp(); // = public void disp();
}
class B implements A // => public이 생략되어있지 않기때문에 앞에 붙여줘야됨! 
{
	public void disp() {}
}*/
import javax.swing.*;
import java.awt.event.*;
public class MainClass_3 extends JFrame implements ActionListener,MouseListener,KeyListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
