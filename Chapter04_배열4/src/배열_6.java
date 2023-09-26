import java.util.*;
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       char[] c=new char[10];
       for(int i=0;i<c.length;i++)
       {
    	   c[i]=(char)((Math.random()*26)+65);
       }
       System.out.println("정렬전");
       System.out.println(Arrays.toString(c));
       
       for(int i=0;i<c.length-1;i++)
       {
    	   for(int j=0;j<c.length-1-i;j++) // 항상 왼쪽부터 하나씩 비교 => j=0;
    	   {
    		   if(c[j]>c[j+1])
    		   {
    			   char temp=c[j];
    			   c[j]=c[j+1];
    			   c[j+1]=temp;
    		   }
    	   }
       }
       System.out.println("정렬 후");
       System.out.println(Arrays.toString(c));
	}

}
