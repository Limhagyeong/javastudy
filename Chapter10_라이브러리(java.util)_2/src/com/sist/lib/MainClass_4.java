package com.sist.lib;
import java.util.*;
/*
 *  9장 java.lang 
 *  API
 *  
 *  290p => java.lang / util / io / text / net
 *  291p => 최상위 부모 클래스 Object
 *  292p => String, StringBuffer .. => final 클래스 => 확장 불가
 *  302p => toString finalize clone
 *  310p => 메소드
 *  StringBuffer => append
 *  317p => wrapper
 *  boolean int double long
 *  319p => 오토박싱 언박싱
 *  321p => parseInt => 문자형을 정수형으로 바꿈
 *  
 *  10장 java.util
 *  
 *  random -> 숫자 지정 => 범위는 지정숫자-1까지 (+1 해줘야함)
 *  326p Arrays => toString copyOf sort
 *  327p counttokens hasmoretokens 
 *  332p date calendar
 *  *** 335p java collection  
 */

/* 332p => Date / Calendar
 * 
 * 날짜 관련 (시간 포함)
 * ----------------
 * Date => 기능이 없다 (단지 날짜만 저장할 목적)
 *  					----------- 오라클 호환
 * Calendar : Date 없는 기능을 보완
 *  		  => 요일, 마지막날 읽기
 *  		  => 달력 (예약)
 *  		  => 단점 : 월, 요일 
 *      			  --- ----
 *      			   |   |
 *     			    0번부터 1번부터
 *  => Date : 일반 클래스
 *  		  Date date=new Date();
 *     Calendar : 추상 클래스
 *            Calendar cal=Calendar.getInstance();
 *            => getInstance() newInstance()
 *               ---------------------------
 *                메소드 이용하여 형성 시 => 싱글턴 (같은 주소값을 가지고 있다)
 *                => 메모리 공간을 절약할 수 있다!
 * 
 * 
 */
import java.util.*;
class A
{
	static A a;
	public static A newInstance()
	{
		if(a==null)
			a=new A();
		return a;
	}
}
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A aa=new A();
		System.out.println("aa="+aa); 
		
		A bb=new A();
		System.out.println("bb="+bb);*/
		
		/*A aa=A.newInstance(); // 싱글턴
		A bb=A.newInstance(); // 싱글턴
		A cc=A.newInstance(); // 싱글턴
		System.out.println("aa="+aa);
		System.out.println("bb="+bb);
		System.out.println("cc="+cc);*/
		
		Scanner scan=new Scanner(System.in);
		System.out.print("년 월 일 입력(2023 10 24):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt();
		
		Calendar cal=Calendar.getInstance();
		// 날짜 지정
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		String[] strWeek= {"","일","월","화","수","목","금","토"};
		int week=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+strWeek[week]+"요일입니다");
		
			
	}

}
