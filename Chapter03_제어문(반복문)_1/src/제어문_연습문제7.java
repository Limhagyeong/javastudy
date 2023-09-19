// 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
public class 제어문_연습문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
		for(int a=1;a<=10;a++)
        {
        	if(a%2==0)
        		  sum-=a;

        	else
        		  sum+=a;
        }
		System.out.println("1-2+3...-10까지의 합:"+sum);
	}

}
