// 메소드_4에 대한 메소드 제작
// 리턴형, 매개변수, 메소드명 => 가독성 높이는 것이 목적
// 입력 => 기능(1)
// 구구단 => 기능(2)
import java.util.Scanner;
public class 메소드_4_구현 {
    // 사용자로부터 정수값을 받는다
	static int userInput()
	{
		 Scanner scan=new Scanner(System.in);
	     System.out.print("단 입력(2~9 사이):");
	     int dan=scan.nextInt();
	     return dan; // =>  return scan.nextInt(); 동일 
	}
	
	// 받은 정수에 해당되는 단을 출력한다
	
//  방법 1.
//	static String gugudan(int dan)
//	{
//		String result=dan+"단\n";
//		for(int i=1;i<=9;i++)
//		{
//			result+=dan+"*"+i+"="+i*dan+"\n";
//		}
//		return result;
//	}
	
// 방법 2.
	static void gugudan(int dan)
	{
		 for(int i=1;i<=9;i++)
	        {
	        	System.out.println(dan+"*"+i+"="+i*dan);
	        }
	}
	// 조립기
	static void process()
	{
		 int dan=userInput();
//       String gu=gugudan(dan);
//       System.out.println(gu);
       gugudan(dan);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       process();
	}

}
