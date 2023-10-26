package com.sist.lib;
// 검색 => 출력
import java.util.*;
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<Integer>();
		Random r=new Random();
		System.out.println("======= Set ========");
		for(int i=0;i<10;i++)
		{
			int k=r.nextInt(100)+1;
			set.add(k);
		}
		System.out.println(set);
		// 50보다 작은 수 
		System.out.println("50보다 작은 수");
		for(int i:set)
		{
			if(i<50)
			{
				System.out.print(i+" ");
			}
		}
		// 50보다 큰 수
		System.out.println("\n50보다 큰 수");
		for(int i:set)
		{
			if(i>50)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println("\n");
		TreeSet<Integer> tset=new TreeSet<Integer>();
		tset.addAll(set);
		System.out.println("======= tSet ========");
		System.out.println(tset); // 자동 정렬됨!
		System.out.println("50보다 작은 수 "+tset.headSet(50));
		System.out.println("50보다 큰 수 "+tset.tailSet(50));
		// 정렬 / 검색이 빠르다 ==> 오라클 : 인덱스
		
	}

}
