package com.sist.main;
/*
 *  1. 객체 지향 프로그램 => Application, Web Application
 *                      -----------  ----------------
 *                                    | 캡슐화 , 인터페이스
 *                                    => 연산자, 제어문, 메소드
 *                                    => 데이터베이스 연동
 *                                       ------------
 *    = 코드의 재사용이 높다 (기존의 코드를 변경,추가)
 *    = 코드관리가 용이하다 (구조적 프로그램=>메소드로 기능 구분)
 *    = 이미 사용중인 프로그램을 이용 => 신뢰성이 높다
 *    = 대규모 프로그램에 주로 사용
 *      -----------
 *      | model 1 => 홈페이지, 소규모 회사 프로그램
 *        -------- 통으로 프로그램 구현 (개인)
 *        model 2(O) => 대규모 프로그램 (공기업, 금융권..)
 *        -------- Front, Back, DataBase ==> MVC
 *        Spring (MVC) => Front (MVC=>Vuex,Redux)
 *                                           |
 *                                         React-Query
 *        => 한개의 서버에서 작업 => 서버 점검 시에 서비스 중단
 *           ---------------
 *           | 여러개의 서버로 나눠서 작업 (MSA)
 *             => String Cloud
 *             => 데이터분석 => 지능형웹
 *                추천 
 *             new Vue({
 *             })
 *             import
 *             class App extends React
 *             {
 *             }
 *             function App(){} => CDN
 *             
 *    = 클래스의 구성
 *             => 추상화
 *      ----- 공통적인 데이터, 기능을 모아서 저장 => 사용
 *            -----------  ----
 *            멤버변수        메소드
 *              |
 *             사람 : 이름, 나이, 키, 성별 .. (O) / 컴퓨터, 자동차, 기계 .. (X) => 포함 클래스로 넣어주기
 *             ------------------------------
 *             사물을 단순화 시키는 작업! => 추상화 => 프로그램 : 구체화
 *             => 한개의 클래스로 동작하는 것이 아니다
 *                여러개의 클래스를 연관 관계 
 *                행위자 <===> 처리
 *                사람        자판기
 *                사용자,관리자  <===> 웹
 *                --------------------
 *                행위자(Actor)가 있어야지만 객체지향은 동작한다
 *      -----------------------------------------------------------------
 *      --------- 개발자마다 생각하는 데이터가 다르다
 *      --------- 맛집에 들어가는 데이터 추출
 *      1) 설계에 필요한 데이터 설계 (벤치마킹) => 멤버변수
 *      2) 기능 (메뉴,버튼) => 메소드 설계 ==> 멤버 메소드
 *      3) 변수 => 초기화 ==> 생성자
 *      ------------------------------------------------------------------
 *      클래스를 메모리에 저장
 *        클래스명 변수명 = new 클래스명();
 *                          -------- 모든 클래스는 생성자를 가지고있다
 *  ---------------------------------------
 *    재사용 / 데이터 변질,손실 / 변경이 쉽게 ... (객체 지향) => 유지보수에 목적을 둠
 *    ----   -------------  ---------
 *    | 상속, 포함  | 캡슐화     | 다형성 (오버라이딩/오버로딩)
 *    
 *   *** 멤버변수
 *       -----
 *       | 따로 사용 => 인스턴스 변수
 *       | 한개 사용 => 정적 변수
 *       ------------------------ 데이터베이스 (정규화)
 *         => 값 => 취미
 *                 영화, 낚시, 쇼핑 => JOIN
 *  ---------------------------------------------------------------------------
 *    클래스의 구성요소 => 5장
 *      class A
 *      {
 *          ---------------------
 *           데이터 선언 ==> 데이터의 손실, 변질 방지 => 은닉화
 *                        private
 *             멤버변수 : new 이용할 때마다 따로 저장되는 공간 만들어서 사용
 *             정적변수(없을 수도 있음) : 한개만 생성 => 공유 (static)
 *             => private 데이터형 변수명;
 *                => 읽기, 쓰기 (getter, setter)
 *                => 은닉화 VS 캡슐화의 차이점 => 기술면접
 *                => 정적변수 VS 인스턴스 변수의 사용처 => 기술면접
 *          ---------------------
 *           데이터 초기화
 *             생성자 
 *               1) 특징 
 *                  = 클래스명
 *                  = 리턴형이 없다
 *                  = 여러개 사용할 수 있다 (오버로딩)
 *                  ** 오버로딩 (기능 추가)
 *                     메소드명 동일
 *                     메개변수의 갯수나 데이터형이 다르다
 *                     리턴형은 관계없다
 *                     ** 생성자는 필요시에만 사용
 *                        => 생성자가 없는 경우에는 자동 디폴트 생성자를 호출한다
 *                                                ----------
 *                                                | 매개변수가 없는 생성자
 *               2) 역할
 *                  = 멤버변수에 대한 초기화 
 *                  = 메모리 저장 시 호출되는 메소드
 *             초기화 블록 : 컴파일러에 의해 자동 호출
 *                  = 인스턴스 블록
 *                    {
 *                      멤버변수, 정적변수, 멤버메소드, 정적메소드 전부 사용 가능
 *                      ----- 생성자 => 생성자를 반드시 호출
 *                      => 초기화 가능
 *                    }
 *                  = 정적 블록 ==> MyBatis
 *                  static{
 *                      정적변수, 정적메소드만 사용 가능
 *                      ------ static => 자동 초기화
 *                  }
 *          ---------------------
 *           데이터 활용
 *             메소드 ===> 다른 클래스와 통신 (연결) => public
 *             -----
 *             1. 종류 ===> 
 *                = 일반 멤버 메소드
 *                  [접근지정어] 리턴형 메소드명(매개변수목록)
 *                  {
 *                   ---- 기능
 *                  }
 *                  
 *                = 정적 메소드 ==> 암호화 / 복호화 
 *                  [접근지정어] static 리턴형 메소드(매개변수목록)
 *                  {
 *                    ==> 멤버변수를 활용하지 않는 경우 (공통으로 적용하는 기능)
 *                  }
 *                  ==> 윈도우 : 모든 클래스에 적용이 되도록 => 이미지 크기 조절
 *                  ==> 웹 : 한글변환 ==> ISO-8859_(ASC) ==> UTF-8
 *                      "자바" 검색 주소: https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&gs_lcrp=EgZjaHJvbWUyDwgAEEUYORiDARixAxiABDINCAEQABiDARixAxiABDINCAIQABiDARixAxiABDINCAMQABiDARixAxiABDINCAQQABiDARixAxiABDINCAUQABiDARixAxiABDINCAYQABiDARixAxiABDIGCAcQABgDMgcICBAAGIAEMgcICRAAGIAE0gEJMTEwNmowajE1qAIAsAIA&sourceid=chrome&ie=UTF-8
 *                  자바 => %EC%9E%90%EB%B0%94 => 인코딩
 *                   URLEncoder.encode(문자) => 인코딩
 *                  %EC%9E%90%EB%B0%94 => 자바 => 디코딩
 *                   URLDecoder.encode(문자) => 디코딩
 *                   
 *                   
 *                = 종단 메소드 : 오버라이딩이 불가능한 메소드 ==> 사용빈도 거의 X
 *                 [접근지정어] final 리턴형 메소드명(매개변수)
 *                 {
 *                   
 *                 }
 *                 
 *                = 추상 메소드 : 구현이 안된 메소드 => 선언만 하는 메소드
 *                             설계용
 *                             => 추상 클래스 / 인터페이스
 *                             => 여러개의 클래스를 한개의 이름으로 묶어서 처리
 *                                ----------------------------------
 *                                데이터 여러개 => 한개의 이름으로 제어
 *                                              배열
 *                                여러개의 클래스 묶었을 때 => 인터페이스
 *                                                         |
 *                                                        결합성을 낮춰줌
 *                                                        ----
 *                                                        클래스를 수정 => 다른 클래스에 영향
 *                                                        
 *          ---------------------
 *      }
 *    객체지향 3대 특성 => 6장
 *    =>
 *      캡슐화 : private 변수 => 읽기 / 쓰기 메소드
 *      상속 : 기존의 기능을 사용
 *            extends : 확장
 *            => 예외 : static, 생성자, 초기화 블록, private은 상속되지 않는다
 *            => final 클래스는 상속할 수 없다
 *      다형성 : 변경 / 추가
 *             => 오버라이딩 / 오버로딩
 *     --------------------------------
 *     재사용 : 변경 (상속), 있는 그대로 (포함)
 *                                ----- 멤버변수로 사용
 *                                      ------
 *                                      |기본형, 배열, 클래스, 열거형, 인터페이스
 *                                                               -------
 *                                                               |데이터베이스 연결
 *                                           Connection
 *                                               |
 *                                          ------------
 *                                          |    |     |
 *                                       Oracle MySQL MMSQL
 *    클래스의 종류 => 7장
 *    -----------------------------------------
 *      = 추상클래스 
 *        public abstract class ClaseName
 *        {
 *          
 *        }
 *      = 인터페이스 => 추상 클래스의 일종 / 필요한 메소드만 만들어두고 필요에 맞게 구현은 별도로 
 *      public interface interface명
 *      {
 *        // 상수형 변수
 *        // 선언만 된 메소드 ==> 윈도우 : 버튼, 마우스, 키보드
 *      }
 *    ------------------------------------------미완성된 클래스
 *                                              ------------
 *                                              | new를 이용한 메모리 할당 불가
 *                                              | 상속을 내려서 구현된 다음 사용
 *      = 내부클래스 :  쓰레드, 네트워크, 데이터 분석
 *                                 ---------
 *        = 멤버클래스 
 *          class A => 서버 => 접속시 처리 윈도우
 *          {
 *             데이터 => 접속자의 IP 저장
 *             class B => 통신서버 => 접속인하고 통신 쓰레드
 *             {
 *               
 *             }
 *          } // A,B 모두 데이터 사용 가능하다는 장점이 있다! (메모리 할당 필요 x)
 *        = 익명의 클래스
 *          class A
 *          {
 *            B b=new B()
 *            {
 *              void display()
 *              {
 *               
 *              }오버라이딩 => 상속이 없어도 오버라이딩 가능하다
 *            }
 *          }
 *          class B
 *          {
 *            void display()
 *            {
 *            }
 *          }
 *          
 *    사전에 에러 방지 => 8장
 *     1) 직접 처리
 *        try ~ catch
 *     2) 간접 처리
 *        메소드() throw 예외처리
 *     3) 임의발생 => 테스트
 *     4) 사용자 정의 예외 처리
 *    -------------- 기본 문법
 *    라이브러리 => 조립 => 9장~15장
 *      => String , IO, Collection ==> SQL (오라클 연동 프로그램) => Network          
 */
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
// 오버라이딩(재정의) => 기본 (상속) => 속도! (상속 가급적 지양) => 익명의 클래스 이용하여 재정의 
public class MainClass2 extends JFrame{
    // 포함 클래스
	JTable table; // 모양
	DefaultTableModel model; // 테이블 데이터 제어
	// 초기화
	public MainClass2()
	{
		String[] col= {"번호","이름","성별","주소","전화"}; // 타이틀값
		String[][] row = new String[0][5]; // [행의크기][열의크기]
		model=new DefaultTableModel(row, col)
		{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false; // 윈도우창에서 데이터 편집이 불가하도록 함
			}
			
		}; // 상속 없이 오버라이딩! ==> 익명의 클래스
		table=new JTable(model);
		JScrollPane js=new JScrollPane(table);
		//배치
		add("Center",js);
		String[] data= {"1","홍길동","남자","서울","010-1111-1111"};
		for(int i=0;i<10;i++)
		{
			model.addRow(data);
		}
		setSize(600, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass2();
	}

}
