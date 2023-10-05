// 5자리 정수를 전송 => 거꾸로 출력 / 12345 => 54321
// reverse
public class 메소드_1_2 {
    static String reverse(int num) //  int로 선언 시
    		{
    	       String str=String.valueOf(num);
    	       String res="";
    	       for(int i=str.length()-1;i>=0;i--)
    	       {
    	    	   res+=str.charAt(i);
    	       }
    	       return res; //  return Integer.parseInt(res);로 출력
    		}
    
    static void process()
    {
    	System.out.println(reverse(123));
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 process();
	}

}
