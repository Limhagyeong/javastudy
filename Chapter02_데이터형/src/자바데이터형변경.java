
public class 자바데이터형변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int _int=(int)100.0; // (int)=> 소수점 이하를 지워줌 (int로 변경하라고 강제 명령)
     System.out.println("_int:"+_int);
     
     byte _byte=(byte)300;
     System.out.println("_byte:"+_byte); // byte는 127까지 표현 가능 -> 127 초과되어 10진법 변환 -> 00101100
     System.out.println(0b00101100); // 0b -> 10진법 출력 방법
	}

}
