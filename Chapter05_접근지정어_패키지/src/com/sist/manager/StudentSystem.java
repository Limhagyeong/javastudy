package com.sist.manager;
// 같은 패키지 상에 있는 경우 => default public protected
// import를 사용하지않는다
// => 프랜들리
import java.util.*;
/*
 *  캡슐화 / 오버라이딩 / 상속 / 포함
 *  ----   -------  빈도X   ---
 *                    | POJO : 상속이 없는 클래스
 *  ** 1) 결합성 ** : 변경 시 다른 클래스에 영향을 미칠 수록(에러 발생) 결합성이 높음 => 결합성이 낮아야함
 *     2) 응집성
 *  ** 3) 가독성 **
 *     4) 최적화
 */
public class StudentSystem {
     public Student[] students=new Student[3];
     // 입력
     // 메소드 => 1) 멤버메소드 2) static메소드 3) 생성자             
     // 접근 지정어 => public
     public void input()
     {
    	 Scanner scan=new Scanner(System.in);
    	 for(int i=0;i<students.length;i++)
    	 {
    		 students[i]=new Student();
    		 System.out.print("학번 입력:");
    		 students[i].hakbun=scan.nextInt(); // public
    		 
    		 System.out.print("이름 입력:");
    		 students[i].name=scan.next();
    		 
    		 System.out.print("국어 점수 입력:");
    		 students[i].kor=scan.nextInt();
    		 
    		 System.out.print("영어 점수 입력:");
    		 students[i].eng=scan.nextInt();
    		 
    		 System.out.print("수학 점수 입력:");
    		 students[i].math=scan.nextInt();
    		 
    	 }
    	
     }
}

