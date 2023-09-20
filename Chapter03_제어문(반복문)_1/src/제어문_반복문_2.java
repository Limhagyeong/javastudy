/*
 *     1차 for
 *     for(시작점;어디까지;몇씩증감)
 *         초기값  조건식  증감식
 *     예) 1~100까지 출력
 *        for(int i=1;i<=100;i++)
 *     예) 1~100까지 => 홀수
 *         for(int i=1;i<=100;i+=2)
 *     예) 1~100까지 => 짝수
 *         for(int i=2;i<=100;i+=2) 
 *    ------------------------------------
 *    문자는 정수 (문자는 모든 연산 시 정수로 변환된다)
 *    for(int i=...
 *        --- for문 {} 안에서만 사용이 가능하다
 *    변수 사용 범위 {} 메모리 해제
 *   
 *    int y=0;
 *    for
 *    {
 *      int a=10;
 *      {
 *        int b=20;
 *        {
 *          int c=30;
 *        }
 *      }
 *      
 *    } // for문 안에있는 int 변수는 지역 변수 (for문 밖에서는 사용 불가함) => 계속 사용하고싶으면 for 밖에서 선언 (int y=전역변수)
 *    
 *    중첩 for => 2차 for
 *    
 *    for(초기값;조건식;증감식)
 *    {
 *        for(초기값;조건식;증감식)
 *        {        -----!!!
 *        
 *        }
 *    }
 */
public class 제어문_반복문_2 {
	static int aaaa = 100; // 클래스끼리의 변수 연결 기능

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) // 줄수
		{
			for (int a = 1; a <= 5 - i; a++) // 실제 출력문
			{
				System.out.print("★");
			}
			System.out.println();
		}

	}

}
