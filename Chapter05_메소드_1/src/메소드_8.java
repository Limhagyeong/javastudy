/* 세번 호출 시 결과값
 * 
 * increment() => 1
 * increment() => 1
 * increment() => 1
 * 
 *  ==> 초기화됨 (시작점으로 돌아감)
 *  
 */
public class 메소드_8 {
    static void increment()
    {
    	int num=1; // 지역변수 (메소드 안에서만 사용됨)
    	System.out.println(num);
    	num++;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increment();
		increment();
		increment();
		
	}

}
