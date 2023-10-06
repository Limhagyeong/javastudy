/*
 *  달력 만들기 
 *  --------
 *   1. 절차적 언어 ==== 구조적 프로그램 ==== 객체지향 프로그램
 *                     => 메소드 이용     => 메소드
 *                     => 지역변수       => 전역변수 
 *                        매개변수 전송 , 리턴형
 *                        
 *   1) 년도, 월을 사용자로부터 입력받는다 (1-메소드)
 *   2) 전년도까지의 총날수 (1년도 1월 1일~전년도 12월 31일)
 *   3) 전달까지의 총날수
 *      ---------------- +1 (요청한 달의 1일자를 구한다)
 *   4) 총날수%7 => 요일
 *   5) 달력출력
 *   ----------------------------------------------
 *   6) 조립
 */
import java.util.Scanner;
public class 메소드_4 {
    static int userInput(String msg)
    {
    	Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 입력:");
		return scan.nextInt();
    }
    // 요일 구하기
    static int getWeek(int year, int month)
    {
    	int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100
				+(year-1)/400;
    	int[] lastday= {
				31,28,31,30,31,30,
				31,3,30,31,30,31
		};
		
		// 윤년 조건
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			lastday[1]=29;
		}
		else
		{
			lastday[1]=28;
		}
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		
		int week=total%7;
		
		return week;
    	
    }
    static void print(int year, int month, int week)
    {
    	int[] lastday= {
				31,28,31,30,31,30,
				31,3,30,31,30,31
		}; // 불러와야됨
    	
    	if((year%4==0 && year%100!=0)||(year%400==0))
		{
			lastday[1]=29;
		}
		else
		{
			lastday[1]=28;
		} // 불러와야됨
    	
    	String[] strWeek= {
				"일","월","화","수","목","금","토"
		};
		
		System.out.println(year+"년도 "+month+"월");
		System.out.println();
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
		}
		
		System.out.println();
		for(int i=1;i<=lastday[month-1];i++)
		{
			if(i==1)
			{
				// 공백위치
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6)
			{
				System.out.println();
				week=0;
			}
		}
		
    }
    static void process()
    {
    	int year=userInput("년도");
    	int month=userInput("월");
    	int week=getWeek(year, month);
    	print(year, month, week);		
    }
   
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
		
//       // 1. 년도, 월을 사용자로부터 입력받는다 (1-메소드)
//		Scanner scan=new Scanner(System.in);
//		System.out.print("년도 입력:");
//		int year=scan.nextInt();
//		System.out.print("월 입력:");
//		int month=scan.nextInt();
//		
//		// 2. 전년도까지의 총날수 (1년도 1월 1일~전년도 12월 31일)
//		
//		int total=(year-1)*365
//				+(year-1)/4
//				-(year-1)/100
//				+(year-1)/400;
//		
//		// 3. 전달까지의 총날수
//		
//		int[] lastday= {
//				31,28,31,30,31,30,
//				31,3,30,31,30,31
//		};
//		
//		// 윤년 조건
//		if((year%4==0 && year%100!=0)||(year%400==0))
//		{
//			lastday[1]=29;
//		}
//		else
//		{
//			lastday[1]=28;
//		}
//		for(int i=0;i<month-1;i++)
//		{
//			total+=lastday[i];
//		}
//				
//		// 요청한 달의 1일자 요일 확인
//		total++;
//		
//		// 요일 구하기
//		int week=total%7;
//		
//		//달력출력
//		String[] strWeek= {
//				"일","월","화","수","목","금","토"
//		};
//		
//		System.out.println(year+"년도 "+month+"월");
//		System.out.println();
//		for(String s:strWeek)
//		{
//			System.out.print(s+"\t");
//		}
//		
//		System.out.println();
//		for(int i=1;i<=lastday[month-1];i++)
//		{
//			if(i==1)
//			{
//				// 공백위치
//				for(int j=0;j<week;j++)
//				{
//					System.out.print("\t");
//				}
//			}
//			System.out.printf("%2d\t",i);
//			week++;
//			if(week>6)
//			{
//				System.out.println();
//				week=0;
//			}
//		}
//		
	}

}







