// 실제 달력 만들 때 사용하는 형식 => 배열1이랑 비교해서 보기
import java.util.*;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month;
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		year=scan.nextInt();
		System.out.print("월 입력:");
		month=scan.nextInt();
		
		// 라이브러리 이용 (API)
		
		Calendar cal=Calendar.getInstance(); // => 오늘 날짜를 불러옴
		// 클래스 저장 => 싱글턴
		// 셋팅 => year, month, day
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1); // 1일부터 출력할것
		
		char[] strweek= {'일','월','화','수','목','금','토'};
		int week=cal. get(Calendar.DAY_OF_WEEK);
		// week => 1번부터 시작 => 0번부터 시작으로 바꿔줘야함 => 일요일부터 출력하기 위해
		week=week-1;
		int lastday=cal.getActualMaximum(Calendar.DATE); // 마지막 날을 가져온다
		
//		System.out.println(year+"년도 "+month+"월 1일자는 "+strweek[week]+"요일 입니다");
		
		System.out.println(year+"년도 "+month+"월");
		System.out.println();
		for(int i=0;i<strweek.length;i++)
		{
			System.out.print(strweek[i]+"\t");
		} // 전체 요일 넣어줌
		System.out.println();
		for(int i=1;i<=lastday;i++) // 1~12까지
		{
			if(i==1)
			{
				for(int j=0;j<week;j++) // 1일에 맞는 요일부터 출력해라
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++; // 1일자에 설정된 요일에서 일자가 바뀜에 따라 맞는 요일에 출력해주는 역할
			if(week>6) // 토요일보다 커지면
			{
				week=0; // 일요일이 되고
				System.out.println(); // 한줄 띄어서 출력해라
			}
		}
		
		
	}

}
