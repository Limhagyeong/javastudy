package com.sist.main2;
class Super
{
	
}
class Sub extends Super
{
	
}
// <에러> NullPointerException => 주소값이 없는 상태에서 호출
// Super ssss;
// ssss.~ => 호출 시 오류!
// <에러> ClassCastException => 형변환 오류 
public class MainClass4 {
    static String str; // null
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Super s=new Sub(); // 객체 생성
        //Sub ss=(Sub)new Super(); // => 오류! 형변환 형식이 아님! => ClassCastException
        //Sub ss=(Sub)s; // 객체 형변환 형식
		
        char c=str.charAt(0); // NullPointerException
        
        //Super sss=new Super();
        //Sub ssss=(Sub)sss; // => 오류! / 하위 클래스를 생성자로 받아 형변환은 가능하지만 반대는 불가능하다
	}

}
