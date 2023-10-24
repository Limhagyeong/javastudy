package com.sist.lib;

import java.util.StringTokenizer;

/*
 *  StringTokenizer
 */
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="red|green|blue|black|white|yellow|pink|cyan|magenta";
		// \\| (X)
		StringTokenizer st=new StringTokenizer(data,"|");
		System.out.println("컬러 갯수:"+st.countTokens());
		/*String color1=st.nextToken();
		String color2=st.nextToken();
		String color3=st.nextToken();
		//String color4=st.nextToken();
		// st.nextToken() => 갯수를 벗어나면? => 오류 발생
		System.out.println(color1);
		System.out.println(color2);
		System.out.println(color3);*/
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		/*
		 *  hasMoreTokens => true면 값을 가져오고 false면 종료
		 *  1) cursor
		 *  --------------
		 *  -> before First
		 *  --------------
		 *   red => st.nextToken() ==> 데이터가 있으면 true
		 *  --------------
		 *   green => st.nextToken() ==> 데이터가 있으면 true
		 *  --------------
		 *   ...
		 *  --------------
		 *  -> after Last => st.nextToken() ==> 데이터가 없으면 false
		 *  --------------
		 */
	}

}
