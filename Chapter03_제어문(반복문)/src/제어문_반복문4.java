// 1~100 => 루프변수 
// 총합 , 짝수의 합, 홀수의 합 ==> 누적변수
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0, even=0, odd=0;
        // => 0 => 장바구니 => 결제금액
        for (int i=1; i<=100 ; i++)
        {
        	sum+=i;
//        	System.out.println("sum="+sum+",i="+i);
        	if(i%2==0)
        		 even+=i;
        	else
        		odd+=i;
        }
        
        System.out.println("짝수의 합:"+even);
        System.out.println("홀수의 합:"+odd);
        System.out.print("총합:"+sum);
     
	}

}
