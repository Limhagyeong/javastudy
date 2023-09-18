//100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
// 60점 이하면 F를 출력하라 (switch~case 사용)
import java.util.Scanner;
public class 선택문_연습문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan= new Scanner(System.in);
	       System.out.print("점수입력:");
	       int a=scan.nextInt();
	       int b=(int)(a/10);
	       char score=' ';
	       
       switch(b)
       {
       case 9: case 10:
    	   score='A';
      	   break;
      	   
       case 8: 
    	   score='B';
      	   break;
      	   
       case 7:
    	   score='C';
       	   break;
       	   
       case 6:
	      score='D';
  	      break;
  	  
  	   default:
  		   score='F';  	      
       }
            System.out.println(score+"학점입니다");
	    	   
	}
}


