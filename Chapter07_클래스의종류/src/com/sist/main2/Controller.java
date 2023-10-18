package com.sist.main2;

public interface Controller {
	public void execute(); // => 선언 후 구현은 필요에 맞춰서 함 (구현 내용이 각각 다를 때 / 선언만)
	// public default void aaa(){} => 추가 필요 구현 부분은 default로 구현하고 들어갈 수 있음 
	// {} => 구현 부분 수정하고 싶을 때는  public void aaa(){} 형식으로 오버라이딩 가능
	// => 단점 : 필요 없는 부분도 가지고 들어와야함 => default로 보완
}

