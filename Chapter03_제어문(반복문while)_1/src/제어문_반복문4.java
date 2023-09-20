// 사용자로부터 정수 1개 => 구구단 출력
import java.util.Scanner;
public class 제어문_반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // int a=0,b=0,c=0,d=0,e=0; => 변수가 여러개면 while 돌릴 수 없음 / 통일 시켜주면 가능 (rand..)
	  // => int[] arr=new int[10];
		
		 int a=0;
		 Scanner scan = new Scanner(System.in);
	     System.out.print("단 입력:");
	     a=scan.nextInt();
	     
	    int i=1;
	    while (i<=9)
	    {  
	    	System.out.printf("%d*%d=%d\n",a,i,a*i);
	    	i++;
	    }
        
	}

}
