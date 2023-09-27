//char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력하시오
//위문제를 역순으로 출력하시오

public class 배열_연습문제9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char[] arr=new char[26];
        char c='A';
        for(char i=0;i<arr.length;i++)
        {
        	arr[i]=c++;
        }
        for(char i:arr)
        {
        	System.out.print(i);
        }
        System.out.println();
        for(int i=arr.length-1;i>=0;i--)
        {
        	System.out.print(arr[i]);
        }
	}

}
