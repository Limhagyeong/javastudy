
/*
 * 자바 => 문자열 (웹, 윈도우) => 가장 많이 사용되는 데이터형
 *              -------- 대부분 문자열을 가지고있다
 * 문자열의 사용법 
 * -----------
 * => 데이터형 
 *    String : 일반 데이터형 , 클래스형으로 사용이 가능
 *             ----------
 *                 |
 *             String name="홍길동";
 *             String name=new string("홍길동");
 *             ** 문자열의 저장 갯수는 제한이 없다
 *                ------------------------
 *   String => 클래스형으로 만들어져 있다
 *   ------ char[] => 클래스화 시킴
 *   "Hello Java"
 *    0123456789 => 배열형식 ==> 문자열 번호는 0번부터 시작
 *                             (오라클은 1번부터 시작함, MySQL: 0번부터 시작)
 *   => {'H','e',...,'v','a'} 와 동일함 (공백포함)
 *   String은 기능(메소드)
 *     *** 라이브러리 (변경해서 사용 할 수 없다)
 *          final class
 *          java.lang에 있는 대부분의 클래스는 final 
 *          --------- String, Math, System, ...
 *   ------------------
 *   변환 
 *    toUpperCase() => 대문자 변환
 *    toLowerCase() => 소문자 변환
 *    *******valueOf() => 모든 문자를 String으로 변경*******
 *    int a=10;
 *    valueOf(a) ==> "10"
 *    valueOf(a)+100 ==> "10100"
 *     
 *   제어
 *    substring() : 문자 자를 때 사용
 *    
 *   변경
 *    trim() : 좌우 공백 제거
 *    replace() : 문자열을 변경
 *    replaceAll() : 변경(정규식 이용)
 *    split() : 문자를 잘라 배열에 저장
 *    
 *   찾기
 *    indexOf() => 앞에서부터 위치 찾기
 *    lastIndexOf() => 뒤에서부터 위치 찾기
 *   
 *    "Hello Java"
 *            - -
 *            1 2
 *    1. indexOf()
 *    2. lastIndexOf()
 *    
 *   결합
 *    concat() ==> + (문자열 결함)
 *   비교
 *    equals() => 같은 문자열인 경우 (로그인 처리, 아이디찾기...) 
 *    contains() => 문자열이 포함되어 있는 경우 (검색)
 *    startsWith() => 시작 문자열이 같은 경우 (Cookie=> 웹사이트 검색 시 연관검색어)
 *    endsWith() => 끝문자열이 같은 경우
 *   기타 
 *    charAt() => 문자중에 한개의 char 얻는다
 *    toCharArray() => char[]
 * 
 */
import java.util.Arrays;

public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기능 처리 = 메소드 : 기능처리 한 후에 반드시 결과값을 보내준다
		// 결과값 : 리턴형
		// double Math.random()
		// String => char[] toCharArray

//		String s = "Hello Java";
//		System.out.println(s);
//
//		char[] c = s.toCharArray();
//		System.out.println(Arrays.toString(c));
		
		char[] arr=new char[10];
		// 초깃값 부여
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
		
//		System.out.println(Arrays.toString(arr));
//		
//		String s=String.valueOf(arr);
//		System.out.println(s);
		// char[] => String valueOf 
		// String => char[] toCharArray
		// charAt() => char
		/*
		 *  Hello Java
		 *  0123456789
		 *  
		 *  charAt(4) => 'o'
		 */
		String s="Hello Java"; // "" ''
		for(int i=0;i<10;i++)
		{
			char c=s.charAt(i);
			System.out.println("c="+c);
		}
		
	}

}
