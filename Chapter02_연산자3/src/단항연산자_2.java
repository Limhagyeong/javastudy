// 형변환 연산자
/*
 *  (int)값
 */
public class 단항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=65;
        double d=(double)a;
        // 생략이 가능 (자동형변환)
        char c=(char)a;
        // 특수한 경우 => 생략이 가능 (실제 값 대입) : char c=65;
        // 연산처리가 되면 생략할 수 없다 
       System.out.println("a="+a);
       System.out.println("d="+d);
       System.out.println("c="+c);
       c=10000;
       System.out.println("c="+c);
       c=65535;
       System.out.println("c="+c);
       c=20000;
       System.out.println("c="+c);
       c='0';
       System.out.println("c="+(int)c);
       // char=> A=65, a=97, '0'=48
       
	}

}
