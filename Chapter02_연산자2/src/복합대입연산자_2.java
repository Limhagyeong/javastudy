// <<= , >>= 쉬프트 연산자 (비트이동연산자)
/*
 *   << : 비트를 왼쪽으로 이동
 *   >> : 비트를 오른쪽으로 이동
 *   
 *   int a=27;
 *   a=a<<3 ===> a<<=3 => a*2^3
 *   -----------------
 *     16+8+2+1
 *     11011
 *  11011(0)(0)(0) => 11011000
 *                    -------
 *                     128+64+16+8 ==> 216 
 */
public class 복합대입연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=27; // 11011
        a<<=3; // 11011000
        System.out.println("a="+a);
        
        a=27;
        a>>=3; // 11
        System.out.println("a="+a);
        
        //  a=33 ==> 왼쪽으로 2이동 오른쪽으로 2이동
        a=33;
        a<<=2;
        System.out.println("a="+a);
        
        a=33;
        a>>=2;
        System.out.println("a="+a);
        
        		
	}

}
