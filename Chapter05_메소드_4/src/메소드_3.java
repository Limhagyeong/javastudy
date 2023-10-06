// 숫자 야구 게임
import java.util.*;
/*
 *  1. 컴퓨터가 임의 난수 발생 => []
 *  2. 사용자 숫자 입력 
 *  3. 힌트
 *  4. 종료 여부 확인
 *  5. 조립
 */
public class 메소드_3 {
    static int[] COM()
    {
    	int[] com=new int[3];
    	for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			//          1.----------------
			//    2.---
			//                          3.-
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
    	return com;
    }
    static int[] USER(int[] user)
    {
    	user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true) // 무한루프 => 종료여부
		{
			System.out.println();
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100 && input>99)
			{
				System.out.print("잘못된 입력 입니다");
				continue; // ==> for문 : 증가식으로 이동 // while문 : 조건식으로 이동
				          // ==> 제외 시 for문 // 처음부터 실행 시  while문
			}
			
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("같은 수는 사용할 수 없습니다");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다");
				continue;
			}
			break;
			
    }	
		return user;
  }
    static int hint(int input, int[] com, int[] user)
    {
    	int s=0,b=0;
		for(int i=0;i<3;i++) // com
		{
			for(int j=0;j<3;j++) // user
			{
				 if(com[i]==user[j]) // 같은 수가 있는지 확인
				 {
					 if(i==j) 
					 {
						 s++; // 같은 자리 수
					 }
					 else
					 {
						 b++; // 다른 자리 수
					 }
				 }
			}
		}
		return s;
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 컴퓨터가 임의 난수 발생
		int[] com=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			//          1.----------------
			//    2.---
			//                          3.-
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
//		System.out.println(Arrays.toString(com));
		
		//사용자 요청 값
		int[] user=new int[3];
		Scanner scan=new Scanner(System.in);
		while(true) // 무한루프 => 종료여부
		{
			System.out.println();
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			if(input<100 && input>99)
			{
				System.out.print("잘못된 입력 입니다");
				continue; // ==> for문 : 증가식으로 이동 // while문 : 조건식으로 이동
				          // ==> 제외 시 for문 // 처음부터 실행 시  while문
			}
			// 배열에 입력된 값을 저장
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("같은 수는 사용할 수 없습니다");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다");
				continue;
			}
			
			// 힌트 제공
			int s=0,b=0;
			for(int i=0;i<3;i++) // com
			{
				for(int j=0;j<3;j++) // user
				{
					 if(com[i]==user[j]) // 같은 수가 있는지 확인
					 {
						 if(i==j) 
						 {
							 s++; // 같은 자리 수
						 }
						 else
						 {
							 b++; // 다른 자리 수
						 }
					 }
				}
			}
			// 힌트 출력
			System.out.printf("Input Number:%d,Result:%dS-%dB",
					input, s, b);
			if(s==3)
			{
				System.out.print("Game Over");
				break;
			}
		}
		
		
	}

}
