package com.sist.music;
// 크롤링 => 데이터를 모아서 저장 => 메모리에 저장
// ==> 배열 / 컬렉션
// 크롤링 => 파일 저장
// 크롤링 => 오라클 
// ---------------------> 브라우저에 출력
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MusicManager {
	// 뮤직 전체 데이터를 가지고있음 => 클라이언트 접속자에 공유 => static 
	private static ArrayList<Music> list=new ArrayList<Music>();
	// 크롤링 => 초기화
	static // 초기화블록
	{
	  	try
	  	{
	  		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
	  		// poster 
	  		Elements poster=doc.select("table.list-wrap a.cover img");
	  		// 곡명
	  		Elements title=doc.select("table.list-wrap td.info a.title");
	  		// 가수명
	  		Elements singer=doc.select("table.list-wrap td.info a.artist");
	  		// 앨범
	  		Elements album=doc.select("table.list-wrap td.info a.albumtitle");
	  		
	  		for(int i=0;i<poster.size();i++)
	  		{
	  			Music music=new Music();
	  			music.setRank(i+1);
	  			music.setPoster("http:"+poster.get(i).attr("src"));
	  			//<img src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/084/181/610/84181610_1692585955705_1_140x140.JPG/dims/resize/Q_80,0" onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" alt="Love Lee">
	  			//     --- src라는 속성값 안에 있는 이미지를 달라!
	  			music.setTitle(title.get(i).text());
	  			//<a>aaa</a>
	  			music.setSinger(singer.get(i).text());
	  			music.setAlbum(album.get(i).text());	
	  			
	  			list.add(music);
	  		}
	  	}catch(Exception ex){ex.printStackTrace();}
	}
	// 목록 출력
	public ArrayList<Music> musicAllData()
	{
		return list;
	}
	// 상세보기
	public Music musicDetailData(int no)
	{
		Music music=new Music();
		for(Music m:list)
		{
			if(m.getRank()==no)
			{
				music=m;
				break;
			}
		}
		return music;
	}
	// 검색
	public ArrayList<Music> musicFindData(String title)
	{
		ArrayList<Music> arr=new ArrayList<Music>();
		for(Music m:list)
		{
			if(m.getTitle().contains(title));
			{
				arr.add(m);
			}
		}
		return arr;
	}
	// 수정은 불가
}
