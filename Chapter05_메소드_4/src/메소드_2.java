// 리턴형 O 매개변수 X
// 아이디 찾기
import java.util.Scanner;
public class 메소드_2 {
    static String idInput()
    {
    	Scanner scan=new Scanner(System.in);
    	System.err.print("아이디 입력:");
    	return scan.next();		
    }
    // 아이디 중복체크
    static boolean idcheck(String id)
    {
    	boolean bCheck=false;
    	String[] ids= {
    			"hong","admin","lee","pakr","shim"
    	};
    	for(String i:ids)
    	{
    		if(id.equals(i))
    		{
    			bCheck=true;
    			break;
    		}
    	}
    		return bCheck;
    }
    // 모든 메소드를 조립하는 메소드 (기본)
    static void process()
    {
    	String id=idInput();
    	// 사용자가 입력한 값 받음
    	boolean bCheck=idcheck(id);
    	
    	if(bCheck)
    	{
    		System.out.println(id+"는 이미 사용중입니다");
    	}
    	else
    		System.out.println(id+"는 사용 가능한 아이디 입니다");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    process();
	}

}
