import java.util.*;
/*
 *  int aaa(int a, int b)
 *  {
 *    return a+b; ==> a,b가 사라지기때문에 리턴으로 넘겨줌
 *  }
 *  
 *  int a,b => a,b가 사라지지않기때문에 리턴 필요 없음 (멤버변수)
 *  void aaa()
 *  {
 *  
 *  }
 */
class Student{
	// heap : 프로그램 종료 전까지 메모리 유지 (멤버변수) => 다른 클래스에서도 사용 가능
	String name;//null
	int kor,eng,math;//0,0,0 => heap  ==>  저장공간이 다르기 때문에 변수명이 동일해도 됨
	// 매개변수 / 지역변수 =>  stack       ==>  저장공간이 다르기 때문에 변수명이 동일해도 됨
	Student(String name, int kor, int eng, int math) //=> 매개변수 (값을 받을 목적)
	{
		// 사용범위 : 지역변수 / 매개변수 => 메소드 안에서만 사용이 가능함 => 이후 자동으로 메모리 해제
		    //=> 멤버변수에 메모리 저장해주는 이유
		    //     |
		this.name=name; // 지역변수 => 값을 불러옴
		this.kor=kor;
		this.eng=eng;
		this.math=math;
		
		// 변수명 찾는 우선 순위 : 지역변수, 매개변수 => 멤버변수 
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Student[] std=new Student[3];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<std.length;i++)
        {
        	System.out.println((i+1)+"번째 학생의 이름:");
        	String name=scan.next();
        	
        	System.out.println((i+1)+"번째 학생의 국어 점수:");
        	int kor=scan.nextInt();
        	
        	System.out.println((i+1)+"번째 학생의 영어 점수:");
        	int eng=scan.nextInt();
        	
        	System.out.println((i+1)+"번째 학생의 수학 점수:");
        	int math=scan.nextInt();
        	
        	std[i]=new Student(name, kor, eng, math);
        	
        }
        
        // 출력
        for(int i=0;i<std.length;i++)
        {
        	System.out.printf("%-6s%-5d%-5d%-5d%-7d%-7.2f\n",
        			std[i].name,std[i].kor,std[i].eng,std[i].math,
        			(std[i].kor+std[i].eng+std[i].math),
        			(std[i].kor+std[i].eng+std[i].math)/3.0
        			);
        }
        
        
//        ArrayList<Student> list=new ArrayList<Student>();
//        list.add(new Student("", 0, 0, 0));
        
	}

}
