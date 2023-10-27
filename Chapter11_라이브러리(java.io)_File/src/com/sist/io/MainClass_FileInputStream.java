package com.sist.io;
// => 한글 파일 읽기 => (X) 
// => 다운로드 / 업로드 시 사용
// FileInputStream (X) => 한글 깨짐
// FileReader(O) => 한글 깨지지 않음 
import java.io.*;
public class MainClass_FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis=new FileInputStream("c:\\java_data\\category.txt");
			int i=0; // 한글자씩 읽어온다 => ASC(문자번호)
			// A => 65
			// 파일 끝날 때까지 읽어온다 => -1(EOF)
			// 바이트 스트림 => 한글 파일 읽기 X => 업로드 / 다운로드 시 사용
			String msg="";
			while((i=fis.read())!=-1)
			{
				msg+=(char)i;
			}
			fis.close();
			System.out.println(msg);
		}
		catch(Exception ex) {}
	}

}
