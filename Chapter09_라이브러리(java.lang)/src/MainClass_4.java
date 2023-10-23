// finalize() => 객체가 메모리 해제시에 자동 호출
// 소멸자
// 클래스는 1) 객체 생성 => A a=new A() (메모리 저장)
// 2) 기능 활용 => a.메소드명()
// 3) 메모리 해제 => finalize => 바로 회수가 안된다
//    a=null => GC대상
class A
{
	public A()
	{
		System.out.println("A 객체 생성:"+this);
	} // 메모리 할당
	public void action()
	{
		System.out.println("객체 활용");
	} // 활용
	  // GC는 바로 회수하지 않는다 => 메모리가 크기 때문에 
	  // 메모리 회수 시 자동 호출됨 (finalize)
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 메모리 해제"); 
	} // 해제
	  
	
}
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.action();
		a=null; // GC 대상
		System.gc(); // 직접 gc 호출 ==> 멀티미디어 
				
	}

}
