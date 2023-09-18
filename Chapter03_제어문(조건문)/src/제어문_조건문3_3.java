// 정수 하나를 받아 
// 1 => 메모장, 2=> 그림판, 3=> 브라우저
// 1,2,3 => 메뉴 클릭 or 버튼 클릭 시 처리된다는 의미와 동일! => GUI (그래픽 유저)

import java.util.Scanner;
public class 제어문_조건문3_3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int no=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("번호 선택 (1,2,3):");
        no=scan.nextInt();
        
        if(no==1)
        {
        	System.out.println("메모장을 선택하셨습니다");
        }
        else if(no==2)
        {
        	System.out.println("그림판을 선택하셨습니다");
        }
        else if(no==3)
        {
        	System.out.println("브라우저를 선택하셨습니다");
        	Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"); // 속성=> 바로가기 => 대상 주소 복붙
        	/*
        	 *  \n : 다음 라인에 출력
        	 *  \t : 
        	 *  \" : " 출력 시
        	 *  \\ : \ 출력 시
        	 */
        }
        else
        {
        	System.out.println("메뉴가 존재하지 않습니다");
        }
	
       
	}

}
