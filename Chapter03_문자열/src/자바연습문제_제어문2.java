//2.	숫자를 입력받아 
//3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 
//그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. 
//if-else 문과 switch 둘 다 이용해 볼 것.
/*
 *  switch (정수, 문자, 문자열)
 *  {
 *     case 값:
 *      처리문장
 *      break;
 *      --
 *      --
 *      --
 *       default
 *         처리문장 ==> 생략 가능
 *  }
 * 
 */
import java.util.Scanner;
public class 자바연습문제_제어문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.print("달 입력:");
       int month=scan.nextInt();
       
       if(month>=1 && month<=12)
       {
    	   switch(month)
           {
               case 3: case 4: case 5:
               System.out.println("봄");  
               break;
               case 6: case 7: case 8:
               System.out.println("여름");
               break;
               case 9: case 10: case 11:
               System.out.println("가을");
               break;
               case 12: case 1: case 2:
               System.out.println("겨울");
            }
       }
       else
    	   System.out.println("잘못입력하셨습니다");
       }
}
