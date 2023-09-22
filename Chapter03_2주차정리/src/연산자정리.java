/*
 *  연산자 
 *  ----
 *   => 결과값 (데이터형 사용)
 *   1) 피연산자 / 연산자
 *      ------ 연산 대상
 *      
 *      1개 = 단항연산자 ++a !a (char)10
 *            - 증감연산자
 *              =======
 *                 |
 *               ++, -- => 1증가,  1감소
 *               전치 : 먼저 증가 => 다른 연산 실행
 *               후치 : 다른 연산 먼저 실행=> 증가
 *               int a=10;
 *               int b=a++;  => b=10, a=11
 *                 1.---
 *                   2.---
 *                   
 *            - 부정연산자 ==> boolean 사용 (조건문)
 *              string s="aaa";
 *              s=s.replace('a','b') ==> "bbb"
 *              s="aaa" // 
 *              
 *            - 형변환연산자 
 *            -------------- boolean은 불가 (true, false)
 *            
 *      2개 = 이항연산자 a+b
 *            - 산술연산자 : +,-,*,/,%
 *            - 비교연산자 : 문자는 비교 불가 (equals) 
 *            - 논리연산자 : && , ||
 *                        --
 *                        => 범위, 기간 지정
 *                             (조건) && (조건) => 앞 조건이 false면 뒤에 조건은 검색 X (효율적 연산)   
 *                             -- => 오류 처리(잘못된 입력), 범위를 벗어났을 때
 *                                => 앞 조건이 true면 뒤에 조건은 검색 X (효율적 연산)
 *            - 대입연산자 : = += -=
 *            
 *      3개 = 삼항연산자 (조건)?값1:값2 ==> 페이지 불러오기
 *                    ----
 *                     true => 값1
 *                     false => 값2
 *      
 */
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       boolean bCheck=false;
       bCheck=!bCheck;
       if(!bCheck) // boolean은 값을 다시 받아줘야함
       {
    	   System.out.println("출력");
       }
       System.out.println(bCheck);
       int a=10;
       a++;
       System.out.println(a);
       
       String s="Hello";
       String s1= new String("Hello");
       if(s.equals(s1))
    	   System.out.println("같다");
       else
    	   System.out.println("다르다");
    		   
	}

}
