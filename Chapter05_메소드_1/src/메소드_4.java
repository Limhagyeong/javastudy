/*
 *  리턴형 (처리 결과값 => 반드시 한개만 사용이 가능) => 여러개일때는 배열을 이용
 *       ---------------------------------
 *  1) 로그인 요청
 *     --------
 *     boolean => 경우의 수 2개인 경우 [예] true: 로그인 성공 => 메인페이지 이동 / false : 로그인 오류 메시지 전송
 *     String, int => 경우의 수가 3개인 경우 (유지보수 하려면 string 쓰는게 편함)
 *                   ----------------- id 틀린경우 / pwd 틀린경우 / 로그인 성공 
 *   2) 기본형 => int , long, double
 *   3) 영화 정보 요청 : class
 *   4) 정렬 => 10 40 50 20 30 => 배열
 *   -----------------------------------------------
 *      경우의 수를 잘 따져아햠 => 데이터형 선택 
 *      
 *    예) 정수 => 사칙연산
 *        +  int plus(int a, int b)
 *        -  int minus(int a, int b)
 *        *  int gop(int a, int b)
 *        /  String div(int a, int b)  
 *      
 */
// 1. 기능별로 나눠서 처리 (한가지 기능만 수행)
/*
 *  예) 
 *     사람 <===> 자판기
 *     --- 행위자(액터) => 유스케이스 다이어그램
 */
// 2. 반복이 있는 경우
// 3. 다른 클래스와 연결 
// 연산 프로그램
import java.util.Scanner;
// 1. 정수 한개를 입력받아(2~9)구구단을 출력
public class 메소드_4 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 절차적 언어 => 재사용 불가
        Scanner scan=new Scanner(System.in);
        System.out.print("단 입력(2~9 사이):");
        // print() => 사용자가 요청한 메시지를 출력
        int dan=scan.nextInt();
        // nextInt() => 키보드로 정수값을 입력 시 => 읽어서 => 메모리에 저장
        // 1. 단 입력
        for(int i=1;i<=9;i++)
        {
        	System.out.println(dan+"*"+i+"="+i*dan);
        }
        // 2. 단 출력
	}

}
