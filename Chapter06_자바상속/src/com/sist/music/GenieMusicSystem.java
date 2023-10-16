package com.sist.music;


import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 *   GenieMusicSystem 
 *          |
 *    MelonMusicSystem 
 *    
 *    => 접근지정어 
 *       -------
 *       default => 패키지가 동일
 *       private => getter / setter => 접근이 가능하도록 함
 *       protected => 패키지가 동일 / 상속을 받는 경우에는 패키지가 다를 수 있다
 *       public => 공개
 *       기본 => 모든 데이터는 은닉화
 */

public class GenieMusicSystem {
  protected Music[] musics=new Music[50]; // =>private: 상속 받는 경우 접근 불가
                                         // class 영역에서는 제어문 사용 불가
  protected String title="지니뮤직 Top 50"; // 명시적 초기화
  
  // => 생성자 , 초기화 블록
  //    --- 인스턴스 불러 올 때 
  {
	 // 외부에서 데이터를 읽어 온다 => 값을 초기화 
	 // 크롤링, 파일읽기, 오라클 데이터 불러오기 => 구현 // 명시적 초기화 불가 => 초기화 블록 이용
	 /*
	  *  초기화 블록
	  *  => 인스턴스 블록 => {} => 인스턴스 변수, static 변수 사용 가능
	  *  => static 블록 (정적 블록) => static{} => static 변수만 사용 가능
	  *  => ----------------------- 자동 인식 (호출하는 것 X)
	  *  
	  *  => 상속의 예외 조건
	  *  try catch => 프로그램의 비정상 종료 방지 (예외 처리)
	  *            => 에러를 사전에 방지
	  *  try
	  *  {
	  *     // 정상적으로 수행하는 문장
	  *     // 지금까지 코딩했던 모든 문장
	  *  }catch(Exception ex){에러 시 처리}
	  *  => 에러를 무시하고 다음 문장 수행
	  *  
	  *  network, 파일, 오라클 연동 ==> 예외 처리를 반드시 한다
	  *  => 수정이 가능한 에러만 가능하다
	  *     메모리 부족 (X)
	  *     에러 / 예외처리 => 10/0 (O) 
	  */
	 try
	 {
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		// Document: HTML을 저장하는 공간 , Jsoup: HTML을 읽어서 데이터 추출
		// 데이터 저장 => HTML , JSON, XML => 데이터 추출 방식이 다르다
		/*
		 *  HTML  => tag/attribute ==> tag: <> </> <a/> => Markup lang
		 *          <a class="aaa"></a>
		 *          --  attribute -----
		 *          여는tag        닫는 tag
		 *          
		 *  태그를 읽는 방법
		 *  Element => Tag
		 *  
		 *  같은 태그 여러개를 읽는 경우
		 *  Elements
		 *  
		 *  ==> 구분자 
		 *      id ==> 찾기: 태그명#ID명 => 중복이 없는 경우
		 *      class ==> 찾기 : 태그명.클래스명 => 중복이 있는 경우
		 *      
		 *  <table id="aaa"> => table#aaa
		 *  <table class="bbb"> => table.bbb
		 *  
         */
	     // 노래 제목
		 Elements title=doc.select("table.list-wrap td.info a.title");
		 // 가수명
		 Elements singer=doc.select("table.list-wrap td.info a.artist");
	     // 앨범
		 Elements album=doc.select("table.list-wrap td.info a.albumtitle");
		 
		 for(int i=0;i<50;i++)
		 {
			 musics[i]=new Music();
			 musics[i].setMno(i+1);
			 musics[i].setTitle(title.get(i).text());
			 musics[i].setSinger(singer.get(i).text());
			 musics[i].setAlbum(album.get(i).text());
		 }
	 }catch(Exception ex) {}
  }
  
  public Music[] musicAllData()
  {
	  return musics;
  }
  // 제목으로 찾기
 public Music[] musicTitleFindData(String title)
  {
	  int count=0;
	  for(Music mm:musics)
	  {
		  if(mm.getTitle().contains(title))
		  {
			  count++;
		  }
	  }
	
	  Music[] music=new Music[count];
	  // 배열 (고정) => 가변형[컬렉션]
	  int i=0;
	  for(Music mm:musics)
	  {
		  if(mm.getTitle().contains(title))
		  {
			  music[i]=mm;
			  i++;
		  }
	  }
	  return music;
  }
  // 가수명으로 찾기
  public Music[] musicSingerFindData(String singer)
  {
	  int count=0;
	  for(Music mm:musics)
	  {
		  if(mm.getSinger().contains(singer))
		  {
			  count++;
		  }
	  }
	  
	  Music[] music=new Music[count]; // 배열의 단점 => 고정 (갯수 지정)
	  
	  int i=0;
	  for(Music m:musics)
	  {
		  if(m.getSinger().contains(singer))
		  {
			  music[i]=m;
			  i++;
		  }
		  
	  }
	  
	  return music;
  }
  // 상세보기
  public Music musicDetailData(int mno)
  {
	  return musics[mno-1];
  }
  public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("가수명 입력:");
	String singer=scan.next();
	GenieMusicSystem gm=new GenieMusicSystem();
	Music[] music=gm.musicSingerFindData(singer);
	System.out.println("검색결과:"+music.length+"건");
	for(Music m:music)
	{
		System.out.println(m.getMno()+"."+m.getTitle());
	}
}
   
}
