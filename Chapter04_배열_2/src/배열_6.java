// 1~100 => 10개 저장 ==> 변수(X) 배열(O)
// 1. 총합 
// 2. 평균
// 3. 최댓값
// 4. 최솟값
// 5. 최대값의 위치 ==> index이용
// 6. 최솟값의 위치 ==> index이용
import java.util.Arrays;
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int[] arr=new int[10];
        // 초기화
       int[] arr= {10,20,10,30,10,40,50,30,10,30,50};


//for(int i=0;i<arr.length;i++)
//        {
//        	arr[i]=(int)(Math.random()*100)+1;
//
//        }
        System.out.println("===== 저장된 값 =====");
        System.out.println(Arrays.toString(arr));
        
        int sum=0;
        for(int i:arr)
        {
        	sum+=i;
        }
        System.out.println("총합:"+sum);
        System.out.printf("평균:%.2f\n",sum/10.0);
        
        int max=0, min=100;
        for(int i: arr)
        {
        	if(max<i)
        		max=i;
        	if(min>i)
        		min=i;
        }
        System.out.println("최댓값:"+max);
        System.out.println("최솟값:"+min);
        
        // 인덱스
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
        	if(max==arr[i])
        	{
        		 System.out.println("Max값의 위치=>"+(i+1)+"번째 위치합니다"); 
        	}
        	
        } // 중복이 있을 경우 모든 최댓값을 출력해줌
        for(int i=0;i<arr.length;i++)
        {
        	if(min==arr[i])
        	{
        		index=i;
        		break;
        	}
        	
        }
       // int index=0;
        System.out.println("Min값의 위치=>"+(index+1)+"번째 위치합니다");
        // 중복이 있을 경우 가장 앞에 나와있는 최솟값만 출력해줌
	}

}
