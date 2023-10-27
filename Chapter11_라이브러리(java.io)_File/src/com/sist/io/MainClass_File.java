package com.sist.io;
/*
 *  데이터 저장 ====== 데이터 가공 ===== 데이터 출력
 *  변수 : 한개 저장    연산자		    도스출력
 *  배열   		     제어문			윈도우***
 *  클래스 			------메소드      브라우저
 *  ----- 메모리 
 *  파일 *** 
 *   => 업로드, 다운로드, Open API
 *  오라클 (RDBMS)
 *   => JDBC = DBCP = ORM
 *                    (라이브러리: 마이바티스, JPA)
 *  ------------------------------------------------------
 *   사용자 정의 클래스 
 *   + 라이브러리
 *   ----------------- 한개의 프로그램 완성
 *   라이브러리 
 *    = java.lang => Object, String, Math, Wrapper
 *    				 **StringBuffer
 *    = java.util => Date, StringTokenizer
 *    				 List, Map
 *    				 ** Set (보충정도), Calendar
 *   ------------------------------------------------------
 *    = java.io => File, FileInputSystem, FileOutputSystem
 *    			   FileReader, FileWriter
 *    			  => BufferedReader
 *     		      ** ObjectInputStream / ObjectOutputStream
 *    = java.net => URL / URLEncoder / Socket
 *    = java.sql => Connection / Statement / ResultSet
 *    = java.text => DecimalFormat / SimpleDateFormat
 *    자바 ==> 2차 자바 : 브라우저 (Web)
 *    		  3차 자바 : Spring(핵심!)
 *    ------------------------------------------------------
 *    1) IO 
 *       Input Output => 입출력
 *       -------------
 *        = 메모리 입출력
 *        = 파일 입출력
 *        = 네트워크 입출력
 *        ---------------> 클래스가 동일
 *     입출력 방식 
 *     --------
 *     
 *     메모리(데이터 저장) ====== 자바 응용 프로그램 ======= 화면 출력
 *     파일, 네트워크        |				       |
 *     				   InputStream		    OutputStream
 *     					  |					   |
 *   				   일반 파일(.zip, .png)    Writer
 *   			       => 1byte => 바이트 스트림
 *   				   문자 저장 파일(.txt, .dat)
 *   				   => 2byte => 문자 스트림
 *      				  ** 영어외의 다른 언어 
 *      					 => 한글자당 2byte
 *      				 Reader 
 *    ---------------------------------------------------------- 
 *        *** 스트림 : 데이터 이동 통로
 *            ----- 읽기/쓰기 => 단방향 통신 => 두개 프로그램 동시에 수행 (스레드)
 *                  => 네트워크 
 *                  => 웹에서는 이미 서버가 만들어져 있다
 *                     => 기능 추가 (톰캣=자바엔진=테스트서버)
 *                                 --- 50명이 최대
 *        바이트 스트림 (1byte) => 업로드, 다운로드, 카페 ...
 *         InputStream          OutputStream
 *             |                      |
 *         ***FileInputStream      ***FileOutputStream
 *         FilterInputStream     FilterOutputStream
 *               |                       |
 *            ***ufferedInputStream     ***BufferedOutputStream
 *            => 메모리에 전체를 저장 (속도가 빠르다)
 *            ***ObjectInputStream   ***ObjectOutputStream
 *            => 객체단위로 저장 (***)
 *        문자 스트림 (2byte) => 파일 제어(한글) => 파일 읽기/쓰기
 *          Reader          Writer
 *            |               |
 *         **FileReader      **FileWriter
 *            |               |
 *       **BufferedReader     BufferedWriter
 *       
 *       **** 독립적인 클래스 
 *       	  File : file, directory => 포함
 *       **** 
 *          바이트스트림 (1byte씩 송수신 담당) => 자료실 (업로드, 다운르드)
 *                    => 갤러리 게시판, 후기 게시판
 *          문자스트림 (2byte씩 송수신 담당) => 한글 파일 읽기 / 저장
 *          		  *** 한글은 한 글자당 2byte => UTF-8
 *          			  --------------------------- Git 언어 통일
 *          보조스트림 : 읽는 속도, 쓰는 속도르 빨리하기 위해 미리 메모리에 올려 놓고 시작
 *          		  String / StringBuffer
 *               => Buffered~
 *               => 전체를 메모리로 이동 => 메모리에서 제어
 *          파일
 *           File => 정보
 *           파일 읽기 : FileInputStream / FileReader
 *            => String은 저장이 불가능
 *               => byte[]로 변경해서 저장
 *           파일 쓰기 : FileOutputStream / FileWriter
 *           => String 자체를 저장
 *          
 *          네트워크 
 *           => OutputStream (1byte)
 *           => BufferedReader (2byte로 변환 후 수신)
 *       ===> 메소드 : read(), write(), close()
 *       ===> IO는 반드시 예외처리를 해야한다 (체크 예외처리)
 *       
 *       *** File => 일반 클래스
 *           => 파일의 정보 읽기 => 생성자를 이용한다
 *           => file 
 *              new File("경로명\\파일명")
 *           => directory
 *              new File("경로명")
 *           => 주요 메소드
 *              1) 파일 특성
 *                 = 읽기 전용 => boolean canRead()
 *                 = 쓰기 전용 = boolean canWrite()
 *                 = 숨김 파일 = boolean isHidden()
 *              2) 파일 정보
 *                 = 파일명 => String getName()
 *                 = 경로명 + 파일명 => String getPath()
 *                 = 경로명 => String getParent()
 *                 = 파일 크기 => long length()
 *                 = 수정일 => long lastModified()
 *              3) 파일 종류
 *                 = 파일 : boolean isFile()
 *                 = 폴더 : boolean isDirectory()
 *              4) 파일 , 디렉토리 만들기 
 *                 = createNewFile() => 파일 만들 경우 사용
 *                 = mkdir()
 *              5) 삭제
 *                 = delete() => 폴더 삭제 시 파일이 존재하면 삭제가 안된다
 *                   rm 파일명 , rm -rf ==> 리눅스
 *                  => AWS (리눅스=명령어)
 *              6) 존재여부 확인
 *                 **
 *                 7) 폴더에 있는 모든 파일 읽기 
 *              
 *                 
 *                 
 */
// 폴더 전체 
import java.io.*;
public class MainClass_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		   // directory 확인
			File dir=new File("c:\\javaDev");
			// window => \ , max,linux => /
			// \는 반드시 두개(\\)를 사용해야한다
			// 가급적이면 절대경로를 이용한다
			// . (현재 폴더) / .. (상위폴더) => cd (change directory)
			// 폴더안에 있는 폴더 / 파일 읽기
			File[] list=dir.listFiles();
			// 출력
			for(File f:list)
			{
				//System.out.println(f.getName()); => 모든 파일 읽기
				if(f.isFile())
				{
					System.out.println(f.getName()+"(file)");
				}
				else if(f.isDirectory())
				{
					System.out.println(f.getName()+"(directoty)");
				}
			}
		}
		catch(Exception ex) {}
	}

}
