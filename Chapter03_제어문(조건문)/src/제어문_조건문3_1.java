//58~59P

// 정수 2개 입력, 연산자 (+,-,*,/) => 사칙연산처리
// if(op=='+')
// else if(op=='-')
// else => 잘못된 연산자 입니다
import java.util.Scanner;
public class 제어문_조건문3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		char op=' ';
		// 사용자의 입력값 받기
		// 사용자의 요청에 따라 결과값을 출력 (가공) = 연산자, 제어문
		//                                   ========== 메소드
		//---------------------------------------------------- 재사용 목적                                    		 
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
	     a=scan.nextInt();
	     System.out.print("두번째 정수 입력:");
         b=scan.nextInt();
         System.out.print("연산자 입력(+,-,*,/):");
         op=scan.next().charAt(0);
        
        if(op=='+')
        	System.out.println(a+"+"+b+"="+(a+b));
        else if(op=='-')
        	System.out.println(a+"-"+b+"="+(a-b));
        else if(op=='*')
        	System.out.println(a+"*"+b+"="+(a*b));
        else if(op=='/')
        {
          //0으로 나눌 경우 오류 발생
         if(b==0)
         
        	 System.out.println("0으로 나눌 수 없습니다");
         else
        	 System.out.println(a+"/"+b+"="+(a/b));
        }
        else 
        	System.out.println("잘못된 연산자입니다");
       
        
        
	}

}
