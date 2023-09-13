/*
 *  증감 연산자 ==> 반복문에서 주로 사용
 *  int a=10;
 *  a++; => a=a+1; => a+=1;
 *  --- 1개 증가 or 1개 감소
 *          ++        --
 *    = 전치연산자
 *      ++a, --a
 *    = 후치연산자
 *      a++, a--
 *      
 *    int a=10;
 *    int b=++a; ==> a를 먼저 증가하고 b에 대입
 *          ---
 *           1
 *         ---
 *          2  
 *    ==> a=11 , b=11
 *    
 *    int a=10;
 *    int b=a++; ==> b에 a를 먼저 대입하고 후에 a 증가
 *    ==> a=11, b=10
 *    
 *    ==> a=11, b=10
 *    
 *    int a=10;
 *    int b=++a + ++a + a++ ==> a값은 증가된 수만큼 1씩 더해짐 / a=13
 *          ---   ---   ---
 *           11    12    12 => b = 35
 *    int a=10;
 *            -->+1 -->+1 +1 
 *    int b= a++ + a++ + ++a; a=13 b =34
 *           ---   ---   ---
 *            10    11    13
 *     int a=10;
 *     int b=++a + a++ + ++a + a++; a=14 b=48 
 *            11 + 11 + 13 + 13 = 48
 *            
 *     int a=10;
 *     int b=a++ + a++ + a++ + a++; a=14 b=46
 *            10 + 11 + 12 + 13 = 46
 *            
 *     int a=10;
 *     int b=a-- + a++ + --a + a++ a=10 b=37
 *           10 + 9 + 9 + 9 =37
 *     ------------------------------------------
 *          
 */
public class 증감연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		 int a=10;
	     int b=++a;
	     System.out.println("a="+a+",b="+b);
	        
        a=10;
        b=a++;
        System.out.println("a="+a+",b="+b);
	}

}
