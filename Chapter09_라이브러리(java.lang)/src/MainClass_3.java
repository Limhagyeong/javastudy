
public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o="홍길동";
		// Object클래스는 데이터형 중에 가장 큰 데이터형
		/*
		 *  Object i=1;
		 *  i=10.5;
		 *  i='A';
		 *  i=new A();
		 */
		//String s=o; // o는 최상위 클래스이기 때문에 그냥은 넘겨줄 수 없음
		//String s=o.toString();
		String s=String.valueOf(o);
		System.out.println(s);
	}

}
