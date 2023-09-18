/*
 *  컴퓨터 VS 플레이어 => 가위 바위 보
 *  ----------------------------
 *  => 다중조건문 => 경우의 수 9개
 *  
 *     가위(0)         가위  
 *                    바위 
 *                     보 
 *     바위(1)         가위 
 *                    바위 
 *                     보 
 *     보(2)           가위 
 *                    바위 
 *                     보 
 *       ==========> 중첩 if ===> 55P 
 *                   if(조건문) ==========> 한개의 조건문 ==> &&          
 *                   {
 *                       if(조건문) // 관리자
 *                         {
 *                         
 *                         }
 *                         if(조건문) // 사용자
 *                         {
 *                         
 *                         }
 *                   }
 *                   else
 *                   {
 *                    Guest 라면
 *                   }
 */
import java.util.Scanner;
public class 제어문_조건문3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int com,user;
		 com=(int)(Math.random()*3);
	     Scanner scan=new Scanner(System.in);
	     System.out.println("가위(0), 바위(1), 보(2):");
	     user=scan.nextInt();
	     
	     //가공
	     System.out.print("컴퓨터:");
	     if(com==0)
	    	 System.out.println("가위");
	     else if(com==1)
	    	 System.out.println("바위");
	     else if(com==2)
	    	 System.out.println("보");

	     System.out.print("사용자:");
	     if(user==0)
	    	 System.out.println("가위");
	     else if(user==1)
	    	 System.out.println("바위");
	     else if(user==2)
	    	 System.out.println("보");
	         System.out.println();
	         System.out.println("=======결과=======");
	         
		     // 최종 결과값
	         /*                   <결과:com-user>
	          *  com==0(가위)
	          *          user=0(가위) => S (0)
	          *          user=1(바위) => U (-1)
	          *          user=2(보) => C (-2)
	          *   com==1(바위)
	          *          user=0(가위) => C (1)
	          *          user=1(바위) => S (0)
	          *          user=2(보) => U (-1)
	          *   com==2(보)
	          *          user=0(가위) => U (2)
	          *          user=1(바위) => C (1)
	          *          user=2(보) => S (0)
	          *          
	          *   <결과값>     
	          *   com-user= 0 => S
	          *           = -2,1 => C.W
	          *           = -1,2 => U.W
	          *                 
	          *                 
	          */
	         
	     int res=com-user;
	     if (res==-2 || res==1)
	     {
	    	 System.out.println("컴퓨터 Win");
	     }
	     else if(res==-1 || res==2)
	     {
	    	 System.out.println("사용자 Win");
	     }
	     else
	     {
	    	 System.out.println("비겼다");
	     }
	     

	     
//	     if(com==0)// 컴 가위
//	     {
//	    	 if(user==0)
//	    		 System.out.println("비겼다");
//	    	 else if(user==1)
//	    		 System.out.println("사용자 Win");
//	    	 else if(user==2)
//	    		 System.out.println("컴퓨터 Win");
//	    		 
//	     }
//	     else if(com==1)// 컴 바위
//	     {
//	    	 if(user==0)
//	    		 System.out.println("컴퓨터 Win");
//	    	 else if(user==1)
//	    		 System.out.println("사용자 Win");
//	    	 else if(user==2)
//	    		 System.out.println("비겼다");
//	     }
//	     else if(com==2)// 컴 보
//	     {
//	    	 if(user==0)
//	    		 System.out.println("사용자 Win");
//	    	 else if(user==1)
//	    		 System.out.println("컴퓨터 Win");
//	    	 else if(user==2)
//	    		 System.out.println("비겼다");
//	     }
	         

	}

}
