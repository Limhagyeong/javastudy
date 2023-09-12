/*  교제 25P 관리할 데이터를 저장하는 공간을 변수라고 한다!
 *          한개만 저장이 가능
 *          
 *  변수 : 변수명 => 소문자로 시작
 *        식별자 (명명규칙) 
 *        1. 알파벳이나 한글로 시작
 *           ---- 대소문자 구분
 *           ABC abc Abc -> 각 다른 변수
 *        2. 명칭의 개수는 제한하지 않는다 
 *           => 3~7로 압축
 *           a, b, c => kor, math, eng (의미부여해주기)
 *        3. 숫자는 사용 가능
 *          but, 앞에 사용은 불가!
 *        4. 특수문자 사용 가능 (  $ , _ ) -> 언더바는 많이 사용!
 *           file_name
 *           _name => 임시변수
 *        5. 변수명에 공백 추가는 불가
 *        6. 키워드 사용 불가
 *           ---- 자바에서 사용하는 단어 (public, class, int 등)
 *           
 *   변수
 *    1) 선언 
 *       데이터형 변수명 ;
 *       -----   
 *       int  a; -> 4byte 메모리 공간을 만들어 이름을 a라고 명칭하겠다
 *    2) 초기값 부여
 *       a=100;
 *    3) 동시 처리 => int a=100; (사용빈도 높음)
 *    4) 값 읽기, 값 변경
 *       ------------- 읽기(값을 가지고 옴) / 쓰기(저장) / 수정
 *       
 *  교제 26P 
 *  정수값을 저장한다 (200)
 *   => int num=200;
 *      --- --- ----
 *       |   |    |
 *    데이터형 변수 리터럴              
 *   => 프로그램 개발 : 가독성 , 퍼포먼스 (속도)
 *                   ---- 리팩토링
 *               
 *      
 *                  
 */
public class 자바변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       byte _byte=127;
       int _int=20000;
       long _long=20000; //20000L
       float _float=10.5f;
       double _double=100; //100.0
       char _char=65; //'A'
       boolean _boolean=true;
       
       System.out.println("_byte:"+_byte);
       // + (산술) + (문자열 결합)
       System.out.println("_int:"+_int);
       System.out.println("_long:"+_long);
       System.out.println("_float:"+_float);
       System.out.println("_double:"+_double);
       System.out.println("_char:"+_char);
       System.out.println("_boolean:"+_boolean);
	}

}
