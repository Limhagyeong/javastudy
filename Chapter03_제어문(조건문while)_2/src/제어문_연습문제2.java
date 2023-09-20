// char형 변수 ch가 공백이고 탭이 아닐 때 true인 조건식 작성
import java.util.Scanner;
public class 제어문_연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char ch='A';
       Scanner scan= new Scanner(System.in);
       System.out.print("변수 입력:");
       ch=scan.next().charAt(0);
       
       if(ch==' '&& ch=='\t')
       {
    	   System.out.println("false");
       }
       else
       {
    	   System.out.println("true");
       }
	}

}
