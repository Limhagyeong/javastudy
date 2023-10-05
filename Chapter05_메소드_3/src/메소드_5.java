// 5개의 정수를 받아 => max,min 
//1.  정수입력
// 2. 최대최소
// 3. 출력
import java.util.*;
public class 메소드_5 {
    static int[] userInput()
    {
    	int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
     	   arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    // 리턴형은 한개만 설정이 가능하다 (최대 최소 따로)
    static int max(int[] arr)
    {
    	int m=arr[0];
    	 for(int i:arr)
         {
      	   if(i>m)
      		   m=i;
         }
    	 return m;
    }
    static int min(int[] arr)
    {
    	int m=arr[0];
    	 for(int i:arr)
         {
      	   if(i<m)
      		   m=i;
         }
    	 return m;
    }
    static void print(int max, int min)
    {
    	 System.out.println("max:"+max);
         System.out.println("min:"+min);
    }
    static void process()
    {
    	int[] arr=userInput();
    	int max=max(arr);
    	int min=min(arr);
    	print(max, min);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
//       int[] arr=new int[5];
//       for(int i=0;i<arr.length;i++)
//       {
//    	   arr[i]=(int)(Math.random()*100)+1;
//       }
       /// 사용자로부터 입력값을 받는다 / 초기화 => 한단락
//       System.out.println(Arrays.toString(arr));
//       
//       int max=arr[0];
//       int min=arr[0];
//       
//       for(int i:arr)
//       {
//    	   if(i>max)
//    		   max=i;
//    	   if(i<min)
//    		   min=i;
//       }
       /// 최대 최소 구한다
//       
//       System.out.println("max:"+max);
//       System.out.println("min:"+min);
       /// 출력
	}

}
