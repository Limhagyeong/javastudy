// 10개의 난수를 배열에 저장 후에 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력하시오

import java.util.Arrays;

public class 배열_연습문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
        for(int i=0;i<a.length;i++)
        {
        	a[i]=(int)(Math.random()*100)+1;
        	// double random()
        }
        System.out.println(Arrays.toString(a));
        
        for(int i=0;i<a.length;i++)
        {
        	if(i==3)
        		continue; // 인덱스가 3인 값은 제외하고 => 증가식으로 이동
        	System.out.print(a[i]+" ");
        }
	}

}
