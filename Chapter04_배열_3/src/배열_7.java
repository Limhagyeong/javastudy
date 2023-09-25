// 년도/ 월/ 일=> 요일 출력
import java.util.Calendar;
import java.util.Scanner;
// => 연산자 / 제어문 활용법 ==> 1차원 배열
public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.println("년도 입력:");
        int year=scan.nextInt();
        
        System.out.println("월 입력:");
        int month=scan.nextInt();
        
        System.out.println("일 입력:");
        int day=scan.nextInt();
        
        /*
         *  요일 구하는 방식
         *  -------------
         *  1년 ~ 요청한 날까지 날의 총수를 구한다 % 7 ==> 요일
         */
        
        char[] strWeek= {'일','월','화','수','목','금','토'};
        int[] lastday= {
        		31,28,31,30,31,30,
        		31,31,30,31,30,31
        }; 
        
        // 1. 전년도까지 날수 => 12.31
        
        int total=(year-1)*365
        		 +(year-1)/4
        		 -(year-1)/100
        		 +(year-1)/400;
        // 윤년일 경우 변경 (2월 날짜를 29일로 바꿔야함)
        if((year%4==0 && year%100!=0) || (year%400==0))
        	lastday[1]=29;
        else
        	lastday[1]=28;
        // 2. 전달까지 날수
        for(int i=0;i<month-1;i++)
        {
        	total+=lastday[i];
        }
        // 3. 요청한 날 =================> 1+2+3%7 ==> 0~6사이가 나옴 
        total+=day; // total++; => 달력만들기
        
        // 요일 구하기
        int week=total%7; // ==> 배열_8의 get(Calendar.DAY_OF_WEEK);과 동일
        
        System.out.println(year+"년도 "+month+"월 "
        		+day+"일은 "+strWeek[week]+"요일입니다");
        
	}

}



