// Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
// 웹 => 아이디 중복, 로그인, 관리자/사용자, 아이디찾기, 비밀번호 찾기
// 파일업로드

import java.util.Scanner;
public class 선택문_연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		System.out.print("한개의 정수 입력:");
		int a=scan.nextInt();
		/*
		 *  정수 : nextInt()
		 *  실수 : nextDouble()
		 *  논리 : nextBoolean()
		 *  문자열 : next()
		 *  *** 단점은 char는 읽지 못한다
		 *           ---- 문자열로 읽어서 첫번째 문자를 잘라내야한다 => charAt(0); 붙여주기
		 */
		
		if(a<0)
		 System.out.print(a+"는(은) 음수입니다");
		else
		System.out.print(a+"는(은) 양수입니다");
			
		
	}

}
