//// => updown게임
//import java.util.*;
//public class 메소드_문제_6 {
//    static int com()
//    {
//    	 int com=(int)(Math.random()*100)+1;
//  	     return com;
//    }
//    static void user(int com)
//    {
//    	 Scanner scan=new Scanner(System.in);
//  	   while(true)
//  	   {
//  		   System.out.println("정수 입력(1~100):");
//  		   int user=scan.nextInt();
//  		   if(com>user)
//  		   {
//  			   System.out.println("입력된 값보다 큰 수를 입력하시오");
//  		   }
//  		   else if(com<user)
//  		   {
//  			   System.out.println("입력된 값보다 작은 수를 입력하시오");
//  		   }
//  		   else
//  		   {
//  			   System.out.println("Game over");
//  			   break;
//  		   }
//  	   }
//  	   
//  	   static void process()
//  	   {
//  		   int com=com();
//  		   while(true)
//  		   {
//  			   int user=user(com);
//  		   }
//  	   }
//  	   
//    	 
//    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//       // 컴퓨터가 임의로 숫자 추출
//		process();
////	   int com=(int)(Math.random()*100)+1;
////	   Scanner scan=new Scanner(System.in);
////	   while(true)
////	   {
////		   System.out.println("정수 입력(1~100):");
////		   int user=scan.nextInt();
////		   if(com>user)
////		   {
////			   System.out.println("입력된 값보다 큰 수를 입력하시오");
////		   }
////		   else if(com<user)
////		   {
////			   System.out.println("입력된 값보다 작은 수를 입력하시오");
////		   }
////		   else
////		   {
////			   System.out.println("Game over");
////			   break;
////		   }
////	   }
//	}
//
//}
