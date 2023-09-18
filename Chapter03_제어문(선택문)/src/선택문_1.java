/*
 *   선택문은 범위가 지정되는 것이 아니다
 *   => 값 1개를 선택해서 사용
 *      ----- 정수, 문자, 문자열
 *   => 형식)
 *      switch (정수, 문자, 문자열)
 *      {
 *         case 1:
 *            실행문장
 *            break; ==> 실행문장 수행 후에 종료 //1
 *         case 2:
 *            실행문장
 *             break; ==> 실행문장 수행 후에 종료 //2
 *         case 3:
 *            실행문장
 *         case 4:
 *            실행문장 
 *            break; ==> 3을 수행하고 4 수행 후 종료 //3 
 *      }
 *      
 *      범위가 지정되면 다중 조건문
 *      범위가 없이 값이 1개일 때 => switch
 *      switch => 메뉴 , 키보드 입력 => 웹, 게임, 서버프로그램에서 주로 사용
 */
// 성적계산 => 3개의 정수를 받아 => 평균, 총점, 학점
import java.util.Scanner;
public class 선택문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor,eng,math,total,avg; //switch에는 실수 저장 불가(정수, 문자, 문자열)=> avg를 int로 저장해둠
		double avg2;
		char score=' ';
        Scanner scan=new Scanner(System.in);
        System.out.print("국어점수:");
        kor=scan.nextInt();
        
        System.out.print("영어점수:");
        eng=scan.nextInt();
        
        System.out.print("수학점수:");
        math=scan.nextInt();
        
        total=kor+eng+math;
        avg2=(kor+eng+math)/3.0;
        
        avg=(int)(avg2/10);
        // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0
        // 10 => score = 'F' (break 걸지 않았기 떄문에 마지막 문장까지 수행)
//        switch(avg)
//        {
//        case 10: // avg==10 || avg==9 (if문)
//        case 9:
//        	score='A';
//        case 8:
//        	score='B';
//        case 7:
//        	score='C';
//        case 6:
//        	score='D';
//        default: // 나머지
//        	score='F'; 
//        }
        
        switch(avg)
        {
        case 10: // avg==10 || avg==9 (if문)
        case 9:
        	score='A';
        	break;// 종료명령
        case 8:
        	score='B';
        	break;
        case 7:
        	score='C';
        	break;
        case 6:
        	score='D';
        	break;
        default: // 나머지
        	score='F'; 
        }
        System.out.println("총점:"+total);
        System.out.printf("평균:%.2f\n",avg2);
        System.out.println("학점:"+score+"학점");        
        
	}

}













