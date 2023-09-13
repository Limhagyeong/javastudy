import java.util.Scanner;
public class 연습문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드 입력값을 가져온다
        Scanner scan=new Scanner(System.in);
                                //----------시스템입력
        /*
        System.out.println("첫번쨰 정수 입력:");
        int a=scan.nextInt();
        System.out.println("두번쨰 정수 입력:");
        int b=scan.nextInt();*/
        
        System.out.println("정수 두개 입력 (10 20):");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println(a-b);
        System.out.println(a*b);
	}

}
