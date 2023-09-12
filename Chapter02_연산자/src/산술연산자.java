// 가장 기본이 되는 연산자 : 신술연산자 (38P)
/*
 *  산술연산자 : +, -, *, /, %
 *  ------ 이항연산자 (피연산자 (연산대상2개))
 */

public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // + (산술)
		// 국어 , 영어, 수학 점수의 총점을 구해라
		int kor=89;
		int eng=90;
		int math=87;
		int total=kor+eng+math;
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		//평균출력
		double avg=total/3.0;
		System.out.println("평균:"+avg);// 있는 그대로 출력
		System.out.printf("평균:%.2f\n",avg);// 원하는 형식으로 출력 (소수점 이하 두자리 출력 및 반올림)
		
		System.out.println("======== % ========");// 형식 만들어놓기
		int a=5;
		int b=2;
		System.out.println(a+"%"+b+"="+(5%2));// 위 형식으로 출력됨
		System.out.println(-a+"%"+b+"="+(-5%2));
		System.out.println(a+"%"+-b+"="+(5%-2));
		System.out.println(-a+"%"+-b+"="+(-5%-2));//왼쪽값(앞)의 부호를 따라 출력됨
		
		System.out.println("======== 형변환 =======");
		/*
		 *  자동 형변환
		 *   작은 데이터 => 큰데이터
		 *  강제 형변환
		 *   큰 데이터 => 작은 데이터 
		 *   (데이터형)값
		 *      ===========> 자동형변환
		 *   byte < char < int < long < float < double
		 *           <============= 강제형변환
		 *           
		 *   자동 형변환 
		 *    int a='A'; => a=65
		 *    double d=100; => d=100.0
		 *             -----int
		 *             
		 */
		 int aa='A';
		 System.out.println("aa="+aa);
		 double dd=100;
		 System.out.println("dd="+dd);
		 
		 System.out.println(100+10.5+10.5F+'A'); // 가장 큰 데이터값인 double이 결과값으로 나온다!
		                                         // 자동형변환이 있는 이유 => 연산은 같은 데이터끼리만 연산이 되기 때문!
		 
		 System.out.println('A'+'B'); //int로 계산됨! (65+66) => int이하이기 때문에 (byte, char, short 일 때)
	}

}
