//사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
//   끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.

import java.util.Scanner;
public class 제어문_연습문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan=new Scanner(System.in);
		System.out.print("시작 입력:");
		int a=scan.nextInt();
		System.out.print("끝 입력:");
		int b=scan.nextInt();
		int res=1;
		
		for (int i=a;i<=b;i++)
		{
			res*=i;
		}
		System.out.println("결과값:"+res);
			
	}

}
