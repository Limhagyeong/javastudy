import java.util.Arrays;

public class 배열_연습문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[10];
        for(int i=0;i<a.length;i++)
        {
        	a[i]=(int)(Math.random()*100)+1;
        	// double random()
        }
        System.out.println(Arrays.toString(a));
        
        for(int i:a)
        {
        	if(i%3==0)
        		System.out.print(i+" ");
        }
	}

}
