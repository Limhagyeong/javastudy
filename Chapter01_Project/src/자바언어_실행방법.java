/*
 *  교제 2~5P
 *  자바 언어의 특징
 *  ------------
 *   1) 실행방법 
 *      = 컴파일 방식 ==> 2진파일로 변경 (컴퓨터가 인식하는 언어)
 *                     C / C++ ... , java
 *                     기계어 
 *         *** 자바의 특징 
 *             컴파일
 *                C/C++ => 컴파일 시, 운영체제마다 다른 컴파일을 한다
 *                      => 컴파일된 내용이 다르다
 *                 Java => 운영체제마다 동일
 *                 => 컴파일된 파일 : 바이너리 코드
 *                                ----------
 *                                One Write
 *      = 인터프리터 방식 ==> 한줄씩 번역해서 실행
 *                 HTML / CSS 
 *      = 보안이 뛰어남 => 두번을 검색하기 때문 (소스검증)
 *        => 해킹 당한 후 인증 시스템으로 변경
 *         
 *                자바소스
 *                  ㅣ
 *                 JVM
 *                  ㅣ => 파일 (d11)
 *          ----------------                 
 *          ㅣ       ㅣ     ㅣ
 *          리눅스    윈도우  MAC
 *     = 실행과정
 *             기계어로 변경 (javac)         한줄씩 번역 (java)
 *     A.java =================== A.class==============> Hello java!
 *     프로그래머 코딩      ㅣ          바이너리 코드     ㅣ
 *                     컴파일                    인터프리터
 *     => 편집기 : 이클립스. 인텔리J (파이참)
 *               ----------------- 어시스트 용이하여 두가지 자주 사용
 *                       ㅣ
 *                       javac+javac => ctrl+f11
 *               ----------------------------
 *                            ㅣ
 *                 자바 파일 목록 ㅣ
 *                            ㅣ    소스 코딩
 *                            ㅣ
 *              ------------------------------
 *              OUT PUT : 화면출력
 *              -------------------------------            
 *              다운로드 : eclipse.org => J2EE
 *              
 *       교제 6P : 개발환경 구축
 *                JDK => 17버전 이상은 한글 제어 문제
 *                https;//jdk.java.net
 *                --> 스프링 (14버전)
 *                    스프링 (STS => 3, STS => 4 : Boot)
 *                          Framework+Boot
 *       => JDK 환경설정
 *          ----------
 *          path : c:/jdk-17.0.2/bin
 *          classpath :   .;c:/jdk-17.0.2/bin
 *          
 *        교제 11P : 이클립스로 파일 생성하는 방법
 *                  => 프로젝트 폴더 만들기
 *                  => src => 자바 파일 생성
 *                            ------------- class파일 생성
 *                   => 주의점 
 *                      파일명과 클래스명이 반드시 동일해야함!!
 *                      대소문자 구분 필수
 *                      
 *                    => 개발자의 약속
 *                       1) 헝거리언식 표현법
 *                       2) 변수, 메소드 => 소문자
 *                          상수 => 전체를 대문자
 *                       3) 명령어 종료 시 ;
 *                       4) {} 일치
 *                       5) 모든 자바 파일은 main이 있어야 실행이 가능
 *                         
 *                 => 주석 (번역이 되지 않는 코드)
 *                    // 한줄 주석 
 *                    => ctrl+shift+/
 *                    =>  ctrl+shift+\
 *                    =>  화면 출력
 *                       sysout => ctrl+space
 *                       
 *                    자바의 구성도
 *                    class A ==> 클래스 시작
 *                    {
 *                       public static void main(String[] args) => 메인
 *                     {
 *                         system.out.println("Hello"); 화면출력
 *                         } => 메인 종료
 *                       } => 클래스 종료                 
 *       
 *       
 *       
 *       
 *       
 */
public class 자바언어_실행방법 {
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hello java!");
        System.out.println("Hello java!");
        System.out.println("Hello java!");
        System.out.println("Hello java!");
        System.out.println("Hello java!");
        System.out.println("Hello java!");
	}

}
