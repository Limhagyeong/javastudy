package com.sist.lib;
/*
 *  Wrapper : 기본 데이터형을 클래스화 
 *     => 기본 데이터형에 기능을 부여해서 쉽게 사용할 수 있도록 함
 *     int ==> Integer
 *     long ==> Long
 *     double ==> Double
 *     boolean ==> Boolean
 *     --------------------  웹에서 주로 사용
 *     
 *     => 웹/윈도우 => 모든 데이터값 문자열
 *                   --------------
 *                   문자열을 정수, 실수, 논리형으로 변환
 *     => Double.parseDouble("4.5") => 4.5
 *        Integer.parseInt("10") => int page=10
 *        Boolean.parseboolean("true") => true
 *                ---------------------
 *                 HTML => checkbox
 *     => 제네릭 사용시 => 데이터형 통일
 *        ---- 메소드 => 리턴형 , 매개변수
 *                     ------------- Object
 *        <Integer>
 *        ---------
 *        배열 => 저장 (클래스) => Object
 *        
 *        class Box<T> ==> T(Object대신 사용)
 *        {
 *           T t=new T();
 *           void setT(T t){}
 *           T getT()
 *           {
 *             return T;
 *           }
 *        }
 *        
 *        Box<String>  ==> T 문자가 전부 Stirng으로 변환돼서 들어감 
 *        ----------------------------------------
 *        *** 오토박싱 / 언박싱
 *        Integer i=10; => int와 같이 사용이 가능 (integer => int로 받음) : 오토박싱
 *        int j=i; (int => integer로 받음) => 언박싱
 *       
 */
import java.util.*;
public class MainClass_2 {
	static void aaa(Integer i)
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		// <Integer> => Object의 모든 데이터형을 int로만 사용하겠다
		// <MainClass_2> 사용자정의 클래스로 변경하는 것도 가능
		// Wrraper 존재 이유 : <>안에는 기본 데이터형이 아닌 무조건 클래스형을 사용해줘야한다
		
		//Integer i=10; // 오토박싱
		//int j=i; // 언박싱
		//int j=new Integer(100);// 언박싱
		//System.out.println(i);
		aaa(10);
		
		/*list.add("a");//0
		list.add(10.5);
		list.add(10);
		list.add('A');
		list.add(new MainClass_2());
		list.add(10.5);
		list.add(10);
		list.add('A');
		list.add(new MainClass_2());
		list.add(10.5);
		list.add(10);
		list.add('A');
		list.add(new MainClass_2());
		list.add(10.5);
		list.add(10);
		list.add('A');
		list.add(new MainClass_2());
		list.add(10.5);
		list.add(10);
		list.add('A');
		list.add(new MainClass_2());*/
		// 데이터형이 섞여있어 for문 이용이 어려움 
		
		
		
		
		
	}

}
