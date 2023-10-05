// 국어 영어 수학 점수 입력 받아서 => 총점 평균을 구해라
import java.util.Scanner;
public class 메소드_문제_3 {
    static int score(String msg)
    {
    	Scanner scan=new Scanner(System.in);
        System.out.print(msg+"점수:");
        int num=scan.nextInt();
        return num;
    }
    static int total(int kor, int eng, int math)
    {
    	return kor+eng+math;
    }
    static double avg(int total)
    {
    	return total/3.0;
    }
    static char sc(int avg)
    {
    	char c='A';
    	switch(avg)
    	{
    	
    	case 10: 
         case 9:
        	 c='A';
    	break;
         case 8:
        	 c='B';
    	break;
         case 7:
        	 c='C';
    	break;
         case 6:
        	 c='D';
    	break;
    	default:
    	 c='F';
    	}
    	return c;
    	
    }
    static void print(int kor, int eng, int math, int total, double avg,char c)
    {
    	System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n",kor,math,eng,total,avg,c);
    }
    static void process()
    {
    	int kor=score("국어");
    	int math=score("수학");
    	int eng=score("영어");
    	int total=total(kor, eng, math);
    	double avg=avg(total);
    	char c=sc((int)(avg/10));
    	print(kor, eng, math, total, avg,c);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
//       Scanner scan=new Scanner(System.in);
//       System.out.print("국어 점수:");
//       int kor=scan.nextInt();
//       System.out.print("수학 점수:");
//       int math=scan.nextInt();
//       System.out.print("영어 점수:");
//       int eng=scan.nextInt();
//       
//       int total=kor+math+eng;
//       double avg=total/3.0;
//       System.out.printf("%-5d%-5d%-5d%-7d%-7.2f\n",kor,math,eng,total,avg);
	}

}
