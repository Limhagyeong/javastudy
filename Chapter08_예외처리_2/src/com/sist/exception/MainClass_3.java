package com.sist.exception;

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 선택적인 부분 => 원하는 부분에서 사용 가능
		//0으로 나눈 경우(오류) 제외하고 10번째까지 모두 출력
	    // 오류 발생 시 제외 할 때 for문 안에 사용
		//try
		//{
			for(int i=1;i<=10;i++) // for문 안쪽으로 예외처리 해줘야함 => continue랑 동일한 효과
			{
				try {
					int j=(int)(Math.random()*3); // 0나올 시 오류 (0으로 나눌 수 없음)
					System.out.println("i="+i+"j="+j);
					System.out.println("i/j="+(i/j));
				}catch(Exception ex)
				{
					
				}
			}
		//}catch(Exception ex)
		//{
			
		//}
	}

}
