// 리턴값을 받는 경우
public class 메소드_3 {
    static int plus(int a, int b) // => 하나의 틀을 만들어 데이터를 관리함
         //--------
    {
    	System.out.println("plus() call");
    	System.out.println("요청처리 종료..");
    	System.out.println("결과값을 전송..");
    	return a+b;
    	// 코딩 불가 (return 마지막줄)
    }
    /*
     *  main에서는 가급적이면 처리하지 않는다 => 시작 메소드만 호출
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a=plus(10,20);
     //----------
       System.out.println("결과값:"+a);
	}

}
