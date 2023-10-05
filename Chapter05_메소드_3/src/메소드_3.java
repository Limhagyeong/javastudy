/*
 *  연도를 입력받아서 => 윤년여부 확인
 *  1. 입력 => 초기화 => 회원가입에 필요한 데이터 입력
 *  2. 윤년확인 => 오라클을 연결해서 데이터 추가
 *             => 로그인 여브 확인
 *  3. 출력 => 로그인 이동
 *          => 로그인 : 메인이동
 */
import java.util.Scanner;
public class 메소드_3 {
	// 입력
    static int userInput()
    {
    	 Scanner scan=new Scanner(System.in);
         System.out.print("년도 입력:");
         int year=scan.nextInt();
         return year;
    }
    
    // 윤년여부 확인
    static boolean isyear(int year)
    {
    	boolean bCheck=false;
    	  if((year%4==0 && year%100!=0)||(year%400==0))
    	  {
    		  bCheck=true;
    	  }
    	  return bCheck;
    }
    static void res(boolean bCheck)
    {
    	if(bCheck)
    		  System.out.println("윤년입니다");
    	  else
    		  System.out.println("윤년이 아닙니다");
    }
    static void process()
    {
    	int year=userInput();
    	boolean bCheck=isyear(year);
    	res(bCheck);
    }
    // 윤년여부 확인
//    static void year()
//    {
//    	int year=userInput();
//    	 if(year%4==0 && year%100!=0 || year%400==0)
//         {
//      	   System.out.println(year+"년은(는) 윤년입니다");
//         }
//         else
//         {
//      	   System.out.println(year+"년은(는) 윤년이 아닙다");
//         }
//    }
//    // 출력
//    static void process()
//    {
//    	
//    	year();
//
//    }
    
//    static void year(int year)
//    {
//    	
//    	 if(year%4==0 && year%100!=0 || year%400==0)
//         {
//      	   System.out.println(year+"년은(는) 윤년입니다");
//         }
//         else
//         {
//      	   System.out.println(year+"년은(는) 윤년이 아닙다");
//         }
//    }
//    // 출력
//    static void process()
//    {
//    	int year=userInput();
//    	year(year);
//
//    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
  process();
  
 
	  
       
  
       
	}

}
