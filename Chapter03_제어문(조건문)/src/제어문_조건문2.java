/*   56P
 *   [단일 조건문 : true일 때만 처리 / false일 때는 건너뜀]
 *   선택 조건문 => true일 때와 false일 때 처리를 나눠서 수행함
 *   -------- 예) 아이디 중복체크, 로그인 정상 수행 여부
 *                중복일 경우 ==> 이미 사용중인 아이디 입니다
 *                중복이 아닐 경우 ==> 사용 가능한 아이디 입니다
 *   형식)
 *        if(조건문)
 *        {
 *             조건문이 true일 경우
 *        }
 *        
 *        else
 *        {
 *            조건문이 false일 경우
 *        }
 *        
 *        ====> 간결하게 처리하기 위해 삼항연산자 사용하기도 함 (웹, 게임 등에 사용)
 *        ==> 짝수 / 홀수
 *        ==> 대문자 / 소문자
 *        ==> 웹 => 페이지
 *   
 */
public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char c='a';
       // 대문자 소문자
       
       if (c>='A'&&c<='Z')
       {
    	   System.out.println(c+"는(은) 대문자 입니다");
       }
       else 
       {
    	   System.out.println(c+"는(은) 소문자 입니다");
       }
       //else문장은 독립적으로 사용이 불가하다 => if문과 같이 사용돼야함
       //else문장은 바로 위에 있는 if만 지원한다
       /*
        *    if()
        *    {
        *    }//1
        *    -------
        *    if()
        *    {
        *    }//2
        *    --------
        *    if()
        *    {
        *    }
        *    else
        *    {
        *    }//3
        */
       
        int a=10;
        if(a%2==0)
        {
        	System.out.println(a+"는(은) 짝수입니다");
        }
        else
        {
        	System.out.println(a+"는(은) 홀수입니다"); 	
        }
	}

}
