/*
 *  updown 게임
 *  -----------
 *   컴퓨터가 난수 발생 : 1~100 사이
 *   --------------------------
 *     => 힌트
 *        입력값 < 난수 => up
 *        입력값 > 난수 => down
 *        
 *     => 몇바퀴 돌릴지가 관건! => 정답이 나올 때까지 반복 
 *                            ---------------- 무한루프
 *                            for(;;) <=> while(true)
 */
import java.util.Scanner;
// import java.lang.*
public class 제어문_반복문9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수발생
		int com=(int)(Math.random()*100)+1;
        Scanner scan=new Scanner(System.in);
        int count=0; // => 입력횟수
        for(;;) // 무한루프 => 종료 => break , System.exit(0) -> 정상종료 , System.exit(1) -> 비정상종료
        {
        	System.out.print("1~100 사이의 값 입력:");
        	int user=scan.nextInt();
        	if(user<1 || user>100)
        	{
        		System.out.println("잘못된 입력값입니다");
        		continue; // => 오류값 입력하였을 시 초기화
        	}
        	count++;
        	// 힌트
        	if(user<com)
        		{
        		System.out.println("높은 정수 입력(UP)");
        		}
        	else if(user>com)
        		{
        		System.out.println("낮은 정수 입력(DOWN)");
        		}
        	else
        		{
        		System.out.println("Game Over!");
        		System.out.println("입력횟수:"+count);
        		System.exit(0);
        		}
        		
        }
      
	}

}
