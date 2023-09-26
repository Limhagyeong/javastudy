// 대소문자 변환
/*
 *    String toUpperCase() => 대문자 변환 ==> 가끔 나옴
 *                         => 오라클에서는 대소문자를 구분하기 때문 (로그인 시 대소문자 구분)
 *    String toLowerCase() => 소문자 변환 
 */

public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String msg="Hello Java";
       
       //msg=msg.toUpperCase(); // msg를 대문자로 변환해서 저장 => 원본 변함
       
       System.out.println(msg.toUpperCase()); // msg 원본값은 변경 X
       
       //msg=msg.toLowerCase(); // 저장 => 원본 변함
       
       System.out.println(msg.toLowerCase());
       
       // 처리 => 저장하지 않으면 원본을 유지한다
       
       System.out.println(msg); // 원본출력
	}

}
