// 정수 입력 => 0~32767 => 16bit => 2진법을 출력하시오
// 입력 메소드 / 2진법 변환 메소드 / 출력 메소드
import java.awt.print.Printable;
import java.util.Scanner;
public class 메소드_2 {
	// 입력
	 static int userInput()
	 {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("정수 입력(0~32767):");
		 int num=scan.nextInt();
		 return num;
				 
	 }
    // 2진법
	 static int[] change(int num)
	 {
		 int[] binary=new int[16];
			int index=15; // 15부터 출력하겠다
		    while(true)
		    {
		    	binary[index]=num%2;
		    	num=num/2; // num=1 => 1/2=0
		    	if(num==0)
		    		break;
		    	index--;
		    }
		    return binary;
	 }

	// 출력
	 static void print (int[] binary)
	 {
		 for(int i=0;i<binary.length;i++)
		 {
			 if(i%4==0 && i!=0)
			 {
				 System.out.print(" "); 
			 }
			 System.out.print(binary[i]);
		 }
		
	 }
	 
	 // 조립
	 
	 static void process()
	 {
		 int num=userInput();
		 int[] arr=change(num);
		 print(arr);
	 }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
	}

}
