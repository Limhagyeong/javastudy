// // 1~n까지 합을 구하는 메소드 구현
/*
 *  메소드 사용시 => 호출
 *  ---------------- main()은 컴파일러에 의해 자동 호출됨
 *                  ------------------------------
 *                        | Callback
 *  메소드
 *   = Callback : 자동 호출되는 메소드 (시작점) => main()
 *   = 사용자 정의 : 프로그래머가 직접 만듦 
 *   = 라이브러리 : 이미 제작된 메소드 => 만들지 못하는 프로그램
 *     = 자바에서 제공
 *     = 외부 업체에서 지원 (Jsoup, Spring) => mvnrepository.com
 *     = CBD => 조립식 프로그램 
 *       ------------------ 메소드 호출
 *     = 조립할 때, 재사용 할 때, 유지보수 편리하게 만든다
 *     = 재사용 => 메소드 호츨
 *       int aaa() ==> int a=aaa()
 *       double bbb() ==> double b=ddd()
 *       void ccc() ==> ccc()
 *       boolean ddd() ==>  boolean d= ddd()
 *       ------------------------------------
 *       
 *       class A
 *       {
 *          int aaa(){}
 *       }
 *       class B
 *       {
 *           main()
 *           {
 *             A.aaa() ==> Math.random()
 *           }
 *        }
 */
import java.util.Scanner;
public class 메소드_연습문제4 {
    static int userInput()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("정수 입력:");
    	return scan.nextInt();		
    }
    static void sum (int a)
    {
    	int sum1=0;
    	for(int i=1;i<=a;i++)
    	{
    		sum1+=i;
    	}
    	System.out.println(sum1);
    }
    static void process()
    {
    	int a=userInput();
    	sum(a);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   process();
	}

}
