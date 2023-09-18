// 사칙연산
// 정수 2개를 => 연산자(문자열)  +,-,*,/
// 정수 3개를 => 1개 결과값

import java.util.Scanner;
public class 선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num1, num2; // => 사용자에게 받는 값 (초기화 설정 필요 x)
       int result=0; // => 결과값 (초기화 설정 필요 ㅇ)
       Scanner scan= new Scanner(System.in);
       // 초기화
       System.out.print("첫번째 정수:");
       num1=scan.nextInt();
       System.out.print("두번째 정수:");
       num2=scan.nextInt();
       
       System.out.print("연산자 입력(+,-,*,/):");
       switch(scan.next())
       {
       case "+":
    	   result=num1+num2;
    	   break;
       case "-":   
    	   result=num1-num2;
    	   break;
       case "*":  
    	   result=num1*num2;
    	   break;
       case "/":   
    	   result=num1/num2;
    	   break;
       default:
    	   System.out.println("잘못된 연산자입니다");
       }
       System.out.println("계산결과:"+result);
       
	}

}
