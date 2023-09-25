// 정수 10개를 받아서 3번째, 5번째, 마지막에 있는 데이터를 출력해라
import java.util.*;
public class 배열_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



int[] arr=new int[10];
	        for(int i=0;i<arr.length;i++)
	        {
	        	arr[i]=(int)(Math.random()*100)+1;
	        }
	        System.out.println(Arrays.toString(arr)); 
	        System.out.println("세번째 데이터:"+arr[2]);
	        System.out.println("다섯번째 데이터:"+arr[4]);
	        System.out.println("마지막번쨰 데이터:"+arr[arr.length-1]); // 저장 데이터 갯수가 달라질 수 있기때문에 
	        
	}

}
