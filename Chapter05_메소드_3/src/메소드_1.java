/*
 *  변수 / 연산자 / 제어문 
 *       -------------- 명령문
 *  => 묶어서 사용
 *  변수 : 배열 / 클래스 (O)
 *  명령문 : 관련된 명령
 *        => 입력 관련 / 출력 관련 / 요청 관련 => 메소드
 *        => 동작 => 조립해서 사용 (객체 지향 프로그램)
 *                  ========= 수정 / 추가 (유지보수)
 *  메소드는 한개의 기능만 수행이 가능하게 만든다
 *  => 자바는 클래스 영역을 벗어날 수 없다 (클래스 종속)
 *  1. 메소드 구성 요소
 *    = 리턴형 : 사용자 요청에 대한 처리 결과값
 *             결과값은 반드시 한개만 사용 가능하다
 *                         --------
 *                             | 여러개인 경우 => 배열, 클래스, 컬랙션 활용
 *              => 예측해서 설정
 *    = 매개변수 : 사용자가 요청한 값 
 *              => 웹 : 마우스 클릭 / 엔터 / 버튼 클릭 / 입력창 입력 (검색, 로그인 등)
 *                     --------                   ---------
 *              => 메소드는 사용자가 행위를 한 경우 => 메소드 호출
 *                        ---------- : 마우스 , 키보드
 *    = 메소드명 : 식별자 (변수)
 *               => 소문자로 시작한다 등
 *    = return문장 : 처리 결과값을 보내준다 , 메소드의 종료
 *      --------- 항상 맨 마지막에 등장 X => 중간 사용 가능
 *      메소드()
 *      {
 *         if()
 *         {
 *           return;
 *         }
 *         else
 *         {
 *           return;
 *         } 
 *      }
 *  2. 메소드 형식
 *     --------------------------------------
 *     public : 모든 클래스
 *     protected : 상속받는 클래스, 같은 폴더 안에서 
 *     default : 같은 폴더 안에서만 
 *     private : 자신의 클래스 안에서만 => 은닉화
 *     ---------------------------------------
 *        |          기본형(int, double, boolean, long, char, byte) 
 *        |          참조형 : 배열 / 클래스 (String, int[])
 *        |          메소드 매개변수 전송법 : Call By Value /  Call By Reference
 *        |            |
 *     [접근지정어][옵션] 리턴형(1개) 메소드(매개변수...(0개 이상)) ===> 선언부
 *                |                  
 *               static : 자동 메모리 저장 ==> new
 *               abstract : 추상 메소드 ==> 선언 (설계 => 요구사항)
 *               final : 수정이 불가능 => String, Math..
 *               
 *     => 매개변수(0개이상)으로 사용 => 기본형 : Call By Value
 *                                참조형 :  Call By Reference
 *                                **** 매개변수가 3개 이상이면 배열, 클래스 사용
 *                                
 *       {
 *          구현부
 *          ---- 변수선언
 *          ---- 연산자
 *          ---- 제어문
 *          ------------------ 결과값 도출 : 파이썬(예측)
 *          return 결과값;
 *          => 결과값이 없는 경우 자체 처리 ==> void => return 생략 가능
 *                                               -------
 *                                                  | 모든 메소드는 return을 필요로 한다
 *                                                  | 컴파일러가 자동 추가
 *       }
 *       => return / import java.lang.* : 자동추가 (클래스 파일 자체도 java.lang.Object의 상속을 받고있음)
 *                          ------------ String, Math, System...
 *          return을 생략할때는 void인 경우에만 가능
 *         
 *         *** 모든 프로그램
 *         = 입력 기능 => 변수에 대한 초기화
 *         = 처리부분 (요청처리) => CRUD 
 *                              ----> 
 *                              Create : 추가 => INSERT
 *                              Read : 읽기 (목록, 상세보기) => SELECT
 *                              Update : 수정 => UPDATE
 *                              Delete : 삭제 => DELETE
 *         = 출력 => 사용자가 볼 수 있도록 만든다 (sysout..) => HTML, CSS
 *         = main() => 프로그램의 시작과 종료
 *   3. 메소드 유형
 *      리턴형    매개변수
 *        O       O
 *          => String substring(int begin) => 원형
 *             ------          ------------
 *              String substring(int begin, int end) => 오버로딩
 *        X       O
 *           => void main(String[] arg)
 *              ---- 메소드 자체에서 처리
 *        O       X
 *         => String trim()
 *            ------
 *            double random()
 *            ------
 *        X       X
 *           => void println() => 다음줄 출력
 *           
 *           *** 한개의 클래스 안에서 메소드명이 동일 할 수 있다
 *                               -----------
 *                                   |
 *                                  매개변수의 갯수나 데이터형이 다르다
 *                                  aaa(int a) ===> aaa(int) 
 *                                  aaa(double d) ===> aaa(double)
 *                                  aaa(int a, int b) => 오버로딩 ===> aaa(int,int)
 *                                     => 중복 정의 메소드
 *   4. 메소드 호출 : **** 여러번 호출 가능 **** (재사용)
 *      ---------
 *      = 인스턴스 메소드 => new를 이용해서 메모리에 저장
 *        Scanner scan=new Scanner(System.in)
 *        scan.nextInt()
 *        String a="";
 *        a.메소드
 *      = 클래스 메소드 (static) => 모든 사람 공유 => 자동 저장
 *        Math.random()
 *      
 *      => static
 *         클래스명.메소드명()
 *         ---------------
 *         => 같은 클래스인 경우  => 클래스명 생략 가능
 *      => aaa(int a, int b)
 *         => aaa(10,20)
 *      => int aaa()
 *         int a=aaa()
 *         -----
 *   5. return값 설정
 *      -----------
 *      int display()
 *      {
 *        return 10;
 *      }
 *      double display()
 *      {
 *        return 10.5;
 *      }
 *      String display()
 *      {
 *        return "";
 *      }
 *      void display()
 *      {
 *        return; => 생략 가능
 *      }
 *      int[] display()
 *      {
 *        int[] arr=new int[5];
 *        return arr;
 *      }
 *      
 *   6. 메소드 사용 목적
 *      = 반복 코드 제거
 *      = 유지보수 용이 (기능별 분리)
 *      = 소스 간결
 *      = 재사용 (다른 클래스 연결 가능)
 *      
 */
