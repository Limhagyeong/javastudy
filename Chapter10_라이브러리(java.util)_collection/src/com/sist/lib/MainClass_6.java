package com.sist.lib;
// 멜론 : 곡명, 지니뮤직 : 곡명 => 중복이 안된 노래만 추출
// 공통 / 차집합 / 교집합 / 합집합
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class MainClass_6 {
	public static Set<String> genieMusic()
	{
		Set<String> set=new HashSet<String>();
		try
		{
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text());
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return set;
	}
	public static Set<String> melonMusic()
	{
		Set<String> set=new HashSet<String>();
		try
		{
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div.wrap_song_info div.rank01 a");
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text());
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return set;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> genie=genieMusic();
		System.out.println("============ Geine Music ============");
		for(String title:genie)
		{
			System.out.println(title);
		}
		System.out.println("============ Melon Music ============");
		Set<String> melon=melonMusic();
		for(String title:melon)
		{
			System.out.println(title);
		}
		
		/*System.out.println("========= 지니 뮤직에만 있는 노래 =========");
		// 차집합 => removeAll() => 오라클 : MINUS ***
		// [1,2,3,4,5]-[1,2,3,6,7] => 4,5
		genie.removeAll(melon);
		for(String title:genie)
		{
			System.out.println(title);
		}*/
		
		/*System.out.println("========= 공통으로 들어간 노래 =========");
		// 교집합 => retainAll() ***
		genie.retainAll(melon);
		System.out.println("공통 곡 수:"+genie.size());
		for(String title:genie)
		{
			System.out.println(title);
		}*/
		// 장바구니 => 동일 상품 관계 없이 처리 => List (중복허용)
		//        => 동일 상품 제거 => set (중복제거)
		System.out.println("========= 지니 뮤직+멜론 뮤직 =========");
		// 합집합 (UNION ALL)
		List<String> list=new ArrayList<String>();
		list.addAll(genie);
		list.addAll(melon); // 데이터값 전체 추가 addAll ***
		System.out.println("곡 갯수:"+list.size());
		for(String title:list)
		{
			System.out.println(title);
		}
		System.out.println("========= 지니 뮤직+멜론 뮤직 =========");
		// 합집합 - 교집합 (UNION)
		Set<String> hap=new HashSet<String>();
		hap.addAll(genie);
		hap.addAll(melon);
		System.out.println("곡 갯수:"+hap.size());
		for(String title:hap)
		{
			System.out.println(title);
		}
	}

}
