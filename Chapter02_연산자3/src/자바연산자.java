/*
 *  ----> 데이터 저장 ----> 사용자 요청에 맞게 가공 ----> 화면 출력
 *  ----> 프로그램 (반복)          |
 *                            연산자
 *  자바에서 제공하는 연산자
 *  ------------------
 *   단항연산자 : a++ / -a
 *    = 증감연산자 (++ / --) :한개 증가 or 감소
 *    = 부정연산자 (!) => boolean에서만 사용
 *                  => true -> false
 *                     false -> true
 *                    예) boolean bCheck=false;
 *                       bCheck=!bCheck ==> bCheck=true
 *                        
 *                        예약 가능한 날 => !(예약가능한날)
 *    = 형변환연산자 (type) => 강제형변환 
 *      -------- 객체지향 형변환 (클래스)
 *      숫자관련만 (정수, 실수, 문자) -> boolean은 형변환 불가
 *      -------
 *       UpCasting : 데이터형을 크게 만들어준다 => 자동형변환 : 연산처리 시 많이 변경됨 (데이터형이 같은 것끼리만 연산이 됨)
 *       DownCasting : 데이터형을 작게 만들어준다 => 강제형변환
 *    
 *   이항연산자: 
 *    = 산술연산자 (+,-,*,/,%)
 *          ***우선순위 : *,/,% => +,- (+,-)쳐주면 우선순위 바뀜
 *          -> / : 정수/정수 = 정수, 정수/(double)정수 = 실수
 *          -> % : 왼쪽편 부호를 따라감 => 윤년구하기, 숫자자르기 ..., 배수구하기
 *          
 *    = 비교연산자 (==,!=,<,>,<=.>=) : 날짜, 문자열은 비교 불가 (자체 비교 메소드가 존재함) , 비교값은 true / false
 *                                  자바는 unicode사용 (모든 국가의 언어 사용이 가능, 호환성이 뛰어남)
 *                                        ------ 한글 한글자당 2byte
 *    = 논리연산자 (&&, ||)
 *               --> 기간, 범위가 포함된 상태에 주로 사용
 *                   --> 잘못된 입력에 주로 사용
 *    = 대입연산자 (=,+=,-=)
 *                 ------> 여러개 증가 혹은 감소 시 사용
 *    
 *   삼항연산자
 *    = 조건연산자 (?:)
 *  
 */
// 산술연산자
// 정수 3개 입력을 받아서 총점, 평균을 구하여라
import java.util.Scanner; //scanner클래스를 가지고온다
// c=> include 
// c# => using
// 자바스크립트, python => import
public class 자바연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int kor,eng,math;
        int total;
        double avg;
        // ==============> 변수선언 (메모리저장공간만듦)
        // 메모리 공간에 값을 첨부 => 변수의 초기화
        Scanner scan=new Scanner(System.in);
        //                       ---------- 키보드 입력
        System.out.print("국어,영어,수학 점수 입력(90 90 90):");
        kor=scan.nextInt();
        eng=scan.nextInt();
        math=scan.nextInt();
        //활용할 수 있다
        //new = 메모리에 저장 (클래스)
        // 연산처리 ===>
        total=kor+eng+math;
        avg=total/3.0;
        // 결과값 출력
        System.out.println("국어점수"+kor);
        System.out.println("영어점수:"+eng);
        System.out.println("수학점수:"+math);
        System.out.println("총점:"+total);
        System.out.println("평균:"+avg);
        System.out.println();
        System.out.print(avg>=90 && avg<100?"A학점":"");
        System.out.print(avg>=80 && avg<90?"B학점":"");		
        System.out.print(avg>=70 && avg<80?"C학점":"");		
        System.out.print(avg>=60 && avg<70?"D학점":"");		
        System.out.print(avg<60?"F학점":"");		
        
        
	}

}
