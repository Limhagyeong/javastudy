package com.sist.io;
// BufferedInputStream => 파일 데이터 읽기 
import java.io.*;
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			// 1byte => 한글 깨짐!
			FileInputStream fis=new FileInputStream("c:\\javaDev\\genie.txt"); // 파일 읽기
			BufferedInputStream bis=new BufferedInputStream(fis); // 파일 읽기 => buffered 사용해서 파일 메모리에 저장 => 사용 편리해짐 (속도 최적화)
		    int i=0;
		    while((i=bis.read())!=-1)
		    {
		    	System.out.print((char)i);
		    }
		    bis.close();
		}
		catch(Exception ex) {}
		
	}

}
