// 사용자정의 예외처리 => 283~285p
// 사용 거의 X
package com.sist.exception;
class MyException extends Exception
{
   public MyException(String msg)
   {
	   super(msg);
   }
}
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		  int a=21;
		  if(a%3==0)
		  {
			  throw new MyException(a+"는(은) 3의 배수를 사용할 수 없습니다");
		  }
		}
		// catch절 안에서 인식하는 예외 클래스는 라이브러리로 만들어진 클래스만 인식 가능하다
		// 사용자정의 예외처리 클래스는 인식 불가 => 직접 호출해야 사용 가능
		// 호출 시 반드시 throw new 생성자("관련 메세지") 형식
		// ==> 검색 (한글=>모음, 문자열) => if문 사용이 훨씬 편함
		catch (MyException m)
		{
			System.out.println(m.getMessage());
		}
		catch(Exception ex)
		{
			ex.printStackTrace(); // => 권장사항 : 에러 위치까지 확인해줌 
			//System.out.println(m.getMessage()); => 에러만 확인해줌
		}
		
	}

}
