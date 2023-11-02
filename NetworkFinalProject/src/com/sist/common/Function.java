package com.sist.common;
// 웹 => 구분자 없이 사용 => 파일명이 구분자 역할이기때문에 반드시 필요

public class Function {
	// 서버에 요청 => 구분
	public static final int LOGIN=100; // 100 => 구분자
	// 서버에 100을 보내면 LOGIN 처리를 해준다 
	// => 100|LOGIN ==> 내부 프로토콜
	// 상수형을 사용해서 가독성이 좋도록함
	public static final int MYLOG=110;
	public static final int WAITCHAT=200;
	public static final int EXIT=900;
	public static final int MYEXIT=910;
	 public static final int MSGSEND=990; // 쪽지보내기 
	// MY~ : 개인별 처리 => 시도중 (아직 처리는 안됨)
	// 서버에서 지시 => 클라이언트가 수행 => 같은 내용(공유)
	
	
	
}
