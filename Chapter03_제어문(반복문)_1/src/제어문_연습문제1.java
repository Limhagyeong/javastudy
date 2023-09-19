// 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
// 초기값 : 2 증가식: 2
public class 제어문_연습문제1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int sum=0;
		for (int a=2;a<=100;a+=2)	
		{
			sum+=a; // => 총합구하는 방식
        }
		System.out.println("2+4+...+100의 합:"+sum);
	}

}
