import java.util.Scanner;
// 문자열 입력을 받아 A,a가 몇개?
public class 문자열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan= new Scanner(System.in);
       System.out.print("문자를 입력하세요:");
       String data=scan.next();
       
       int count=0; // A || a
       // charAt => 문자를 한개씩 잘라올때 사용
       // "Hello" 01234 ==> charSt(5) => 오류
       for (int i=0;i<data.length();i++) // 조건식에 = 써주면 오류남 / "01234" 5글자이기때문에 5 불러오면 오류이기 때문
       {
    	   char c=data.charAt(i);
    	   if(c=='A'||c=='a')
    		   count++;
       }
       System.out.println("A||a의 갯수는"+count+"개입니다");
       
	}

}
