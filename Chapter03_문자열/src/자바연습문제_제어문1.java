//1.	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
//십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
import java.util.Scanner;
public class 자바연습문제_제어문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("두자리 정수 입력(10~99):");
        int a=scan.nextInt();
        
        if(a%11==0)
        	System.out.println("10의 자리와 1의 자리가 같습니다");
        else
        	System.out.println("10의 자리와 1의 자리가 같지 않습니다");
	}

}
