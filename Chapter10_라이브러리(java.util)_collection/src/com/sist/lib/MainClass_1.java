package com.sist.lib;
/*
 *  컬렉션 프레임워크
 *   = 다수의 데이터를 쉽고 효율적으로 처리할 수 있게 만든 표준화된 클래스의 집합
 *     ----------							  ------
 *     클래스의 집합 (자바에서 지원하는 라이브러리=>사용법) 
 *   = 데이터 수정, 삭제, 추가, 읽기 => CRUD (자료구조)
 *   = 배열의 단점 보완 => 고정(정적) => 추가, 삭제가 어려움 
 *    => 동적 메모리 할당 (가변)
 *       필요시마다 추가, 삭제가 편리하다
 *   = 단점 : 모든 데이터형을 저장할 수 있다 (Object)
 *   = 기본적으로 데이터 관리
 *     ------------------> 같은 데이터형을 모아서 처리
 *  제네릭 : 데이터형을 통일화
 *         -------------
 *          기존에 만들어진 메소드의 리턴형, 매개변수를 변경
 *          *** 데이터를 저장할 때 한가지 데이터형만 사용이 가능하게 만들어서 사용
 *          *** 소스가 간결하다 , 가독성이 좋다
 *              -----------   ---------
 *               | 형변환 없이 사용 가능   | 어떤 데이터가 들어갔는지 확인이 쉽다
 *          *** 컬렉션에서 사용
 *          => 사용법 => 클래스 뒤에 <>
 *             <> => 클래스만 사용할 수 있다 (기본형 사용 불가 => Wrapper)
 *             ArrayList<Integer>
 *             ArrayList<Music> ...
 *          => T,E,K,V
 *             T => <type> => 클래스 (type=>클래스 등록)
 *               => MyBatis => type
 *               => Spring => class
 *             E => <Elements> => 클래스
 *             K => <Key>
 *             V => <Value>
 *             ArrayList<E>
 *             Set<E>
 *             Map<K,V>
 *             
 *           예)  사용자 정의
 *               class Box<T>
 *               {
 *                  T t;
 *                  public void setT(T t)
 *                  {
 *                     this.t=t;
 *                  }
 *                   public T getT()
 *                   {
 *                     return t;
 *                   }
 *               }
 *               Box box=new Box() ==> T (Object)
 *               Box<Integer> box=new Box<Integer>();
 *                  => T (Integer)
 *               
 *  클래스의 종류
 *  
 *  => List (인터페이스)
 *     순서가 존재 (자동으로 인덱스 번호 부여)
 *     데이터 중복 허용
 *     => 가장 많이 사용되는 컬렉션
 *     => 구현하는 클래스
 *        -----------
 *        | ArrayList,Vector,LinkedList
 *     => ArrayList 
 *        : 비동기방식 => 접근속도가 빠름 => 데이터베이스에서 데이터 읽기
 *                     -----------    --------- 웹 핵심
 *          => 단점 : 추가, 삭제 시 속도가 느리다
 *                   -------- 오라클에서 주로 하는 일! => ArrayList 통해서 하는 경우는 거의 X
 *          => 읽기/데이터 모아서 전송
 *             => 마이바티스 : 리턴형 List
 *          => Vector의 단점 보완
 *     => Vector : 동기방식 => 네트워크 (접속자 정보 저장)
 *     => LinkedList : 접근 속도가 늦다, 추가, 삭제가 빠르다
 *        ---------- 자체 처리 (Application)
 *        ---------- List라는 인터페이스 이용 => 모든 메소드 동일
 *        ---------- java.util => 사용시에는 반드시 import를 이용한다
 */
import java.util.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		// 가변 => 메모리 저장 크기를 지정하지 않는다
		// 배열 => 사용하지 않는 공간이 있는 경우 메모리 누수 현상
		// => 추가 => add(Object) => add(String)
		list.add("사과");
		list.add("배");
		list.add("수박");
		list.add("바나나");
		list.add("메론");
		// => 인덱스 번호가 자동으로 변경
		// 추가시에는 마지막에 추가 , 가급적이면 삭제는 하지 않는다 => 인덱스번호 재정의로 속도 느려짐
		// 데이터 읽기 => 출력 => size(), get(index)
		
		for(int i=0;i<list.size();i++)
		{
			String f=list.get(i);
			System.out.println(i+":"+f);
		}
		System.out.println("===삭제 후===");
		// 삭제 remove(index) => 데이터 (중복 허용)
		list.remove(1);
		for(int i=0;i<list.size();i++)
		{
			String f=list.get(i);
			System.out.println(i+":"+f);
		}
		System.out.println("===수정 후===");
		// 수정 set(index,data)
		list.set(2, "연시");
		for(int i=0;i<list.size();i++)
		{
			String f=list.get(i);
			System.out.println(i+":"+f);
		}
		System.out.println("===저장 갯수 확인===");
		//size() => 장바구니 
		System.out.println("과일:"+list.size());
		System.out.println("====전체 삭제====");
		// ArrayList 데이터 비우기 ==> clear
		list.clear();
		System.out.println("과일:"+list.size());
		
		System.out.println("=== 데이터 존재 여부 확인 ===");
		// isEmpty
		if(list.isEmpty())
		{
			System.out.println("장바구니가 비어있습니다"); 
		}
		else
		{
			System.out.println("장바구니에 선택된 데이터가 있습니다");
		}
		
	}

}
