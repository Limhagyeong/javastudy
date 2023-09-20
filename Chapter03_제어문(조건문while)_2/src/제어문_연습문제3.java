 //char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식 작성
import java.util.Scanner;
public class 제어문_연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("변수 입력:");
        char ch=scan.next().charAt(0);
        
        if(ch=='z'||ch=='Z')
        {
        	System.out.println("true");
        }
        else
        	System.out.println("false");
	}

}
