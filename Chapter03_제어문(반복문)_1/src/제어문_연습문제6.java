// 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)
public class 제어문_연습문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int a=1;a<=10;a++)
        {
        	if(a%3==0)
        	{
        		continue; // => 초기화한다는 의미
        	}
        		 System.out.print(a+" ");
        }
       
	}

} // continue 사용 안하면 if(a%3!=0) 사용해서 System.out.print(a+" "); 바로 출력 
