//5.	1에서 10까지 범위의 정수를 랜덤하게 생성하여 숫자들과 평균을 출력하라.

public class 자바연습문제_제어문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
        int sum=0;
//        double avg=0;
        
        for(int i=1;i<=10;i++)
        {
            int a=(int)(Math.random()*10)+1;
        	System.out.print(a+" ");
        	sum+=a;
        }
 //       avg+=sum/10.0;
 //       System.out.println("\n합계="+sum);
        System.out.printf("\n평균=%.1f\n",sum/10.0);
	}
	

}
