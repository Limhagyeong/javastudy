/*
 *  ****알고리즘 : 정렬 ( 선택정렬, 버블정렬)
 *  ****자료구조 : 데이터 관리 (추가 => 가지고오기)
 *           스택 (LIFO) / 큐(FIFO) / 데큐 (양방향)
 *           : 메모리 구조   : 네트워크 전용 
 *            => LastInFirstOut  => FirstInFirstOut
 *               (먼저들어간게 나중에 나옴) (들어간 순서대로 나옴)
 *  -------------------------------------------------------
 *  선택 정렬 => 한개를 선택하고 변경 
 *  버블 정렬 => 인접한 것 끼리 변경 
 *   
 *    선택 정렬 
 *    30 10 20 50 40 ==> 10 20 30 40 50 (하나씩 왼쪽 정렬) => 작은 값을 먼저 왼쪽에 출력
 *    -- --
 *    10 30
 *    --    --
 *    10    20
 *    --       --
 *    10       50
 *    --          --
 *    10          40
 *    -------------------1
 *    10 30 20 50 40
 *       -- --
 *       20 30
 *       --    --
 *       20    50
 *       --       --
 *       20        40
 *   --------------------2
 *     10 20 30 50 40
 *           -- --
 *           30 50
 *           --    --
 *           30    40
 *    --------------------3
 *    10 20 30 50 40 
 *             -- --
 *             40 50
 *     --------------------4      
 *     10 20 30 40 50      
 *     
 *  ----------------------------------------------------------------------
 *  
 *   버블 정렬 => 오른쪽 정렬
 *   --------
 *    30 10 20 50 40 
 *    -- --
 *    10 30  
 *       -- --
 *       20 30 
 *          -- --
 *          30 50 
 *             --  --
 *             40 50 
 *   --------------------1
 *     10 20 30 40 
 *     -- --
 *        --  --
 *            -- --
 *                        
 */
import java.util.*;
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= new int[5];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("======= 선택 정렬 전 =======");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        
        for(int i=0;i<arr.length-1;i++) // 4round 돌리겠다
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]>arr[j])
        		{
        			int temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        	System.out.println("===== "+(i+1)+" Round=====");
        	 System.out.println(Arrays.toString(arr));
        	 System.out.println();
        }
        System.out.println("======= 선택 정렬 후 =======");
        System.out.println(Arrays.toString(arr));
	}

}







