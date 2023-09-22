//84~86P
// 문자 => 10개를 저장하는 배열을 생성=> 초기화 => 출력
//        ---------
// 실수 배열 ==> double[] arr={10, 20, ... , 50}
// => 10.0...
// double[] arr=new double[10] ==> 0.0으로 초기화
// char[] arr=new.char[10] ==> '\0'
// boolean[] arr=new boolean[10] ==> false
// String[] arr=new String[10] ==> null (주소가 없는 상태=> 모든 클래스는 null)
// index를 이용하는 프로그램
/*
 *   int[] arr=new int[3]; => 같은 데이터형끼리 모아줘야함
 *   
 *     [1]  [2]
 *   ------------
 *    0 | 0  | 0
 *  |-------------
 *  arr[0] 
 *  
 */
import java.util.Arrays;
public class 배열_생성2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] alpha=new char[10];
        // alpha[0], ..., [9] ==> char a1, ... ,a10
        // 초기화
        for(int i=0;i<alpha.length;i++) // new char[10]; 의 '10'을 가져오는거임
        {
        	alpha[i]=(char)((Math.random()*26)+65);
        }
        // alpha={'A','B','C'...}
        // 출력 => for each (제어X, 출력용임) ==> 웹 출력 시 자주 사용됨
        
        System.out.println("====== for-each: 실제 저장된 값을 읽어온다 =======");
        for(char c:alpha) // 실제 값을 가지고 들어오는거야 => alpha={'A','B','C'...}
        {
        	System.out.print(c+" ");
        }
        
        System.out.println("\n====== for(일반):index이용 =======");
        // 값을 변경하거나 초기화 줄 때 이용



for(int i=0;i<alpha.length;i++)
        {
        	System.out.print(alpha[i]+" ");
        }
        
        System.out.println("\n====== API =======");
        Arrays.sort(alpha); // 오름차순  정렬
        System.out.println(Arrays.toString(alpha));
        for(int i=alpha.length-1;i>=0;i--) // 내림차순으로 출력 (별도 메소드 없음)
        {
        	System.out.print(alpha[i]+" ");
        }
        
	}

}
