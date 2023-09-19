//100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성
public class 제어문_연습문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a4=0,sum=0;
        for (int i=100;i<=999;i++)
        {
        	if(i%4!=0)
        	{
        		a4++;
        		sum+=i;
        	}
        }
           System.out.println("갯수:"+a4);
           System.out.println("총합:"+sum);
	}   

}
