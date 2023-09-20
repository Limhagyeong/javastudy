// 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.
public class 제어문_연습문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int sum=0;
       for(int i=3;i<=4462;i++)
       {
    	   if(i%2==0)
    	   {
    		   sum+=i;
    	   }
       }
        System.out.println("결과값:"+sum);
	}

}
