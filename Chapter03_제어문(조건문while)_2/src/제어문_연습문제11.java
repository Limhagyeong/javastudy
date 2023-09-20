// 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성

public class 제어문_연습문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	    
        int count=0;
        for (int j=1;j<=10;j++)
        {
        	int a=(int)(Math.random()*100)+1;
        	System.out.print(a+" ");
        	
        	if(j%2==0)
        		count++;
        }
        System.out.println("\n갯수:"+count);
	}

}
	

