package com.sist.lib;
/*
 *  java.lang => 자바 소스의 기본 => 많이 사용이 되는 패키지
 *            => import 생략이 가능하다
 *            => java.lang에 있는 대부분의 클래스는 final 클래스가 많다
 *                                            ----------- 
 *                                            확장 불가능 => 변경 불가 (있는 그대로 사용)
 *                                            String
 *                                            StringBuffer
 *                                            Math
 *                                            System
 *                                            Wrapper
 *                                            예외 : Object
 *                                            
 *  => Object : 최상위 클래스 => 모든 클래스의 상위 클래스
 *              (사용자 정의 , 라이브러리 => 모든 클래스는 Object 로 부터 상속을 받는다)
 *              => toString() : 객체를 문자열화 
 *                              기본은 메모리 주소값 출력
 *                              => 오버라이딩 (멤버변수 값 확인)
 *              => clone() : 메모리 주소 복제 => 새로운 메모리 생성
 *              => finalize() : 소멸자 함수 => 메모리 해제 시 자동 호출
 *  => System : 출력, 메모리 해제 , 프로그램 종료
 *              = *** println() : 에러 출력
 *                                멤버변수 값 확인
 *                                전송 값 확인
 *                윈도우 / 브라우저 => 자체 출력 => 디버깅 역할
 *              => gc() : 가비지 컬렉션을 호출해서 메모리를 비워줌
 *                 => 멀티미디어, 애니메이션
 *                    ==> 실시간 도로 cctv
 *              => exit() => 종료
 *                    ---- 0(정상), 비정상
 *  => Math : 수학 => 모든 메소드가 static
 *            => 메모리 할당을 하지 않는다
 *            => Math.메소드
 *            => *** random() => 리턴형 double=0.0~0.99
 *            => *** ceil() => 올림함수 => 총 페이지 구하기
 *  => StringBuffer : String을 보완 => 문자열 결합 시 최적화
 *            => *** append()
 *  => String : 문자열 관리하는 클래스
 *      
 *                   
 */

