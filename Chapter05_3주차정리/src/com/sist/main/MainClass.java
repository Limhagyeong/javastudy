package com.sist.main;
/*
 *  1. 객체지향 프로그램 (클래스를 만드는 목적)
 *     ------------ 
 *       1) 재사용 가능 
 *          = 상속 => 기존의 클래스를 변경해서 사용할 목적
 *            class GenieMusic
 *            => class Melon extend GenieMuic
 *                     ------------ 기존의 클래스를 확장
 *                     
 *          = 포함 => 기존의 클래스를 그대로 사용
 *            class Melon
 *            {
 *              GenieMusic gm=new GenieMusic();
 *            }
 *       2) 필요한 데이터를 보호 : 데이터 보호 (캡슐화)
 *          => 접근지정어 : private => 클래스에서 사용하는 멤버변수는 은닉화 
 *                               => 메소드에서 기능을 제작
 *                                  -----------------
 *                                   읽기(getter) / 쓰기(setter)
 *       3) 수정이 가능 / 추가 가능 => 다형성 
 *          --------   --------
 *          오버라이딩    오버로딩          
 *  -------------------------------------------------------------------------------
 *     목적 ==> 유지보수 쉽도록! => 가독성 (리팩토링) 
 *             개발 => 비중: 개발 < 유지보수   ===> 객체지향 중요한 이유
 *                         (1년) (10년)  
 *  2. 클래스를 만드는 과정
 *     1) 클래스 구성요소
 *        class MainClass
 *        {
 *          --------------
 *          변수 => 1개의 데이터를 저장
 *          인스턴스 변수
 *           => 메모리 여러개를 따로 저장해서 사용이 가능
 *              -------------  new => 중심
 *          공유 변수 , 클래스 변수 : static => 메모리 컴파일러에 의해 자동으로 생성됨 (한개)
 *                                      => 데이터 목록
 *          
 *          예)
 *             String name; => 자동 초기화 : class인 경우 : null
 *                null => 주소가 지정이 안된 경우 [클래스 객체는 반드시 메모리 주소값을 가지고있어야함] 
 *             A a; => null (a=null)
 *               a= new A(); ==> ** NullPointerException
 *             int age; => 0
 *             String address; => null
 *             String phone; => null
 *             double ki; => 0.0
 *             char c; => '\0'
 *             boolean b; => false ==> 한번은 메모리에 저장해줘야함 => 필요한 값으로 변경 선언, 사용
 *                                 =======> 초기화블록 or 생성자 이용!
 *             
 *             유지보수 편의를 위해 위 형식을 권장
 *             String name, address, phone (X)
 *          
 *          ***** 데이터(변수)는 반드시 외부에서 접근, 변경, 손실할 수 없도록 함 => 은닉화
 *                private ==> 모든 변수
 *          --------------
 *          생성자 => 접근이 가능 => public 
 *               => 무조건 생성하는 것이 아니다
 *               클래스에는 반드시 생성자가 있어야 한다
 *               -----------------------------
 *                => 생성자가 없는 경우에는 컴파일러가 자동으로 생성한다
 *                                    -------------------
 *                                           |
 *                                     매개변수가 없는 생성자 (디폴트 생성자)
 *                                     
 *               class A
 *               {
 *                 => 자동 생성 => A(){}
 *               }
 *               class A
 *               {
 *                 A(int a){} => 생성자가 존재 => 자동추가가 안된다
 *               }
 *               
 *               *** 컴파일러가 자동 생성
 *               1) import : import java.lang.*
 *                           --------------------
 *                            | String, System, Math
 *               2) void method()
 *                  {
 *                     return; => 생략하는 경우 => 자동추가
 *                  }
 *               3) 자바의 모든 클래스는 Object클래스 상속
 *                                  ---------------
 *                  class A extends Object
 *                          -------------- => Object에서 지원하는 모든 메소드 사용이 가능
 *               4) 생성자가 없는 경우 => 자동으로 디폴트 생성자 추가
 *               5) 자바의 모든 클래스는 예외처리를 가지고있다
 *                                  ------
 *                                     |
 *                                  컴파일시 / 런타입시 
 *                                          --------
 *                                   javac     java             
 *          1) 역할
 *              = 멤버변수에 대한 초기화 담당
 *              = 메모리 저장시 반드시 호출되는 메소드 
 *                => 생성자 호출 시 new 생성자()
 *                               ----------
 *              = 모든 클래스는 생성자가 1개 이상 존재한다 (없는 경우 자동 추가)
 *              
 *          2) 특징
 *              = 클래스명과 동일
 *              = 리턴형이 없다 (*******void는 리턴형이다)
 *                class A => int A(), void A() => 일반 메소드
 *              = 생성자는 다른 틀래스에서 메모리 할당 후에 사용
 *                 => 기본 public 
 *              = 필요시에 여러개의 생성자를 만들 수 있다
 *                => 같은 이름으로 여러개를 만들어서 다른 기능 수행
 *                   -----------------------
 *                    | 오버로딩 (중복함수정의)
 *                     --------
 *                     1) 조건
 *                       = 메소드명이 동일
 *                       = 매개변수의 갯수나 데이터형이 다르다
 *                       = 리턴형은 관계없다
 *                         int aaa() ====> aaa()
 *                         void aaa()  ====> aaa()
 *                         void aaa(int a) ===> aaa(int)
 *                         void aaa(int b) ===> aaa(int) // 매개변수명이 달라도 같은 메소드
 *                      = 같은 클래스에서 제작
 *                      = 생성자, 멤버 메소드에서도 적용
 *                              -------- println(), println(String s)...
 *                              -------- sunbstring(int s) substring(int s, int e)...
 *            3) 사용처
 *               = 인스턴스 변수가 명시적인 초기화가 안되는 경우
 *                             ----------- 파일읽기, 데이터베이스 데이터, 크롤링
 *               
 *               =  시작과 동시에 처리하는 명령문
 *                  예) 자동 로그인 , ID등록 , 윈도우 화면 디자인
 *                      서버 => 서버가 동작 , 클라이언트 => 데이터베이스 연결
 *                  => A a=new A();
 *                       a.메소드명()
 *                     A a;
 *                       a.메소드명() ==> Error
 *               
 *          초기화 블록 : 생성자 없이 멤버 변수 초기화
 *          -------- 컴파일러에 의해 자동 호출
 *           인스턴스 블록 => 생성자를 주로 사용
 *            class A
 *            {
 *              int a; 1) => 0
 *              
 *              2)
 *              {
 *                a=(int)(Math.random()*100)+1;
 *              }
 *              
 *              3)
 *              A()
 *              {
 *                a=(int)(Math.random()*100)+1;
 *              }
 *            }
 *            
 *            static 블록 => 자동으로 메모리 할당 => 생성자를 사용하지 않아도 된다
 *            class A
 *            {
 *              static int a; // 생성자 호출이 없어도 사용이 가능
 *              static
 *              {
 *                a=100;
 *              }
 *            }
 *            A aa=new A(); => aa.a
 *            A.a
 *            
 *            *** 주의점
 *            인스턴스 블록 / static 블록
 *            class A
 *            {
 *              int a;
 *              static int b;
 *              ----------------(O)
 *              {
 *                a=100;
 *                b=200;
 *              }
 *             ----------------
 *             ----------------(X) => static에서는 인스턴스 사용이 불가하다
 *              static
 *              {
 *                => 객체생성 후 사용
 *                a=1000; => Error
 *                b=2000; //  static인 경우에만 사용이 가능하다
 *              }
 *              ----------------
 *            }
 *          
 *          초기값에 대한 호출 순서
 *          1) 명시적인 초기화
 *             int a=10; => 우선시
 *           2) 초기화 불록
 *             a=100;
 *           3) 생성자
 *             a=200;
 *           ***** 변수 
 *             멤버변수 / static변수 / 지역변수
 *             --------------------------
 *                | 반드시 초기화를 해서 사용
 *          --------------
 *          메소드 => 다른 클래스와 통신 => 접근지정어: public
 *          형식) 
 *               멤버메소드
 *               public 리턴형 메소드명(매개변수목록) => 선언부
 *               {
 *                 구현부
 *                 => 인스턴스는 모두 사용 가능
 *                 => static 메소드나 static 변수 사용이 가능
 *               }
 *               => 호출 =>  객체명.메소드()
 *                  Scanner scan=new Scanner(System.in)
 *                  scan.nextInt()
 *               static메소드
 *               public static 리턴형 메소드명(매개변수목록) => 선언부
 *               {
 *                 구현부
 *                 => static 메소드나 static 변수만 사용이 가능
 *                 => 인스턴스는 사용이 불가능
 *                 => 인스턴스 사용하고싶다면 반드시 객체 생성 후 사용해야한다
 *               }
 *               => 호출 => 클래스명.메소드()
 *                  Math.random()
 *                  
 *               String s="";
 *               s.substring()
 *               s.trim()
 *               s.replace()
 *               --------------------- 멤버 메소드
 *               Stirng.valuOf()
 *               --------------------- static 메소드
 *               Calendar c=Calendar.getInstance()
 *               --------   ---------------------- new(X)
 *               추상 클래스
 *               -------------------------------------------- 
 *               
 *               메소드 (접근지정어는 public) => 다른 클래스와 연결 
 *                = 리턴형
 *                  => 사용자 요청에 대한 처리 결과값 (한개만 사용 가능)
 *                  => 기본형
 *                     정수 => int, long
 *                     실수 => double
 *                     문자 => char
 *                     논리 => boolean
 *                  => 참조형
 *                     배열 => int[]
 *                     클래스 => A
 *                  => 리턴형
 *                     ----
 *                     {
 *                       return 값
 *                              --- 일치
 *                     }
 *                     *** 결과값이 없는 경우 => void를 사용한다
 *                         void => return 생략이 가능하다
 *                     *** 리턴형이 있는 경우
 *                         반드시 받아서 저장한다
 *                         int aaa() => int a=aaa()
 *                     *** 메소드를 호출하면 
 *                         메소드의  return까지 수행 => 호출된 위치로 돌아온다
 *                         
 *                = 메소드명
 *                    *** 변수 명칭법과 동일 (식별자)
 *                    *** 길이의 제한은 없다 => 가급적이면 압축
 *                                         (5~12)
 *                    *** 자바 개발자의 약속 => 소문자로 시작
 *                        => 소프트웨어 이행 : 영문을 사용한다
 *                           -----------
 *                           서버는 리눅스 => 차세대 운영체제 (우분투)
 *                                     => 우분투 (AWS)
 *                           개발 : 윈도우/맥 => 호스팅:리눅스
 *                           => 프로젝트 : GIT(원격) => 경로명
 *                = 매개변수
 *                   사용자 요청 값 => 로그인(id,pwd,check)
 *                   => 사용자의 입력, 마우스 클릭, 키보드 입력 => 매개변수로 처리
 *                   => 매개변수의 갯수는 무제한 => 가급적이면 적게 사용
 *                                            --------------- 
 *                                              | 통상 3개까지
 *                                              | 3개 이상 => 모아서 전송=> 배열, 클래스 
 *                   => 매개변수는 메모리 할당 => 메소드호출시마다 메모리 생성
 *                   => 매개변수는 지역변수의 일종 => 메소드 종료되면 자동으로 사라진다
 *                     => 자동 해제 (메모리에서 자동 처리)
 *                     => 초기값을 주는 경우
 *                        메소드 호출시에 초기화를 해준다
 *                     예)
 *                         public void disp(int a)
 *                         {
 *                         }
 *                         
 *                         disp(10) => 매개변수의 값을 설정한다
 *                         -------- 호출
 *              => ******* 클래스도 데이터형이다
 *                         ------------
 *          --------------
 *        }
 *        ***클래스 영역
 *        코드영역
 *        class 
 *        {
 *          선언만 가능 : 변수 선언, 메소드 선언
 *          
 *          => 구현 불가! (메소드 호출, 연산처리, 제어문 사용 등)
 *        }
 *        method
 *        {
 *          선언, 구현 가능 : 선언(지역변수) , 메소드 호출, 연산처리, 제어문 사용 가능
 *          
 *          => 사용자 요청 => 처리 => 결과값 전송
 *        }
 *        메소드 => 생성자, 초기화 블록 (구현)
 *        *** 사용자 정의로 만든 메소드, 생성자
 *             => 반드시 호출 (자동호출이 없다)
 *             => 초기화 블록 => 컴파일러에 의해 한번만 수행
 *        ==> CRUD => 면접! : 게시판 
 *            회원가입 / 회원 정보 / 회원 수정 / 회원 탈퇴
 *            
 *     2) 메모리 저장
 *     3) 활용 (호출)
 *     
 *  3. 클래스의 종류 
 *     1) 일반 클래스
 *     2) 추상 클래스
 *     3) 인터페이스
 *     4) 내부 클래스
 *        = 멤버클래스 , 지역클래스, 익명의 클래스
 *          class A
 *          {
 *             class B
 *             {
 *             
 *             }
 *          } // 멤버클래스 
 *          
 *          class A
 *          {
 *              public void disp()
 *              {
 *                 class B
 *                 {
 *                 
 *                 }
 *              }
 *          } // 지역클래스
 *          
 *          ===================> **상속없이 오버라이딩**
 *          class A
 *          {
 *            B b= new B()
 *            {
 *               => 메소드 추가
 *               => 메소드 변경
 *            }
 *          } // 익명의 클래스
 *          5) 종단 클래스 : 상속을 할수없는 클래스 (마지막!)
 *         final class => String, Math, System ... 
 *         
 *  4. 비정상 종료를 방지하는 프로그램 구현 => 예외처리
 * -------------------------------------------------------------------------자바기초
 *       
 */
public class MainClass {
    int a=100;
    static int b=200;
    public static void aaa()
    {
    	MainClass m=new MainClass();
    	System.out.println(m.a); // 인스턴스는 객체 생성 후 사용
    	System.out.println(b); // static 변수는 사용 가능
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
