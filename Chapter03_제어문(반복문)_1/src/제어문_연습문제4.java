// 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
import java.util.Scanner;
public class 제어문_연습문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, sum=0;
		Scanner scan= new Scanner(System.in);
		System.out.print("한개의 정수 입력:");
		a=scan.nextInt();
	
		for(int i=1;i<=a;i++)
		{
			sum+=i;
		}
		System.out.println("1~"+a+"까지의 합:"+sum);
	}

}
