// 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
//   60점 이하면 F를 출력하라 (다중 if 사용)

import java.util.Scanner;
public class 선택문_연습문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan= new Scanner(System.in);
       System.out.print("점수입력:");
       int a=scan.nextInt();
       char score=' ';
       
       if(a>=90)
       {
    	  score='A';
       }
       else if(a>=80)
       {
    	   score='B';
       }
       else if(a>=70)
       {
    	   score='C';
       }
       else if(a>=60)
       {
    	   score='D';
       }
       else
       {
    	   score='F';
       }
       System.out.println(score+"학점입니다");
       
       
       
	}

}
