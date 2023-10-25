package com.sist.lib;
/*
 *  ArrayList<클래스>
 *           -------
 *           | 기본형 ==> Integer, String 
 *           | 사용자정의 클래스 ***
 *             ArrayList<Music>
 *             ArrayList<Movie>
 *             ArrayList<Food>
 *             ------------------ Object => 형변환
 */
import java.util.*;
public class MainClass_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names1=new ArrayList<String>();
		names1.add("홍길동");
		names1.add("박문수");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("강감찬");
		for(String name:names1)
		{
			System.out.println(name);
		}
		System.out.println("=========");
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("홍길동");
		names2.add("박문수");
		names2.add("심청이");
		names2.add("이순이");
		names2.add("성춘향");
		for(String name:names2)
		{
			System.out.println(name);
		}
		System.out.println("=========");
		ArrayList<String> temp=new ArrayList<String>();
		temp.addAll(names1); // 데이터값을 복사함 => 다른 컬렉션에 데이터를 추가할 때 사용
		//   -------
		for(String name:temp)
		{
			System.out.println(name);
		}
		System.out.println("=========");
		temp.retainAll(names2); // names1과 names2의 교집합을 찾아라
		//  ---------- => 오라클 : JOIN / INTERSECT
		for(String name:temp)
		{
			System.out.println(name);
		}
	
	}

}
