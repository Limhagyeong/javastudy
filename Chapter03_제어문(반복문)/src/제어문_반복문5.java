// 1~100까지 => 3의배수의 합, 5의 배수의 합, 7의 배수의 합

public class 제어문_반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int t=0, f=0, s=0;
        for (int i=0; i<=100; i++)
        {
        	if(i%3==0)
                t+=i;
            if(i%5==0)
                f+=i;  
        	if(i%7==0)
                s+=i;
        }
        System.out.println("1~100까지 3의 배수의 합:"+t);
        System.out.println("1~100까지 5의 배수의 합:"+f);
        System.out.println("1~100까지 7의 배수의 합:"+s);  
	}

}
