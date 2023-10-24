package com.sist.lib;
// Random
import java.util.*;
/*
 *  Random => 임의의 수 추출할 때 사용
 *            ------- 자바 JVM에서 
 *            => Math.random() => double 
 *  => int nextInt(int bound)
 *                 ---------
 *                   100 ==> 0~99 (마지막값은 제외) ==> +1 해줘야함 
 */
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A~Z 알파벳을 임의로 10개 출력
		Random r=new Random();
		/*for(int i=1;i<=10;i++)
		{
			char c=(char)(r.nextInt(26)+65);
			// 0~25
			System.out.print(c+" ");
		}*/
		
		/*for(int i=1;i<=6;i++)
		{
			int lotto=r.nextInt(45)+1; // 1~45
			System.out.print(lotto+" ");
		}*/
		
		int day=r.nextInt(7)+7;
		Set set=new HashSet(); // 중복을 제거해준다
		for(int i=1;i<=day;i++)
		{
			int rr=r.nextInt(31)+1;
			/*if(rr>=24) // 24(오늘일자) => 예약가능일자 : 오늘일자보다 크거나 같아야함
			{
				System.out.print(rr+" ");
			}*/
			System.out.print(rr+" ");
			set.add(rr);
		} // 예약 가능한 일자를 뽑아옴
		
		System.out.println("\n======= 최종 결과 =======");
		for(Object obj:set)
		{
			System.out.print(obj+" ");
		}
		
		
	}

}
