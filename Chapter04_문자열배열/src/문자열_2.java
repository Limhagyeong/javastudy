import java.util.Scanner;
// 사용자로부터 입력값 (문자열)을 받아 좌우대칭 여부를 확인하시오
// ABBA => 문자갯수가 짝수여야함 => 문자 갯수: length()
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       String msg=""; //null값 
       
       // 오류 처리
      while(true)
      {
    	  System.out.print("문자열을 입력하시오:");
    	  msg=scan.next();
    	  if(msg.length()%2==0)
    	  {
    		  break;
    	  }
    	  
      }
      // 좌우대칭 확인
      boolean bCheck=true;
      /*
       *   AV VA
       *   -   -
       *    - -
       */
      int j=msg.length()-1;  // 가장 마지막 번호
      /* if~else 사용하려면 else 문장에는 break 걸면 X
       *  ABCA
       *  AA 비교해서 같으면 => else 문장 수행으로 true로 나옴 
       *  BC => 수행 안함 
       */
      for(int i=0;i<msg.length()/2;i++)
      {
    	  char c=msg.charAt(i);
    	  char c1=msg.charAt(j);
    	  if(c!=c1)
    	  {
    		  bCheck=false;
    		  break;
    	  }
//    	  else
//    	  {
//    		  bCheck=true;
//    	  }
    	   j--;
      }
      if(bCheck==false)
      {
    	  System.out.println(msg+"은(는) 대칭 구조가 아니다");
      }
      else
      {
    	  System.out.println(msg+"운(는) 좌우 대칭이다");
      }
       
	}

}
