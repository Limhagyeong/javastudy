// 간단하게 짜는 중복 없는 난수 (배열_4랑 비교)
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr=new int[10];
       for(int i=0;i<arr.length;i++)
       {
    	   arr[i]=(int)(Math.random()*10)+1;
    	   for(int j=0;j<i;j++)
    	   {
    		  if(arr[i]==arr[j])
    		  {
    			  i--; // 난수를 다시 발생시켜라 => arr[3] 중복 => arr[3]을 다시 발생시켜라
    			      // index를 이용해서 다시 난수를 발생하게 만듦
    			  break;
    		  }
    	   }
    	   
       }
       // 출력
       for (int i: arr)
       {
    	  
    	   System.out.print(i+" ");
       }
	}

}
