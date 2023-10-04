// 시저스 암호화 => AES
import java.util.Scanner;
public class 메소드_3 {
	// 매개변수 전송법
    // 사용자 입력값 => 암호화 시 입력값 넘겨줘야함 (void 사용 불가) / 리턴형(O) 매개변수(x)
	static String userInput()
	{
		Scanner scan=new Scanner(System.in);
    	System.out.print("문자열 입력:");
    	return scan.nextLine();
	}
	// 암호화 => 입력값 넘겨줘야함 (void 사용 불가) / 리턴형(O) 매개변수(O)
	static String encode(String msg)
	{
		String result="";
		for(int i=0;i<msg.length();i++)
		{
			char c=msg.charAt(i);
			result+=(char)(c+3);
		}
		return result;
	}
	// 복호화 리턴형(O or X) 매개변수(O)
	static void decode(String en)
	{
		for(int i=0;i<en.length();i++)
		{
			char c=en.charAt(i);
			System.out.print((char)(c-3));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String msg=userInput();
       System.out.println("msg:"+msg);
       String en=encode(msg);
       System.out.println("암호화된 문자:"+en);
       decode(en);
	}

}
