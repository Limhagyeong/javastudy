package com.sist.main2;
import java.util.*;
public class MainClass {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.print("클래스 선택:");
       int select=scan.nextInt();
       I[] i= {null,new A(),new B(),new C(), new D(), new E()};
       i[select].execute();
       // => I i=new A() 
       // 데이터형 => 데이터형을 동일하게 만든다 (상속)
       /*if(select==1)
       {
    	   A a=new A();
    	   a.execute();
       }
       if(select==2)
       {
    	   B b=new B();
    	   b.execute();
       }
       if(select==3)
       {
    	   C c=new C();
    	   c.execute();
       }
       if(select==4)
       {
    	   D d=new D();
    	   d.execute();
       }
       if(select==5)
       {
    	   E e=new E();
    	   e.execute();
       }*/
	}

}
