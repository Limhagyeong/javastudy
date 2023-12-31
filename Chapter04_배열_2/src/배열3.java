/*
 *  3명의 학생 => 국,영,수 : 총점, 평균, 학점, 등수
 *                                     -----
 *                                     
 */
import java.util.Scanner;
public class 배열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 설정
       int[] kor=new int[3];
       int[] eng=new int[3];
       int[] math=new int[3];
       int[] total=new int[3];
       int[] rank=new int[3];
       
       double[] avg=new double[3];
       char[] score=new char[3]; 
       
       // 1명 => index번호가 같은 것 [0] [1] [2] 
       // 초기화
       // ----- 국 영 수
       Scanner scan=new Scanner(System.in);
       for(int i=0;i<kor.length;i++)
       {
    	   System.out.print((i+1)+"번째 학생 국어 점수:");
    	   kor[i]=scan.nextInt();
    	   System.out.print((i+1)+"번째 학생 영어 점수:");
    	   eng[i]=scan.nextInt();
    	   System.out.print((i+1)+"번째 학생 수학 점수:");
    	   math[i]=scan.nextInt();
    	   
    	   total[i]=kor[i]+eng[i]+math[i];
    	   avg[i]=total[i]/3.0;

       }
       /* %-5d (값 왼쪽 정렬 5칸 공백) %-3c (캐릭터값 출력)
        *  -----
        *  98    => 3칸 공백
        *  100   => 2칸 공백
        */
       // 학점 출력
       for(int i=0;i<kor.length;i++)
       {
    	   switch((int)(avg[i]/10))
    	   {
    	   case 10:
    	   case 9:
    		   score[i]='A';
    		   break;
    		   
    	   case 8:
    		   score[i]='B';
    		   break;   
    	   case 7:
    		   score[i]='C';
    		   break;      
    	   case 6:
    		   score[i]='D';
    		   break;      
    	  default:
    		  score[i]='F';
    	   }
    	   
       }
       // 등수구하기
       for(int i=0;i<total.length;i++) // 1차
       {
    	   rank[i]=1;
    	   for(int j=0;j<total.length;j++) //2차
    	   {
    		   if(total[i]<total[j])
    		   {
    			   rank[i]++;
    		   }
    	   }
       }
       // 출력
       for(int i=0;i<kor.length;i++)
       {
    	   System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-5c%-5d\n",
    			   kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
       }
  
       
       
	}

}
