package com.sist.main2;
class Movie
{ // 공통성
   /*
    *  예약을 한다
    *  영화목록을 보여준다
    *  상세보기를 보여준다
    *  영화 추천을 해준다
    */
	void reserve()
	{
		System.out.println("예약을 한다");
	}
	void list()
	{
		System.out.println("영화 목록을 보여준다");
	}
	void detail()
	{
		System.out.println("영화 상세보기를 한다");
	}
	void recommand()
	{
		System.out.println("영화 추천을 한다");
	}

} // 각 영화관 별 기능이 달라질 수 있음 => 메소드 선언만 함(설계) ==> 인터페이스 => 구현은 알아서!
class CGV extends Movie
{
    // 기능 추가 => 바꾸려는 부분만 불러와서 변경 , 구현하면 됨
	@Override
	void reserve() {
		// TODO Auto-generated method stub
		System.out.println("CGV 예약");
	}

} // 오버라이딩 => 설계한 메소드를 불러와 구현함
class MegaBox extends Movie
{

	@Override
	void reserve() {
		// TODO Auto-generated method stub
		System.out.println("MegaBox 예약");
	} // reserve 제외 나머지 기능은 Movie클래스의 기능 그대로 사용함
	  // 메소드 오버라이딩
	
	// 확장 => Movie가 가지고있는 메소드 외 다른 기능을 추가함
	public void print()
	{
		System.out.println("MegaBx:print() Call");
	} // => 상위 클래스에 존재하지 않는 메소드 
	
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        CGV c=new CGV();
        c.reserve();
        
        MegaBox m=new MegaBox();
        m.reserve();
        m.print(); // 가능
        
        // 한개의 객체만 생성하여 접근 가능 => 상위 클래스 이용
        // 상속을 받는 목적 => 관련된 클래스를 묶어서 한개의 객체 이용
        System.out.println("=====================");
        Movie mm=new CGV(); // mm은 Movie안에 있는 메소드만 호출이 가능함!
                            // 생성자로 덮어쓰기 했기 때문에 내용은 변경됨 (오버라이딩)
                            // 메소드 호출 시, Movie 안에 존재하는 CGV의 값을 불러옴 
        mm.reserve();
        // 생성자와 클래스가 다를 경우 => 오버라이딩 된 메소드를 호출해라
        mm= new MegaBox();// mm은 print()를 호출할 수 없다 => Movie에 존재하지 않는 메소드!
        mm.reserve();
      //mm.print(); // 불가능
        
        /*
         *  생성자와 클래스명이 다른 경우
         *  Movie m=new CGV()
         *  -----       -----
         *  m을 통해 접근 : Movie 안에 있는 메소드와 멤버변수에 접근이 가능
         *  m을 통해 호출 => CGV 안에 있는 오버라이딩 된 메소드와 멤버변수 호출
         *  
         *  클래스 100개
         *  => 기능별 분리
         *  => 한개의 객체를 가지고 100개를 제어 ==> Object
         *  => 배열 
         *  Object[] obj={10,"aaa",10.5,"A",new Movie()} // 모든 데이터형을 받을 수 있음
         */
       
//        Object o=10;
//        int i=(int)o;
        
        Object o=new CGV(); // o는 멤버변수, 메소드를 가지고있지 않음
        CGV cc=(CGV)o; // 객체 형변환을 통해 접근 할 수 있도록 함
        
        // 자바에서 => 클래스 객체를 리턴하는 메소드가 많이 존재한다
        //          --------------- 모든 리턴은 Object로 넘어옴
        
        
	}

}
