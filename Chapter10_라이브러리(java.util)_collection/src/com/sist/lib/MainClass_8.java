package com.sist.lib;
/*
 *  = 중복이 있는 데이터 ==> List => ArrayList
 *  = 중복이 없는 데이터 => HashSet
 *  = 두개를 동시에 저장해서 찾는다 => HashMap : 클래스 찾기 , SQL 문장 찾기
 *    						   -------- Annotation 
 *  ----------------------------------------
 *  
 *  Map => 인터페이스 (349P) / 클래스 관리 목적 
 *  ---  
 *   |
 *  ---------------------------
 *  |					      |
 *  HashTable				HashMap => HachTable 보완
 *  								  (동기 => 비동기화)
 *  							    => Ajax
 *  특징
 *   = 두개를 동시에 저장 (Key,Value)
 *   = key는 중복 불가 / value는 중복 가능
 *     예) ("id","hong")
 *         ("id","shim") ==> get("id")
 *   = 사용처 
 *     웹에서 제공하는 90% 클래스 => Map을 이용하고 있다
 *     => 데이터 전송
 *        HttpServletRequest
 *        -------------------- 서버 => 브라우저로 값 전송
 *        setAttribute("id","hong")
 *        setAttribute("pwd","1234")
 *        => session / cookie
 *        			  -------- 최신 방문
 *        => 라이브러리
 *           Spring ==> HashMap => Key, 클래스 객체
 *            => 클래스 관리 => 클래스 찾기 (DL)
 *                           --------- getBean("key")
 *               객체의 생명주기 관리 => 생성 ~ 소멸
 *               => WEB (라이브러리 일부)
 *           MyBatis => 데이터베이스와 관련 => ORM
 *           => SQL문장을 관리 => key
 *           --------------> 등록 (XML, Annotation)
 *        => 주요 메소드 
 *           1) 저장 => put("key","value")
 *           			   ------ 반드시 문자로 시작한다
 *           2) 읽기 => get(key)
 *           --------------------------------------
 *           프로그램 : 데이터가 많이 있다
 *             => 구분 
 *             ArrayList => 인덱스
 *             Set => 중복 없다 
 *             Map => key
 *             오라클 => Primary Key
 *            ------------------------------------- 정형화 데이터
 *            비정형화 데이터 => 분석 => 시각화
 *                			 ----------- 정형화된 데이터로 변경
 *                               |
 *                              빅데이터 => 목적 : 예측 (AI)
 *            Application => exe
 *            웹/모바일 => java
 *                         |
 *                       kotlin
 *            분석 => python
 *            실시간 => 스칼라
 */
import java.util.*;
public class MainClass_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("id", "hong");
		map.put("pwd", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("addr", "서울");
		map.put("phone", "010-1111-1111");
		
		/*System.out.println("ID:"+map.get("id"));
		System.out.println("PWD:"+map.get("pwd"));
		System.out.println("Name:"+map.get("name"));
		System.out.println("Sex:"+map.get("sex"));
		System.out.println("Addr:"+map.get("addr"));
		System.out.println("Phone:"+map.get("phone"));*/
		
		Set<String> set=map.keySet();
		System.out.println(set);
		for(String key:set)
		{
			System.out.println(key.toUpperCase()+":"+
							   map.get(key));
		}
		// 단점 : 코딩 순서와 출력 순서가 다르다 => 읽는 순서는 저장 순서와 다르다
		for(String s:map.values())
		{
			System.out.println(s);
		}
		/*
		 *  clear() : 전체 삭제 ==> TRUNCATE
		 *  get() : 실제 데이터를 읽어온다
		 *  put() : 데이터를 저장할 때 쓴다
		 *  isEmpty() : 데이터가 저장되어있는지 확인할 때 사용 => true : 없다
		 *  size() : 저장 갯수
		 *  keySet() : 키값을 읽어온다
		 *  Values() : 실제 저장된 값 읽어온다
		 */
	}

}
