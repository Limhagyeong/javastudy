// 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 
//    출력하는 프로그램을 작성하시오
// 1 5 / 2 4 / 3 3 / 4 2 / 5 1
public class 제어문_연습문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for (int i=1;i<=6;i++)
       {
    	   for(int j=1;j<=6;j++)
    	   {
    		   if(i+j==6)
    		   {
    			   System.out.println("["+i+","+j+"]");
    		   }
    	   }
       }
                           
	}

}
