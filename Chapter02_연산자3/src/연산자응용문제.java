import java.util.Scanner;
public class 연산자응용문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       int i=0;
//       System.out.println("첫번째결과:"+i++*2);
//       System.out.println("두번째결과"+i);
//       
//       i=0;
//       System.out.println("첫번째결과:"+ ++i*2);
//       System.out.println("두번째결과"+i); // 2번
//       System.out.println("================");
//       int a = 10; 
//       int b = 5; 
//       int c = 5;
//       System.out.println("a == b -> " + (a == b)); 
//       System.out.println("a != b -> " + (a != b)); 
//       System.out.println("a > b -> " + (a > b)); 
//       System.out.println("b >= c -> " + (b >= c)); 
//       System.out.println("a < b -> " + (a < b)); 
//       System.out.println("b <= c -> " + (b <= c)); //3번
       
//       int h = 3; 
//       h = h + 1; 
//       System.out.println(h); //4
//       h += 1; 
//       System.out.println(h); //5
//       h -= 1; 
//       System.out.println(h); //4
//       h *= 2;
//       System.out.println(h); //8
//       h /= 2; 
//       System.out.println(h); //4 
//       h %= 2; 
//       System.out.println(h); //0 
       
       
//       Scanner scan=new Scanner(System.in);
//       System.out.println("농구공 갯수 :");
//       int ball=scan.nextInt();
//       System.out.println("필요한 상자의 갯수:"+(ball%5==0?ball/5:ball/5+1));// 응용 1번
//		 ====> 총 페이지 만들 때 사용 할 예정
//        ====> 반올림 함수 사용 시 더욱 간단
//        		System.out.println("필요한 박스:"+(int)(Math.ceil(ball/5.0)));
		
//		char ch = 'z'; 
//	    boolean b = ( ch>='A' && ch<='Z'||ch>='a' && ch<='z'||ch>='0' && ch<='9'?true:false ); 
//	    System.out.println(b); // 응용 2번
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("문자입력:");
//		char ch=scan.next().charAt(0);//입력한 글자의 몇번째 글자를 출력할것인지 번호 입력 / 0 입력 시 첫번째 글자 출력, 3 입력 시 네번째 글자 출력
//		System.out.println("ch="+ch);
//		boolean b=(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'||ch>='0'&&ch<='9'?true:false);
//		System.out.println(b); //응용 2번
		
		Scanner scan=new Scanner(System.in);
		System.out.println("문자 입력:");
		char ch=scan.next().charAt(0);
		System.out.println("ch="+ch);
        char lowerCase=(ch>='A' && ch<='Z'?(char)(ch+32):(char)(ch-32));
        System.out.println("변경된 값:"+lowerCase); //응용 3번
		
		
//		char ch = 'A'; 
//	    char lowerCase = (ch>=65?(char)(ch+32):ch); 
//	    System.out.println("ch : " + ch); 
//	    System.out.println("ch to lowerCase : " + lowerCase);// 응용 3번
	    
	 

       

  }

	}


