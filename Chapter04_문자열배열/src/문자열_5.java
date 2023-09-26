/*
 *  split =>  String[]
 *  하정우 ,  임시완 ,  배성우 ,  김상호
 */
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       String actor= "하정우,임시완,배성우,김상호";
//       String[] movie=actor.split(",");
//       System.out.println(movie[0]);
//       System.out.println(movie[1]);
//       System.out.println(movie[2]);
//       System.out.println(movie[3]);
		
//		String actor= "하정우|임시완|배성우|김상호";
//		String[] movie=actor.split("\\|"); //  regex => 정규식
//	    System.out.println(movie[0]);
		
		String name="       Hello Java ";
		System.out.println(name);
		System.out.println(name.trim()); // .trim() 좌우 공백을 제거함
		// replace => 원하는 문자를 변경
		
		String s="Hello Java";
		System.out.println(s.replace('a', 'b')); // 문자 바꾸기
		System.out.println(s.replace("Java", "Oracle")); // 문자열 바꾸기
		System.out.println(s); // 원본
		System.out.println(s=s.replace("Java", "Oracle")); // s값 저장      
		System.out.println(s); // 변환
		
		
		// 문자열 결합
		String msg="나라가 독립을 했으면 당연히 우리 기록도 독립이 되어야지!";
		if(msg.length()>20)
		{
			msg=msg.substring(0,20)+"..."; // 문자 갯수 자르기
//			msg=msg.substring(0,20).concat("..."); // 위에 코드랑 같은 표현 but, 잘 사용 안함
		}
		System.out.println(msg);
		
	}

}
