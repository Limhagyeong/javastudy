/*
 *  1. 문자열을 입력받아서 대문자를 소문자로 / 소문자를 대문자로 변환하여라
 *  2. 문자열을 입력받아서 거꾸로 출력하여라
 */
import java.util.Scanner;
public class 메소드_2 {
	// 문자열 입력받는 기능
    static String userInput()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("문자 입력:");
    	return scan.nextLine();
    	// next() : 엔터 시 메모리에 저장 => 문자열 인식 (공뱃)
    	// ㅁㅁㅁ ㅁㅁㅁ ㅁㅁㅁ ㅁㅁㅁ => ㅁㅁㅁ (공백 앞에서 자름)
    	// nextLine() : 엔터 시 메모리에 저장
    	// ㅁㅁㅁ ㅁㅁㅁ ㅁㅁㅁ ㅁㅁㅁ => ㅁㅁㅁ ㅁㅁㅁ ㅁㅁㅁ ㅁㅁㅁ (공백 포함하여 출력)
    }
    // 대문자를 소문자로 / 소문자를 대문자로 변환
    static void ch (String msg)
    {
    	String result="";
    	for(int i=0;i<msg.length();i++)
    	{
    		char c=msg.charAt(i);
    		if(c>='A'&&c<='Z')
    		{
    			result+=String.valueOf(c).toLowerCase(); // or result+=(char)(c+32);
    			//      -------------  char => String으로 변환 + toLowerCase()
    		}
    		else if(c>='a'&&c<='z')
    		{
    			result+=(char)(c-32);
    		}
    		else
    		{
    			result+=c;
    		}
    	}
    	System.out.println("결과값:"+result);
    }
    // 문자열을 거꾸로 출력
    static String alphaReverse(String msg)
    {
    	String result="";
    	for(int i=msg.length()-1;i>=0;i--)
    	{
    		char c=msg.charAt(i);
    		result+=c;
    	}
    	return result;
    }
    // 최종 결과값 출력
    static void process()
    {
    	 String msg=userInput();
         System.out.println("msg:"+msg);
         //ch(msg); // 대소문자 변환 
         String res=alphaReverse(msg);
         System.out.println("res:"+res);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      process();
	}

}
