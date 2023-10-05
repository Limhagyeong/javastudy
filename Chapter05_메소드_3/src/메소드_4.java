// 로또 => 6개의 중복없는 정수 추출 (1~45) => 출력
// 1. 추출
// 2. 출력
public class 메소드_4 {
     static int[] getRand()
     {
    	 int[] lotto=new int[6];
         for(int i=0;i<lotto.length;i++)
         {
      	   lotto[i]=(int)(Math.random()*45)+1;
      	   for(int j=0;j<i;j++)
      	   {
      		   if(lotto[i]==lotto[j])
      		   {
      			   i--; // 중복 나올 시 다시 i번째로 돌아감
      			   break;
      		   }
      	   }
         }
         return lotto;
     }
     static void print(int[] lotto)
     {
    	 for(int i:lotto)
         {
      	   System.out.print(i+" ");
         }
     }
     static void process()
     {
    	 int[] lotto=getRand();
    	 print(lotto);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       int[] lotto=new int[6];
//       for(int i=0;i<lotto.length;i++)
//       {
//    	   lotto[i]=(int)(Math.random()*45)+1;
//    	   for(int j=0;j<i;j++)
//    	   {
//    		   if(lotto[i]==lotto[j])
//    		   {
//    			   i--; // 중복 나올 시 다시 i번째로 돌아감
//    			   break;
//    		   }
//    	   }
//       }
//       for(int i:lotto)
//       {
//    	   System.out.print(i+" ");
//       }
		process();
       
	}

}