// 5개의 정수를 전송 => 정렬한다 / int[]
// 5자리 정수를 전송 => 거꾸로 출력 / 12345 => 54321
import java.util.Arrays;
public class 메소드_1 {
     static int[] sortAsc(int[] arr) // 오름차순
     {
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 for(int j=i+1;j<arr.length;j++)
    		 {
    			 if(arr[i]>arr[j]) // 오름차순 내림차순 결정
    			 {
    				 int temp=arr[i];
    				 arr[i]=arr[j];
    				 arr[j]=temp;
    			 }
    		 }
    	 }
    	 return arr;
    	 
    	 
     }
     static int[] sortDesc(int[] arr) // 내림차순
     {
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 for(int j=i+1;j<arr.length;j++)
    		 {
    			 if(arr[i]<arr[j]) // 오름차순 내림차순 결정
    			 {
    				 int temp=arr[i];
    				 arr[i]=arr[j];
    				 arr[j]=temp;
    			 }
    		 }
    	 }
    	 return arr;
    	 
    	 
     }
     static int[] sort(int[] arr,String type) // 오름차순, 내림차순 하나의 메소드로 묶음 
     {
    	 boolean bCheck=false;
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 for(int j=i+1;j<arr.length;j++)
    		 {
    			if(type.equals("ASC"))
    			{
    				bCheck=arr[i]>arr[j];
    			}
    			else
    			{
    				bCheck=arr[i]<arr[j];
    			}
    			 if(bCheck) // 오름차순 내림차순 결정
    			 {
    				 int temp=arr[i];
    				 arr[i]=arr[j];
    				 arr[j]=temp;
    			 }
    		 }
    	 }
    	 return arr;
    	 
     }
     
     static void sort_1(int[] arr,String type) // 자체처리 (Call By Reference)
     {
    	 boolean bCheck=false;
    	 for(int i=0;i<arr.length;i++)
    	 {
    		 for(int j=i+1;j<arr.length;j++)
    		 {
    			if(type.equals("ASC"))
    			{
    				bCheck=arr[i]>arr[j];
    			}
    			else
    			{
    				bCheck=arr[i]<arr[j];
    			}
    			 if(bCheck) // 오름차순 내림차순 결정
    			 {
    				 int temp=arr[i];
    				 arr[i]=arr[j];
    				 arr[j]=temp;
    			 }
    		 }
    	 }
    	
     }
     
     // 조립
    static void process()
    {
    	 // 5개 정수 설정
    	int[] arr=new int[5];
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(int)(Math.random()*100)+1;
    	}
    	
    	System.out.println("정렬 전:");
    	System.out.println(Arrays.toString(arr));
    	
//    	int[] result=sortAsc(arr);
//    	System.out.println("정렬 후(Asc):");
//    	System.out.println(Arrays.toString(result));
//    	result=sortDesc(arr);
//    	System.out.println("정렬 후(Desc):");
//    	System.out.println(Arrays.toString(result)); // 오름차순, 내림차순 각 결과
    	
//    	int[] result=sort(arr,"ASC");
//    	System.out.println(Arrays.toString(result));
//    	result=sort(arr,"DESC");
//    	System.out.println(Arrays.toString(result)); // 합 결과
    	
    	sort_1(arr,"ASC");
    	System.out.println(Arrays.toString(arr));
    	sort_1(arr,"DESC");
    	System.out.println(Arrays.toString(arr)); // 자체처리 결과
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 메소드 조립
       process();



		
	}

}
