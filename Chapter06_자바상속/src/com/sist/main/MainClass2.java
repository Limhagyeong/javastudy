package com.sist.main;
class A
{
	int a=10,b=20;
	void aaa() 
	{
		System.out.println("A:aaa() call");
	}
} 
class B extends A
{
	int a=100,b=200;
	int c,d;
	//오버라이딩 => 상속받은 메소드 변경
	void aaa()
	{
		System.out.println("B:aaa() Call");
	}
	void bbb()
	{
		System.out.println("B:bbb() call");
	}
}
// B클래스는 A클래스에 있는 모든 것을 사용할 수 있다 (a,b,aaa())
// A클래스는 B클래스에 있는 모든 것을 사용할 수 없다 
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a=new A();
       System.out.println("a=>"+a.a);
       System.out.println("b=>"+a.b);
//       System.out.println("c=>"+a.c);
//       System.out.println("d=>"+a.d);
       // B클래스에 있는 변수나 메소드 사용 불가
       a.aaa();
       
       System.out.println("===================");
       B b=new B();
       System.out.println("a=>"+b.a);
       System.out.println("b=>"+b.b);
       System.out.println("c=>"+b.c);
       System.out.println("d=>"+b.d);
       b.aaa();
       b.bbb();
       // A클래스에 있는 변수나 메소드 사용 가능
       
       // A > B => 클래스의 크기 ==> 범위 (상속을 내린 클래스가 항상 크다!)
       /*
        *  A a=new B(); 
        *  B b=new A(); // 오류 => 형변환은 가능
        */
       
       System.out.println("===================");
       A aa=new B();
       // aa => a,b,aaa()만 접근 가능
       System.out.println("aa.a=>"+aa.a); // 10
       System.out.println("aa.a=>"+aa.b); // 20
//       System.out.println("aa.a=>"+aa.c);
//       System.out.println("aa.a=>"+aa.d);
       // B클래스에 있는 변수나 메소드 사용 불가
       aa.aaa();
       // 멤버변수 => A aa ==> a=10, b=20
       // 메소드 => 생성자 => B클래스의 aaa() 호출
//       aa.bbb();
       // B클래스에 있는 변수나 메소드 사용 불가
       
       System.out.println("===================");
       B bb=(B)aa; // 형변환 => 상위클래스 => 하위클래스로 받는 경우
       // --------- 사용 빈도수 가장 높음
       System.out.println("bb.a=>"+bb.a);
       System.out.println("bb.a=>"+bb.b);
       System.out.println("bb.a=>"+bb.c);
       System.out.println("bb.a=>"+bb.d);
       bb.aaa();
       bb.bbb();
//     B cc=new A(); // 오류 => int aa=10.5;
//     B cc=(B) new A(); // int aa=(int)10.5;
       /*
        *  상속 : (기본) 하위클래스로 접근
        *             --------
        *             class A
        *             class B extends A
        *             B b=new B(); => 기본 코딩
        *              = static , private , 생성자, 초기화 블록
        *              = 상위 클래스는 공통적으로 사용하는 메소드, 변수
        *             A => 여러개를 한개의 클래스로 제어 시 사용
        */
       
       /*
        *  학생          회사원 
        * ----         -------
        * 학번           사번
        * -------------------- 
        * 이름           이름
        * 나이           나이
        * -------------------- 
        * 학년           연차
        * --------------------- 
        *  먹는다()      먹는다()
        *  잠을 잔다()   잠을 잔다()
        *  --------------------- 
        *  공부한다()    업무한다()
        *  
        *        <<사람>> => 상위클래스 (공통 변수, 메소드)
        *          이름
        *          나이
        *         먹는다()
        *        잠을 잔다()
        *   --------------------------
        *      |                  |
        * 학생 extends 사람   회사원 extends 사람 
        * 학번               사번
        * 학년               연차
        * 공부한다()          업무한다()
        * ---------------------------------------------> 반복제거
        * *** 단일 상속만 가능하다
        * 
        * 상위 클래스는 하위 클래스의 변수, 메소드 사용이 불가하다
        * 하위 클래스는 상위 클래스의 변수, 메소드 사용이 가능하다
        *           ==> static 변수는 상속은 아니지만 사용이 가능하다! (공통 변수이기 때문)
        * 객체 생성
        * 하위 클래스로 객체 생성
        * class A
        * class B extends A
        * 
        * => B b=new B();
        * => A a=new B(); // => 변수는 A클래스에서, 메소드는 B클래스에서 값 불러옴
        *                    => 여러개의 클래스를 한개로 묶어서 사용 (사용 빈도 낮음)
        * => A bb=new B(); 
        *         --------
        *    B cc=(B)bb; // => 형변환 중요! (생성자 매칭)
        *         --
        *   
        *   class 동물
        *   class 사람 extends 동물
        *   class 개 extends
        *   class 고양이 extends
        *   class 소 extends
        *   class 말 extends
        *   class 돼지 extends
        *   
        *   ------------------------
        *   동물 ani=new 사람();
        *   
        *   ani=new 개();
        *   
        *   ani=new 고양이();
        *        
        *        
        */
       
	}

}
