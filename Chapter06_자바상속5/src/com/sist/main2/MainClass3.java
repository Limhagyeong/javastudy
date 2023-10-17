package com.sist.main2;

import java.util.*;

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>(); // list의 리턴값은 Object
		list.add("홍길동");
//        list.add('A'); // list의 리턴값을 Object에서 String으로 형변환 시켜줬기때문에 오류

//        String name=(String)list.get(0); // Object로 넘어오기때문에 형변환 필요
		String name = list.get(0);
		// 상위클래스를 리턴 => 반드시 형변환 시켜 사용! => 라이브러리
	}

}
