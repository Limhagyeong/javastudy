package com.sist.main;
import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Project {
/*
 * data-url="https://cdn.bonif.co.kr/cmdt/BF101_thum_BN100347.jpg"
 * https://cdn.bonif.co.kr/cmdt/BF101_pic_10000277.jpg
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
			Document doc=Jsoup.connect("https://www.bonif.co.kr/menu/list?brdCd=BF102").get();
			Elements link=doc.select("a.goods-detail-view");
			for(int i=0;i<link.size();i++)
			{	
				//System.out.println(link.get(i).text());
				
				String subLink="https://www.bonif.co.kr/menu/"+link.get(i).attr("href");
				System.out.println(subLink);
				Document doc2=Jsoup.connect(subLink).get();
				Elements title=doc.select("div.goods-name p.nm");
				Elements money=doc.select("div.goods-name p.price");
				Elements poster=doc.select("div.goods-thumb img");
				
				
				
				try {
					System.out.println(title.get(i).text());
					System.out.println(money.get(i).text());
					System.out.println(poster.get(i).attr("src"));
					} 
				catch(Exception ex) {}
				
				String msg=title.get(i).text()+"|"+money.get(i).text()+"|"
						+poster.get(i).attr("src")+"\r\n";
				FileWriter fw=new FileWriter("c:\\java_data\\project.txt",true);
				fw.write(msg);
				fw.close();
			}
			
		
	}
		catch(Exception ex) 
		{
			
		}

}
	
}
