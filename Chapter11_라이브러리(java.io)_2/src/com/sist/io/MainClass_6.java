package com.sist.io;
import java.io.*;
// 객체단위 저장 => 객체 단위로 읽기 => Object InputStream
// ObjectOutputStream
/*
 *  Sawon s=new Sawon(...);
 *  
 *  s ==> ----sabun--------
 *  
 *  	  -----------------
 *  
 *  	  ------name------
 *  	
 *        ----------------
 *        
 *              ...
 *              
 *              => 병렬화
 *              
 *   객체 단위로 저장
 *      -------------------------------------------
 *       sabun       name       . . .
 *               |         |     
 *      -------------------------------------------
 *         => 직렬화 => implements Serializable
 */
import java.util.*;
class Sawon implements Serializable
{
	private int sabun;
	private String name;
	private String dept;
	private String jpb;
	private int pay;
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getJpb() {
		return jpb;
	}
	public void setJpb(String jpb) {
		this.jpb = jpb;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public Sawon(int sabun, String name, String dept, String jpb, int pay) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.jpb = jpb;
		this.pay = pay;
	} // 초기화
	public Sawon()
	{
		
	}// 입력용 (읽기)
}
public class MainClass_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
			// 메모리에 저장 => ArrayList
			ArrayList<Sawon> list=new ArrayList<Sawon>();
			list.add(new Sawon(1, "홍길동", "개발", "대리", 3800));
			list.add(new Sawon(2, "박문수", "인사", "사원", 3300));
			list.add(new Sawon(3, "이순신", "영업", "과장", 4800));
			list.add(new Sawon(4, "강감찬", "기획", "사원", 3300));
			list.add(new Sawon(5, "을지문덕", "개발", "대리", 3800));
			
			// 파일에 저장
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\emp.txt");
			// Object 단위로 저장 시 주소값으로 저장되기때문에 한글 깨진것처럼 보임 
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(list); // ***
			oos.close();
			fos.close();
			System.out.println("객체 단위 저장 완료");
		}
		catch(Exception ex){}
	}

}
