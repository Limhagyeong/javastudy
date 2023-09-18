// if else 문장 (선택 조건문)
/*
 *  예상되는 결과값이 두개로 나눠서 나오는 경우 사용 => if else
 *  예상되는 결과값이 여러개가 동시에 나오는 경우 => 결과값 1개만 나온다면 (다중 조건문) 여러개가 동시에 나온다면 (단일 조건문)
 *  
 */
// 국어, 영어, 수학 점수를 입력 받아 평균, 총점 => 평균 60점 이상 60점 미만 합,불
import java.util.Scanner;
public class 제어문_조건문2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		// 초기화 => 명시적인 초기화, 입력값을 받아서 저장, 임의 발생
		   /*
		    * int a=10;
		    * 입력값 => scanner
		    * 임의 발생 => random
		    */
       Scanner scan= new Scanner(System.in);
       System.out.println("국어 점수:");
       int kor=scan.nextInt();
       System.out.println("영어 점수:");
       int eng=scan.nextInt();
       System.out.println("수학 점수:");
       int math=scan.nextInt();
       
       int total=(kor+eng+math);
       double avg=total/3.0;
       
       System.out.println("=====결과값=====");
       System.out.println("총점="+total);
       System.out.printf("평균=%.2f\n",avg);
       
       if (avg>=60)
       {
    	   System.out.println("결과=합격");
       }
       else 
       {
    	   System.out.println("결과=불합격");
       }
	}

}
