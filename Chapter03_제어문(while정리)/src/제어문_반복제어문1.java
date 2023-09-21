/*
 * break : 반복 중단
 *         게임 => ESC 눌러 종료하라 명령! (반복문, switch)
 * continue : 특정 부분 제외
 * --------------------------------------- 반복문에서만 사용 가능
 * *** 제어 영역 => 자신의 반복문
 * 1. for()
 * {
 *   2. for()
 *   {
 *      break; =======> 2차 for만 제어
 *   }
 *      break; =======> 1차 for만 제어
 * }
 * 
 * 1. outer: for()
 * {
 *   2. for()
 *   {
 *      break outer; =======> 1, 2차 for만 제어
 *   }
 *      
 * }
 *  
 */
public class 제어문_반복제어문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // break => 반복문 종료
		/*
		 *  for(int i=1;i<=10;i++)
		{
			if(i==3)
                break;
			System.out.println("i="+i); ==> if 소속 문장이 아니다
	    }
		 */
//		for(int i=1;i<=10;i++)
//		{
//			if(i==3)
//			{
//				// 소스 코딩이 가능 => {} 잘 보기
//                break; // i가 3이 되면 중단 (특정 조건까지 출력)
//                // 소스 코딩이 불가능
//			}
//			System.out.println("i="+i); // 1 2 출력
//		} 
		
		// continue
		
		for (int i=1;i<=10;i++)
		{
			if(i==3)
				continue; // 증가식으로 이동 (특정 조건을 제외하고 출력)
			/*
			 *  for
			 *  while
			 *  --------break는 동일
			 *  continue
			 *  --------
			 *     for => 증가식으로 이동
			 *     while => 조건식으로 이동
			 *     ---------------------> while구문에서 잘못 사용하면 무한루프 걸릴 수 있는 점 유의
			 *                            => 처음부터 다시 실행할 경우에 주로 사용
			 *     
			 */
			System.out.println("i="+i);
			// 1 2 4 5 6 7 8 9 10 출력
		}
		System.out.println(" ======= while =======");
//		int i=1;
//		while(i<=10)
//		{
//			if(i==3)
//				break;
//			System.out.println("i="+i);
//			i++;
//		}
		
		int i=1;
		while(i<=10)
		{   
			if(i==3)
				continue; // 조건식으로 이동
			System.out.println("i="+i);
			i++;
		}
	}

}
