/*
 *  while 
 *  -----
 *    => 10개의 난수 발생 => 1~100
 *    => 최댓값 최솟값
 */
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int max=1,min=100; // 최댓값은 가장 작은 값으로 초기화 , 최솟값은 가장 큰 값으로 초기화
        int i=1; // 루프변수
        while (i<=10)
        {
        	int rand=(int)(Math.random( )*100)+1;
        	System.out.print(rand+" ");
        	  if(max<rand)
              	max=rand;
        	  if(min>rand)
        		  min=rand;
        	i++; // i가 10이 될때까지 돌려준다 => 11되면 종료
        }
        System.out.println("\n최댓값:"+max);
        System.out.println("최솟값:"+min);
        
	}

}
