// 알파벳을 입력받아서 => 대문자 or 소문자 판별
// 1개 or 2개
import java.util.Scanner;
public class 메소드_6 {
    static char alphaInput()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("알파벳 입력:");
    	return scan.next().charAt(0);
    	// 자바 단점 => char를 받아서 처리하는 기능이 없다
    	// => String으로 받아서 char를 분리
    }
    static void result(char c)
    {
    	// void : 결과값 자체처리
    	if(c>='a'&&c<='z')
    	{
    		System.out.println(c+"은(는) 소문자입니다");
    	}
    	else if(c>='A'&&c<='Z')
    	{
    		System.out.println(c+"은(는) 대문자입니다");
    	}
    	else
    		System.out.println(c+"은(는) 알파벳이 아닙니다");
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // 알파벳 받기
		char c=alphaInput();
		result(c); // void에서 처리해서 결과값 돌려줌
	}

}
