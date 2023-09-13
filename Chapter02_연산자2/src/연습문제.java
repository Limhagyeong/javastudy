
public class 연습문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=10;
        System.out.printf("%d\n",num1);//=System.out.println("num1="+num1);
        num1++;
        System.out.printf("%d\n",num1);
        ++num1;
        System.out.printf("%d\n",num1);
        num1--;
        System.out.printf("%d\n",num1);
        --num1;
        System.out.printf("%d\n",num1); //5번
        System.out.println("=======================");
        
         int num2=10, num3=10;
         int a,b;
         a=++num2; //증가후 대입
         b=num3++; //대입후 증가
         
         System.out.printf("%d,%d\n",b,num3); //6번
         System.out.println("=======================");
         
         int num4=10, num5=10;
         int c,d;
         num4=num4+1; //11
         c=num4; //11
         System.out.printf("%d,%d\n",c,num4); 
         
         d=num5; //10
         num5=num5+1; //11
        System.out.printf("%d,%d\n",d,num5); //7번
        System.out.println("=======================");
        
         int num6=10, num7=10;
         System.out.printf("%d\n",++num6);
         System.out.printf("%d\n",num6);
         System.out.printf("%d\n",num7++);
         System.out.printf("%d\n",num7); //8,9번
         System.out.println("=======================");
         
         int num8=2;
         int num9=7;
         int num10;
         int num11;
         num8++;//
         //3
         num10=--num8;
         //2
         --num9;
         //6
         num11=num9++;
         System.out.printf("%d\n",num10);
         System.out.printf("%d\n",num11); 
         System.out.printf("%d\n",num9);//10번
         System.out.println("=======================");
         
         int i=0;
         int re=0;
         i=3;
         re=++i;
         //4
         System.out.println("re:"+re+",i:"+i);
         i=3;
         re=i++;
         //3
         System.out.println("re:"+re+",i:"+i);//11번
         System.out.println("=======================");
         
         int h=(int)(Math.random()*2)+1;
         int g=(int)(Math.random()*2)+1;
         System.out.println("h="+h);
         System.out.println("g="+g);
         int M=h-g;
         int X=h*g;
         System.out.println("뺄셈="+M+",곱셈"+X);//12번
         System.out.println("=======================");
         
         int l=(int)(Math.random()*3)+1;
         int p=(int)(Math.random()*3)+1;
         int e=(int)(Math.random()*3)+1;
         System.out.println("l="+l+",p="+p+",e="+e);
         int o=l*p+e;
         System.out.println(o);//13번
         System.out.println("=======================");
         
         int k=(int)(Math.random()*2)+1;
         int v=(int)(Math.random()*2)+1;
         System.out.println("k="+k);
         System.out.println("v="+v);
         int r=k%v;
         System.out.println(r);//14번
         System.out.println("=======================");
         
         int y=5;
         int u=5;
         System.out.println("y="+y+",u="+u);	 
         System.out.println("y와u가 같은가요?"+(boolean)(y==u));
         System.out.println("y가u보다 큰가요?"+(boolean)(y>u));
         System.out.println("y가u보다 작은가요?"+(boolean)(y<u));
         System.out.println("y가u와 같으면서 3보다 큰가요?"+(boolean)(y==u && y>3));
         System.out.println("y가 50이 아닌가요?"+(boolean)(y!=50)); //15번
        
         
         
         
	}

}
