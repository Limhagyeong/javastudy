package com.sist.io;
// BufferedOutputStream => 파일 쓰기
import java.io.*;
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\sawon.txt");
			BufferedOutputStream bos=new BufferedOutputStream(fos); 
			String data="홍길동|개발부|서울|대리|3600\r\n";
			bos.write(data.getBytes());
			bos.close(); // File을 연결해서 처리
		}
		catch(Exception ex){}
		
	}

}
