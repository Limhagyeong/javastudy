/*
 *   while 응용
 *   
 *   for()
 *   {
 *     while()
 *     {
 *       if()
 *       {
 *         for()
 *         {
 *         
 *         }
 *       }
 *     }
 *   }
 */
//1~100까지 짝수의 합, 홀수의 합
public class 제어문_반복문_1 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int even=0,odd=0;
        int i=0;
        
        while (i<=100)
        {
        	if(i%2==0)
        		even+=i;
        	else
        		odd+=i;
        	    i++;
        }
        System.out.println("짝수의 합:"+even);
        System.out.println("홀수의 합:"+odd);
	}

}
