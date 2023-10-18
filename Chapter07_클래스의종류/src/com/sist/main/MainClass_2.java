package com.sist.main;
/*
 *  클래스의 종류
 *   => 사용자 정의 일반 클래스
 *      --------
 *       | 
 *         = 데이터형 (여러개의 변수를 모아서 => 한번에 저장할 목적)
 *           ======> ~VO (Value Object) => Spring
 *                   ~DTO (Data Transfer Object) => MyBatis
 *                    => 웹 => JSP (~Bean) => JSP
 *                    Music(X) => MusicVO
 *         = 액션 클래스 : 데이터형 클래스를 제어 => 메소드
 *           ==> ~DAO => 오라클 연결
 *               ~Manager => 파일입출력, 크롤링, Open API
 *               ~Service => DAO여러개를 묶어서 관리
 *                       DAO : 게시판
 *                       DAO : 댓글
 *               ~Controller => 자바에서 브라우저 연동
 *               -----------------------------------------------------------
 *               ~RestController => 자바에서 자바스크립트로 값을 보냄
 *                                    JSON (Java Script Object Notation)
 *                              GET/POST/DELETE/PUT
 *               ----------------  RestFul 가능자 ---------------------------
 *  1) 추상 클래스 => 단일 상속 
 *     = 주목적
 *       관련된 클래스를 모아서 관리 (서로다른 클래스를 연결해서 사용)
 *     = 미완성 클래스 (메소드를 구현하지 않는 경우) => 선언
 *       => new를 이용한 메모리 할당 불가
 *       => 사용시에는 반드시 상속을 내려서 구현 후 사용
 *                       --------------
 *                              |
 *                           오버라이딩 기법
 *     = 단일 상속만 가능
 *     = 선언만 한 메소드 존재할 수 있다
 *     = 인스턴스메소드 , 인스턴스변수 사용이 가능하다
 *     = 형식)
 *       public abstract class ClassName
 *              --------
 *       {
 *          -----------------------
 *           변수영역 
 *          -----------------------
 *           메소드 => 구현된 메소드
 *              public void display(){}
 *              ==> 공통으로 사용하되 필요 시 오버라이딩 하여 사용 가능
 *          -----------------------
 *           메소드 => 선언된 메소드 => 없을 수 있다
 *              public abstract void display();  ==> 선언만 된 상태
 *              => 상속을 받은 클래스는 반드시 구현을 해야한다
 *              => 구현이 안되는 경우 
 *                 버튼 => 디폴트 불가능 ==> 용도에 따라 다른 기능의 여러 버튼을 만들어야함
 *                     => 용도가 많다
 *                 마우스
 *                 키보드
 *          -----------------------
 *       }
 *       
 *       public abstract class A // 선언
 *       public class B extends A // 구현
 *       {
 *         
 *       }
 *       => A a=new B();
 *         ------------- 구현된 클래스를 이용해서 메모리 할당
 *         
 *     ** 추상 클래스 => 공통성을 가지고있는 클래스 => 요구사항 분석
 *        예)
 *            게시판 : 목록출력, 검색, 글쓰기, 내용보기, 수정하기, 삭제하기
 *        묻고 답하기 : 목록출력, 검색, 글쓰기, 내용보기, 수정하기, 삭제하기, 답변하기
 *        댓글 게시판 : 목록출력, 검색, 글쓰기, 내용보기, 수정하기, 삭제하기, 댓글
 *        후기 게시판 : 목록출력, 검색, 글쓰기, 내용보기, 수정하기, 삭제하기, 업로드
 *        
 *        1) 공통으로 사용되는 메소드 찾기
 *        2) 추상메소드 (구현이 안된 메소드)
 *           => 클래스를 묶어서 한개의 이름으로 제어
 *           => 설계 => 필요한 메소드를 선언 => 프로그램에 맞게 구현
 *           => 상속 받아서 구현
 *           => 추상클래스 => 모든 게시판 제어 => 카페
 *           
 *         => 추상 클래스 확인
 *            1) 선언된 클래스와 생성자가 다르다 => A a=new B();
 *            2) 메모리 할당 시 메소드를 이용한다
 *            
 *  2) 인터페이스 => 추상클래스의 일종 => 다중상속
 *  3) 내부 클래스
 *  
 *  
 *  ==> 버튼, 마우스, 키보드 ==> 디폴트 (프로그램에 따라 다르다)
 *     ----------------- 구현이 안됨
 *     abstract class ActionListener
 *     {
 *        버튼클릭();
 *        더블클릭();
 *      }
 *     abstract class MouseListener
 *     { 
 *        마우스클릭_Left();
 *        마우스클릭_Right();
 *     }
 *     abstract class KeyListener
 *     {
 *        키보드클릭();
 *        키보드UP();
 *     }
 *     
 *     게임 제작
 *     class Game1 extends ActionListener
 *     class Game2 extends MouseListener
 *     class Game3 extends KeyListener
 *     
 *     class Game4 extends Game1
 *     class Game5 extends Game4
 *     
 *     ==> 간단하게 변경 (인터페이스)
 *     
 *     class Game implements ActionListener, MouseListener, KeyListener
 *     => 추상클래스를 보완
 *        1) 다중 상속 가능
 *        2) 구현이 안된 메소드만 사용 가능
 *        3) 변수 대신 상수 사용
 *        4) 기본 목적 => 다른 클래스에 영향을 미치지 않도록 함
 *        
 *     
 */
// 추상클래스
import java.util.*;
abstract class 도형
{
	// 선, 사각형, 삼각형, 원 ...
	public abstract void draw(); // 추상 메소드
	public void select()
	{
		System.out.println("검정색을 사용한다");
	}
}

class 선 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("선을 그린다");
	}
	public void select()
	{
		System.out.println("하얀색을 사용한다");
	}
	
}
class 사각형 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("사각형을 그린다");
	}
	
}
class 원 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원을 그린다");
	}
	public void select()
	{
		System.out.println("빨간색을 사용한다");
	}
	
}
class 삼각형 extends 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("삼각형을 그린다");
	}
	public void select()
	{
		System.out.println("파란색을 사용한다");
	}
	
}
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("도형을 선택해라: 원(1), 사각형(2), 선(3), 삼각형(4)");
        int mode=scan.nextInt();
        
        도형 a=null;
        
        if(mode==1)
        	a=new 원();
        else if(mode==2)
        	a=new 사각형();
        else if(mode==3)
        	a=new 선();
        else if(mode==4)
        	a=new 삼각형();
        
        a.draw();
        a.select();
        
        /*if(mode==1)
        {
        	원 a=new 원();
        	a.draw();
        	a.select();
        }
        else if(mode==2) 
        {
        	사각형 a=new 사각형();
        	a.draw();
        	a.select();
        }
        else if(mode==3) 
        {
        	선 a=new 선();
        	a.draw();
        	a.select();
        }
        else if(mode==4) 
        {
        	삼각형 a=new 삼각형();
        	a.draw();
        	a.select();
        }*/
	}

}
