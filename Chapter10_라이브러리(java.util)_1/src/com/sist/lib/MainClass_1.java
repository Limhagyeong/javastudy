package com.sist.lib;
/* *** 웹 : String , Integer, ArrayList
 * 
 *  1. java.util
 *     => 프로그램에서 많이 사용되는 유용한 클래스의 집합
 *     => 반드시 import를 사용해야한다
 *     1) 날짜
 *        Date / Calendar ==> Date에 없는 기능을 확장 (Calendar)
 *               -------- 예약
 *     2) 문자열 분해
 *        StringTokenizer
 *     3) 자료 구조 : 메모리에서 데이터를 쉽게 관리할 수 있게 만든 클래스
 *        ------- 컬렉션 (***)
 *                ------ 가변형 (크기를 결정하지 않는다) => 값을 입력하는 만큼 메모리 공간이 생김
 *                                                => 배열은 메모리 공간을 만든 후 값을 넣어주는 형식
 *                표준화 (모든 개발자가 동일하게 사용한다) 
 *                => CRUD => 읽기 / 쓰기 / 수정 / 삭제 (배열은 삭제 불가함)
 *                   Collection => interface 
 *                      |
 *         ---------------------------------------------------
 *         |                          |                      | ==> interface
 *       List                        Set                    Map 
 *       = 데이터의 중복허용        = 데이터의 중복허용 X        = 데이터의 중복허용 (키는 중복 불가)
 *       = 순서를 가지고있다        = 순서를 가지고있지 않다      = 순서를 가지고있지 않다
 *         (인덱스를 이용)                                 = 키와 값으로 저장한다
 *       = 데이터베이스 사용 시에 주로 사용***                 = 클래스 관리 (스프링, 웹)
 *       
 *       List 
 *       -----
 *        | List를 구현하는 클래스
 *      --------------------------------- Stack
 *      |              |                |
 *   *** ArrayList   Vector         LinkedList
 *                                      |
 *                                    Queue
 *                                    
 *       Set
 *       ---
 *        | set을 구현하는 클래스
 *      -------
 *      |      |
 * *** HashSet TreeSet
 *     
 *     Map
 *     ----
 *      | Map을 구현하는 클래스
 *   -----------------
 *   |                |
 * *** HashMap         HashTable   
 * 
 * 
 * <List>
 * ArrayList : 오라클에 있는 데이터를 저장해서 제어
 *             ----------------------------
 *                    |
 *                  브라우저로 전송 
 *                => 데이터베이스와 관련 => 비동기 방식 
 * Vector : 동기 방식 => 네트워크 (사용자 정보 저장 => IP,Port)
 *   *** Vector의 단점을 보완 => ArrayList
 * LinkedList : C호환 => 수정, 삭제, 추가가 빠르다 // 읽기는 ArrayList가 빠르다
 * 
 *   *** 인터페이스를 구현했기때문에 모든 메소드가 동일하다 (내용만 오버라이딩 된 상태)
 *   
 * 
 * Random : 난수 발생 
 * 
 */
import java.util.*;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new LinkedList();
		list.add("홍길동"); // Object
		list.add("심청이");
		list.add("박문수");
		
	   for(Object name:list)
	   {
		   System.out.println(name);
	   }
		
	}

}
