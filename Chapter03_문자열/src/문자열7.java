import java.util.Scanner;
//equals (==) : 대소문자 구분 O / equalsIgnoreCase : 대소문자 구분 X

public class 문자열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       final String MID="admin",MPWD="1234";
      Scanner scan=new Scanner(System.in);
      System.out.print("아이디 입력:");
      String id=scan.next();
      System.out.print("비밀번호 입력:");
      String pwd=scan.next();
      // 로그인 정보는 대소문자 구분 필수 
      if (id.equals(MID) && pwd.equals(MPWD)) // equals => 대소문자 구분 O / equalsIgnoreCase -> 구분 X
      {
    	  System.out.println(id+"님 로그인이 되었습니다");
      }
      else
      {
    	  System.out.println("ID나 PASSWORD 오류입니다");
      }
	}

}
