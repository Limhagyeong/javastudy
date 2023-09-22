/*
 *  배열
 *  --- 묶어서 관리
 *      ---------
 *      1) 변수 => 같은 유형의 변수가 3개 이상 => 묶어서 처리
 *                                        -----
 *                                         변수명 한개로 관리
 *             => 같은 데이터형 => 배열
 *             => 다른 데이터형 (**********) => 클래스
 *                => 한명의 사원에 대한 정보 저장
 *                 (Spring)
 *                => ~VO, ~DTO, ~Bean
 *                       (MyBatis)(JSP)
 *      2) 명령문 : 관련된 명령끼리 묶어서 구조적 프로그램
 *                메소드 ==> 단락
 *                
 *  기본 문법 --------
 *  데이터 묶기 (변수)
 *  명령문 묶기 (명령문) => 소스코딩;
 *              |
 *             입력
 *             처리
 *             출력
 *             ----
 *             
 *   배열 : 같은 데이터형을 여러개 묶어서 관리
 *   1) 장점
 *      여러개의 변수명 => 한개로 합쳐서 사용
 *                     ----------
 *      => 데이터마다 구분 => 인덱스 (순차적) => 반복문
 *   2) 단점
 *      고정적이다 => 메모리 할당 (10)
 *      -------
 *      크기 변경이 불가능하다 => 큰 배열을 생성해서 변경해야함
 *      동일 데이터형만 모아서 저장
 *      --------------------------------------------------------
 *      1. 배열선언
 *         형식1)
 *          데이터형[] 배열명; 자바(권장) 
 *          데이터형 배열명[]; c
 *          ---------------
 *      2. 초기화
 *         int[] arr={1,2,3,4,5} => 5
 *                ---
 *                 | 변수식별자와 동일
 *         int[] arr = new int[5]; => int (5를 모아서 관리)
 *                     ----------- => 자동 초기화 0
 *         int[] arr;            
 *                     스택           힙
 *               arr         |
 *              -----        |
 *                           |
 *                           |
 *              -----        |
 *              
 *          arr=new int[5];  |    arr+1*4 
 *                                    arr+2*4 
 *                                        arr+3*4  
 *                                               arr+4*4
 *                                  104 108 112  116         
 *             arr           |    --------------------
 *             ------        |    0 | 0|  0 | 0  |  0
 *             100           |   |--------------------
 *             -------       |   arr(100)*4 ==>100
 *             
 *                                 |      |
 *                               arr[0]  arr[1] ..... arr[4] => 변수명으로 생각하면 됨
 *                               ----|----------------------
 *                               (인덱스번호)  일반변수와 동일
 *                               ----------
 *                                = length-1
 *              
 *      3. 값 변경
 *         => 1번째 값 변경
 *            arr[0]=100 ===> 첫번째 0 = 100으로 바뀜
 *            arr[4]=200 ===> 마지막 0 = 200으로 바뀜
 *      4. 출력
 *         int[] arr
 *         for(int a:arr) // 데이터형 일치 시키는 것 중요
 *         {
 *            
 *         }
 *      
 *      
 */ 
import java.util.Scanner;
public class 배열_생성 {

// 3명의 학생 => 국,영,수 => 총점, 평균
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor1,kor2,kor3;
        int eng1, eng2, eng3;
        int math1, math2, math3;
        int total1, total2, total3;
        double avg1, avg2, avg3;
        
        Scanner scan= new Scanner(System.in);
        System.out.println("첫번째 학생의 국어 점수:");
        kor1=scan.nextInt();
        
        System.out.println("첫번째 학생의 영어 점수:");
        eng1=scan.nextInt();
        
        System.out.println("첫번째 학생의 수학 점수:");
        math1=scan.nextInt();

        System.out.println("두번째 학생의 국어 점수:");
        kor2=scan.nextInt();
        
        System.out.println("두번째 학생의 영어 점수:");
        eng2=scan.nextInt();
        
        System.out.println("두번째 학생의 수학 점수:");
        math2=scan.nextInt();

        System.out.println("세번째 학생의 국어 점수:");
        kor3=scan.nextInt();
        
        System.out.println("세번째 학생의 영어 점수:");
        eng3=scan.nextInt();
        
        System.out.println("세번째 학생의 수학 점수:");
        math3=scan.nextInt();
        
        total1=kor1+eng1+math1;
        total2=kor2+eng2+math2;	
        total3=kor3+eng3+math3;
        
        System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor1,eng1,math1,total1/3.0); // %-5d : 5칸을 만들어 왼쪽(-) 정렬로 표시하겠다 => 글자없으면 공백으로 띄어쓰기
        System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor2,eng2,math2,total2/3.0);
        System.out.printf("%-5d%-5d%-5d%-7d%-5.2f\n",kor3,eng3,math2,total3/3.0);
	}

}
