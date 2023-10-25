package com.sist.lib;
/*
 *  338p => 제네릭 => 폴더를 만들어 정리하는 것과 비슷한 개념
 *   제네릭: 데이터형을 통일화 (기존에 설정된 데이터를 변경할 때 사용)
 *         => 기본형은 사용 불가 클래스형만 사용 가능
 *            ------------------------------
 *            => Wrapper를 이용해서 기본형을 사용할 수 있게 한다
 *   <클래스형> => 자바에서는 컬렉션 => Object로 설정이 되어있다
 *   		    				 ------- 지정된 클래스형으로 변경
 *   <T> => type (클래스형)
 *   <E> => element (요소)
 *   <K> => key
 *   <V> => value
 *   
 *   List<E>
 *   Vector<E>
 *   Set<E>
 *   Map<K,V>
 *   
 *   ***장점 : 소스 간결화 => 형변환 필요가 없어지기 때문!
 *      단점 : 무조건 지정된 데이터형만 첨부해야한다
 *      ArrayList => Object
 *      ArrayList<String> => String
 *      ArrayList<Integer> => int  
 *      ArrayList<Music> => Music => 사용자정의 클래스도 가능하다
 *      => 저장된 데이터는 같은 데이터형을 사용해야 편하다
 */
class Data<T>
{
	private T t; // T가 없는 경우는 자동으로 Object를 설정하고 들어간다
	public void setT(T t)
	{
		this.t=t;
		
	}
	public T getT()
	{
		return t;
	}
	
}
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d=new Data();
		Data<String> d1=new Data<String>();
		
	}

}
