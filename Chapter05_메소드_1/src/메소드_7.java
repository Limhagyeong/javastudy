import java.util.Scanner;
// 로그인 처리
// 사용자로부터 받는 값 => id, pwd (매개변수) 
// 처리에 대한 결과값 (로그인 여부) => 메소드 => void: 해당 메소드 내에서 처리 or 결과값 받기?
// =>  결과값 받아서 처리 : boolean , int (0,1) , String
//                     -------> 빈도수 가장 높음
public class 메소드_7 {
    static String userInput(String msg)
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print(msg+"를 입력하시오:");
    	return scan.next();
    }
    static boolean isLogin(String id, String pwd)
    {
    	final String ID="admin"; // 상수
    	final String PWD="1234";
    	// 파일, 오라클에 저장되어있는 데이터를 불러옴 => 없기때문에 임시로 입력해줌
    	boolean bCheck=false;
    	if(id.equals(ID) && pwd.equals(PWD))
    	{
    		bCheck=true;
    	}
//    	else
//    	{
//    		bCheck=false;
//    	} // 생략가능
    	return bCheck;
    }
    static void process()
    {
    	String id=userInput("아이디");
        String pwd=userInput("비밀번호"); 
    	boolean bCheck=isLogin(id, pwd);
        // boolean => bXxx 형식으로 변수명 선언함
        // 메소드 isXxx => 리턴형 : boolean
        // get: 가져옴 remove : 지움
        // 처리
        if(bCheck==true)
        {
        	System.out.println("메인 화면으로 이동 (response.sendRedirect('main.jsp'))");
        }
        else
        {
        	System.out.println("아이디 혹은 비밀번호가 틀렸습니다(history.back())");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

     process();
        
        
	}

}
