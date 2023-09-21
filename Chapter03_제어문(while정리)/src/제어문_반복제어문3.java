import java.util.Scanner;
public class 제어문_반복제어문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // 1~9개의 메뉴 => 9번 종료 / 다른 버튼 입력시 오류
   
        while(true)
        {
        	System.out.print("메뉴 선택:");
        	int menu=scan.nextInt();
        	if(menu<1 || menu>9) // 없는 메뉴 선택
        		{
        		  System.out.println("없는 메뉴 입니다");
        		  continue; // 조건식으로 이동하여 처음부터 실행
        		}
        	if(menu==9)
        	{
        		break; // => while문만 종료
        		//System.exit(0);  => 프로그램 자체가 종료되기때문에 사용 X (다음 문장 수행이 불가함)
        	}
        	System.out.println(menu+"번 메뉴를 선택하셨습니다");
        }
        System.out.println("프로그램 종료!");
	}

}
