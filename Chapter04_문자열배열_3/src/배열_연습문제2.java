//10개의 임의의 정수를 받아서 최대값,최소값(난수)  구하는 프로그램 작성

public class 배열_연습문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a=new int[10];
        for(int i=0;i<a.length;i++)
        {
        	a[i]=(int)(Math.random()*100)+1;
        	System.out.print(a[i]+" ");
        }
        int max=0;
        int min=100;
        for(int i=0;i<a.length;i++)
        {
        	if(max<a[i])
        	{
        		max=a[i];
        	}
        	if(min>a[i])
        	{
        		min=a[i];
        	}
        }
        System.out.println();
        System.out.println("최댓값:"+max);
        System.out.println("최솟값:"+min);
        
	}

}
