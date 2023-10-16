package com.sist.music;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MelonMusicSystem extends GenieMusicSystem{ 
  protected String title="멜론 Top 50";
  // protected Music[] musics=new Music[50]; => null => 예외 조건 걸어줘야함
  /*
   *  public Music[] musicAllData()
   *  public Music[] musicTitleFindData(String title)
   *  public Music[] musicSingerFindData(String singer)
   *  public Music musicDetailData(int mno)
   */ 
  // 초기화 블록 제외 모든 메소드, 변수 들어옴
  // 상속 제외 => 초기화블록, 생성자, static, private
  
  {
	  try
	  {
		  Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
		  Elements title=doc.select("div.wrap_song_info div.rank01");
		  Elements singer=doc.select("div.wrap_song_info div.rank02");
		  Elements album=doc.select("div.wrap_song_info div.rank03");
	  }catch (Exception ex) {}
	  
  }
  
  
}
