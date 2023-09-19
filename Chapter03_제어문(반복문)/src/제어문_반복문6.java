// 1~100까지 5의 배수의 합과 5의 배수의 갯수 => 갯수 오류 
public class 제어문_반복문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a5=0, count=0;
        for (int i=1;i<=100;i++)
        {
        	if(i%5==0)
        		{
        		a5+=i;
        		count++;
        		} // if문 안에 들어가는 조건 => 꼭 {} 해주기!!
        }
        System.out.println("1~100까지 5의 배수의 합:"+a5);
        System.out.println("1~100까지 5의 배수의 갯수:"+count);
	}

}
