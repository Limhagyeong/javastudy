// 정수 한개를 입력받아 => 짝수 홀수 판단 
import java.util.Scanner;
public class 메소드_문제_1 {
    static int arr()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.print("한개의 정수 입력:");
    	int a=scan.nextInt();
    	return a;
    }
//     static void p(int a)
//     {
//    	 if(a%2==0)
//    		 System.out.println("짝수");
//    	 else
//    		 System.out.println("홀수");
//    	 
//     }
    
     static String check(int a)
     {
//    	 String res="";
// 		if(a%2==0)
// 		{
// 			res=a+"는(은) 짝수입니다";
// 		}
// 		else
// 			res=a+"는(은) 홀수입니다";
 		return a%2==0?"짝수":"홀수";
     }
     
     static void print(String res)
     {
    	 System.out.println(res);
     }
     
     static void process()
     {
    	// int a=arr();
//    	 check(arr());
    	 print(check(arr()));
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
//		String res="";
//		if(a%2==0)
//		{
//			res=a+"는(은) 짝수입니다";
//		}
//		else
//			res=a+"는(은) 홀수입니다";
//		
//       System.out.println(res);
	}

}
