//  int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식 작성 (조건문
public class 제어문_연습문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x=(int)(Math.random()*20)+1;
       System.out.println("변수:"+x);
       
       if (x>10 && x<20)
       {
    	   System.out.println("true");
       }
       else
       {
    	   System.out.println("flase");
       }
	}

}
