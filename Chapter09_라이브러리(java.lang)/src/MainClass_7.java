/* *** 305p
 * 
 *  Math : 수학 ==> 대부분 double => 형변환 필요
 *    => Math.random() ==> java.util.Random()
 *                         Random r=new Random()
 *                         r.nextInt(100) => 0~99
 *            | Math => final클래스 => 변경이 불가함
 *                      있는 그대로 사용해야함 (암기!)
 *                      모든 메소드가 static 이다
 *                      => Math는 객체 생성을 하지 않는다
 *     => Math.ceil() : 웹에서 가장 많이 사용
 *                      ----------------
 *                       | 페이징 => 무한 스크롤 => 
 *                         ----- 총 페이지 구하기 => ceil
 *         => 올림 함수
 *            172/10.0 => 17.2 ==> 18 (총 페이지) 
 *            => 배열 => 컬렉션 
 *  System
 *  ------
 *    System.out.println() => 웹 => 확인
 *       정상적으로 사용자가 데이터를 전송했는지
 *       동작 순서
 *       에러 처리 순서
 *   System.gc() => 메모리 해제 요청 , 웹서버 (톰캣)
 *   System.exit() => 프로그램 종료 ==> 윈도우
 *  
 *  ------
 *  *** String / StringBuffer / Wrapper (Integer, Long, Double, Byte, Boolean)
 *  데이터형 ==> 문자열로 변경
 *  문자열  ==> 다른 데이터형으로 변경
 *  -----
 *  => 2진법 , 8진법 , 16진법
 *     ------------------- 10진법 변환 => Wrapper 클래스 역할
 */
import java.util.*;
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.print("총 갯수:");
		int total=scan.nextInt();
		
		// ==>10개씩 나눠서 출력 ==> 총 페이지
		// 이전 1/10  다음
		
		int page=(int)Math.ceil(total/10.0);
		// SELECT CEIL(COUNT(*)/10.0) FROM recipe;
		System.out.println("총 페이지:"+page);*/
		
		int a=10;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));
		//                 -------Wrapper : 데이터형을 원하는 형식으로 바꿀때 사용하는 클래스
		
	}

}
