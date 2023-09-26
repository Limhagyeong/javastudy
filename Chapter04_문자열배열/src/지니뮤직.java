/*
 * 1. equals : (==) => boolean => 대소문자 구분 사용
 *                   -------- if문에서 사용
 *                   equals() ==
 *                   !equals() !=
 *    equalsIgnoreCase => 대소문자 구분 없이 사용
 * 2. contains : 포함된 단어 찾기 => boolean
 * 3. startsWith: 시작문자열이 같은 경우 => boolean
 * 4. endsWith : 끝문자열이 같은 경우 
 * ---------------------------------------------- 검색
 * 
 * 크롤링
 * 
 */

import java.util.*;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class 지니뮤직 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        String url="";
        while(true)
        {
        	System.out.println("==== 메뉴 ====");
        	System.out.println("1. Top50");
        	System.out.println("2. 가요");
        	System.out.println("3. POP");
        	System.out.println("4. OST");
        	System.out.println("5. 트롯");
        	System.out.println("6. JAZZ");
        	System.out.println("7. CLASSIC");
        	System.out.println("8. CONTAINS");
        	System.out.println("9. StartsWith");
        	System.out.println("10. EndsWith");
        	System.out.println("11. Exit");
        	System.out.println(" ============");
        	System.out.print("메뉴를 선택하시오:");
        	int menu=scan.nextInt();
        	if(menu==11)
        	{
        		System.out.println("프로그램 종료");
        		break;
        	}
        	else if(menu==1)
        	{
        		url="https://www.genie.co.kr/chart/top200";
        	}
        	else if(menu==2)
        	{
        		url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0100";
        	}
        	else if(menu==3)
        	{
        		url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0200";
        	}
        	else if(menu==4)
        	{
        		url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0300";
        	}
        	else if(menu==5)
        	{
        		url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0107";
        	}
        	else if(menu==6)
        	{
        		url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0500";
        	}
        	else if(menu==7)
        	{
        		url="https://www.genie.co.kr/chart/genre?ditc=D&ymd=20230925&genrecode=M0600";
        	}
        	
        	System.out.print("검색어 입력:");
        	String msg=scan.next();
        	
        	Document doc=Jsoup.connect(url).get();
        	Elements title=doc.select("table.list-wrap a.title");

        	for(int i=0;i<title.size();i++)
        	{
        		String name=title.get(i).text();
//        		if(name.contains(msg))
//        		if(name.equals(msg)) // == (모든 제목을 입력해야함 / 대소문자 구분해야함)
        		if(name.equalsIgnoreCase(msg)) // == (모든 제목을 입력해야함 / 대소문자 구분X)
        		{
        		System.out.println((i+1)+"."+name); // 단어가 포함된 제목을 가져옴
        		Thread.sleep(500); // 0.5초 간격으로 값 출력
        		}
//        		if(name.startsWith(msg))
//        		{
//        			System.out.println((i+1)+"."+name); // 검색 단어로 시작하는 제목을 가져옴
//        		}
        		
//        		if(name.endsWith(msg))
//        		{
//        			System.out.println((i+1)+"."+name); // 검색 단어로 끝나는 제목을 가져온다
//        		}
        	}
        	
        		
        	
        }
	}

}
