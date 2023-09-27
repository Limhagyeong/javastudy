// 5개의 난수를 배열에 저장한 후에 인덱스번호 두개를 받아서 값을 교환하는 프로그램을 작성하시오

import java.util.*;

public class 배열_연습문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[5];
        for(int i=0;i<a.length;i++)
        {
        	a[i]=(int)(Math.random()*100)+1;
        	// double random()
        }
        System.out.println(Arrays.toString(a));
        Scanner scan=new Scanner(System.in);
        System.out.print("첫번째 인덱스 입력:");
        int index1=scan.nextInt();
        System.out.print("두번째 인덱스 입력:");
        int index2=scan.nextInt();
        
        // 교환 => 임시변수 설정
        
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;
        
        System.out.println(Arrays.toString(a));
	}

}
