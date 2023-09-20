//. char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성
import java.util.Scanner;
public class 제어문_연습문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자입력:");
		char ch=scan.next().charAt(0);
		
        if(ch>='0' && ch<='9')
        {System.out.println("true");
	}

}
	
}
