package com.sist.lib;
/*
 *  335p => 자바 컬렉션
 *  		-------- 자료 구조 (데이터 관리)
 *  		=> 데이터를 모아서 관리하는 클래스의 집합
 *   		  ------------------ CRUD
 *   		  추가 , 수정 , 삭제 , 읽기
 *   		  => 메모리에서 영구적으로 저장이 안됨
 *   		  => 영구적인 저장장치 : 파일 / 오라클
 *  	Collection => 인터페이스
 *          |
 *   --------------------------------------
 *   |                 |                  |
 *   List 			  Set				 Map => 인터페이스 => 모든 메소드 동일 (표준화)
 *   
 *    
 *   List : 순서를 가지고 있다 (인덱스 번호 이용) ==> 배열을 보완 (배열: 고정적, 같은 데이터형만 모을 수 있다)
 *   	    								 => 가변형 (크기 지정하지 않는다), 모든 데이터형 사용 가능
 *          데이터의 중복을 허용한다
 *   	    => ArrayList ***
 *          => Vector
 *          => LinkedList
 *          
 *   Set : 순서를 가지고 있지 않다 
 *   	   데이터의 중복을 허용하지 않는다
 *   	   => HashSet ***
 *         => TreeSet 
 *         
 *   Map : 순서를 가지고 있지 않다
 *   	   데이터 중복을 허용한다 (Value값)
 *         Key를 가지고 Value값을 찾는다 => 쌍으로 만들어진다!
 *         --- 중복X
 *         => HashMap ***
 *         => HashTable
 *         
 *   335p
 *     Collection => 데이터를 일정 공간에 모아서 관리할 목적
 *     ---------- => 웹에서 목록 출력 (모아서 => 브라우저)
 *       1) 배열의 단점 보완 (저장 크기 결정) => 고정적
 *          => 크기 결정을 하지 않는다 (가변형)
 *       2) 인터페이스를 이용한다
 *          ------- 표준화 (모든 개발자가 동일한 메소드를 이용)
 *          => 프레임워크 : Spring / MyBatis / JQuery / VueJS / ReactJS
 *              | 일정 틀을 만들어 관리 => 쉽게 다른 개발ㅈ의 코딩을 분석할수 있다
 *                 ----------- 유지 보수 
 *     Collection 
 *          |
 * ---------------------------------
 * |              |                |
 * List          Set              Map
 * |              |               |
 * |          -----------         ---------------
 * |         |          |        |             |
 * |      HashSet     TreeSet  HashMap      Hashtable
 * -------------------------
 * |            |          |
 * ArrayList  Vector    LinkedList
 * 
 * List : 가장 많이 사용되는 컬렉션
 *        ArrayList : Vector를 보완한 클래스 => 비동기적으로 처리됨 => 데이터베이스 연동
 *        => 장점 : 배열형식으로 만들어져있다 => 인덱스를 이용해서 처리 
 *                 접근 속도가 빠르다 
 *           단점 : 중간에 추가/삭제 할 시 속도 저하 (인덱스번호가 전부 수정되어야하기때문)
 *                 항상 인덱스 번호는 순차적으로 유지 (루프 돌리기 편함)
 *                 0 1 2 3 4 5
 *                 => 3번 삭제
 *                 0 1 2 3 4 => 자동으로 처리
 *                 -----------------------
 *                 0 1 2 (3 4 5)
 *                       |추가
 *                 0 1 2 3 (4 5 6)
 *        => 사용처 : 데이터의 양이 일관적이고 추가/삭제가 없는 경우
 *                  =>데이터베이스
 *                  데이터의 접속 속도를 중요시할 때 (웹)        
 *                  
 *                   -------------
 *                    10 20 30 40
 *                   -------------
 *                    0  1  2  3 => 인덱스번호 자동 부여
 *                    
 *        Vector : 동기적 => 네트워크에서 접속자 정보를 저장할 때 사용
 *        LinkedList : C언어 개발자 => 호환
 *                     
 *                     ---- ----   ----    ---
 *                      10 -- 20 -- 30 --  40
 *                     --- -----   ----    ---
 *                     
 *                     => 주요 메소드 ( ArrayList, LinkedList , Vector) ***
 *                     => 웹(데이터 공유가 핵심 ==> 오라클)
 *                        -----------
 *                        1) 추가 ***
 *                            add(데이터)
 *                            add(int index,데이터) => 원하는 인덱스 위치에 데이터 추가 => 속도 느려짐
 *                        2) 수정
 *                            set(int index,데이터)
 *                        3) 삭제
 *                            remove(int index) => 원하는 인덱스 위치에 데이터 삭제 => 속도 느려짐
 *                        4) 읽기 ***
 *                            get(int index)
 *                        5) 저장 갯수 *** => 데이터 총 갯수 확인
 *                            size()
 *                        6) 전체 지우기
 *                            clear()
 *                        ------------- 
 *        
 * ***       
 * ----------------------------------------------
 * 컬렉션         읽기(접근시간)	   추가/삭제   	비고
 * -----------------------------------------------
 * ArrayList    속도가 빠르다      느리다   순차적으로 추가/삭제 => 빠르다
 * (웹에서 주로 사용)					   비효율적으로 메모리 사용
 *              => 웹 => 자체에서 추가/삭제를 하지 않는다
 *                       오라클에서 추가/삭제한다
 * -----------------------------------------------
 * LinkedList   속도가 느리다      빠르다   데이터가 많을 수록 접근성이 떨어진다
 *              => 윈도우
 * (어플리케이션에서 주로 사용)
 * ------------------------------------------------
 * Set : 중복 데이터를 만들 때 => 중복을 없앨 수 있음 :HashSet
 *       검색 최적화 : TreeSet
 *       
 * Map : Hashtable => 단점을 보완 => HashMap
 *       HashMap => 웹에서 가장 많이 사용
 *       			1) 관련된 클래스 관리 => 스프링, 마이바티스
 *       			2) 웹소켓 (웹 네트워크) =>sessionId
 *       
 * 
 *   
 *   
 *   
 */
