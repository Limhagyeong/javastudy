import java.io.*; // 파일, 메모리 입출력
import java.util.*;
/*
 *  라이브러리
 *  -------
 *  java.lang : Object, String, StringBuffer, Math, Wrapper
 *  java.util : List, Set, Map
 *  java.io 
 *  java.net
 *  java.text
 *  ------------------------------------------------------------
 */
public class 문자열_5 {
    static String movie;
    static
    {
    	try
    	{
    		FileReader fr=new FileReader("C:\\javaDev\\movie.txt");
    		int i=0;
    		StringBuffer data=new StringBuffer();
    		while((i=fr.read())!=-1) // -1 => 문장 끝 (EOF)
    		{
    			data.append((char)i);
    		}
    		movie=data.toString();
    	}catch(Exception ex) {}
    }
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        //파일 읽기
//		FileReader fr=new FileReader("C:\\javaDev\\movie.txt");
//		int i=0;
//		StringBuffer data=new StringBuffer();
//		while((i=fr.read())!=-1) // -1 => 문장 끝 (EOF)
//		{
//			data.append((char)i);
//		}
//		System.out.println(data.toString());
//		System.out.println(movie);
		String[] movieData=movie.split(("\n"));
		System.out.println("영화 갯수:"+movieData.length);
		System.out.println("==영화목록==");
		// 검색
		// 송강호가 출연한 영화 제목
		Scanner scan=new Scanner(System.in);
//		System.out.print("입력:");
//		String actor=scan.next();
        // 1990년에 개봉한 영화
		System.out.println("등급 입력:");
		int grade=scan.nextInt();
		for(String movie:movieData)
		{
			String[] detail=movie.split("\\|");
//			if(detail[4].contains(actor)){
//			    if(detail[5].contains("1990")) {
			if(detail[6].startsWith(String.valueOf(grade))) {
				System.out.println("순위:"+detail[0]);
				System.out.println("영화명:"+detail[1]);
				System.out.println("장르:"+detail[2]);
				System.out.println("출연자:"+detail[4]);
				System.out.println("개봉일자:"+detail[5]);
				System.out.println("관람등급:"+detail[6]);
				System.out.println("감독:"+detail[7]);
				System.out.println("------------------------------------------------------------");
//			}
//			    }
			}
			
		}
			
	
	}

}

