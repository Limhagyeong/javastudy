//Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라

import java.util.Scanner;
public class 선택문_연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("한개의 정수 입력:");
		int a=scan.nextInt();
		int result=0;
		
		if(a<0)
		  result=a*-1;	
		else
			result=a;
			System.out.println(a+"의 절댓값은"+result+"입니다");
	}

}
