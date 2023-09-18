/*
 *   다중 조건문 => 결과값 1개만 도출
 *   형식)
 *       if(조건문)
 *       {
 *          조건이 true일 때 수행하는 문장 ====> 종료  
 *       }
 *       | false
 *       |
 *       else if(조건문)
 *       {
 *         조건이 true일 때 수행하는 문장 ====> 종료 
 *       }
 *       | false
 *       |
 *       else if(조건문)
 *       {
 *         조건이 true일 때 수행하는 문장 ====> 종료 
 *       }
 *       | false
 *       |
 *       ...
 *       ...
 *       | false
 *       |
 *       else // 생략이 가능함 => 해당 조건이 없는 경우 수행
 *       {
 *          
 *       }
 *       // 한개의 문장만 수행
 *       // 게임, 네트워크 서버
 *       
 */
// 국어, 영어, 수학점수를 입력 받아 => 총점, 평균, 학점. 합불 여부 출력
// 평균 90이상 A 80 이상 B 70 이상 C 60 이상 D

import java.util.Scanner;
public class 제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수:");
        int kor=scan.nextInt();
        System.out.println("영어 점수:");
        int eng=scan.nextInt();
        System.out.println("수학 점수:");
        int math=scan.nextInt();
        
        int total=(kor+eng+math);
        double avg=(kor+eng+math)/3.0;
        System.out.println("총점="+total);
        System.out.printf("평균=%.2f\n",avg);
        
        
        char score=' ';
        if (avg>=90)
           {
        	score='A';
           }
        else if (avg>=80)
        {
     	    score='B';
        }
        else if (avg>=70)
        {
         	score='C';
     	}		
        else if (avg>=60)
        {
        	score='D';
     	}
        else
        {
        	score='F';
        }
        System.out.println("학점="+score);
        
        

	}

}
