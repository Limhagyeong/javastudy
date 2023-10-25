package com.sist.lib;
// => 메소드 (340p)
// => 검색 => 
import java.util.*;
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수만 메모리에 저장하겠다
		ArrayList<Integer> list=new ArrayList<Integer>();
		/*
		 *  Wrapper => 기본형을 클래스형으로 만들어서 => 기능을 수행할 수 있도록 한다
		 *             						  => 제네릭을 사용할 수 있도록 한다
		 *  장점 : Wrapper클래스와 기본형 호환이 가능하다
		 *  Integer => 10,20,30 ... (int) => 오토박싱
		 *  Integer i=10; => 언박싱
		 */
		// 추가 => add()
		list.add(Integer.valueOf(10)); // 0
		list.add(20); //1
		list.add(30); //2
		              //3
		list.add(40); //3 => 4
		list.add(50); //4 => 5
		
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i); // 형변환 불필요
			System.out.println(val);
		}
		System.out.println("=======");
		list.add(3,60);
		for(int i=0;i<list.size();i++)
		{
			int val=list.get(i); 
			System.out.println(val);
		}
		System.out.println("=======");
		list.remove(3);
		/*for(int i=0;i<list.size();i++) // 인덱스 번호 : 0번부터 시작 => size() 갯수 i<list.size()
			                           // i<=list.size => 인덱스 범위 오류남
		{
			int val=list.get(i); 
			System.out.println(val);
		}*/
		for(int i:list)
		{
			System.out.println(i); // 인덱스 범위 설정해줄 필요 없음
		}
		System.out.println("=======");
		System.out.println("데이터 저장 갯수:"+list.size());
		// list.size()==0 => 장바구니가 비어있다!
		System.out.println("데이터 존재 여부:"+list.isEmpty()); // => false => 있다
		// 라이브러리 => 메소드 : is~ => 리턴형은 무조건 boolean
		//                  : set~ => 무조건 void
		// 					: get~ => 리턴형 무조건 존재
		System.out.println("=======");
		list.clear();
		System.out.println("데이터 저장 갯수:"+list.size());
		System.out.println("데이터 존재 여부:"+list.isEmpty()); // true => 없다
		/*
		 *  
		 */
		
	}

}
