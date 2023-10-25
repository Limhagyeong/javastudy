package com.sist.lib;
import java.util.*;
/*
 *  class A
 *  {
 *     int a,b;
 *     public void aaa(){}
 *     public void bbb(){}
 *  }
 *  class B extends A
 *  {
 *     int c;
 *     public void ccc(){}
 *     -------------------
 *     int a,b;
 *     public void aaa(){}
 *     public void bbb(){}
 *     -------------------- // 상속 받은 영역
 *  }
 *  
 *  B b=new B();
 *    => a,b,c,aaa(),bbb(),ccc() => B가 가지고있는 변수와 메소드
 *  A a=new A();
 *    => a,b,aaa(),bbb() => A가 가지고있는 변수와 메소드
 *  A b=new B();
 *    => a,b,aaa(),bbb() => A가 가지고있는 변수, B에서 오버라이딩된 메소드
 * 
 */
class Sawon
{
	private int sabun;
	private String name;
	private String dept;
	public Sawon(int sabun,String name,String dept)
	{
		this.sabun=sabun;
		this.name=name;
		this.sabun=sabun;
	}
	public void print()
	{
		System.out.println("사번:"+sabun);
		System.out.println("이름:"+name);
		System.out.println("부서:"+dept);
	} // 상속 내린 클래스가 Object보다 작기 때문에 출력시 Object.print 사용이 불가하다
	  // => Sawon으로 형변환 해줘야함
	
}
// Object 대신 저장해야 되는 데이터형으로 설정 => 모든 매개변수,리턴형이 변경된다
// => 제네릭 => 컬렉션은 가급적이면 제네릭 사용을 권장한다
// => 데이터 첨부시에 원하는 데이터만 첨부가 가능하게 만들어준다
// => 분석이 쉬워진다 => 가독성이 높아짐 => 명시적이기 때문!
// 데이터를 저장할 때 => 같은 데이터를 첨부 => 제네릭을 선언하면 다른 데이터형은 첨부할 수 없다
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Sawon> list=new ArrayList<Sawon>();
		// Sawon이라는 폴더를 만들어 관리하는 개념으로 이해하면 편함!
		// 폴더별로 저장 => 찾기!
		// 제네릭 => <클래스> => 기본형은 반드시 Wrapper 클래스 사용해줘야함
		// ArrayList<int> (X) => ArrayList<Integer> (O)
		list.add(new Sawon(1,"홍길동 1","개발"));
		list.add(new Sawon(2,"홍길동 2","영업"));
		list.add(new Sawon(3,"홍길동 3","인사"));
		//list.add("Hello"); => Sawon 클래스에 없는 데이터이기 때문에 오류
		
		for(int i=0;i<list.size();i++)
		{
			//Object obj=list.get(i);
			// Object => clone(), finalize(), toStirng()
			Sawon obj=list.get(i);
			          //---------- => ArrayList<Sawon> list=new ArrayList<Sawon>();로 선언
			          //---------- => Object에서 Sawon으로 형변환 됨!
			obj.print();
			
		}
		// list => Object
		/*list.add(1);
		list.add(2);
		list.add(3);
		list.add("홍길동");
		list.add(4);
		list.add(5);
		for(int i=0;i<list.size();i++)
		{
			Object obj=list.get(i);
			System.out.println(obj);
		}*/
		
		
		
	}

}
