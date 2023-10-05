/*  * 프로그램의 유형
 *    = 네트워크 : 게임 , 화상채팅 ...
 *    = 데이터베이스 : 웹***
 *  1. 리턴형
 *     = 요청 처리에 대한 결과값 전송
 *                    --------
 *                    = 한개 (기본형) => 정수, 실수, 문자, 논리
 *                    = 여러개 (배열, 클래스)
 *                                 ----- 상세보기 , 목록출력...
 *     = 결과값이 없는 경우 : 데이터 추가, 수정, 삭제 ===> void
 *                       ==> 출력
 *     = 결과값이 있는 경우 : 목록 가져오기, 상세보기, 검색 ...
 *  2. 매개변수
 *     = 사용자 요청값을 받을 경우
 *     = 여러개 사용이 가능 => 3개 이상 배열 / 클래스로 처리
 *     = 가변 매개변수
 *  3. 메소드명
 *     = 식별자 => 문자갯수(제한X) : 10글자 이내가 적당
 *     = 두개의 단어가 있는 경우
 *       userInput(), user_input()
 *       aaa() => delete() ==> 가급적 의미 알아볼 수 있도록 설정
 *  4. return문
 *      => 가급적이면 메소드 마지막에 설정
 *      => void면 생략이 가능
 *      
 *      
 *   5. 형식
 *      리턴형 메소드명(매개변수...)
 *      -----
 *      {
 *        return 값;
 *               ---> 동일 데이터형 사용
 *      }
 *   6. 유형
 *      리턴형 매개변수
 *       O     O
 *       O     X
 *       ----------------- 출력 내용이 있는 경우
 *       X     O
 *       X     X
 *       ------------------ 메소드 자체 처리 (void)
 *   7. 사용목적
 *      = 다른 클래스 연결 (메세지) => 메소드 호출
 *      = 재사용
 *      = 반복 제거
 *      = 유지보수 편리
 *      = 에러 처리 용이
 */
public class 메소드정리 {
//    static void data(String s)
//    {
//    	System.out.println(s);
//    }
//    static void data(String s, String s1)
//    {
//    	System.out.println(s+" "+s1);
//    }
	
	static void data(String...s)
	{
		for(String ss:s)
		{
			System.out.println(ss);
		}
	}
 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		data("Java");
//        data("Java","Oracle");
		data("aaa");
		data("aaa","bbb");
		data("aaa","bbb","ccc");
	}

}
