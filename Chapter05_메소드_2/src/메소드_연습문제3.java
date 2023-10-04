// 1~10까지 출력하는 메소드 구현 => 사용자 요청 값 없음 => 매개변수 X
// 1~10까지 합을 구하는 메소드 구현 => 사용자 요청 값 없음 => 매개변수 X
/*
 *  리턴형 메소드명(매개변수...)
 *  {           ---------- 가변 매개변수
 *    => 자체에서 void (결과값이 없는 상태)
 *  }
 *  메소드 : 기능처리 (연산자+제어문)
 *         = 다른 클래스 연결
 *         = 재사용 (호출)
 */
public class 메소드_연습문제3 {
    static void process()
    {
    	int sum=0;
    	for(int i=1;i<=10;i++)
    	{
    		System.out.print(i+" ");
    		sum+=i;
    	}
    	System.out.println("\n합계:"+sum);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     process();
	}

}
