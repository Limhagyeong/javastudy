// 10개의 난수를 발생하여 배열에 저장한 후에 인덱스가 1인 곳의 값을 출력하시오.
// 위 문제 배열 중에서 최대값의 인덱스를 출력하시오. 
import java.util.*;
public class 배열_연습문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a=new int[10];
        for(int i=0;i<a.length;i++)
        {
        	a[i]=(int)(Math.random()*100)+1;
        	// double random()
        }
        System.out.println(Arrays.toString(a));
        System.out.println(a[1]);
        
        int max=0;
        for(int i=0;i<a.length;i++)
        {
        		if(max<a[i])
            	{
            		max=a[i];
            	}			
        }
        int index=0;
        for(int i=0;i<a.length;i++)
        {
        	if(max==a[i])
        	{
        		index=i;
        		break;
        	}
        }
         System.out.println("최댓값의 인덱스 번호:"+index);
        
	}

}