import java.util.*;
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList(); // Object => 데이터 상관 x
		// 가급적이면 같은 데이터 첨부하는 것이 유리하다
		// 추가
		list.add("홍길동"); // 0번
		list.add("심청이"); // 1
		list.add("이순신"); // 2
		list.add("강감찬"); // 3
		list.add("춘향이"); // 4
		
		// 출력
		for(int i=0;i<list.size();i++)
		{
			Object name=list.get(i); // 데이터 읽기 => 인덱스 번호 활용
			System.out.println(i+"."+name);
		}
		System.out.println("==================="); // 중간에 추가하면 속도 느려지는 단점이 있음
		// 추가
		list.add(2,"을지문덕");
		for(int i=0;i<list.size();i++)
		{
			Object name=list.get(i); // 데이터 읽기 => 인덱스 번호 활용
			System.out.println(i+"."+name);
		}
		// 삭제 remove(int index)
		System.out.println("==================");
		list.remove(3);
		for(int i=0;i<list.size();i++)
		{
			Object name=list.get(i); // 데이터 읽기 => 인덱스 번호 활용
			System.out.println(i+"."+name);
		}
		// 수정 set(int index,데이터)
		System.out.println("==================");
		list.set(2, "박문수");
		for(int i=0;i<list.size();i++)
		{
			Object name=list.get(i); // 데이터 읽기 => 인덱스 번호 활용
			System.out.println(i+"."+name);
		}
		System.out.println("==================");
		System.out.println("현재 인원:"+list.size());
		
		//전체 삭제 => clear
		System.out.println("==================");
		list.clear();
		System.out.println("현재 인원:"+list.size());
		
	}

}
