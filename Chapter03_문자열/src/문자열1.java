/*
 *   문자열 
 *   문자 '' => 한글자 저장 => char
 *       'a', 'b', 'c' ==> 한번에 저장이 가능한 공간 => String => ""
 *   일반 데이터형
 *    String name="홍길동"; ==> 제어 
 *   클래스형
 *    기능 => 메소드
 *   => 웹은 데이터형이 없다 => 모든 데이터형이 문자열
 *   "1"
 */
 import java.util.Scanner;
public class 문자열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // 저장방법
		String name="홍길동";
		System.out.println(name);
	   	
	    char a='홍';
	    char b='길';
	    char c='동';
	    System.out.println(a+""+b+""+c);
	    
	    String addr="서울특별시 강남구 도산대로51길 14 1F";
	    System.out.println(addr);
	    
	    Scanner scan=new Scanner(System.in);
	    System.out.print("검색어:");
	    String findData=scan.next();
	    System.out.println(findData);
	
	
	}

}
