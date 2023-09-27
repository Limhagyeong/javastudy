// 100 개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오
import java.util.*;
public class 배열_연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a=new int[100];
        int[] count=new int[10];
        for(int i=0;i<a.length;i++)
        {
        	a[i]=(int)(Math.random()*10);
        	System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++) 
        {
        	count[a[i]]++; 
        	
        }
        System.out.println(Arrays.toString(count));
	}

}
