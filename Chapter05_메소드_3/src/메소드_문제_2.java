// 정수 한개 입력 => 3의 배수 여부 확인
import java.util.Scanner;
public class 메소드_문제_2 {
    static int userInput()
    {
    	Scanner scan=new Scanner(System.in);
        System.out.print("한개의 정수 입력:");
        int a=scan.nextInt();
        return a;
    }
    static String check(int a)
    {
    	  String r="";
          if(a%3==0)
          {
       	   r=a+"은(는) 3의 배수입니다";
          }
          else
          {
       	   r=a+"은(는) 3의 배수가 아닙니다";
          }
          return r;
    }
    static void print(String r)
    {
    	  System.out.println(r);
    }
    static void process()
    {
    	int a=userInput();
    	String r=check(a);
    	print(r);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
//       Scanner scan=new Scanner(System.in);
//       System.out.print("한개의 정수 입력:");
//       int a=scan.nextInt();
//       
//       String r="";
//       if(a%3==0)
//       {
//    	   r=a+"은(는) 3의 배수입니다";
//       }
//       else
//       {
//    	   r=a+"은(는) 3의 배수가 아닙니다";
//       }
//       System.out.println(r);
    	   
	}

}
