//한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라 

import java.util.Scanner;
public class 선택문_연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.print("한개의 정수 입력:");
		int a=scan.nextInt();
		
		if(a%3==0)
			System.out.println(a+"는(은) 3의 배수입니다");
		else
			System.out.println(a+"는(은) 3의 배수가 아닙니다");
	}

}
