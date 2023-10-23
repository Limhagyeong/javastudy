package com.sist.exception;
/*
 *  1. 자바 문법
 *     => 변수 / 연산자 / 제어문
 *     => 사용자 정의 클래스
 *        => 멤버변수 / 메소드 / 생성자
 *        => 클래스의 종류 => 인터페이스
 *        
 *    => 에러 방지 : 예외처리
 *    예외처리 : 사전에 에러를 방지하는 프로그램
 *            => 비정상 종료를 방지하고 정상수행
 *    => 자바에서 지원하는 예외처리
 *       1) 고려 => if문 => 예외처리
 *       2) 예외처리 대상
 *          CheckedException : 컴파일 시에 예외처리가 되어 있는지 확인
 *          => 반드시 예외처리를 한다
 *             io(입출력), net(네트워크), sql(오라클 연결)
 *             => 웹
 *          UnCheckedException : 사용자의 입력에 따라
 *          => 예외처리 하지 읺을 수도 있다
 *       3) 예외처리 방법
 *        ----------------------------------------------- ***
 *          = 예외 복구 => 에러를 받아서 처리 => catch (예외가 복구되는 위치)
 *            1. 형식
 *               try
 *               {
 *                  => 정상수행 할 수 있는 소스 코드
 *                  => 모든 소스, 부분 소스
 *               }catch (예외처리 종류)
 *               {
 *                  => try에서 에러가 발생 시 처리하는 문장
 *                  => 복구는 거의 X
 *                  => 에러의 위치 
 *                     printStackTrace()
 *                  => 에러 정보
 *                     getMessage()
 *                  => 에러 수정 목적
 *               }
 *               ---catch는 여러개 사용이 가능하다 => 전체 => Exception 하나로 통일해서 사용해도 된다
 *               finally
 *               {
 *                 => 생략 가능
 *                 => 사용처 : 서버 종료, 오라클 연결 해제, 파일 닫기 ...
 *                 => 에러 발생 여부와 관계없이 무조건 수행하는 문장
 *                    ------------------------------------
 *                    try수행 (정상 수행) , catch수행 (에러 발생)
 *                    ------------------------------------
 *                                    |
 *                                 무조건 수행하는 문장
 *               }
 *               
 *               동작 순서
 *               try
 *               {
 *                 문장 1
 *                 문장 2
 *                 문장 3
 *               }
 *               catch (Exception e)
 *               {
 *                 문장 4
 *               }
 *               finally
 *               {
 *                 문장 5
 *               }
 *               
 *               => try에 에러가 없는 경우
 *                   1 => 2 => 3=> 5 ====> catch절은 수행하지 않는다
 *                                ---- finally는 수행한다
 *                                
 *               => 문장 2에서 에러 발생하는 경우
 *                   1 => 4 => 5
 *                               
 *          = 예외 회피 => JVM에 미리 알려준다 =>  RunTimeException은 생략이 가능하다
 *                    => 이런 에러가 발생할 수 있다
 *            문법)
 *                 메소드() throws 예외처리의 종류 ..
 *                 메소드() throws Exception, NumberFormatException 
 *                 => 예외처리 순서가 없다
 *                 => try~catch  => 예외처리 순서가 있음 (상속도에 따라서)
 *                 => throws => 예외처리 순서가 없다
 *                 => 사용자 정의는 throws문장 사용 거의 X
 *                 => throws문장은  try위치를 잘 모른다 or 이미 완료된 소스에 예외처리가 필요하다면 붙여준다
 *           
 *            *** 예외처리의 목적 => 프로그램의 비정상종료 방지
 *                 예) 로그인 => 입력이 안된 상태 => 종료 (X)
 *            
 *            => 라이브러리 뒤에 많이 붙어 있다
 *               =========
 *               1) throws 
 *               2) try~catch
 *               
 *               예) 
 *                  void insert() throws Exception
 *                    => insert를 호출하기 위해서는 예외처리를 하고 사용한다
 *                  void method()
 *                  {
 *                     insert() => 오류
 *                  }
 *                  
 *                  => void method() throws Exception
 *                      {
 *                         insert()
 *                      }
 *                      
 *                      void method()
 *                      {
 *                        try
 *                        {
 *                           insert()
 *                        }catch(Exception ex) {}
 *                      }
 *                    => Thread.sleep(1000);로 확인 해보기
 *                
 *         -----------------------------------------------
 *          = 임의발생 => 테스트
 *          = 지원하지 않는 예외 => 사용자 정의 예외 
 *                    
 *             
 *  2. 라이브러리 => 암기 
 *      java.lang
 *        =>  Object, String, StringBuffer, Wrapper
 *      java.util
 *        => Date, Calendar, StringTokenizer
 *        => Collection
 *          => ArrayList (데이터베이스) / HashSet / HashMap
 *      java.io
 *        => 업로드 / 다운로드 => 파일 관련
 *      java.net => 흐름(크롤링=> 프로젝트) URL
 *   ----------------------------------------------- ***
 *     java.sql = 자바에서 오라클 연동 
 *       Connection, Statement, ResultSet
 *  -----------------------------------------------
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	}

}
