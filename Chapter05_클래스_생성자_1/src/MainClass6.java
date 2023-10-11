class B{
	int a=10;
	// void 등이 앞에 붙으면 일반함수 (생성자가 아니다)
	void B(){
		System.out.println("B클래스의 디폴트 생성자 호출");
	}
	/*
	 *  생성자 => 초기화가 필요할 때 혹은 명시적 초기화가 불가능할 때
	 *          제어문 / 파일 읽기 등이 필요할 때
	 *       => 시작과 동시에 처리 해야할 때 => 가장 먼저 호출
	 *          -------------
	 *               |
	 *            자동 로그인
	 *            윈도우 화면 설정
	 *            서버 연결 
	 *            데이터베이스 연결
	 */
}
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      new B(); // 단독 호출 시 반드시 new 생성자 형식으로 호출
//		new B().a=100;
		//----------
//		System.out.println(new B().a);
                        //-------- 위의 new B()와는 다른 메모리!
		B b=new B(); // 생성자 호출
		b.B(); // void 호출
//		b.a=100;
//		System.out.println(b.a);
//		                //-------- 위의 b와 같은 메모리!
		
	}

}
