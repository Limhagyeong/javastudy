package com.sist.exam;
/*
 *    Thread
 *   -------- 모든 프로그램에 한개 이상 존재
 *   			  ------- 프로세스
 *            => 프로그램 안에서 여러개의 프로그램을 동시에 수행
 *            => main => Thread
 *    => 서버에는 반드시 쓰레드를 필요로 한다
 *      ----- 여러명이 접근시에 통신부분을 따로 수행
 *      ----- 클라이언트 <==> 쓰레드 : 멀티 쓰레드
 *    => 사용처 (사용자 정의 쓰레드)
 *    	 1. 데이터 수집 => 20만개 (1만개씩 => 20개 => 빠른 속도!)
 *       2. 네트워크 서버 => 서버를 여러개 수행
 *       3. 게임 (비행기...) => 비행기 , 총알
 *       4. 웹 서버
 *       	------ 아파치 / IIS => 톰캣(테스트용 => 웹서버)
 *          					 => WAS
 *       5. 데이터베이스 서버 : 오라클 (서버)
 *       ---- 서버는 한개만 수행 (사용자 요청에 대한 처리 ==> 쓰레드)
 *    => 사용자 정의 쓰레드
 *    	 => 서버개발자
 *    	 => 서버측 사이드 (서버에서 동작하게 코딩) => Back-End
 *    	 => 방법 1.
 *    		쓰레드 상속
 *    		public class MyThread extends Thread
 *          {
 *             Thread 확장
 *             public void run()
 *             {
 *                => 쓰레드가 동작할 수 있게 만들어줌 => 한가지 일만 수행
 *             }
 *          }
 *         
 *          방법 2. 
 *           => 확장 없이 동작!
 *           인터페이스 구현 => 윈도우에서 주로 사용
 *           public class MyThread implements Runnable
 *           {
 *              public void run()
 *             {
 *                => 확장 없이 쓰레드가 동작
 *             }
 *           }
 *           
 *           방법 3. 
 *           => 익명의 함수 () => run : 람다식 (메소드명 없이 사용 => 코딩이 간결)
 *                단점 : 재사용(객체지향을 벗어난다)
 *                Runnable r=()->{
 *                   구현 
 *                }
 *           => JavaScript에서 자주 사용
 *              function aaa(){}
 *              let aaa() => {}   ======> 선호! (람다식 = 화살표함수)
 *              
 *        => 쓰레드의 생명주기 (생성~소멸)
 *        쓰레드 생성
 *        => Thread => java.lang
 *            ***** run()은 호출하지 않는다!
 *                  start(){run()} ==> start 호출 시 자동 호출됨! ******
 *        new Thread() ======>    start() ===============================> run() ***
 *        쓰레드 생성     ======> 대기상태 (쓰레드 필요한 자원 확보 : 좌표점, 이미지 등) ===> 쓰레드 동작 =====> 일시정지
 *         																		   | interrupt () | sleep()
 *         																		쓰레드 종료        
 *        => start() => run() 수행
 *        => sleep() => 일시정지
 *        => interrupt() => 쓰레드 소멸 
 *        => 쓰레드는 시분할 프로그램
 *                  ---- 나눠서 작업
 *        예) 
 *            1~10 => 출력
 *            
 *            => new Thread() => 1 2
 *               1) JVM
 *                  => 이름 부여 => Thread-0 => 변경 가능!
 *                  => 우선 순위 => 사용자 정의 => 5
 *                     1~10 => 5
 *                     10 => main (지시) : 속도가 가장 빠름
 *                     1 => gc (가비지컬렉션 => 메모리 회수)
 *            => new Thread() => 1 2 ...    => 순서대로 한번씩 돌림 (1~10까지 동작 X => 1,1,1 / 2,2,2 => 작동 순서는 랜덤으로 배정됨)
 *            => new Thread() => 1 2
 *       
 */
class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(getName()+":"+i);
			try
			{
				Thread.sleep(100); //  1/1000 단위 => 0.1초당 한번씩 멈춤
			}catch(Exception ex) {}
			
		}
	}
}
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 쓰레드 객체 생성
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread(); 
		
		// 동작 명령 => run() 호출 => start 호출하면 자동 호출!
		t1.start(); // Thread-0
		t2.start(); // Thread-1
		t3.start(); // Thread-2
		
		// 실행 시 가장 먼저 종료되는 쓰레드가 우선순위가 높음! => 끝나는 순서는 랜덤배정 / 번갈아가면서 한번씩 수행
		// ----------------- => 우선호출                                     => 비동기화
		
	}

}



