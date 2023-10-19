package com.sist.exception;
/*
 *  8장 => 예외처리
 *        ------ 에러처리 => 사전에 에러를 방지하는 목적
 *                      => 비정상 종료를 방지하고 정상 상태 유지를 한다
 *                      => 예외처리 => 에러발생 시 에러를 건너뛴다
 *  
 *  에러 발생
 *  -------
 *   = 사용자 (잘못된 입력) => 유효성 검색 => JavaScript
 *                     => if
 *   = 개발자 (실수) => 배열 인덱스, 정수변환...
 *   --------------------
 *   1) 사전에 차단 (조건문) => if => 예외처리
 *   2) 예외처리 
 *      ------
 *         = 에러(Error) : 소스상에서 수정이 불가능
 *                        => 메모리 저장공간이 부족하다
 *         = 예외(Exception) : 소스상에서 수정이 가능
 *                        => 파일경로명, IP, 0으로 나눈다, 배열 인덱스가 틀리다
 *                        int[] arr=new int[2];
 *                        arr[2]=10; // [0,1]만 들어갈 수 있음 => 1로 수정!
 *    ==> 예외처리 방법
 *        = 예외 복구 => try catch 
 *        = 예외 회피 => throws
 *        = 임의 발생 => throw
 *        = 지원하지 않는 예외 : 사용자 정의 예외 처리
 *    ==> 예외의 종류 (상속도 => 위로 올라갈수록 예외 많이 잡음)
 *             Object :모든 클래스의 상위 클래스
 *               |
 *            Throwable : 예외의 최상위 클래스
 *               |
 *       ------------------------
 *       |                       |
 *   Error                     Exception
 *   ------                  -------------
 *   처리가 불가능                처리가 가능 (소스 변경으로 해결) 
 *   메모리 부족                 => 0으로 나누는 경우
 *   윈도우 충돌                 => 배열 인덱스 번호 잘못 입력 (범위 벗어남)
 *   톰캣 작동 오류               => 형변환 오류
 *   오라클 연결 불가			  => 파일명 오류
 *   -------------
 *   
 *        Exception : 예외처리의 최상위 클래스
 *        ----------
 *             |
 *     ---------------------------------
 *     |                               |
 *   CheckException                  UnCheckException
 *   => 컴파일 시에 예외처리를 했는지 확인    => 확인이 없기 때문에 필요시에만 사용
 *   => 예외 처리 안하면 오류남!           => 예외 처리 하지 않아도 오류 나지 않음!
 *   => 라이브러리중에 반드시 예외처리 해야한다  
 *   => java.io
 *      => 파일명이 틀린 경우
 *      => FileNotFoundException
 *      => IOException
 *   => java.net
 *     => URL주소, IP가 틀린 경우
 *     => MalformedURLException
 *   => java.sql
 *     => 오라클 주소가 틀린 경우 : SQLException
 *        jdbc:oracle:thin:@localhost:1521:XE
 *                                    ----
 *                                      |
 *                                    연결포트번호
 *     => 충돌 => 쓰레드 InterruptedException
 *     => ClassNotFoundException
 *    
 *     UnCheckException
 *     ----------------
 *       => RuntimeException => 예외를 확인할 수 없다
 *         -----------------
 *         | 실행 시 에러
 *           예) 1~100까지 사이의 정수 입력해라 => 실행해야 에러 확인할 수 있음
 *         NumberFormatException : 문자열로 받아서 정수로 변경 시 
 *         => 웹에서 가장 많이 등장하는 에러 중 하나!
 *         => http://localhost/main/main.jsp?page = 10 => 공백 넣을 시 에러
 *         => 웹에서는 데이터 전송 => URL을 이용해서 전송
 *            자바는 메소드의 매개변수를 이용해서 전송
 *         
 *        ArrayIndexOfOutBoundsException : 배열의 인텍스범위를 벗어나는 경우 
 *        NullPointerException : null인 클래스를 사용한 경우
 *                               ----- 주소가 없는 경우
 *        ArithmeticException : 0으로 나눴을 때
 *        
 *        ==> 에러 예상 : 
 *            문자열로 정수를 받아서 배열에 저장한 다음 나누기를 한다
 *            ----------        -------       -----
 *            1. NumberFormatException 
 *            2. ArrayIndexOfOutBoundsException
 *            3. ArithmeticException
 *        ==> 사전에 에러 방지 => 예측
 *        
 *        ClassCastException : 형변환 문제
 *         
 */
import javax.swing.*;
class A
{
	public void aaa() {
		System.out.println("A:aaa() Call");
	}
}
class B extends A
{
	public void aaa() {
		System.out.println("B:aaa() Call");
	}
}
public class MainClass_1 extends JFrame{
    JButton b1,b2; // null
    public MainClass_1()
    {
    	b1=new JButton("로그인");
    	b1=new JButton("취소"); 
    	add("North",b2);
    	setSize(300, 300);
    	setVisible(true);
    	
    }
	public static void main(String[] args) {
		//new MainClass_1();
		// TODO Auto-generated method stub
		//System.out.println(Integer.parseInt(" 10"));
		
//		int[] arr=new int[2];
//		arr[2]=100;
//		System.out.println(arr[2]);
		
//        A a=new (A); // A a=new A();로 선언 시 b.aaa를 가지고올 수 없음!
//        B b=(B)a;
//        try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        b.aaa();
//        a.aaa(); 
	}

}
