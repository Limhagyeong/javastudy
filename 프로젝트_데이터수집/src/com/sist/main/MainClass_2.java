package com.sist.main;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Document doc=Jsoup.connect("https://movie.daum.net/ranking/reservation").get();
			Elements title=doc.select("div.section_ranking strong.tit_item a"); // class => . ID => #
			// <div class="thumb_cont">
            //<strong class="tit_item">
            //<a href="/moviedb/main?movieId=171140" class="link_txt" data-tiara-layer="moviename">그대들은 어떻게 살 것인가</a>
			Elements poster=doc.select("div.section_ranking div.poster_movie img");
			Elements grade=doc.select("div.section_ranking span.txt_tag span");
			Elements avg=doc.select("div.section_ranking span.txt_grade");
			Elements rev=doc.select("div.section_ranking span.txt_append span.txt_num");
			//Elements cont=doc.select("div.section_ranking strong.tit_item a.link_txt");
			// 같은 태그 이름이 있으면 상위 태그, 태그 두개 이용해서 불러줘야함!
			/*  <a href="/moviedb/main?movieId=171140"
			 * -------------------- attr("href") => 링크 출력
			 *  class="link_txt" data-tiara-layer="moviename">그대들은 어떻게 살 것인가
			 *   => text() 값 출력
			 */
			for(int i=0;i<title.size();i++)
			{
				System.out.println(title.get(i).text());
				System.out.println(poster.get(i).attr("src"));
				System.out.println(grade.get(i).text());
				System.out.println(avg.get(i).text());
				System.out.println(rev.get(i).text());
				System.out.println(title.get(i).attr("href"));
			}
						
		}
		catch(Exception ex)
		{
			
		}
	}

}
