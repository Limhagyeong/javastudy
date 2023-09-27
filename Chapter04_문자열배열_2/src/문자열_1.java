/*
 *  문자열 저장 => String => ""
 *  한개 저장 
 *    String 변수명=""
 *  여러개 저장
 *    String[] 배열명={"","","","",...}
 *    String[] 배열명=new String[5]
 *    String은 클래스 => 메소드 (기능)
 *                     -----------
 *                  1. 메소드명 : 기능
 *                  2. 결과값 확인
 *                  3. () => 매개변수
 *    => length()
 *      => 원형 : int length() => 문자갯수
 *              ----
 *              String s="Hello";
 *              s.length() => Hello의 문자갯수는 몇개?
 *              ----------
 *              => int len= s.length();
 *    => toUpperCase()
 *      => 원형 : String toUpperCase() => 대문자 변환
 *              -------
 *              String s="Hello"
 *              s.toUpperCase() => 대문자로 변환요청
 *              ---------------
 *              => String ss=s.toUpperCase();
 *    => toLowerCase()
 *      => 원형: String toLowerCase() => 소문자 변환
 *              ------
 *    => substring() => 문자를 자를때
 *      => 원형: String substring (int begin)
 *              ------           -----------
 *               리턴형            매개변수
 *                                ------- 사용자 요청
 *               ----- 요청 처리 결과
 *               => 예) 로그인
 *                     ----- 요청 => id, password => 결과값 boolean
 *                     boolean isLogin(String id, Strinf password)
 *               => String ss= s.substring(1) => 인덱스 1번부터 뒤에 문자를 모두 잘라와라
 *              String substring (int begin,int end) 
 *    => startsWith() : 시작문자열이 같은지 확인
 *      => 원형 : boolean startsWith(String msg)
 *               => if문에서 주로 처리
 *               String s="Hello Java"
 *               if(s.startswith("H"))
 *              => 서제스트 (자동완성 => 검색창 단어 입력 시 연관검색어 등)
 *              LIKE 'A%' => A로 시작하는 모든 단어를 불러와라 (오라클)
 *    => endsWith() : 끝문자열이 같은지 확인
 *      => 원형 : boolean endsWith(String msg)
 *              => 확장자 (jpg,png,gif...) => 갤러리 게시판
 *               LIKE '%A' => A로 끝나는 모든 단어를 불러와라 (오라클)
 *    => contains() : 문자열 포함 여부 확인
 *       => 원형 : boolean contains(String msg)
 *               => 검색 (*******)
 *                LIKE '%A%' => 오라클
 *    => trim() : 좌우 공백 제거
 *      => 원형 : String trim()
 *             => 로그인 입력, 검색어 입력, 회원가입
 *             => 유효성 검사
 *    => equals() : 같은 문자인지 확인 (대소문자 구분)
 *       => 원형 : boolean equals(String msg)
 *              => 로그인 (아이디, 비밀번호)
 *     => replace() : 문자, 문자열 변경 => 데이터베이스
 *       => 원형 : String replace(char c,char c1)
 *                              -------  ------
 *                                old    new
 *                String replace(String s, String s1)
 *                               -------  ----------
 *                                old    new
 *      => valueOf : 모든 데이터형을 문자열로 변환
 *        => 원형 : String valueOf(int a) => boolean b .. (모든 데이터형 사용 가능)
 *        => static : 자동 메모리 할당
 *           String.valueOf() 
 *      => toString() : 생략 가능 => 객체의 주소값을 출력 (원시값)
 *      => indexOf() : 지정된 문자 위치값 확인 (문자번호 0번부터)
 *        => 원형 : int indexOf(char)
 *                 int indexOf(String s)
 *       =>lastIndexOf() : 지정된 문자위치값 확인 (문자번호, length()-1)
 *        => 원형 : int lastIndexOf(char)
 *                  int lastIndexOf(String s)
 *       => concat() : 문자열 결합 (+)
 *         => 원형 : String concat(String s)
 *   -------------------------------------------------------------------
 *       => split() : 특정 문자를 중심으로 잘라서 배열에 저장
 *         => 원형 : String[] split(String regex)
 *                                       ------ 정규식   
 *       => replaceAll()
 *         => 원형 : String replaceAll(String regex)
 *    -------------------------------------------------------------------
 *         
 *           
 *                    
 */
import java.util.Scanner;
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       문자열_1 a=new 문자열_1();
//       // 클래스 저장
//       System.out.println(a);
//       System.out.println(a.toString()); // => toString은 생략이 가능함
		String[] names= {"홍길동","박문수","심청이","이순신","강감찬"};
		// String은 문자저장 제한이 없다
		/*
		 * <<stack>>      <<Heap>>
		 *  names      names[0]  [1]    [2]    [3]     [4]
		 *  ------     ---------------------------------------
		 *    100       "홍길동"|"박문수"|"심청이"|"이순신"|"강감찬"
		 *  ------     |--------------------------------------
		 *           메모리 주소값 (100)
		 *   1. 선언
		 *      데이터형[] 배열명
		 *      데이터형 배열명[]
		 *   2. 초기값
		 *      데이터형[] 배열명={}
		 *      테이터형[] 배열명=new 데이터형[갯수]
		 *      배열명[0]=""
		 *      for문 
		 *      난수발생 ...
		 *   3. 활용 / 변겅, 출력
		 *                ---- for-each
		 *            배열명[0]=""=> 변경
		 */
		// 출력
		for(String name:names) // 실제 저장된 값을 가져온다
		{
			System.out.println(name);
		} // => 속도가 빠르다
		
		// 인덱스를 이용해 출력
		System.out.println("========");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		System.out.println("=========");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 입력:");
		String name=scan.next();
		int index=0;
		
		for(String n:names)
		{
			if(n.equals(name))
			{
				break;
			}
			index++;
		}
		System.out.println(name+"은(는) "+(index+1)+"번째있습니다");
    		   
	}

}








