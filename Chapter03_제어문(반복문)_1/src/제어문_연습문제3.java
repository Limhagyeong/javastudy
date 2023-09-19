//B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
public class 제어문_연습문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char ch='B';ch<='N';ch+=2)
		{
	            if(ch!='N')		
				   System.out.print(ch+",");
	            else
	            	System.out.print(ch+" ");	
			}
		}

	}


