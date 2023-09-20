/*
 *  ★
 *  ★★
 *  ★★★
 *  ★★★★
 *  
 *  
 *   ★★★★
 *   ★★★
 *   ★★
 *   ★
 *   
 *    i   j
 *   줄수 별표 | 역순 => 더한다
 *   1   4   5
 *   2   3   5
 *   3   2   5
 *   4   1   5
 *   ------------ i+j=5 => j=5-i
 *   
 *   A
 *   BC
 *   DEF
 *   GHIJ
 *   
 *   
 */
public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//		for (int i=1;i<=4;i++)
//        {
//        	for (int j=1;j<=i;j++)
//        	{
//        			System.out.print("★");
//        	}
//        	System.out.println();
//        }
		
//		for (int i=1;i<=4;i++)
//        {
//        	for (int j=1;j<=5-i;j++)
//        	{
//        			System.out.print("★");
//        	}
//        	System.out.println();
//        }
		
		char c='A';
		for (int i=1;i<=4;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(c++);
			}
			System.out.println();
		}
				
	}

}
