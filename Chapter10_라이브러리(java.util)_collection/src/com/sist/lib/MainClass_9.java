package com.sist.lib;
import java.util.*;
interface I
{
	public void display();
}
class A implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("A: display() Call");
	}
	
}
class B implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("B: display() Call");
	}
	
}
class C implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("C: display() Call");
	}
	
}
class D implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("D: display() Call");
	}
	
}
class Container
{
	private Map<String,I> map=new HashMap<String,I>();
	public Container()
	{
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
		map.put("d", new D());
	}
	public I getBean(String key)
	{
		return map.get(key);
	}
}
public class MainClass_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container c=new Container();
		I i=c.getBean("a");
		i.display();
		System.out.println("i="+i); 
		
		i=c.getBean("a");
		i.display();
		System.out.println("i="+i); // 싱글턴 : 같은 메모리 주소 값을 가지고있음 => 메모리 누수 방지
		
		/*i=c.getBean("b");
		i.display();
		System.out.println("i="+i);
		
		i=c.getBean("c");
		i.display();
		
		i=c.getBean("d");
		i.display();*/
		
		
	}

}
