// 정수 1개를 받아서 해당 구구단

import java.util.Scanner;
public class 제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dan;
        Scanner scan=new Scanner(System.in);
        System.out.print("단 입력:");
        dan=scan.nextInt();
        
        for (int a=1; a<=9; a++)
        {
        	System.out.printf("%2d * %2d = %2d\n", dan, a, dan*a);
        } // -%2d : 왼쪽으로 두칸 정렬 / %2d : 오른쪽으로 두칸 정렬
        
	}

}
