package com.sist.seoul;
import java.io.*;
import java.util.*;
public class SeoulManager {
	
	public Seoul[] seoulAllData(int i)
	{
		Seoul[] seoul=null;
		String path="c:\\javaDev\\";
		if(i==1)
			path+="seoul_location.txt";
		else
			path+="seoul_nature.txt";
		
		FileReader fr=null;
		try
		{
			fr=new FileReader(path);
			String data="";
			int j=0;
			while((j=fr.read())!=-1) // 파일이 종료되기 전까지 읽어라
			{
				// read() => 한글자 읽기 => 정수로 읽는다
				// A => 65
				data+=(char)j;
			}
			
			StringTokenizer st=new StringTokenizer(data,"\n");
			seoul=new Seoul[st.countTokens()]; // 273, 110
			
			// 분리 => 데이터를 seoul[]에 첨부
			i=0;
			// 분리 
			String [] seouls=data.split("\n");
			
			for(String s:seouls)
			{
				st=new StringTokenizer(s,"|");
				seoul[i]=new Seoul();
				// 문자열을 정수형으로 변경
				// nexttoken => 데이터 출력 순서 상관있음 기억하기!
				seoul[i].setRank(Integer.parseInt(st.nextToken()));
				seoul[i].setLoc(st.nextToken());
				seoul[i].setDetail(st.nextToken());
				seoul[i].setAddr(st.nextToken());
				i++;
				
				
			}
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fr.close();
			}
			catch(Exception ex) {}
		}
		
		return seoul;
		
	}
	
	
}