/*
 * 1.  문자열이 지정한 문자로 시작하는지 판단 같으면 true반환 아니면 false를 반환한다.(대소문자구별)
                   --------
     ***public boolean startsWith(String s)
        => 검색기 만들 때 사용 
        
2. 문자열 마지막에 지정한 문자가 있는지를 판단후 있으면 true, 없으면 false를 반환한다.(대소문자구별)
        public boolean endsWith(String s)

3. 두개의 String에 값만을 비교해서 같으면 true, 다르면 false를 반환한다.(대소비교)
                ----------
   객체 생성 
   -------
    => 모든 값을 저장 할 수 없다
    => 모든 값을 저장하기 위해서 메모리를 모아서 저장
                          ---------------- Heap
    => 객체에는 heap에 저장되어 있는 메모리 주소를 가지고 있다
                               -------- 참조변수
    (주소 비교시에는 ==, 실제 저장된 값을 비교 equals)
    
    *** public boolean equals(String s)
        => 웹 : 로그인, 아이디 찾기, 아이디 중복
          -- CRUD (게시판) => 회원가입 => 로그인 
          -- 목록 (페이지 나누기) => 상세보기 (댓글)
          -- 최신방문 (쿠키), 로그인 상태 유지(세션)
        => 대소문자 구분해서 비교

4. 지정한 문자가 문자열에 몇번째에 있는지를 반환한다.
             ------------
          String => char[]을 이용한 클래스
                    ------
                    => 문자열의 번호 => 0번부터 시작
                    
          String s="Hello Java";
                    0123456789
                  => {'H','e','l',...,'v','a'}
          public char charAt(int index)
           

5. 문자열에 지정한 문자가 마지막몇번째에 있는 int를 반환한다.
          -------------------
          ***public int lastindexOf(char c)
          public int lastindexOf(String s)
          ----------------------------------
            오버로딩 => 객체지향의 3대 특성(다형성) => 오버라이딩(재정의)
              = 한 클래스에서 만들어진다
              = 같은 메소드명 이용
                ex) 버스 => 버스(좌석) 버스(마을) 버스(고속) ==> 매개변수가 다름
              = 매개변수의 갯수나 데이터형이 다른 경우
              = 리턴형은 관계 없다
              = 접근지정어도 관계 없다
                대표적) 생성자, println()
              = 중복 메소드 정의
              = 면접 => 협업 / 프로젝트의 어려운 점
                => 형상관리 (git)

6. 문자열의 길이를 반환한다.
   => length() 
   => ***public int length()
   => 비밀번호 / 글쓰기
              ------ 오라클의 지정된 문자 갯수를 초과하면 오류가 난다
              => 오라클은 문자의 갯수 지정
              => title VARCHAR2(1000) => 한글은 300글자까지만 입력 가능
                 => 한글은 3byte
      ------ 8자리 

문자열에 지정한 문자" "가 있으면 새로 지정한 문자" "로 바꿔서 출력한다.
                          -------------------------
   => ***replace : 변경
      public String replace(char c)
      public String replace(String s)
      => 오라클 => 값을 저장
                 ------- 이미지 => & , || 의 사용 의미가 다름
                 & : Scanner ==> & , # ==> URL 주소 복붙 시 활용
                 || : 문자열 결합
                 
                 크롤링 => 화면출력 (기능)


정규표현식을 지정한 문자로 바꿔서 출력한다.
 => replaceAll(String  regexp, String s)
              --------------- 정규식, split()
              공부 : 데이터 분석 (챗봇)
 => 패턴 (문자열의 형태) 
 => 맛집 => 어떤 맛에 대한 통계를 내본다
           짜다 싱겁다 맵다 ...
           ---
           짜다, 짜고, 짜니 ...
            |
           짜+ => 짜로 시작하고 한글자가 더 붙은 데이터를 가져온다
 => 기호 (+ , ^ , $ , . , |) ==> 자체 출력 => \\+
지정한 문자로 문자열을 나눌수 있다.(배열로 반환)
     public  String[] split(String regexp) => 정규식 이용
     => java.util => ***StringTokenizer
     
10. 문자열에 지정한 범위에 속하는 문자열을 반환한다.(시작범위에 값은 포함하고, 끝나는 범위에 값은 포함하지않는다.)
          ---------
          public String subString(int b)
          => b부터 전체 반환
          public String subString(int b, int e)
          => b부터 시작 ~ e-1번까지 접근  
                       ------------- 가장 마지막 데이터 제외
          *** 원본은 변경되지 않는다 
          String s="Hello Java"
                    0123456789
          s.subString(6) => Java // s자체가 변경되는 것은 아님!
                

11.  문자열에 대문자를 소문자로 변환한다.
     toLowerCase()

12. 문자열에 소문자를 대문자로 변환한다.
    toUpperCase()

13. 문자열을 그대로 반환해준다.


14. 문자열에 공백을 제거해 준다.
    *** public String trim() => 좌우에 있는 공백만 제거 가능하다

15. 지정한 개체의 원시 값을 반환 (데이터형을 문자열로 변경)
              ------- 주소값
     toString() => Object가 가지고있는 toString()을 오버라이딩
     ----------- 문자열 반환 => 데이터형을 문자형으로 변경
 
16. 두개의 String을 비교해서 비교대상 String을 포함하고 있으면true, 다르면 false를 반환한다.
    *** 검색 시에 주로 사용
    *** public boolean contains(String s)

17. 지정한 index번째에 문자를 반환한다.
      public char charAT(int index) => 0번부터 시작       

18. 문자와 문자를 결합해준다.
     public String concat(String s) ==> +
        => MySQL은 문자열 결합 시 => concat()을 이용한다 ==> 기억해야하는 이유
        => 오라클은 문자열 결합 시 => ||를 이용한다
     String s="A";
     String s="B";
     s.concat(s1) => "AB"
     
     s+s1와 동일

19. 서식문자열을 이용해서 서식화된 문자열을 반환한다.

    String.format("%d%d%d",10,20,30)
    ------ static 
    public static String format(String s,Object...obj)
                                               ---- 가변 매개변수
 
1. 객체의 복사본을 만들어 리턴한다.
   ***clone()

2. 현재 객체와 매개 변수로 넘겨 받은 객체가 같은지 확인하다. 같으면 true를 다르면 false를 리턴한다.
   equals() 
3. 현재 객체가 더 이상 쓸모가 없어졌을 때 가비지 컬렉터에 의해서 이 메소드가 호출된다.
   finalize()
4. 객체를 문자열로 표현하는 값을 리턴한다.
   toString()
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Hello Java";
        System.out.println(s.substring(6));
        System.out.println(s);
        		
	}

}
