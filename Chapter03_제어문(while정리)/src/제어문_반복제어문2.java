// break 숙달 중요! ==> while, for 제어 시, System.exit(0); 사용 X => 프로그램 자체를 종료시킨다는 의미임
public class 제어문_반복제어문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println(" ====== break =======");
        for (int i=1;i<=3;i++)
        {
        	for(int j=1;j<=3;j++)
        	{
        		if(j==2)
        		   break; // 특정조건에서 2차for 중단 (2차 다음 수행 X / 1차 다음 수행 O)
        		System.out.println("i="+i+",j="+j);
        	}
        }
        System.out.println(" ====== continue =======");
        for (int i=1;i<=3;i++)
        {
        	for(int j=1;j<=3;j++)
        	{
        		if(j==2)
        		   continue; // 특정조건 제외 (다음 수행 O)
        		System.out.println("i="+i+",j="+j);
        	}
        }
        System.out.println(" ====== 이름 있는 break =======");
       outer: for (int i=1;i<=3;i++)
        {
        	for(int j=1;j<=3;j++)
        	{
        		if(j==2)
        		   break outer; // outer 이름 달고있는 for 제어 (특정 조건 다음 수행 X)
        		System.out.println("i="+i+",j="+j);
        	}
        }
	}

}
