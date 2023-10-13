package com.sist.main;
class Sawon
{
	int sabun;
	String name;
}
// 메모리 주소 전송법 => 메모리 주소에 있는 변수값을 변경할 때 사용
// Call By Reference
// 클래스 => 데이터베이스에 있는 값을 채워온다 => 매개변수 이용
// 배열 / 클래스는 모두 적용 (예외 : String => 일반 변수)
// 160P
public class MainClass4 {
    static void change(Sawon sa)
    {
    	sa.sabun=2;
    	sa.name="이순신";
    	// 원본변경
    	// 기본형 => 복사본 => 값만 전송
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sawon s=new Sawon();
       s.sabun=1;
       s.name="박문수";
       
       System.out.println(s.sabun);
       System.out.println(s.name);
       
       change(s);
       System.out.println(s.sabun);
       System.out.println(s.name);
       
	}

}
