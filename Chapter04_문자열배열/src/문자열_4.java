/* 
 * substring() => 문자를 자를 때 사용
 *  "Hello Java"
 *   0123456789
 *   
 *   substring(6)=> 6789를 불러와라 => Java
 *   substring(0,5) => 01234를 불러와라 => Hello (마지막 번호는 제외)
 *   
 *  
 */
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="서울특별시 영등포구 국제금융로 70 B1 19호 지번 서울시 영등포구 여의도동 43 B1 19호";
//		String s1=s.substring(0,5); // endindex-1 => Hello
//		String s1=s.substring(6); // => Java
//		System.out.println(s1);
		
//		String addr=address.substring(0,address.indexOf("지번")); // ""앞 까지 잘라옴
//		System.out.println(addr);
//		String addr=address.substring(address.indexOf("지번")+3); // +3 => [지번""]=> 3글자 자른 뒤 전체 문장을 불러옴
//		System.out.println(addr);
		
//		int a= address.lastIndexOf(" ");
//		String addr=address.substring(a-10,a);
//		System.out.println(addr);
		
		String ext="Hello.Java.java";
		String s=ext.substring(ext.lastIndexOf(".")+1); // "+"는 다음 글자부터 출력하겠다는 의미
		System.out.println(s);
	}

}
