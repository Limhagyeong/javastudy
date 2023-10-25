package com.sist.student;
import java.lang.reflect.Array;
import java.util.*;
// 액션 클래스 => Backend
/*
 *  클래스 
 *  -----
 *   1) 데이터 ===> 오라클의 column 
 *      ------------------------
 *      데이터형을 만든다
 *      => Music => 가수명, 제목, 앨범 ...
 *      => Movie => 제목, 감독, 출연 ...
 *      -----> 캡슐화 
 *             변수에 읽기/쓰기 추가
 *   2) 사용자 요청 => 기능
 *      ------- 목록 출력, 상세 보기, 찾기, 예매, 추천..
 *      -----> 상속 / 포함 / 오버라이딩
 *            ---------------------
 *   3) 데이터가 여러개일 경우 => 모아서 관리 
 *      => 컬렉션 / 배열 
 *      	      ---- 고정하기 어렵다
 *          | 계속 갱신 / 추가 => 가변형으로 사용하는 것이 좋음 ==> 컬렉션 사용 이유
 *      => 컬렉션 : list => 중복허용, 순서(인덱스 이용)
 *                 |
 *                ArrayList => 비동기, 데이터베이스 프로그램 특성화
 *                 => 읽기 기능 => get()  
 *                 => 총 갯수 => size()
 *                 => 추가 => add()
 *                 => 프로그램 종료 시 수정했던 데이터는 날아감
 *                 => 실제 수정, 삭제, 추가 => 오라클에서 해야함!
 */
public class StudentManager {
	private static ArrayList<Student> list=new ArrayList<Student>();
	
	// 여러명 저장
	// 초기화 => 생성자 이용
	public StudentManager()
	{
		list.add(new Student(1,"홍길동",89,79,90));
		list.add(new Student(2,"심청이",80,75,95));
		list.add(new Student(3,"춘향이",78,73,92));
		list.add(new Student(4,"이순신",67,72,95));
		list.add(new Student(5,"박문수",90,70,80));
	}
	// 리턴형 / 매개변수
	// 목록 출력 (학생 전체)
	public ArrayList<Student> studentAllData()
	{
		return list;
	}
	// 상세보기 (학생 1명)
	public Student studentDetailData(int hakbun)
	{
		Student s=new Student();
		for(Student std:list)
		{
			if(std.getHakbun()==hakbun)
			{
				s=std;
				break;
			}
		}
		return s;
	}
	// 학생 추가 ==> add
	// 추가 , 수정 => 매개변수 많다 (클래스로 전송)
	// 순서 없이 처리 가능
	public void studentInsert(Student std)
	{
		list.add(std);
		System.out.println("학생 추가가 완료되었습니다");
	}
	// 자동 증가 => sequence (오라클) ==> 중복이 없는 데이터를 만든다
	// CREATE SEQUENCE
	// MYAQL => auto_increment()
	public int hakbunMaxData()
	{
		int max=0;
		for(Student std:list)
		{
			if(max<std.getHakbun())
			{
				max=std.getHakbun();
			}
		}
		return max+1; // 기존 존재하는 학번에 추가 학번을 만들겠다!
	}
	// 학생 수정 ==> set(int index,데이터) => 일반 for문 사용
	public void studentUpdate(Student std)
	{
		int index=0;
		for(int i=0;i<list.size();i++)
		{
			Student s=list.get(i);
			if(s.getHakbun()==std.getHakbun())
			{
				index=i;
				break;
			}
		}
		
		list.set(index, std);
		System.out.println("수정이 완료되었습니다");
	}
	// 학생 삭제 ==> remove(int index) => 일반 for문 사용
	public void studentDelete(int hakbun)
	{
		for(int i=0;i<list.size();i++) // 인덱스이용해 삭제하기때문에 일반 for문 사용
		{
			Student s=list.get(i);
			if(s.getHakbun()==hakbun)
			{
				list.remove(i);
				System.out.println(hakbun+" 학번을 삭제하였습니다");
				break;
			}
		}
	}
	// 학생 찾기 ==> contains
	public ArrayList<Student> studentFindData(String name)
	{
		ArrayList<Student> arr=new ArrayList<Student>();
		for(Student std:list) // 인덱스 필요 없을때는 for each 사용
		{
			if(std.getName().contains(name))
			{
				arr.add(std);
				
			}
		}
		return arr;
	}
}
