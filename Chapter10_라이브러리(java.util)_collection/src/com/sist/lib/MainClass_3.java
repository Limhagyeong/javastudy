package com.sist.lib;
/*
 *  set (인터페이스)
 *   |
 *  -----------
 *  |		  |
 *  HashSet  TreeSet
 *  ----------------------------
 *   특징)
 *          = 순서가 없다 (인덱스가 없다) , 데이터 중복을 허용하지 않는다
 *          => 장르별 , 부서별 ...
 *          => 데이터베이스 : DISTINCT
 *          => HashSet : 속도가 빠르다
 *          => TreeSet : 정렬, 검색 속도
 *    ------------------------------------ List에 저장 => 중복 제거
 *          => 주요 메소드
 *             데이터 저장 : add(Object)
 *             삭제 : remove(Object)
 *             전체 삭제 : clear()
 *             데이터를 한번에 모아서 관리 : iterator()
 *             TreeSet => LIKE, REGEXP_LIKE(오라클)
 *               = headSet
 *               = tailSet
 *          => 장바구니 => 같은 물품 구매
 *             ------- set에 저장하면 중복 없앨 수 있음
 *  
 */
import java.util.*;
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		////////////////////
		set.add("A");
		set.add("B");
		set.add("C");
		
		// 출력 => set => 중복 데이터를 허용하지 않음
		for(String s:set)
		{
			System.out.print(s+" ");
		}
	}

}
