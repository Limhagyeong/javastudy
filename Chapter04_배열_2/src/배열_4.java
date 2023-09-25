// 중복 없는 난수 발생
// => 예약일 , 예약시간 ... 

public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        // 1~10 => 중복 X
        int su=0; // 난수저장
        boolean bCheck=false; // 중복여부 확인
        
        for(int i=0;i<arr.length;i++)
        {
        	bCheck=true;
        	//-------------- 난수 발생
        	//bCheck=true => 난수 중복 / bCheck=false => 종료
        	// arr에 저장
        	 while(bCheck)
        	 {
        		 // 난수 발생
        		 su=(int)(Math.random()*10)+1;
        		 bCheck=false; // 종료 조건을 만들어 놓고 출력 (if else 사용하면 안됨)
        		               // if else로 쓰면 for문 무한루프 걸림
        		 // 비교 => arr에 저장된 값과 su값(난수)의 값이 같은지 확인
        		 for(int j=0;j<i;j++)
        		 {
        			 // i => 저장된 갯수
        			 if(arr[j]==su) // 같은 수가 있는지 확인
        			 {
        				  bCheck=true; // =>while문을 다시 돌림
        				  break;
        			 }
//        			 else
//        			 {
//        				 bCheck=false;
//        				 break;
//        			 }
        		 }
        	 }
        	//--------------
        	 arr[i]=su;
        }
        // 출력
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
	} 

}
