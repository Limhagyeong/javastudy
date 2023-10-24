package com.sist.Music;
// Music을 제어하는 프로그램
import java.io.*;
import java.util.*;
public class MusicManager {
	private static Music[] musics=new Music[49];
	// 접속하는 모든 유저에게 공유 => 목록 => static 
	// 초기화 ==> 클래스 블록에서는 초기화 불가
	/*
	 *  1) 인스턴스 블록 : 인스턴스 변수, static 변수
	 *  2) static 블록 : static 변수 / 인스턴스 변수 초기화 시 객체 생성 필요
	 *  3) 생성자 : 인스턴스 변수, static 변수
	 */
	
	/* 예외에 대한 설명 중 틀린 것은 무엇입니까?
	 * 
	 * ① 예외는 사용자의 잘못된 조작, 개발자의 잘못된 코딩으로 인한 프로그램 오류를 말한다.

      ② RuntimeException의 하위 예외는 컴파일러가 예외 처리 코드를 
        체크하지 않는다.

      ③ 예외는 try-catch 블록을 사용해서 처리된다.

      ④ 자바 표준 예외만 프로그램에서 처리할 수 있다. 
        => 사용자 정의 예외 처리
        
        예외처리 종류 (예외 : java.io , java.net, java.sql)
                                    -------------------
                                     | 웹(네트워크 프로그램)
           = 예외 복구
             try 
             {
               => 정상 수행, 예외가 발생되는 소스
                  -------
             } catch(예외클래스)
             {
               => 예외가 발생했을 때 복구
                => 예외 복구 불가 시 예외 위치 확인
                  => getMessage()
                  => printStackTrace() 
                  => 디버깅 확인 ==> 수정
             }
             
           = 예외 회피  
             => 라이브러리에서 많이 사용 => 개발자 
             => 예상되는 에러를 선언 => 컴파일러가 확인을 안하고 동작
                Method() throws 예외...  (순서가 없다)
             => 처리 방법은 throws 이용 , try catch절 이용
             
           = 임의 발생
             => throw new 예외처리생성자()
           
           = 사용자 정의 예외 처리
             => class MyException extends Exception
                {
                }
                
                
       try-catch-finally 블록에 대한 설명 중 틀린 것은 무엇입니까?

      ① try { } 블록에는 예외가 발생할 수 있는 코드를 작성한다.
                      ---------------------
                       => 사용자 입력에 따라 예외 발생 여부 달라진다

      ② catch { } 블록은 try { } 블록에서 발생한 예외를 처리하는 블록이다.

      ③ try { } 블록에서 return문을 사용하면 finally { } 블록은 실행되지 않는다. 
        => finally는 항상 실행됨

      ④ catch { } 블록은 예외의 종류별로 여러 개를 작성할 수 있다.
      
      
      throws에 대한 설명으로 틀린 것은 무엇입니까?

      ① 생성자나 메소드의 선언 끝 부분에 사용되어 내부에서 발생된 예외를 떠넘긴다.

      ② throws 뒤에는 떠넘겨야 할 예외를 쉼표(,)로 구분해서 기술한다.

      ③ 모든 예외를 떠넘기기 위해 간단하게 throws Exception으로 작성 할 수 있다.

      ④ 새로운 예외를 발생시키기 위해 사용된다. => X (throw)
      
      4. throw에 대한 설명으로 틀린 것은 무엇입니까?

      ① 예외를 최초로 발생시키는 코드이다.
      ② 예외를 호출한 곳으로 떠넘기기 위해 메소드 선언부에 작성된다. => throws
      ③ throw로 발생된 예외는 일반적으로 생성자나 메소드 선언부에 throws로 떠넘겨진다.
      ④ throw 키워드 뒤에는 예외 객체 생성 코드가 온다.
      
      다음과 같은 메소드가 있을 때 예외를 잘못 처리한 것은 무엇입니까?

public void method1() throws NumberFormauException, ClassNotFoundException { ... }

① try{ method1(); } catch (Exception e) { }
② void method2() throws Exception { method1();  }
③ try{ method1(); } catch (Exception e) { } catch (ClassNotFoundException e) { }
   => 예외클래스 크기 순서가 바꼈음 => 큰게 가장 마지막에 내려와야됨
④ try{ method1(); } catch (ClassNotFoundException e) { } catch (NumberFormauException e) { }

다음 코드가 실행되었을 때 출력 결과는 무엇입니까?
public class TryCatchFinallyExample {
	public static void main(String[] args){
    	String[] strArray = { "10" , "2a" };
        int value = 0;
        for(int i = 0; i <= 2; i++ ){
        	try{
            	value = Integer.parseInt(strArray[i]); // value =>10
            } catch(ArrayIndexOutOfBoundException e){ 
            	System.out.println("인덱스를 초과했음");
            } catch(NumberFormatException e) {
            	System.out.println("숫자로 변환할 수 없음");
            } finally {
            	System.out.println(value); => 1. value : 10
            	                              2. 10 / 오류 발생 => 숫자로 변환할 수 없음 => NumberFormatException e
            	                              3. 10 /  오류 발생 => 인덱스를 초과했음 => ArrayIndexOutOfBoundException
            }
        }
    }
}




	 */
	public MusicManager()
	{  
		/*
		 *  try(FileReader fr=new FileReader();)
		 *  {
		 *  }catch(Exception ex) {}
		 */
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\javaDev\\genie.txt"); // FileNotFound
			int i=0;
			String music_data=""; // 속도 느리면 버퍼로 바꾸기
			while((i=fr.read())!=-1)//-1 EOF
			{
				music_data+=(char)i;
			}
			// 1. 한줄씩 데이터 자르기
			     String[] mds=music_data.split("\n"); 
			     i=0;
			     for(String s:mds) // s => 데이터 한 줄
			     {  
			    	 try
			    	 {
			    	 StringTokenizer st=new StringTokenizer(s,"|");
			    	 musics[i]=new Music();
			    	 musics[i].setRank(Integer.parseInt(st.nextToken())); // String이기때문에 형변환 필요
			    	 musics[i].setTitle(st.nextToken());
			    	 musics[i].setSinger(st.nextToken());
			    	 musics[i].setAlbum(st.nextToken()); 
			    	 musics[i].setKey(st.nextToken());
			    	 i++;
			    	 }catch(Exception ex) {}
			     }
		}
			
		catch(Exception ex)
		{
			// 에러 확인
			ex.printStackTrace();
		}
		finally
		{
			// 파일 닫기
			try
			{
				fr.close();
			}
			catch(Exception ex) {}
		}
	}
	public Music[] musiAllData()
	{
		return musics;
	}
	/*public static void main(String[] args) {
		String[] strArray = { "10" , "2a" };
        int value = 0;
        for(int i = 0; i <= 2; i++ ){
        	try{
            	value = Integer.parseInt(strArray[i]);
            } catch(ArrayIndexOutOfBoundsException e){
            	System.out.println("인덱스를 초과했음");
            } catch(NumberFormatException e) {
            	System.out.println("숫자로 변환할 수 없음");
            } finally {
            	System.out.println(value);
            }
        }
	}*/
	
	
	
}
