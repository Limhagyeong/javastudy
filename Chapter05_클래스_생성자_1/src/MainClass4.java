import java.util.*;

class A{
	static int[] arr=new int[5]; // static 붙이면 메모리 영역이 하나가 됨
	// 클래스 영역에선 선언만 가능
	A() {
      for(int i=0;i<arr.length;i++)
      {
    	  arr[i]=(int)(Math.random()*100)+1;
    	  // 생성자 영역에선 구현 가능
    	  
      }
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new A(); // arr이 저장된 상태
        System.out.println(Arrays.toString(a.arr));
        
        A b=new A(); // a와는 다른 arr이 또 저장되는 상태 (독립적)
        System.out.println(Arrays.toString(b.arr));
        System.out.println(Arrays.toString(a.arr)); // static 있으면 동일영역
         
	}

}
